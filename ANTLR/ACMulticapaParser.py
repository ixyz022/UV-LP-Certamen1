# Generated from ANTLR/ACMulticapa.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,119,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,4,0,24,8,0,11,0,12,0,25,
        1,0,4,0,29,8,0,11,0,12,0,30,1,0,1,0,1,0,1,1,1,1,1,1,1,1,4,1,40,8,
        1,11,1,12,1,41,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,3,2,52,8,2,1,2,1,
        2,1,3,1,3,1,3,1,3,1,3,5,3,61,8,3,10,3,12,3,64,9,3,3,3,66,8,3,1,3,
        1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,
        1,7,1,7,5,7,87,8,7,10,7,12,7,90,9,7,3,7,92,8,7,1,7,1,7,1,8,1,8,1,
        8,4,8,99,8,8,11,8,12,8,100,1,8,1,8,1,9,1,9,1,9,4,9,108,8,9,11,9,
        12,9,109,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,0,0,11,0,2,4,6,8,
        10,12,14,16,18,20,0,1,1,0,10,12,117,0,23,1,0,0,0,2,35,1,0,0,0,4,
        45,1,0,0,0,6,55,1,0,0,0,8,69,1,0,0,0,10,71,1,0,0,0,12,73,1,0,0,0,
        14,80,1,0,0,0,16,95,1,0,0,0,18,104,1,0,0,0,20,113,1,0,0,0,22,24,
        3,2,1,0,23,22,1,0,0,0,24,25,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,
        26,28,1,0,0,0,27,29,3,12,6,0,28,27,1,0,0,0,29,30,1,0,0,0,30,28,1,
        0,0,0,30,31,1,0,0,0,31,32,1,0,0,0,32,33,3,16,8,0,33,34,5,0,0,1,34,
        1,1,0,0,0,35,36,5,1,0,0,36,37,5,19,0,0,37,39,5,2,0,0,38,40,3,4,2,
        0,39,38,1,0,0,0,40,41,1,0,0,0,41,39,1,0,0,0,41,42,1,0,0,0,42,43,
        1,0,0,0,43,44,5,3,0,0,44,3,1,0,0,0,45,46,5,4,0,0,46,47,5,19,0,0,
        47,48,5,5,0,0,48,49,3,10,5,0,49,51,5,6,0,0,50,52,3,6,3,0,51,50,1,
        0,0,0,51,52,1,0,0,0,52,53,1,0,0,0,53,54,5,7,0,0,54,5,1,0,0,0,55,
        56,5,8,0,0,56,65,5,2,0,0,57,62,3,8,4,0,58,59,5,9,0,0,59,61,3,8,4,
        0,60,58,1,0,0,0,61,64,1,0,0,0,62,60,1,0,0,0,62,63,1,0,0,0,63,66,
        1,0,0,0,64,62,1,0,0,0,65,57,1,0,0,0,65,66,1,0,0,0,66,67,1,0,0,0,
        67,68,5,3,0,0,68,7,1,0,0,0,69,70,5,19,0,0,70,9,1,0,0,0,71,72,7,0,
        0,0,72,11,1,0,0,0,73,74,5,13,0,0,74,75,3,10,5,0,75,76,5,14,0,0,76,
        77,3,10,5,0,77,78,5,15,0,0,78,79,3,14,7,0,79,13,1,0,0,0,80,81,3,
        10,5,0,81,82,5,16,0,0,82,91,5,2,0,0,83,88,3,8,4,0,84,85,5,9,0,0,
        85,87,3,8,4,0,86,84,1,0,0,0,87,90,1,0,0,0,88,86,1,0,0,0,88,89,1,
        0,0,0,89,92,1,0,0,0,90,88,1,0,0,0,91,83,1,0,0,0,91,92,1,0,0,0,92,
        93,1,0,0,0,93,94,5,3,0,0,94,15,1,0,0,0,95,96,5,17,0,0,96,98,5,2,
        0,0,97,99,3,18,9,0,98,97,1,0,0,0,99,100,1,0,0,0,100,98,1,0,0,0,100,
        101,1,0,0,0,101,102,1,0,0,0,102,103,5,3,0,0,103,17,1,0,0,0,104,105,
        5,18,0,0,105,107,5,2,0,0,106,108,3,20,10,0,107,106,1,0,0,0,108,109,
        1,0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,111,1,0,0,0,111,112,
        5,3,0,0,112,19,1,0,0,0,113,114,3,8,4,0,114,115,5,14,0,0,115,116,
        3,10,5,0,116,117,5,7,0,0,117,21,1,0,0,0,10,25,30,41,51,62,65,88,
        91,100,109
    ]

class ACMulticapaParser ( Parser ):

    grammarFileName = "ACMulticapa.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", 
                     "')'", "';'", "'VECINDAD'", "','", "'SUSCEPTIBLE'", 
                     "'INFECTADO'", "'RECUPERADO'", "'REGLA'", "'->'", "'SI'", 
                     "'EN'", "'SIMULACION'", "'PASO'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "WS" ]

    RULE_program = 0
    RULE_layer = 1
    RULE_cell = 2
    RULE_vecindad = 3
    RULE_cellRef = 4
    RULE_cellState = 5
    RULE_transitionRule = 6
    RULE_condition = 7
    RULE_simulation = 8
    RULE_step = 9
    RULE_cellAction = 10

    ruleNames =  [ "program", "layer", "cell", "vecindad", "cellRef", "cellState", 
                   "transitionRule", "condition", "simulation", "step", 
                   "cellAction" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    ID=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def simulation(self):
            return self.getTypedRuleContext(ACMulticapaParser.SimulationContext,0)


        def EOF(self):
            return self.getToken(ACMulticapaParser.EOF, 0)

        def layer(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.LayerContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.LayerContext,i)


        def transitionRule(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.TransitionRuleContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.TransitionRuleContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = ACMulticapaParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 22
                self.layer()
                self.state = 25 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

            self.state = 28 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 27
                self.transitionRule()
                self.state = 30 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==13):
                    break

            self.state = 32
            self.simulation()
            self.state = 33
            self.match(ACMulticapaParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LayerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ACMulticapaParser.ID, 0)

        def cell(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.CellContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.CellContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_layer

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLayer" ):
                listener.enterLayer(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLayer" ):
                listener.exitLayer(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLayer" ):
                return visitor.visitLayer(self)
            else:
                return visitor.visitChildren(self)




    def layer(self):

        localctx = ACMulticapaParser.LayerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_layer)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(ACMulticapaParser.T__0)
            self.state = 36
            self.match(ACMulticapaParser.ID)
            self.state = 37
            self.match(ACMulticapaParser.T__1)
            self.state = 39 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 38
                self.cell()
                self.state = 41 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==4):
                    break

            self.state = 43
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CellContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ACMulticapaParser.ID, 0)

        def cellState(self):
            return self.getTypedRuleContext(ACMulticapaParser.CellStateContext,0)


        def vecindad(self):
            return self.getTypedRuleContext(ACMulticapaParser.VecindadContext,0)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_cell

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCell" ):
                listener.enterCell(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCell" ):
                listener.exitCell(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCell" ):
                return visitor.visitCell(self)
            else:
                return visitor.visitChildren(self)




    def cell(self):

        localctx = ACMulticapaParser.CellContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_cell)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 45
            self.match(ACMulticapaParser.T__3)
            self.state = 46
            self.match(ACMulticapaParser.ID)
            self.state = 47
            self.match(ACMulticapaParser.T__4)
            self.state = 48
            self.cellState()
            self.state = 49
            self.match(ACMulticapaParser.T__5)
            self.state = 51
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==8:
                self.state = 50
                self.vecindad()


            self.state = 53
            self.match(ACMulticapaParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VecindadContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cellRef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.CellRefContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.CellRefContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_vecindad

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVecindad" ):
                listener.enterVecindad(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVecindad" ):
                listener.exitVecindad(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVecindad" ):
                return visitor.visitVecindad(self)
            else:
                return visitor.visitChildren(self)




    def vecindad(self):

        localctx = ACMulticapaParser.VecindadContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_vecindad)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 55
            self.match(ACMulticapaParser.T__7)
            self.state = 56
            self.match(ACMulticapaParser.T__1)
            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==19:
                self.state = 57
                self.cellRef()
                self.state = 62
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==9:
                    self.state = 58
                    self.match(ACMulticapaParser.T__8)
                    self.state = 59
                    self.cellRef()
                    self.state = 64
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 67
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CellRefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ACMulticapaParser.ID, 0)

        def getRuleIndex(self):
            return ACMulticapaParser.RULE_cellRef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCellRef" ):
                listener.enterCellRef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCellRef" ):
                listener.exitCellRef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCellRef" ):
                return visitor.visitCellRef(self)
            else:
                return visitor.visitChildren(self)




    def cellRef(self):

        localctx = ACMulticapaParser.CellRefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_cellRef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self.match(ACMulticapaParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CellStateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_cellState

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCellState" ):
                listener.enterCellState(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCellState" ):
                listener.exitCellState(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCellState" ):
                return visitor.visitCellState(self)
            else:
                return visitor.visitChildren(self)




    def cellState(self):

        localctx = ACMulticapaParser.CellStateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_cellState)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7168) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TransitionRuleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cellState(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.CellStateContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.CellStateContext,i)


        def condition(self):
            return self.getTypedRuleContext(ACMulticapaParser.ConditionContext,0)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_transitionRule

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTransitionRule" ):
                listener.enterTransitionRule(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTransitionRule" ):
                listener.exitTransitionRule(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTransitionRule" ):
                return visitor.visitTransitionRule(self)
            else:
                return visitor.visitChildren(self)




    def transitionRule(self):

        localctx = ACMulticapaParser.TransitionRuleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_transitionRule)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.match(ACMulticapaParser.T__12)
            self.state = 74
            self.cellState()
            self.state = 75
            self.match(ACMulticapaParser.T__13)
            self.state = 76
            self.cellState()
            self.state = 77
            self.match(ACMulticapaParser.T__14)
            self.state = 78
            self.condition()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cellState(self):
            return self.getTypedRuleContext(ACMulticapaParser.CellStateContext,0)


        def cellRef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.CellRefContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.CellRefContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = ACMulticapaParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 80
            self.cellState()
            self.state = 81
            self.match(ACMulticapaParser.T__15)
            self.state = 82
            self.match(ACMulticapaParser.T__1)
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==19:
                self.state = 83
                self.cellRef()
                self.state = 88
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==9:
                    self.state = 84
                    self.match(ACMulticapaParser.T__8)
                    self.state = 85
                    self.cellRef()
                    self.state = 90
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 93
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SimulationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def step(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.StepContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.StepContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_simulation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSimulation" ):
                listener.enterSimulation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSimulation" ):
                listener.exitSimulation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSimulation" ):
                return visitor.visitSimulation(self)
            else:
                return visitor.visitChildren(self)




    def simulation(self):

        localctx = ACMulticapaParser.SimulationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_simulation)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(ACMulticapaParser.T__16)
            self.state = 96
            self.match(ACMulticapaParser.T__1)
            self.state = 98 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 97
                self.step()
                self.state = 100 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==18):
                    break

            self.state = 102
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StepContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cellAction(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.CellActionContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.CellActionContext,i)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_step

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStep" ):
                listener.enterStep(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStep" ):
                listener.exitStep(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStep" ):
                return visitor.visitStep(self)
            else:
                return visitor.visitChildren(self)




    def step(self):

        localctx = ACMulticapaParser.StepContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_step)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 104
            self.match(ACMulticapaParser.T__17)
            self.state = 105
            self.match(ACMulticapaParser.T__1)
            self.state = 107 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 106
                self.cellAction()
                self.state = 109 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==19):
                    break

            self.state = 111
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CellActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cellRef(self):
            return self.getTypedRuleContext(ACMulticapaParser.CellRefContext,0)


        def cellState(self):
            return self.getTypedRuleContext(ACMulticapaParser.CellStateContext,0)


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_cellAction

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCellAction" ):
                listener.enterCellAction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCellAction" ):
                listener.exitCellAction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCellAction" ):
                return visitor.visitCellAction(self)
            else:
                return visitor.visitChildren(self)




    def cellAction(self):

        localctx = ACMulticapaParser.CellActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_cellAction)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.cellRef()
            self.state = 114
            self.match(ACMulticapaParser.T__13)
            self.state = 115
            self.cellState()
            self.state = 116
            self.match(ACMulticapaParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





