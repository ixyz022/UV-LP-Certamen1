// Generated from d:/Documentos/Development Projects/UV-LP-Certamen1/app/font/gramatica01/ACMulticapa01.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ACMulticapa01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, NUMBER=23, WS=24;
	public static final int
		RULE_program = 0, RULE_ignoredLines = 1, RULE_grammarChoice = 2, RULE_stepsChoice = 3, 
		RULE_durationStandard = 4, RULE_durationState = 5, RULE_layer = 6, RULE_cell = 7, 
		RULE_basicState = 8, RULE_transitions = 9, RULE_neighborTransitions = 10, 
		RULE_neighborTransitionRule = 11, RULE_durationTransitions = 12, RULE_durationTransitionRule = 13, 
		RULE_condition = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "ignoredLines", "grammarChoice", "stepsChoice", "durationStandard", 
			"durationState", "layer", "cell", "basicState", "transitions", "neighborTransitions", 
			"neighborTransitionRule", "durationTransitions", "durationTransitionRule", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'GRAMATICA:'", "'PASOS:'", "'DURACION ESTADOS'", "'{'", "'}'", 
			"'CAPA'", "'CELDA'", "'('", "')'", "'SUSCEPTIBLE'", "'EXPUESTO'", "'INFECTADO'", 
			"'RECUPERADO'", "'MUERTO'", "'TRANSICIONES POR VECINOS'", "'REGLA'", 
			"'->'", "'SI'", "'TRANSICIONES POR DURACION'", "'HAY'", "'VECINOS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS"
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
	public String getGrammarFileName() { return "ACMulticapa01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACMulticapa01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ACMulticapa01Parser.EOF, 0); }
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				ignoredLines();
				}
			}

			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(33);
				durationStandard();
				}
			}

			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				layer();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__18) {
				{
				{
				setState(41);
				transitions();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
			setState(49);
			grammarChoice();
			setState(50);
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
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
			setState(52);
			match(T__0);
			setState(53);
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
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
			setState(55);
			match(T__1);
			setState(56);
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
			setState(58);
			match(T__2);
			setState(59);
			match(T__3);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				durationState();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0) );
			setState(65);
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
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
			setState(67);
			basicState();
			setState(68);
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
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
			setState(70);
			match(T__5);
			setState(71);
			match(NUMBER);
			setState(72);
			match(T__3);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				cell();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(78);
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
		public BasicStateContext basicState() {
			return getRuleContext(BasicStateContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__6);
			setState(81);
			match(NUMBER);
			setState(82);
			match(T__7);
			setState(83);
			basicState();
			setState(84);
			match(T__8);
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
		enterRule(_localctx, 16, RULE_basicState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
		public NeighborTransitionsContext neighborTransitions() {
			return getRuleContext(NeighborTransitionsContext.class,0);
		}
		public DurationTransitionsContext durationTransitions() {
			return getRuleContext(DurationTransitionsContext.class,0);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transitions);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				neighborTransitions();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				durationTransitions();
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
	public static class NeighborTransitionsContext extends ParserRuleContext {
		public List<NeighborTransitionRuleContext> neighborTransitionRule() {
			return getRuleContexts(NeighborTransitionRuleContext.class);
		}
		public NeighborTransitionRuleContext neighborTransitionRule(int i) {
			return getRuleContext(NeighborTransitionRuleContext.class,i);
		}
		public NeighborTransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neighborTransitions; }
	}

	public final NeighborTransitionsContext neighborTransitions() throws RecognitionException {
		NeighborTransitionsContext _localctx = new NeighborTransitionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_neighborTransitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__14);
			setState(93);
			match(T__3);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				neighborTransitionRule();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			setState(99);
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
	public static class NeighborTransitionRuleContext extends ParserRuleContext {
		public List<BasicStateContext> basicState() {
			return getRuleContexts(BasicStateContext.class);
		}
		public BasicStateContext basicState(int i) {
			return getRuleContext(BasicStateContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NeighborTransitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neighborTransitionRule; }
	}

	public final NeighborTransitionRuleContext neighborTransitionRule() throws RecognitionException {
		NeighborTransitionRuleContext _localctx = new NeighborTransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_neighborTransitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__15);
			setState(102);
			basicState();
			setState(103);
			match(T__16);
			setState(104);
			basicState();
			setState(105);
			match(T__17);
			setState(106);
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
			setState(108);
			match(T__18);
			setState(109);
			match(T__3);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				durationTransitionRule();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0) );
			setState(115);
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
			setState(117);
			basicState();
			setState(118);
			match(T__16);
			setState(119);
			basicState();
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
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
		public BasicStateContext basicState() {
			return getRuleContext(BasicStateContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__19);
			setState(122);
			match(NUMBER);
			setState(123);
			match(T__20);
			setState(124);
			basicState();
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
		"\u0004\u0001\u0018\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0003"+
		"\u0000 \b\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0005\u0000+\b\u0000\n\u0000"+
		"\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004>\b\u0004\u000b"+
		"\u0004\f\u0004?\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006K\b"+
		"\u0006\u000b\u0006\f\u0006L\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0003\t[\b\t\u0001\n\u0001\n\u0001\n\u0004\n`\b\n\u000b"+
		"\n\f\na\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\fp"+
		"\b\f\u000b\f\f\fq\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0001\u0001\u0000\n\u000ex\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000"+
		"\u0000\u00067\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nC\u0001"+
		"\u0000\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000"+
		"\u0000\u0010V\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014"+
		"\\\u0001\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018l\u0001"+
		"\u0000\u0000\u0000\u001au\u0001\u0000\u0000\u0000\u001cy\u0001\u0000\u0000"+
		"\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!#\u0003\b\u0004"+
		"\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$&\u0003\f\u0006\u0000%$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(,\u0001\u0000\u0000\u0000)+\u0003\u0012\t\u0000*)\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0000"+
		"\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0003\u0004\u0002\u0000"+
		"23\u0003\u0006\u0003\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0005\u0017\u0000\u00006\u0005\u0001\u0000\u0000\u0000"+
		"78\u0005\u0002\u0000\u000089\u0005\u0017\u0000\u00009\u0007\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0003\u0000\u0000;=\u0005\u0004\u0000\u0000<>\u0003"+
		"\n\u0005\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0005\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0003\u0010\b"+
		"\u0000DE\u0005\u0017\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0006\u0000\u0000GH\u0005\u0017\u0000\u0000HJ\u0005\u0004\u0000\u0000"+
		"IK\u0003\u000e\u0007\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0005\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0007\u0000\u0000QR\u0005\u0017\u0000\u0000RS\u0005\b\u0000\u0000ST\u0003"+
		"\u0010\b\u0000TU\u0005\t\u0000\u0000U\u000f\u0001\u0000\u0000\u0000VW"+
		"\u0007\u0000\u0000\u0000W\u0011\u0001\u0000\u0000\u0000X[\u0003\u0014"+
		"\n\u0000Y[\u0003\u0018\f\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\u0013\u0001\u0000\u0000\u0000\\]\u0005\u000f\u0000\u0000"+
		"]_\u0005\u0004\u0000\u0000^`\u0003\u0016\u000b\u0000_^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0005\u0000\u0000d\u0015"+
		"\u0001\u0000\u0000\u0000ef\u0005\u0010\u0000\u0000fg\u0003\u0010\b\u0000"+
		"gh\u0005\u0011\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005\u0012\u0000\u0000"+
		"jk\u0003\u001c\u000e\u0000k\u0017\u0001\u0000\u0000\u0000lm\u0005\u0013"+
		"\u0000\u0000mo\u0005\u0004\u0000\u0000np\u0003\u001a\r\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0005\u0000\u0000"+
		"t\u0019\u0001\u0000\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005\u0011\u0000"+
		"\u0000wx\u0003\u0010\b\u0000x\u001b\u0001\u0000\u0000\u0000yz\u0005\u0014"+
		"\u0000\u0000z{\u0005\u0017\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0003"+
		"\u0010\b\u0000}\u001d\u0001\u0000\u0000\u0000\t\u001f\"\',?LZaq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}