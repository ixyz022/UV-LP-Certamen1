grammar ACMulticapa;

// Puntos de entrada
program: layer+ transitionRule+ simulation EOF;

// Definiciones
layer: 'CAPA' ID '{' cell+ '}';
cell: 'CELDA' ID '(' cellState ')' vecindad? ';';
vecindad: 'VECINDAD' '{' (cellRef (',' cellRef)*)? '}';
cellRef: ID;
cellState: 'SUSCEPTIBLE' | 'INFECTADO' | 'RECUPERADO';

transitionRule: 'REGLA' cellState '->' cellState 'SI' condition;
condition: cellState 'EN' '{' (cellRef (',' cellRef)*)? '}';

simulation: 'SIMULACION' '{' (step)+ '}';
step: 'PASO' '{' (cellAction)+ '}';
cellAction: cellRef '->' cellState ';';

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;
