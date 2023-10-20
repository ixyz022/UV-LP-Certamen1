grammar ACMulticapa02;

// Puntos de entrada
program: layer+ transitionRule+ EOF;

// Definiciones
layer: 'CAPA' NUMBER '{' cell+ '}';
cell:
	'CELDA' NUMBER 'POBLACION' NUMBER '{' diseaseState (
		',' diseaseState
	)* '}';

diseaseState: stateName ':' NUMBER;
// stateName: representa el estado de la enfermedad NUMBER: representa la cantidad de individuos en

stateName:
	'SUSCEPTIBLE'
	| 'EXPOSED'
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO';

transitionRule:
	'REGLA' stateName '->' stateName 'SI' condition 'CADA' step;

condition: 'VECINOS' stateName;
step: NUMBER;

// Tokens
STRING: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]*)?;
WS: [ \t\r\n]+ -> skip;