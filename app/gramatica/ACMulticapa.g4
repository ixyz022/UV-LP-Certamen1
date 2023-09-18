grammar ACMulticapa;

// Puntos de entrada
program: layer+ transitionRule+ EOF;

// Definiciones
layer: 'CAPA' ID '{' cell+ '}';
cell: 'CELDA' ID '(' cellState ')' vecindad? ';';
vecindad: 'VECINDAD' '{' (cellRef (',' cellRef)*)? '}';
cellRef: ID;
cellState:
	'SUSCEPTIBLE'
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO'; // Agregado el estado MUERTO para el modelo SIRD

transitionRule: 'REGLA' cellState '->' cellState 'SI' condition;
condition: cellState 'EN' '{' (cellRef (',' cellRef)*)? '}';

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;
