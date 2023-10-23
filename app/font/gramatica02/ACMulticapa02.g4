grammar ACMulticapa02;

// Puntos de entrada
program:
	ignoredLines? durationStandard? layer+ transitions* EOF;

// Líneas ignoradas
ignoredLines: grammarChoice stepsChoice;

// Elección de gramática y pasos
grammarChoice: 'GRAMATICA:' NUMBER;
stepsChoice: 'PASOS:' NUMBER;

// Duración estándar de los estados
durationStandard: 'DURACION ESTADOS' '{' durationState+ '}';

durationState: basicState NUMBER;

// Definiciones
layer: 'CAPA' NUMBER '{' cell+ '}';
cell: 'CELDA' NUMBER diseaseStateSet ('BLOQUEADO')?;

diseaseStateSet: '{' diseaseState ( ',' diseaseState)* '}';

diseaseState: basicState ':' NUMBER;

basicState:
	'SUSCEPTIBLE'
	| 'EXPUESTO'
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO';

// Transiciones
transitions: durationTransitions | cellTransitions;

// Transiciones por duración
durationTransitions:
	'TRANSICIONES POR DURACION' '{' durationTransitionRule+ '}';

durationTransitionRule:
	basicState '->' basicState 'PROBABILIDAD' NUMBER;

// Transiciones por celda
cellTransitions:
	'TRANSICIONES POR CELDA' '{' cellTransitionRule+ '}';

cellTransitionRule:
	'REGLA' basicState '->' basicState 'SI' 'HAY' condition;

condition: basicState comparison;

comparison: OPERATOR NUMBER;

// Tokens
STRING: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]*)?;
WS: [ \t\r\n]+ -> skip;
OPERATOR: '>' | '<' | '>=' | '<=' | '==';