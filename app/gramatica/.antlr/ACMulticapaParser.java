// Generated from d:\Documentos\Development Projects\UV-LP-Certamen1\app\gramatica\ACMulticapa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACMulticapaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, STRING=16, 
		NUMBER=17, WS=18;
	public static final int
		RULE_program = 0, RULE_layer = 1, RULE_cell = 2, RULE_diseaseState = 3, 
		RULE_transitionRule = 4, RULE_condition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "layer", "cell", "diseaseState", "transitionRule", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "'SUSCEPTIBLE'", 
			"'EXPOSED'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", "'REGLA'", "'->'", 
			"'SI'", "'VECINOS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "ACMulticapa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACMulticapaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ACMulticapaParser.EOF, 0); }
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				layer();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				transitionRule();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(22);
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

	public static class LayerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapaParser.NUMBER, 0); }
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
		enterRule(_localctx, 2, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(NUMBER);
			setState(26);
			match(T__1);
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				cell();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(32);
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

	public static class CellContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ACMulticapaParser.NUMBER, 0); }
		public DiseaseStateContext diseaseState() {
			return getRuleContext(DiseaseStateContext.class,0);
		}
		public CellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell; }
	}

	public final CellContext cell() throws RecognitionException {
		CellContext _localctx = new CellContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__3);
			setState(35);
			match(NUMBER);
			setState(36);
			match(T__4);
			setState(37);
			diseaseState();
			setState(38);
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

	public static class DiseaseStateContext extends ParserRuleContext {
		public DiseaseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseaseState; }
	}

	public final DiseaseStateContext diseaseState() throws RecognitionException {
		DiseaseStateContext _localctx = new DiseaseStateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_diseaseState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
	}

	public final TransitionRuleContext transitionRule() throws RecognitionException {
		TransitionRuleContext _localctx = new TransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__11);
			setState(43);
			diseaseState();
			setState(44);
			match(T__12);
			setState(45);
			diseaseState();
			setState(46);
			match(T__13);
			setState(47);
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

	public static class ConditionContext extends ParserRuleContext {
		public DiseaseStateContext diseaseState() {
			return getRuleContext(DiseaseStateContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__14);
			setState(50);
			diseaseState();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\67\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\6"+
		"\2\25\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\t\r\2\63\2\17\3\2\2\2\4\32\3\2\2"+
		"\2\6$\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f\63\3\2\2\2\16\20\5\4\3\2\17\16\3"+
		"\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5"+
		"\n\6\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3"+
		"\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\7\3\2\2\33\34\7\23\2\2\34\36\7"+
		"\4\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!"+
		"\"\3\2\2\2\"#\7\5\2\2#\5\3\2\2\2$%\7\6\2\2%&\7\23\2\2&\'\7\7\2\2\'(\5"+
		"\b\5\2()\7\b\2\2)\7\3\2\2\2*+\t\2\2\2+\t\3\2\2\2,-\7\16\2\2-.\5\b\5\2"+
		"./\7\17\2\2/\60\5\b\5\2\60\61\7\20\2\2\61\62\5\f\7\2\62\13\3\2\2\2\63"+
		"\64\7\21\2\2\64\65\5\b\5\2\65\r\3\2\2\2\5\21\26 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}