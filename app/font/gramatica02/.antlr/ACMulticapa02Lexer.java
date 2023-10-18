// Generated from c:/Users/ixyz0/Personal/Dev/UV-LP-Certamen1/app/font/gramatica02/ACMulticapa02.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ACMulticapa02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, STRING=17, 
		NUMBER=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "STRING", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'POBLACION'", "','", "':'", 
			"'SUSCEPTIBLE'", "'EXPOSED'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", 
			"'REGLA'", "'->'", "'SI'", "'VECINOS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING", "NUMBER", "WS"
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


	public ACMulticapa02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACMulticapa02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u008b\b\u0010"+
		"\n\u0010\f\u0010\u008e\t\u0010\u0001\u0011\u0004\u0011\u0091\b\u0011\u000b"+
		"\u0011\f\u0011\u0092\u0001\u0011\u0001\u0011\u0005\u0011\u0097\b\u0011"+
		"\n\u0011\f\u0011\u009a\t\u0011\u0003\u0011\u009c\b\u0011\u0001\u0012\u0004"+
		"\u0012\u009f\b\u0012\u000b\u0012\f\u0012\u00a0\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000"+
		"\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003,\u0001"+
		"\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000"+
		"\u0000\t6\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rB\u0001"+
		"\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000"+
		"\u0000\u0013X\u0001\u0000\u0000\u0000\u0015b\u0001\u0000\u0000\u0000\u0017"+
		"m\u0001\u0000\u0000\u0000\u0019t\u0001\u0000\u0000\u0000\u001bz\u0001"+
		"\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000"+
		"\u0000\u0000!\u0088\u0001\u0000\u0000\u0000#\u0090\u0001\u0000\u0000\u0000"+
		"%\u009e\u0001\u0000\u0000\u0000\'(\u0005C\u0000\u0000()\u0005A\u0000\u0000"+
		")*\u0005P\u0000\u0000*+\u0005A\u0000\u0000+\u0002\u0001\u0000\u0000\u0000"+
		",-\u0005{\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005}\u0000\u0000"+
		"/\u0006\u0001\u0000\u0000\u000001\u0005C\u0000\u000012\u0005E\u0000\u0000"+
		"23\u0005L\u0000\u000034\u0005D\u0000\u000045\u0005A\u0000\u00005\b\u0001"+
		"\u0000\u0000\u000067\u0005P\u0000\u000078\u0005O\u0000\u000089\u0005B"+
		"\u0000\u00009:\u0005L\u0000\u0000:;\u0005A\u0000\u0000;<\u0005C\u0000"+
		"\u0000<=\u0005I\u0000\u0000=>\u0005O\u0000\u0000>?\u0005N\u0000\u0000"+
		"?\n\u0001\u0000\u0000\u0000@A\u0005,\u0000\u0000A\f\u0001\u0000\u0000"+
		"\u0000BC\u0005:\u0000\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005S\u0000"+
		"\u0000EF\u0005U\u0000\u0000FG\u0005S\u0000\u0000GH\u0005C\u0000\u0000"+
		"HI\u0005E\u0000\u0000IJ\u0005P\u0000\u0000JK\u0005T\u0000\u0000KL\u0005"+
		"I\u0000\u0000LM\u0005B\u0000\u0000MN\u0005L\u0000\u0000NO\u0005E\u0000"+
		"\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005E\u0000\u0000QR\u0005X\u0000"+
		"\u0000RS\u0005P\u0000\u0000ST\u0005O\u0000\u0000TU\u0005S\u0000\u0000"+
		"UV\u0005E\u0000\u0000VW\u0005D\u0000\u0000W\u0012\u0001\u0000\u0000\u0000"+
		"XY\u0005I\u0000\u0000YZ\u0005N\u0000\u0000Z[\u0005F\u0000\u0000[\\\u0005"+
		"E\u0000\u0000\\]\u0005C\u0000\u0000]^\u0005T\u0000\u0000^_\u0005A\u0000"+
		"\u0000_`\u0005D\u0000\u0000`a\u0005O\u0000\u0000a\u0014\u0001\u0000\u0000"+
		"\u0000bc\u0005R\u0000\u0000cd\u0005E\u0000\u0000de\u0005C\u0000\u0000"+
		"ef\u0005U\u0000\u0000fg\u0005P\u0000\u0000gh\u0005E\u0000\u0000hi\u0005"+
		"R\u0000\u0000ij\u0005A\u0000\u0000jk\u0005D\u0000\u0000kl\u0005O\u0000"+
		"\u0000l\u0016\u0001\u0000\u0000\u0000mn\u0005M\u0000\u0000no\u0005U\u0000"+
		"\u0000op\u0005E\u0000\u0000pq\u0005R\u0000\u0000qr\u0005T\u0000\u0000"+
		"rs\u0005O\u0000\u0000s\u0018\u0001\u0000\u0000\u0000tu\u0005R\u0000\u0000"+
		"uv\u0005E\u0000\u0000vw\u0005G\u0000\u0000wx\u0005L\u0000\u0000xy\u0005"+
		"A\u0000\u0000y\u001a\u0001\u0000\u0000\u0000z{\u0005-\u0000\u0000{|\u0005"+
		">\u0000\u0000|\u001c\u0001\u0000\u0000\u0000}~\u0005S\u0000\u0000~\u007f"+
		"\u0005I\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"V\u0000\u0000\u0081\u0082\u0005E\u0000\u0000\u0082\u0083\u0005C\u0000"+
		"\u0000\u0083\u0084\u0005I\u0000\u0000\u0084\u0085\u0005N\u0000\u0000\u0085"+
		"\u0086\u0005O\u0000\u0000\u0086\u0087\u0005S\u0000\u0000\u0087 \u0001"+
		"\u0000\u0000\u0000\u0088\u008c\u0007\u0000\u0000\u0000\u0089\u008b\u0007"+
		"\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0007\u0002\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u009b\u0001\u0000"+
		"\u0000\u0000\u0094\u0098\u0005.\u0000\u0000\u0095\u0097\u0007\u0002\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c$\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0003\u0000\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0012\u0000\u0000"+
		"\u00a3&\u0001\u0000\u0000\u0000\u0006\u0000\u008c\u0092\u0098\u009b\u00a0"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}