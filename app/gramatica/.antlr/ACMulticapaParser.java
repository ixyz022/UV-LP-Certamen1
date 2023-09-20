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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, NUMBER=21, WS=22;
	public static final int
		RULE_program = 0, RULE_layer = 1, RULE_cell = 2, RULE_vecindad = 3, RULE_layeredCellRef = 4, 
		RULE_diseaseState = 5, RULE_transitionRule = 6, RULE_condition = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "layer", "cell", "vecindad", "layeredCellRef", "diseaseState", 
			"transitionRule", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "'VECINDAD'", 
			"','", "'.'", "'SUSCEPTIBLE'", "'EXPOSED'", "'INFECTADO'", "'RECUPERADO'", 
			"'MUERTO'", "'REGLA'", "'->'", "'SI'", "'RATE'", "'EN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "NUMBER", "WS"
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
			} while ( _la==T__14 );
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

	public static class LayerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACMulticapaParser.ID, 0); }
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
			setState(28);
			match(T__0);
			setState(29);
			match(ID);
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

	public static class CellContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACMulticapaParser.ID, 0); }
		public DiseaseStateContext diseaseState() {
			return getRuleContext(DiseaseStateContext.class,0);
		}
		public VecindadContext vecindad() {
			return getRuleContext(VecindadContext.class,0);
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
			setState(38);
			match(T__3);
			setState(39);
			match(ID);
			setState(40);
			match(T__4);
			setState(41);
			diseaseState();
			setState(42);
			match(T__5);
			setState(43);
			vecindad();
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

	public static class VecindadContext extends ParserRuleContext {
		public List<LayeredCellRefContext> layeredCellRef() {
			return getRuleContexts(LayeredCellRefContext.class);
		}
		public LayeredCellRefContext layeredCellRef(int i) {
			return getRuleContext(LayeredCellRefContext.class,i);
		}
		public VecindadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vecindad; }
	}

	public final VecindadContext vecindad() throws RecognitionException {
		VecindadContext _localctx = new VecindadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vecindad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__6);
			setState(46);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(47);
				layeredCellRef();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(48);
					match(T__7);
					setState(49);
					layeredCellRef();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(57);
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

	public static class LayeredCellRefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACMulticapaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACMulticapaParser.ID, i);
		}
		public LayeredCellRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layeredCellRef; }
	}

	public final LayeredCellRefContext layeredCellRef() throws RecognitionException {
		LayeredCellRefContext _localctx = new LayeredCellRefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layeredCellRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(ID);
			setState(60);
			match(T__8);
			setState(61);
			match(ID);
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
		enterRule(_localctx, 10, RULE_diseaseState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		public TerminalNode NUMBER() { return getToken(ACMulticapaParser.NUMBER, 0); }
		public TransitionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionRule; }
	}

	public final TransitionRuleContext transitionRule() throws RecognitionException {
		TransitionRuleContext _localctx = new TransitionRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__14);
			setState(66);
			diseaseState();
			setState(67);
			match(T__15);
			setState(68);
			diseaseState();
			setState(69);
			match(T__16);
			setState(70);
			condition();
			setState(71);
			match(T__17);
			setState(72);
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

	public static class ConditionContext extends ParserRuleContext {
		public DiseaseStateContext diseaseState() {
			return getRuleContext(DiseaseStateContext.class,0);
		}
		public List<LayeredCellRefContext> layeredCellRef() {
			return getRuleContexts(LayeredCellRefContext.class);
		}
		public LayeredCellRefContext layeredCellRef(int i) {
			return getRuleContext(LayeredCellRefContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			diseaseState();
			setState(75);
			match(T__18);
			setState(76);
			match(T__1);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(77);
				layeredCellRef();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(78);
					match(T__7);
					setState(79);
					layeredCellRef();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(87);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r"+
		"\2\16\2\25\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\6\3#\n\3"+
		"\r\3\16\3$\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\65\n\5\f\5\16\58\13\5\5\5:\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tS\n\t\f\t\16"+
		"\tV\13\t\5\tX\n\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\f\20\2Z"+
		"\2\23\3\2\2\2\4\36\3\2\2\2\6(\3\2\2\2\b/\3\2\2\2\n=\3\2\2\2\fA\3\2\2\2"+
		"\16C\3\2\2\2\20L\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\31\5\16\b\2\30\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\2\2\3\35"+
		"\3\3\2\2\2\36\37\7\3\2\2\37 \7\26\2\2 \"\7\4\2\2!#\5\6\4\2\"!\3\2\2\2"+
		"#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\5\2\2\'\5\3\2\2\2()\7\6"+
		"\2\2)*\7\26\2\2*+\7\7\2\2+,\5\f\7\2,-\7\b\2\2-.\5\b\5\2.\7\3\2\2\2/\60"+
		"\7\t\2\2\609\7\4\2\2\61\66\5\n\6\2\62\63\7\n\2\2\63\65\5\n\6\2\64\62\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\2"+
		"9\61\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\5\2\2<\t\3\2\2\2=>\7\26\2\2>?\7\13"+
		"\2\2?@\7\26\2\2@\13\3\2\2\2AB\t\2\2\2B\r\3\2\2\2CD\7\21\2\2DE\5\f\7\2"+
		"EF\7\22\2\2FG\5\f\7\2GH\7\23\2\2HI\5\20\t\2IJ\7\24\2\2JK\7\27\2\2K\17"+
		"\3\2\2\2LM\5\f\7\2MN\7\25\2\2NW\7\4\2\2OT\5\n\6\2PQ\7\n\2\2QS\5\n\6\2"+
		"RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WO\3\2\2\2"+
		"WX\3\2\2\2XY\3\2\2\2YZ\7\5\2\2Z\21\3\2\2\2\t\25\32$\669TW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}