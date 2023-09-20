grammar ACMulticapa;

// Puntos de entrada
program: layer+ transitionRule+ EOF;

// Definiciones
layer: 'CAPA' ID '{' cell+ '}';
// layer: permite crear multiples capas, cada una con sus propias celdas
cell: 'CELDA' ID '(' diseaseState ')' vecindad ';';
// cell: permite crear multiples celdas, cada una con su propio estado de enfermedad
vecindad:
	'VECINDAD' '{' (layeredCellRef (',' layeredCellRef)*)? '}';
// vecindad: permite definir las vecindades de las celdas
layeredCellRef: ID '.' ID;
// layeredCellRef: permite referenciar una celda en una capa específica

diseaseState:
	'SUSCEPTIBLE'
	| 'EXPOSED' // Modelo SEIRD
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO'; // Modelo SIRD
// diseseState: permite definir los estados de la enfermedad

transitionRule:
	'REGLA' diseaseState '->' diseaseState 'SI' condition 'RATE' NUMBER;
// transitionRule: permite definir las reglas de transición entre estados de la enfermedad RATE es
// la tasa de transición
condition:
	diseaseState 'EN' '{' (layeredCellRef (',' layeredCellRef)*)? '}';
// condition: condición bajo la cual ocurre una transición de un estado de enfermedad a otro

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
// ID: permite definir identificadores
NUMBER: [0-9]+ ('.' [0-9]*)?;
// NUMBER: permite definir números
WS: [ \t\r\n]+ -> skip;
// WS: permite definir espacios en blanco
