// Generated from d:\Documentos\Development Projects\UV-LP-Certamen1\ANTLR\ACMulticapa.g4 by ANTLR 4.9.2
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
		T__17=18, ID=19, WS=20;
	public static final int
		RULE_program = 0, RULE_layer = 1, RULE_cell = 2, RULE_vecindad = 3, RULE_cellRef = 4, 
		RULE_cellState = 5, RULE_transitionRule = 6, RULE_condition = 7, RULE_simulation = 8, 
		RULE_step = 9, RULE_cellAction = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "layer", "cell", "vecindad", "cellRef", "cellState", "transitionRule", 
			"condition", "simulation", "step", "cellAction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "';'", "'VECINDAD'", 
			"','", "'SUSCEPTIBLE'", "'INFECTADO'", "'RECUPERADO'", "'REGLA'", "'->'", 
			"'SI'", "'EN'", "'SIMULACION'", "'PASO'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "WS"
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
		public SimulationContext simulation() {
			return getRuleContext(SimulationContext.class,0);
		}
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				layer();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				transitionRule();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(32);
			simulation();
			setState(33);
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
			setState(35);
			match(T__0);
			setState(36);
			match(ID);
			setState(37);
			match(T__1);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				cell();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(43);
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
		public CellStateContext cellState() {
			return getRuleContext(CellStateContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(46);
			match(ID);
			setState(47);
			match(T__4);
			setState(48);
			cellState();
			setState(49);
			match(T__5);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(50);
				vecindad();
				}
			}

			setState(53);
			match(T__6);
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
		public List<CellRefContext> cellRef() {
			return getRuleContexts(CellRefContext.class);
		}
		public CellRefContext cellRef(int i) {
			return getRuleContext(CellRefContext.class,i);
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
			setState(55);
			match(T__7);
			setState(56);
			match(T__1);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(57);
				cellRef();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(58);
					match(T__8);
					setState(59);
					cellRef();
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(67);
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

	public static class CellRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACMulticapaParser.ID, 0); }
		public CellRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellRef; }
	}

	public final CellRefContext cellRef() throws RecognitionException {
		CellRefContext _localctx = new CellRefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cellRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	public static class CellStateContext extends ParserRuleContext {
		public CellStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellState; }
	}

	public final CellStateContext cellState() throws RecognitionException {
		CellStateContext _localctx = new CellStateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cellState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
		public List<CellStateContext> cellState() {
			return getRuleContexts(CellStateContext.class);
		}
		public CellStateContext cellState(int i) {
			return getRuleContext(CellStateContext.class,i);
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
		enterRule(_localctx, 12, RULE_transitionRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__12);
			setState(74);
			cellState();
			setState(75);
			match(T__13);
			setState(76);
			cellState();
			setState(77);
			match(T__14);
			setState(78);
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
		public CellStateContext cellState() {
			return getRuleContext(CellStateContext.class,0);
		}
		public List<CellRefContext> cellRef() {
			return getRuleContexts(CellRefContext.class);
		}
		public CellRefContext cellRef(int i) {
			return getRuleContext(CellRefContext.class,i);
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
			setState(80);
			cellState();
			setState(81);
			match(T__15);
			setState(82);
			match(T__1);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(83);
				cellRef();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(84);
					match(T__8);
					setState(85);
					cellRef();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(93);
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

	public static class SimulationContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public SimulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulation; }
	}

	public final SimulationContext simulation() throws RecognitionException {
		SimulationContext _localctx = new SimulationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simulation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__16);
			setState(96);
			match(T__1);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				step();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
			setState(102);
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

	public static class StepContext extends ParserRuleContext {
		public List<CellActionContext> cellAction() {
			return getRuleContexts(CellActionContext.class);
		}
		public CellActionContext cellAction(int i) {
			return getRuleContext(CellActionContext.class,i);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__17);
			setState(105);
			match(T__1);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				cellAction();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(111);
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

	public static class CellActionContext extends ParserRuleContext {
		public CellRefContext cellRef() {
			return getRuleContext(CellRefContext.class,0);
		}
		public CellStateContext cellState() {
			return getRuleContext(CellStateContext.class,0);
		}
		public CellActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellAction; }
	}

	public final CellActionContext cellAction() throws RecognitionException {
		CellActionContext _localctx = new CellActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cellAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			cellRef();
			setState(114);
			match(T__13);
			setState(115);
			cellState();
			setState(116);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\5\5D\n\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\5\t^\n\t\3\t\3\t\3\n\3\n\3\n\6\ne\n\n"+
		"\r\n\16\nf\3\n\3\n\3\13\3\13\3\13\6\13n\n\13\r\13\16\13o\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\f\16\2w"+
		"\2\31\3\2\2\2\4%\3\2\2\2\6/\3\2\2\2\b9\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16"+
		"K\3\2\2\2\20R\3\2\2\2\22a\3\2\2\2\24j\3\2\2\2\26s\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2"+
		"\2\35\37\5\16\b\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3"+
		"\2\2\2\"#\5\22\n\2#$\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'\7\25\2\2\')\7\4\2"+
		"\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\5\2"+
		"\2.\5\3\2\2\2/\60\7\6\2\2\60\61\7\25\2\2\61\62\7\7\2\2\62\63\5\f\7\2\63"+
		"\65\7\b\2\2\64\66\5\b\5\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		"8\7\t\2\28\7\3\2\2\29:\7\n\2\2:C\7\4\2\2;@\5\n\6\2<=\7\13\2\2=?\5\n\6"+
		"\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C;\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\7\5\2\2F\t\3\2\2\2GH\7\25\2\2H\13\3\2\2\2IJ\t"+
		"\2\2\2J\r\3\2\2\2KL\7\17\2\2LM\5\f\7\2MN\7\20\2\2NO\5\f\7\2OP\7\21\2\2"+
		"PQ\5\20\t\2Q\17\3\2\2\2RS\5\f\7\2ST\7\22\2\2T]\7\4\2\2UZ\5\n\6\2VW\7\13"+
		"\2\2WY\5\n\6\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3"+
		"\2\2\2]U\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\5\2\2`\21\3\2\2\2ab\7\23\2\2"+
		"bd\7\4\2\2ce\5\24\13\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2"+
		"\2hi\7\5\2\2i\23\3\2\2\2jk\7\24\2\2km\7\4\2\2ln\5\26\f\2ml\3\2\2\2no\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\5\2\2r\25\3\2\2\2st\5\n\6\2t"+
		"u\7\20\2\2uv\5\f\7\2vw\7\t\2\2w\27\3\2\2\2\f\33 +\65@CZ]fo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}