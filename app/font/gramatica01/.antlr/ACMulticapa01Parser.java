// Generated from c:/Users/ixyz0/Personal/Dev/UV-LP-Certamen1/app/font/gramatica01/ACMulticapa01.g4 by ANTLR 4.13.1
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
		STRING=18, NUMBER=19, WS=20;
	public static final int
		RULE_program = 0, RULE_layer = 1, RULE_cell = 2, RULE_diseaseState = 3, 
		RULE_transitionRule = 4, RULE_condition = 5, RULE_transitionDiseaseState = 6, 
		RULE_step = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "layer", "cell", "diseaseState", "transitionRule", "condition", 
			"transitionDiseaseState", "step"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "'SUSCEPTIBLE'", 
			"'EXPUESTO'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", "'REGLA'", "'->'", 
			"'SI'", "'VECINOS'", "'DURANTE'", "'PASOS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "NUMBER", "WS"
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
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public List<TransitionRuleContext> transitionRule() {
			return getRuleContexts(TransitionRuleContext.class);
		}
		public TransitionRuleContext transitionRule(int i) {
			return getRuleContext(TransitionRuleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				layer();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				transitionRule();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(26);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitLayer(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(NUMBER);
			setState(30);
			match(T__1);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				cell();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(36);
			match(T__2);
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
		public DiseaseStateContext diseaseState() {
			return getRuleContext(DiseaseStateContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterCell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitCell(this);
		}
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(39);
			match(NUMBER);
			setState(40);
			match(T__4);
			setState(41);
			diseaseState();
			setState(42);
			match(T__5);
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
		public DiseaseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseaseState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterDiseaseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitDiseaseState(this);
		}
	}

	public final DiseaseStateContext diseaseState() throws RecognitionException {
		DiseaseStateContext _localctx = new DiseaseStateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_diseaseState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
	public static class TransitionRuleContext extends ParserRuleContext {
		public List<DiseaseStateContext> diseaseState() {
			return getRuleContexts(DiseaseStateContext.class);
		}
		public DiseaseStateContext diseaseState(int i) {
			return getRuleContext(DiseaseStateContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TransitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterTransitionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitTransitionRule(this);
		}
	}

	public final TransitionRuleContext transitionRule() throws RecognitionException {
		TransitionRuleContext _localctx = new TransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__11);
			setState(47);
			diseaseState();
			setState(48);
			match(T__12);
			setState(49);
			diseaseState();
			setState(50);
			match(T__13);
			setState(51);
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
		public TransitionDiseaseStateContext transitionDiseaseState() {
			return getRuleContext(TransitionDiseaseStateContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__14);
			setState(54);
			transitionDiseaseState();
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
	public static class TransitionDiseaseStateContext extends ParserRuleContext {
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public TransitionDiseaseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDiseaseState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterTransitionDiseaseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitTransitionDiseaseState(this);
		}
	}

	public final TransitionDiseaseStateContext transitionDiseaseState() throws RecognitionException {
		TransitionDiseaseStateContext _localctx = new TransitionDiseaseStateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transitionDiseaseState);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__7);
				setState(58);
				step();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__8);
				setState(60);
				step();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(T__9);
				setState(62);
				step();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				match(T__10);
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
	public static class StepContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapa01Parser.NUMBER, 0); }
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACMulticapa01Listener ) ((ACMulticapa01Listener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__15);
			setState(67);
			match(NUMBER);
			setState(68);
			match(T__16);
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
		"\u0004\u0001\u0014G\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0004\u0000\u0017\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001!\b"+
		"\u0001\u000b\u0001\f\u0001\"\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006A\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000"+
		"\u0001\u0001\u0000\u0007\u000bE\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u001c\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000"+
		"\f@\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0017"+
		"\u0003\b\u0004\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0000\u0000\u0001\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001d\u0005"+
		"\u0001\u0000\u0000\u001d\u001e\u0005\u0013\u0000\u0000\u001e \u0005\u0002"+
		"\u0000\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%\u0003"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005\u0013\u0000"+
		"\u0000()\u0005\u0005\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0006"+
		"\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,-\u0007\u0000\u0000\u0000"+
		"-\u0007\u0001\u0000\u0000\u0000./\u0005\f\u0000\u0000/0\u0003\u0006\u0003"+
		"\u000001\u0005\r\u0000\u000012\u0003\u0006\u0003\u000023\u0005\u000e\u0000"+
		"\u000034\u0003\n\u0005\u00004\t\u0001\u0000\u0000\u000056\u0005\u000f"+
		"\u0000\u000067\u0003\f\u0006\u00007\u000b\u0001\u0000\u0000\u00008A\u0005"+
		"\u0007\u0000\u00009:\u0005\b\u0000\u0000:A\u0003\u000e\u0007\u0000;<\u0005"+
		"\t\u0000\u0000<A\u0003\u000e\u0007\u0000=>\u0005\n\u0000\u0000>A\u0003"+
		"\u000e\u0007\u0000?A\u0005\u000b\u0000\u0000@8\u0001\u0000\u0000\u0000"+
		"@9\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000BC\u0005\u0010"+
		"\u0000\u0000CD\u0005\u0013\u0000\u0000DE\u0005\u0011\u0000\u0000E\u000f"+
		"\u0001\u0000\u0000\u0000\u0004\u0013\u0018\"@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}