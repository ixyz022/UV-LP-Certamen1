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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		STRING=18, NUMBER=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"STRING", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'POBLACION'", "','", "':'", 
			"'SUSCEPTIBLE'", "'EXPOSED'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", 
			"'REGLA'", "'->'", "'SI'", "'CADA'", "'VECINOS'"
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
		"\u0004\u0000\u0014\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0092\b\u0011\n\u0011\f\u0011\u0095\t\u0011\u0001\u0012\u0004\u0012\u0098"+
		"\b\u0012\u000b\u0012\f\u0012\u0099\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u009e\b\u0012\n\u0012\f\u0012\u00a1\t\u0012\u0003\u0012\u00a3\b\u0012"+
		"\u0001\u0013\u0004\u0013\u00a6\b\u0013\u000b\u0013\f\u0013\u00a7\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__"+
		"az\u0001\u000009\u0003\u0000\t\n\r\r  \u00af\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00050\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t8\u0001"+
		"\u0000\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000"+
		"\u0000\u000fF\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013"+
		"Z\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000\u0000\u0017o\u0001"+
		"\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001b|\u0001\u0000\u0000"+
		"\u0000\u001d\u007f\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000"+
		"\u0000!\u0087\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%"+
		"\u0097\u0001\u0000\u0000\u0000\'\u00a5\u0001\u0000\u0000\u0000)*\u0005"+
		"C\u0000\u0000*+\u0005A\u0000\u0000+,\u0005P\u0000\u0000,-\u0005A\u0000"+
		"\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005{\u0000\u0000/\u0004\u0001"+
		"\u0000\u0000\u000001\u0005}\u0000\u00001\u0006\u0001\u0000\u0000\u0000"+
		"23\u0005C\u0000\u000034\u0005E\u0000\u000045\u0005L\u0000\u000056\u0005"+
		"D\u0000\u000067\u0005A\u0000\u00007\b\u0001\u0000\u0000\u000089\u0005"+
		"P\u0000\u00009:\u0005O\u0000\u0000:;\u0005B\u0000\u0000;<\u0005L\u0000"+
		"\u0000<=\u0005A\u0000\u0000=>\u0005C\u0000\u0000>?\u0005I\u0000\u0000"+
		"?@\u0005O\u0000\u0000@A\u0005N\u0000\u0000A\n\u0001\u0000\u0000\u0000"+
		"BC\u0005,\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005:\u0000\u0000"+
		"E\u000e\u0001\u0000\u0000\u0000FG\u0005S\u0000\u0000GH\u0005U\u0000\u0000"+
		"HI\u0005S\u0000\u0000IJ\u0005C\u0000\u0000JK\u0005E\u0000\u0000KL\u0005"+
		"P\u0000\u0000LM\u0005T\u0000\u0000MN\u0005I\u0000\u0000NO\u0005B\u0000"+
		"\u0000OP\u0005L\u0000\u0000PQ\u0005E\u0000\u0000Q\u0010\u0001\u0000\u0000"+
		"\u0000RS\u0005E\u0000\u0000ST\u0005X\u0000\u0000TU\u0005P\u0000\u0000"+
		"UV\u0005O\u0000\u0000VW\u0005S\u0000\u0000WX\u0005E\u0000\u0000XY\u0005"+
		"D\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005I\u0000\u0000[\\\u0005"+
		"N\u0000\u0000\\]\u0005F\u0000\u0000]^\u0005E\u0000\u0000^_\u0005C\u0000"+
		"\u0000_`\u0005T\u0000\u0000`a\u0005A\u0000\u0000ab\u0005D\u0000\u0000"+
		"bc\u0005O\u0000\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005R\u0000\u0000"+
		"ef\u0005E\u0000\u0000fg\u0005C\u0000\u0000gh\u0005U\u0000\u0000hi\u0005"+
		"P\u0000\u0000ij\u0005E\u0000\u0000jk\u0005R\u0000\u0000kl\u0005A\u0000"+
		"\u0000lm\u0005D\u0000\u0000mn\u0005O\u0000\u0000n\u0016\u0001\u0000\u0000"+
		"\u0000op\u0005M\u0000\u0000pq\u0005U\u0000\u0000qr\u0005E\u0000\u0000"+
		"rs\u0005R\u0000\u0000st\u0005T\u0000\u0000tu\u0005O\u0000\u0000u\u0018"+
		"\u0001\u0000\u0000\u0000vw\u0005R\u0000\u0000wx\u0005E\u0000\u0000xy\u0005"+
		"G\u0000\u0000yz\u0005L\u0000\u0000z{\u0005A\u0000\u0000{\u001a\u0001\u0000"+
		"\u0000\u0000|}\u0005-\u0000\u0000}~\u0005>\u0000\u0000~\u001c\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005S\u0000\u0000\u0080\u0081\u0005I\u0000\u0000"+
		"\u0081\u001e\u0001\u0000\u0000\u0000\u0082\u0083\u0005C\u0000\u0000\u0083"+
		"\u0084\u0005A\u0000\u0000\u0084\u0085\u0005D\u0000\u0000\u0085\u0086\u0005"+
		"A\u0000\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u0088\u0005V\u0000"+
		"\u0000\u0088\u0089\u0005E\u0000\u0000\u0089\u008a\u0005C\u0000\u0000\u008a"+
		"\u008b\u0005I\u0000\u0000\u008b\u008c\u0005N\u0000\u0000\u008c\u008d\u0005"+
		"O\u0000\u0000\u008d\u008e\u0005S\u0000\u0000\u008e\"\u0001\u0000\u0000"+
		"\u0000\u008f\u0093\u0007\u0000\u0000\u0000\u0090\u0092\u0007\u0001\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094$\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0007\u0002\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a2\u0001\u0000\u0000\u0000"+
		"\u009b\u009f\u0005.\u0000\u0000\u009c\u009e\u0007\u0002\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u009b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"&\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007\u0003\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0006\u0013\u0000\u0000\u00aa(\u0001"+
		"\u0000\u0000\u0000\u0006\u0000\u0093\u0099\u009f\u00a2\u00a7\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}