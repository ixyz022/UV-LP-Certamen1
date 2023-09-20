# Generated from ACMulticapa.g4 by ANTLR 4.13.1
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
        4,1,22,90,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,4,0,18,8,0,11,0,12,0,19,1,0,4,0,23,8,0,11,0,12,0,24,
        1,0,1,0,1,1,1,1,1,1,1,1,4,1,33,8,1,11,1,12,1,34,1,1,1,1,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,5,3,51,8,3,10,3,12,3,54,
        9,3,3,3,56,8,3,1,3,1,3,1,4,1,4,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,6,1,
        6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,5,7,81,8,7,10,7,12,7,84,
        9,7,3,7,86,8,7,1,7,1,7,1,7,0,0,8,0,2,4,6,8,10,12,14,0,1,1,0,10,14,
        88,0,17,1,0,0,0,2,28,1,0,0,0,4,38,1,0,0,0,6,45,1,0,0,0,8,59,1,0,
        0,0,10,63,1,0,0,0,12,65,1,0,0,0,14,74,1,0,0,0,16,18,3,2,1,0,17,16,
        1,0,0,0,18,19,1,0,0,0,19,17,1,0,0,0,19,20,1,0,0,0,20,22,1,0,0,0,
        21,23,3,12,6,0,22,21,1,0,0,0,23,24,1,0,0,0,24,22,1,0,0,0,24,25,1,
        0,0,0,25,26,1,0,0,0,26,27,5,0,0,1,27,1,1,0,0,0,28,29,5,1,0,0,29,
        30,5,20,0,0,30,32,5,2,0,0,31,33,3,4,2,0,32,31,1,0,0,0,33,34,1,0,
        0,0,34,32,1,0,0,0,34,35,1,0,0,0,35,36,1,0,0,0,36,37,5,3,0,0,37,3,
        1,0,0,0,38,39,5,4,0,0,39,40,5,20,0,0,40,41,5,5,0,0,41,42,3,10,5,
        0,42,43,5,6,0,0,43,44,3,6,3,0,44,5,1,0,0,0,45,46,5,7,0,0,46,55,5,
        2,0,0,47,52,3,8,4,0,48,49,5,8,0,0,49,51,3,8,4,0,50,48,1,0,0,0,51,
        54,1,0,0,0,52,50,1,0,0,0,52,53,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,
        0,55,47,1,0,0,0,55,56,1,0,0,0,56,57,1,0,0,0,57,58,5,3,0,0,58,7,1,
        0,0,0,59,60,5,20,0,0,60,61,5,9,0,0,61,62,5,20,0,0,62,9,1,0,0,0,63,
        64,7,0,0,0,64,11,1,0,0,0,65,66,5,15,0,0,66,67,3,10,5,0,67,68,5,16,
        0,0,68,69,3,10,5,0,69,70,5,17,0,0,70,71,3,14,7,0,71,72,5,18,0,0,
        72,73,5,21,0,0,73,13,1,0,0,0,74,75,3,10,5,0,75,76,5,19,0,0,76,85,
        5,2,0,0,77,82,3,8,4,0,78,79,5,8,0,0,79,81,3,8,4,0,80,78,1,0,0,0,
        81,84,1,0,0,0,82,80,1,0,0,0,82,83,1,0,0,0,83,86,1,0,0,0,84,82,1,
        0,0,0,85,77,1,0,0,0,85,86,1,0,0,0,86,87,1,0,0,0,87,88,5,3,0,0,88,
        15,1,0,0,0,7,19,24,34,52,55,82,85
    ]

class ACMulticapaParser ( Parser ):

    grammarFileName = "ACMulticapa.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", 
                     "')'", "'VECINDAD'", "','", "'.'", "'SUSCEPTIBLE'", 
                     "'EXPOSED'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", 
                     "'REGLA'", "'->'", "'SI'", "'RATE'", "'EN'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "ID", "NUMBER", "WS" ]

    RULE_program = 0
    RULE_layer = 1
    RULE_cell = 2
    RULE_vecindad = 3
    RULE_layeredCellRef = 4
    RULE_diseaseState = 5
    RULE_transitionRule = 6
    RULE_condition = 7

    ruleNames =  [ "program", "layer", "cell", "vecindad", "layeredCellRef", 
                   "diseaseState", "transitionRule", "condition" ]

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
    T__18=19
    ID=20
    NUMBER=21
    WS=22

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
            self.state = 17 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 16
                self.layer()
                self.state = 19 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1):
                    break

            self.state = 22 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 21
                self.transitionRule()
                self.state = 24 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==15):
                    break

            self.state = 26
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
            self.state = 28
            self.match(ACMulticapaParser.T__0)
            self.state = 29
            self.match(ACMulticapaParser.ID)
            self.state = 30
            self.match(ACMulticapaParser.T__1)
            self.state = 32 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 31
                self.cell()
                self.state = 34 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==4):
                    break

            self.state = 36
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

        def diseaseState(self):
            return self.getTypedRuleContext(ACMulticapaParser.DiseaseStateContext,0)


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
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.match(ACMulticapaParser.T__3)
            self.state = 39
            self.match(ACMulticapaParser.ID)
            self.state = 40
            self.match(ACMulticapaParser.T__4)
            self.state = 41
            self.diseaseState()
            self.state = 42
            self.match(ACMulticapaParser.T__5)
            self.state = 43
            self.vecindad()
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

        def layeredCellRef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.LayeredCellRefContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.LayeredCellRefContext,i)


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
            self.state = 45
            self.match(ACMulticapaParser.T__6)
            self.state = 46
            self.match(ACMulticapaParser.T__1)
            self.state = 55
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==20:
                self.state = 47
                self.layeredCellRef()
                self.state = 52
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 48
                    self.match(ACMulticapaParser.T__7)
                    self.state = 49
                    self.layeredCellRef()
                    self.state = 54
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 57
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LayeredCellRefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ACMulticapaParser.ID)
            else:
                return self.getToken(ACMulticapaParser.ID, i)

        def getRuleIndex(self):
            return ACMulticapaParser.RULE_layeredCellRef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLayeredCellRef" ):
                listener.enterLayeredCellRef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLayeredCellRef" ):
                listener.exitLayeredCellRef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLayeredCellRef" ):
                return visitor.visitLayeredCellRef(self)
            else:
                return visitor.visitChildren(self)




    def layeredCellRef(self):

        localctx = ACMulticapaParser.LayeredCellRefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_layeredCellRef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.match(ACMulticapaParser.ID)
            self.state = 60
            self.match(ACMulticapaParser.T__8)
            self.state = 61
            self.match(ACMulticapaParser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DiseaseStateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ACMulticapaParser.RULE_diseaseState

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDiseaseState" ):
                listener.enterDiseaseState(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDiseaseState" ):
                listener.exitDiseaseState(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDiseaseState" ):
                return visitor.visitDiseaseState(self)
            else:
                return visitor.visitChildren(self)




    def diseaseState(self):

        localctx = ACMulticapaParser.DiseaseStateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_diseaseState)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 31744) != 0)):
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

        def diseaseState(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.DiseaseStateContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.DiseaseStateContext,i)


        def condition(self):
            return self.getTypedRuleContext(ACMulticapaParser.ConditionContext,0)


        def NUMBER(self):
            return self.getToken(ACMulticapaParser.NUMBER, 0)

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
            self.state = 65
            self.match(ACMulticapaParser.T__14)
            self.state = 66
            self.diseaseState()
            self.state = 67
            self.match(ACMulticapaParser.T__15)
            self.state = 68
            self.diseaseState()
            self.state = 69
            self.match(ACMulticapaParser.T__16)
            self.state = 70
            self.condition()
            self.state = 71
            self.match(ACMulticapaParser.T__17)
            self.state = 72
            self.match(ACMulticapaParser.NUMBER)
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

        def diseaseState(self):
            return self.getTypedRuleContext(ACMulticapaParser.DiseaseStateContext,0)


        def layeredCellRef(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ACMulticapaParser.LayeredCellRefContext)
            else:
                return self.getTypedRuleContext(ACMulticapaParser.LayeredCellRefContext,i)


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
            self.state = 74
            self.diseaseState()
            self.state = 75
            self.match(ACMulticapaParser.T__18)
            self.state = 76
            self.match(ACMulticapaParser.T__1)
            self.state = 85
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==20:
                self.state = 77
                self.layeredCellRef()
                self.state = 82
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==8:
                    self.state = 78
                    self.match(ACMulticapaParser.T__7)
                    self.state = 79
                    self.layeredCellRef()
                    self.state = 84
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 87
            self.match(ACMulticapaParser.T__2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





