# Generated from app/gramatica/ACMulticapa.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,19,140,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,1,0,1,
        0,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,
        5,1,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,9,1,
        9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,
        10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,
        11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,
        13,1,13,1,13,1,13,1,14,1,14,1,14,1,15,1,15,1,15,1,16,1,16,1,16,1,
        17,1,17,5,17,129,8,17,10,17,12,17,132,9,17,1,18,4,18,135,8,18,11,
        18,12,18,136,1,18,1,18,0,0,19,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,
        17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,
        1,0,3,3,0,65,90,95,95,97,122,4,0,48,57,65,90,95,95,97,122,3,0,9,
        10,13,13,32,32,141,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,
        0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,
        0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,
        0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,
        0,1,39,1,0,0,0,3,44,1,0,0,0,5,46,1,0,0,0,7,48,1,0,0,0,9,54,1,0,0,
        0,11,56,1,0,0,0,13,58,1,0,0,0,15,60,1,0,0,0,17,69,1,0,0,0,19,71,
        1,0,0,0,21,83,1,0,0,0,23,93,1,0,0,0,25,104,1,0,0,0,27,111,1,0,0,
        0,29,117,1,0,0,0,31,120,1,0,0,0,33,123,1,0,0,0,35,126,1,0,0,0,37,
        134,1,0,0,0,39,40,5,67,0,0,40,41,5,65,0,0,41,42,5,80,0,0,42,43,5,
        65,0,0,43,2,1,0,0,0,44,45,5,123,0,0,45,4,1,0,0,0,46,47,5,125,0,0,
        47,6,1,0,0,0,48,49,5,67,0,0,49,50,5,69,0,0,50,51,5,76,0,0,51,52,
        5,68,0,0,52,53,5,65,0,0,53,8,1,0,0,0,54,55,5,40,0,0,55,10,1,0,0,
        0,56,57,5,41,0,0,57,12,1,0,0,0,58,59,5,59,0,0,59,14,1,0,0,0,60,61,
        5,86,0,0,61,62,5,69,0,0,62,63,5,67,0,0,63,64,5,73,0,0,64,65,5,78,
        0,0,65,66,5,68,0,0,66,67,5,65,0,0,67,68,5,68,0,0,68,16,1,0,0,0,69,
        70,5,44,0,0,70,18,1,0,0,0,71,72,5,83,0,0,72,73,5,85,0,0,73,74,5,
        83,0,0,74,75,5,67,0,0,75,76,5,69,0,0,76,77,5,80,0,0,77,78,5,84,0,
        0,78,79,5,73,0,0,79,80,5,66,0,0,80,81,5,76,0,0,81,82,5,69,0,0,82,
        20,1,0,0,0,83,84,5,73,0,0,84,85,5,78,0,0,85,86,5,70,0,0,86,87,5,
        69,0,0,87,88,5,67,0,0,88,89,5,84,0,0,89,90,5,65,0,0,90,91,5,68,0,
        0,91,92,5,79,0,0,92,22,1,0,0,0,93,94,5,82,0,0,94,95,5,69,0,0,95,
        96,5,67,0,0,96,97,5,85,0,0,97,98,5,80,0,0,98,99,5,69,0,0,99,100,
        5,82,0,0,100,101,5,65,0,0,101,102,5,68,0,0,102,103,5,79,0,0,103,
        24,1,0,0,0,104,105,5,77,0,0,105,106,5,85,0,0,106,107,5,69,0,0,107,
        108,5,82,0,0,108,109,5,84,0,0,109,110,5,79,0,0,110,26,1,0,0,0,111,
        112,5,82,0,0,112,113,5,69,0,0,113,114,5,71,0,0,114,115,5,76,0,0,
        115,116,5,65,0,0,116,28,1,0,0,0,117,118,5,45,0,0,118,119,5,62,0,
        0,119,30,1,0,0,0,120,121,5,83,0,0,121,122,5,73,0,0,122,32,1,0,0,
        0,123,124,5,69,0,0,124,125,5,78,0,0,125,34,1,0,0,0,126,130,7,0,0,
        0,127,129,7,1,0,0,128,127,1,0,0,0,129,132,1,0,0,0,130,128,1,0,0,
        0,130,131,1,0,0,0,131,36,1,0,0,0,132,130,1,0,0,0,133,135,7,2,0,0,
        134,133,1,0,0,0,135,136,1,0,0,0,136,134,1,0,0,0,136,137,1,0,0,0,
        137,138,1,0,0,0,138,139,6,18,0,0,139,38,1,0,0,0,3,0,130,136,1,6,
        0,0
    ]

class ACMulticapaLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    T__9 = 10
    T__10 = 11
    T__11 = 12
    T__12 = 13
    T__13 = 14
    T__14 = 15
    T__15 = 16
    T__16 = 17
    ID = 18
    WS = 19

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "';'", "'VECINDAD'", 
            "','", "'SUSCEPTIBLE'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", 
            "'REGLA'", "'->'", "'SI'", "'EN'" ]

    symbolicNames = [ "<INVALID>",
            "ID", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "T__10", "T__11", "T__12", "T__13", 
                  "T__14", "T__15", "T__16", "ID", "WS" ]

    grammarFileName = "ACMulticapa.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None

