// Generated from d:\Documentos\Development Projects\UV-LP-Certamen1\app\gramatica\ACMulticapa.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACMulticapaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, NUMBER=21, WS=22;
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
			"T__17", "T__18", "ID", "NUMBER", "WS"
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


	public ACMulticapaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACMulticapa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\7\25\u0096\n\25\f\25\16\25\u0099\13\25\3"+
		"\26\6\26\u009c\n\26\r\26\16\26\u009d\3\26\3\26\7\26\u00a2\n\26\f\26\16"+
		"\26\u00a5\13\26\5\26\u00a7\n\26\3\27\6\27\u00aa\n\27\r\27\16\27\u00ab"+
		"\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00b3\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7\66\3"+
		"\2\2\2\t8\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21K\3\2\2\2\23M\3"+
		"\2\2\2\25O\3\2\2\2\27[\3\2\2\2\31c\3\2\2\2\33m\3\2\2\2\35x\3\2\2\2\37"+
		"\177\3\2\2\2!\u0085\3\2\2\2#\u0088\3\2\2\2%\u008b\3\2\2\2\'\u0090\3\2"+
		"\2\2)\u0093\3\2\2\2+\u009b\3\2\2\2-\u00a9\3\2\2\2/\60\7E\2\2\60\61\7C"+
		"\2\2\61\62\7R\2\2\62\63\7C\2\2\63\4\3\2\2\2\64\65\7}\2\2\65\6\3\2\2\2"+
		"\66\67\7\177\2\2\67\b\3\2\2\289\7E\2\29:\7G\2\2:;\7N\2\2;<\7F\2\2<=\7"+
		"C\2\2=\n\3\2\2\2>?\7*\2\2?\f\3\2\2\2@A\7+\2\2A\16\3\2\2\2BC\7X\2\2CD\7"+
		"G\2\2DE\7E\2\2EF\7K\2\2FG\7P\2\2GH\7F\2\2HI\7C\2\2IJ\7F\2\2J\20\3\2\2"+
		"\2KL\7.\2\2L\22\3\2\2\2MN\7\60\2\2N\24\3\2\2\2OP\7U\2\2PQ\7W\2\2QR\7U"+
		"\2\2RS\7E\2\2ST\7G\2\2TU\7R\2\2UV\7V\2\2VW\7K\2\2WX\7D\2\2XY\7N\2\2YZ"+
		"\7G\2\2Z\26\3\2\2\2[\\\7G\2\2\\]\7Z\2\2]^\7R\2\2^_\7Q\2\2_`\7U\2\2`a\7"+
		"G\2\2ab\7F\2\2b\30\3\2\2\2cd\7K\2\2de\7P\2\2ef\7H\2\2fg\7G\2\2gh\7E\2"+
		"\2hi\7V\2\2ij\7C\2\2jk\7F\2\2kl\7Q\2\2l\32\3\2\2\2mn\7T\2\2no\7G\2\2o"+
		"p\7E\2\2pq\7W\2\2qr\7R\2\2rs\7G\2\2st\7T\2\2tu\7C\2\2uv\7F\2\2vw\7Q\2"+
		"\2w\34\3\2\2\2xy\7O\2\2yz\7W\2\2z{\7G\2\2{|\7T\2\2|}\7V\2\2}~\7Q\2\2~"+
		"\36\3\2\2\2\177\u0080\7T\2\2\u0080\u0081\7G\2\2\u0081\u0082\7I\2\2\u0082"+
		"\u0083\7N\2\2\u0083\u0084\7C\2\2\u0084 \3\2\2\2\u0085\u0086\7/\2\2\u0086"+
		"\u0087\7@\2\2\u0087\"\3\2\2\2\u0088\u0089\7U\2\2\u0089\u008a\7K\2\2\u008a"+
		"$\3\2\2\2\u008b\u008c\7T\2\2\u008c\u008d\7C\2\2\u008d\u008e\7V\2\2\u008e"+
		"\u008f\7G\2\2\u008f&\3\2\2\2\u0090\u0091\7G\2\2\u0091\u0092\7P\2\2\u0092"+
		"(\3\2\2\2\u0093\u0097\t\2\2\2\u0094\u0096\t\3\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098*\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a6\3\2"+
		"\2\2\u009f\u00a3\7\60\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		",\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\b\27\2\2\u00ae.\3\2\2\2\b\2\u0097\u009d\u00a3\u00a6\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}