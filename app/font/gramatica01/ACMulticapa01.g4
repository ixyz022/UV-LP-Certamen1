grammar ACMulticapa01;

// Puntos de entrada
program: layer+ transitionRule+ EOF;

// Definiciones
layer: 'CAPA' NUMBER '{' cell+ '}';
// layer: representa una vecindad con sus celdas
cell: 'CELDA' NUMBER '(' diseaseState ')';
// cell: permite crear celdas con un estado de enfermedad

diseaseState:
	'SUSCEPTIBLE'
	| 'EXPUESTO' // Modelo SEIRD
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO'; // Modelo SIRD
// diseaseState: estados de la enfermedad

transitionRule:
	'REGLA' diseaseState '->' diseaseState 'SI' condition;
// transitionRule: reglas de transición entre estados de la enfermedad 

condition: 'VECINOS' transitionDiseaseState;
// condition: condición bajo la cual ocurre una transición basada en la vecindad

transitionDiseaseState:
	'SUSCEPTIBLE'
	| 'EXPUESTO' step
	| 'INFECTADO' step
	| 'RECUPERADO' step
	| 'MUERTO';
// diseaseState: estados de la enfermedad

step: 'DURANTE' NUMBER 'PASOS';

// Tokens
STRING:
	[a-zA-Z_][a-zA-Z_0-9]*; // Identificador para cadenas de texto
NUMBER: [0-9]+ ('.' [0-9]*)?; // Números
WS: [ \t\r\n]+ -> skip; // Espacios en blanco