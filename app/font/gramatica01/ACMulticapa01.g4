grammar ACMulticapa01;

// Puntos de entrada
program:
	ignoredLines? // Esta línea es nueva
	durationStandard? layer+ transitions* EOF;

// Líneas ignoradas
ignoredLines: grammarChoice stepsChoice; // Esta línea es nueva

// Elección de gramática y pasos
grammarChoice: 'GRAMATICA:' NUMBER;
stepsChoice: 'PASOS:' NUMBER;

// Duración estándar de los estados
durationStandard: 'DURACION ESTADOS' '{' durationState+ '}';

durationState: basicState NUMBER;

// Definiciones
layer: 'CAPA' NUMBER '{' cell+ '}';
cell: 'CELDA' NUMBER '(' basicState ')';

basicState:
	'SUSCEPTIBLE'
	| 'EXPUESTO'
	| 'INFECTADO'
	| 'RECUPERADO'
	| 'MUERTO';

// Transiciones
transitions: neighborTransitions | durationTransitions;

// Transiciones por vecinos
neighborTransitions:
	'TRANSICIONES POR VECINOS' '{' neighborTransitionRule+ '}';

neighborTransitionRule:
	'REGLA' basicState '->' basicState 'SI' condition;

// Transiciones por duración
durationTransitions:
	'TRANSICIONES POR DURACION' '{' durationTransitionRule+ '}';

durationTransitionRule:
	basicState '->' basicState 'PROBABILIDAD' NUMBER;

condition: 'HAY' NUMBER 'VECINOS' basicState;

// Tokens
STRING:
	[a-zA-Z_][a-zA-Z_0-9]*; // Identificador para cadenas de texto
NUMBER: [0-9]+ ('.' [0-9]*)?; // Números
WS: [ \t\r\n]+ -> skip; // Espacios en blanco