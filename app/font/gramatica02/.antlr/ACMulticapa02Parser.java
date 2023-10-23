// Generated from d:/Documentos/Development Projects/UV-LP-Certamen1/app/font/gramatica02/ACMulticapa02.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ACMulticapa02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, STRING=23, NUMBER=24, 
		WS=25, OPERATOR=26;
	public static final int
		RULE_program = 0, RULE_ignoredLines = 1, RULE_grammarChoice = 2, RULE_stepsChoice = 3, 
		RULE_durationStandard = 4, RULE_durationState = 5, RULE_layer = 6, RULE_cell = 7, 
		RULE_diseaseStateSet = 8, RULE_diseaseState = 9, RULE_basicState = 10, 
		RULE_transitions = 11, RULE_durationTransitions = 12, RULE_durationTransitionRule = 13, 
		RULE_cellTransitions = 14, RULE_cellTransitionRule = 15, RULE_condition = 16, 
		RULE_comparison = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ignoredLines", "grammarChoice", "stepsChoice", "durationStandard", 
			"durationState", "layer", "cell", "diseaseStateSet", "diseaseState", 
			"basicState", "transitions", "durationTransitions", "durationTransitionRule", 
			"cellTransitions", "cellTransitionRule", "condition", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'GRAMATICA:'", "'PASOS:'", "'DURACION ESTADOS'", "'{'", "'}'", 
			"'CAPA'", "'CELDA'", "'BLOQUEADO'", "','", "':'", "'SUSCEPTIBLE'", "'EXPUESTO'", 
			"'INFECTADO'", "'RECUPERADO'", "'MUERTO'", "'TRANSICIONES POR DURACION'", 
			"'->'", "'PROBABILIDAD'", "'TRANSICIONES POR CELDA'", "'REGLA'", "'SI'", 
			"'HAY'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS", "OPERATOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ACMulticapa02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACMulticapa02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ACMulticapa02Parser.EOF, 0); }
		public IgnoredLinesContext ignoredLines() {
			return getRuleContext(IgnoredLinesContext.class,0);
		}
		public DurationStandardContext durationStandard() {
			return getRuleContext(DurationStandardContext.class,0);
		}
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public List<TransitionsContext> transitions() {
			return getRuleContexts(TransitionsContext.class);
		}
		public TransitionsContext transitions(int i) {
			return getRuleContext(TransitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(36);
				ignoredLines();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(39);
				durationStandard();
				}
			}

			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				layer();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__18) {
				{
				{
				setState(47);
				transitions();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IgnoredLinesContext extends ParserRuleContext {
		public GrammarChoiceContext grammarChoice() {
			return getRuleContext(GrammarChoiceContext.class,0);
		}
		public StepsChoiceContext stepsChoice() {
			return getRuleContext(StepsChoiceContext.class,0);
		}
		public IgnoredLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredLines; }
	}

	public final IgnoredLinesContext ignoredLines() throws RecognitionException {
		IgnoredLinesContext _localctx = new IgnoredLinesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ignoredLines);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			grammarChoice();
			setState(56);
			stepsChoice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrammarChoiceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public GrammarChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarChoice; }
	}

	public final GrammarChoiceContext grammarChoice() throws RecognitionException {
		GrammarChoiceContext _localctx = new GrammarChoiceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StepsChoiceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public StepsChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepsChoice; }
	}

	public final StepsChoiceContext stepsChoice() throws RecognitionException {
		StepsChoiceContext _localctx = new StepsChoiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stepsChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationStandardContext extends ParserRuleContext {
		public List<DurationStateContext> durationState() {
			return getRuleContexts(DurationStateContext.class);
		}
		public DurationStateContext durationState(int i) {
			return getRuleContext(DurationStateContext.class,i);
		}
		public DurationStandardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationStandard; }
	}

	public final DurationStandardContext durationStandard() throws RecognitionException {
		DurationStandardContext _localctx = new DurationStandardContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_durationStandard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			match(T__3);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				durationState();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0) );
			setState(71);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationStateContext extends ParserRuleContext {
		public BasicStateContext basicState() {
			return getRuleContext(BasicStateContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public DurationStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationState; }
	}

	public final DurationStateContext durationState() throws RecognitionException {
		DurationStateContext _localctx = new DurationStateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_durationState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			basicState();
			setState(74);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public List<CellContext> cell() {
			return getRuleContexts(CellContext.class);
		}
		public CellContext cell(int i) {
			return getRuleContext(CellContext.class,i);
		}
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__5);
			setState(77);
			match(NUMBER);
			setState(78);
			match(T__3);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				cell();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(84);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CellContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public DiseaseStateSetContext diseaseStateSet() {
			return getRuleContext(DiseaseStateSetContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__6);
			setState(87);
			match(NUMBER);
			setState(88);
			diseaseStateSet();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(89);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiseaseStateSetContext extends ParserRuleContext {
		public List<DiseaseStateContext> diseaseState() {
			return getRuleContexts(DiseaseStateContext.class);
		}
		public DiseaseStateContext diseaseState(int i) {
			return getRuleContext(DiseaseStateContext.class,i);
		}
		public DiseaseStateSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseaseStateSet; }
	}

	public final DiseaseStateSetContext diseaseStateSet() throws RecognitionException {
		DiseaseStateSetContext _localctx = new DiseaseStateSetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_diseaseStateSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__3);
			setState(93);
			diseaseState();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(94);
				match(T__8);
				setState(95);
				diseaseState();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiseaseStateContext extends ParserRuleContext {
		public BasicStateContext basicState() {
			return getRuleContext(BasicStateContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public DiseaseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseaseState; }
	}

	public final DiseaseStateContext diseaseState() throws RecognitionException {
		DiseaseStateContext _localctx = new DiseaseStateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_diseaseState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			basicState();
			setState(104);
			match(T__9);
			setState(105);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasicStateContext extends ParserRuleContext {
		public BasicStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicState; }
	}

	public final BasicStateContext basicState() throws RecognitionException {
		BasicStateContext _localctx = new BasicStateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionsContext extends ParserRuleContext {
		public DurationTransitionsContext durationTransitions() {
			return getRuleContext(DurationTransitionsContext.class,0);
		}
		public CellTransitionsContext cellTransitions() {
			return getRuleContext(CellTransitionsContext.class,0);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transitions);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				durationTransitions();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				cellTransitions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationTransitionsContext extends ParserRuleContext {
		public List<DurationTransitionRuleContext> durationTransitionRule() {
			return getRuleContexts(DurationTransitionRuleContext.class);
		}
		public DurationTransitionRuleContext durationTransitionRule(int i) {
			return getRuleContext(DurationTransitionRuleContext.class,i);
		}
		public DurationTransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationTransitions; }
	}

	public final DurationTransitionsContext durationTransitions() throws RecognitionException {
		DurationTransitionsContext _localctx = new DurationTransitionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_durationTransitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__15);
			setState(114);
			match(T__3);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				durationTransitionRule();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 63488L) != 0) );
			setState(120);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DurationTransitionRuleContext extends ParserRuleContext {
		public List<BasicStateContext> basicState() {
			return getRuleContexts(BasicStateContext.class);
		}
		public BasicStateContext basicState(int i) {
			return getRuleContext(BasicStateContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public DurationTransitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationTransitionRule; }
	}

	public final DurationTransitionRuleContext durationTransitionRule() throws RecognitionException {
		DurationTransitionRuleContext _localctx = new DurationTransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_durationTransitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			basicState();
			setState(123);
			match(T__16);
			setState(124);
			basicState();
			setState(125);
			match(T__17);
			setState(126);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CellTransitionsContext extends ParserRuleContext {
		public List<CellTransitionRuleContext> cellTransitionRule() {
			return getRuleContexts(CellTransitionRuleContext.class);
		}
		public CellTransitionRuleContext cellTransitionRule(int i) {
			return getRuleContext(CellTransitionRuleContext.class,i);
		}
		public CellTransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellTransitions; }
	}

	public final CellTransitionsContext cellTransitions() throws RecognitionException {
		CellTransitionsContext _localctx = new CellTransitionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cellTransitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__18);
			setState(129);
			match(T__3);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				cellTransitionRule();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(135);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CellTransitionRuleContext extends ParserRuleContext {
		public List<BasicStateContext> basicState() {
			return getRuleContexts(BasicStateContext.class);
		}
		public BasicStateContext basicState(int i) {
			return getRuleContext(BasicStateContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CellTransitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellTransitionRule; }
	}

	public final CellTransitionRuleContext cellTransitionRule() throws RecognitionException {
		CellTransitionRuleContext _localctx = new CellTransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cellTransitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__19);
			setState(138);
			basicState();
			setState(139);
			match(T__16);
			setState(140);
			basicState();
			setState(141);
			match(T__20);
			setState(142);
			match(T__21);
			setState(143);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public BasicStateContext basicState() {
			return getRuleContext(BasicStateContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			basicState();
			setState(146);
			comparison();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(ACMulticapa02Parser.OPERATOR, 0); }
		public TerminalNode NUMBER() { return getToken(ACMulticapa02Parser.NUMBER, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(OPERATOR);
			setState(149);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u0098\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0003"+
		"\u0000&\b\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0004\u0000"+
		",\b\u0000\u000b\u0000\f\u0000-\u0001\u0000\u0005\u00001\b\u0000\n\u0000"+
		"\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004D\b\u0004\u000b"+
		"\u0004\f\u0004E\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006Q\b"+
		"\u0006\u000b\u0006\f\u0006R\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\ba\b\b\n\b\f\bd\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0004\fu\b\f\u000b\f\f\fv\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u0084\b\u000e\u000b\u000e\f\u000e\u0085\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0001\u0001\u0000\u000b\u000f\u0090\u0000%\u0001\u0000"+
		"\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000"+
		"\u0006=\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nI\u0001\u0000"+
		"\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000"+
		"\u0010\\\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000\u0000\u0014"+
		"k\u0001\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018q\u0001"+
		"\u0000\u0000\u0000\u001az\u0001\u0000\u0000\u0000\u001c\u0080\u0001\u0000"+
		"\u0000\u0000\u001e\u0089\u0001\u0000\u0000\u0000 \u0091\u0001\u0000\u0000"+
		"\u0000\"\u0094\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\')\u0003\b\u0004\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*,\u0003\f\u0006\u0000+*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.2\u0001\u0000\u0000\u0000/1\u0003\u0016\u000b\u00000/\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u000078\u0003"+
		"\u0004\u0002\u000089\u0003\u0006\u0003\u00009\u0003\u0001\u0000\u0000"+
		"\u0000:;\u0005\u0001\u0000\u0000;<\u0005\u0018\u0000\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005\u0018\u0000\u0000"+
		"?\u0007\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AC\u0005\u0004"+
		"\u0000\u0000BD\u0003\n\u0005\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0005\u0000\u0000H\t\u0001\u0000\u0000\u0000"+
		"IJ\u0003\u0014\n\u0000JK\u0005\u0018\u0000\u0000K\u000b\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0006\u0000\u0000MN\u0005\u0018\u0000\u0000NP\u0005\u0004"+
		"\u0000\u0000OQ\u0003\u000e\u0007\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0005\u0005\u0000\u0000U\r\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0007\u0000\u0000WX\u0005\u0018\u0000\u0000XZ\u0003\u0010"+
		"\b\u0000Y[\u0005\b\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u0004\u0000\u0000"+
		"]b\u0003\u0012\t\u0000^_\u0005\t\u0000\u0000_a\u0003\u0012\t\u0000`^\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0005\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0014\n\u0000hi\u0005\n\u0000\u0000ij\u0005\u0018\u0000\u0000j\u0013"+
		"\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0015\u0001\u0000"+
		"\u0000\u0000mp\u0003\u0018\f\u0000np\u0003\u001c\u000e\u0000om\u0001\u0000"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000p\u0017\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0010\u0000\u0000rt\u0005\u0004\u0000\u0000su\u0003\u001a\r\u0000"+
		"ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0005"+
		"\u0000\u0000y\u0019\u0001\u0000\u0000\u0000z{\u0003\u0014\n\u0000{|\u0005"+
		"\u0011\u0000\u0000|}\u0003\u0014\n\u0000}~\u0005\u0012\u0000\u0000~\u007f"+
		"\u0005\u0018\u0000\u0000\u007f\u001b\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0013\u0000\u0000\u0081\u0083\u0005\u0004\u0000\u0000\u0082\u0084"+
		"\u0003\u001e\u000f\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0005\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0014\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u008c\u0005"+
		"\u0011\u0000\u0000\u008c\u008d\u0003\u0014\n\u0000\u008d\u008e\u0005\u0015"+
		"\u0000\u0000\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0090\u0003 \u0010"+
		"\u0000\u0090\u001f\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0014\n\u0000"+
		"\u0092\u0093\u0003\"\u0011\u0000\u0093!\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u001a\u0000\u0000\u0095\u0096\u0005\u0018\u0000\u0000\u0096"+
		"#\u0001\u0000\u0000\u0000\u000b%(-2ERZbov\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}