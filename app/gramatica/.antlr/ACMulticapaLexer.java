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
		ID=18, WS=19;
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
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CAPA'", "'{'", "'}'", "'CELDA'", "'('", "')'", "';'", "'VECINDAD'", 
			"','", "'SUSCEPTIBLE'", "'INFECTADO'", "'RECUPERADO'", "'MUERTO'", "'REGLA'", 
			"'->'", "'SI'", "'EN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\7\23\u0083\n\23\f\23\16\23\u0086\13\23\3\24\6\24\u0089\n\24\r\24\16\24"+
		"\u008a\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\5\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2"+
		"\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3"+
		"\2\2\2\21>\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27U\3\2\2\2\31_\3\2\2\2\33"+
		"j\3\2\2\2\35q\3\2\2\2\37w\3\2\2\2!z\3\2\2\2#}\3\2\2\2%\u0080\3\2\2\2\'"+
		"\u0088\3\2\2\2)*\7E\2\2*+\7C\2\2+,\7R\2\2,-\7C\2\2-\4\3\2\2\2./\7}\2\2"+
		"/\6\3\2\2\2\60\61\7\177\2\2\61\b\3\2\2\2\62\63\7E\2\2\63\64\7G\2\2\64"+
		"\65\7N\2\2\65\66\7F\2\2\66\67\7C\2\2\67\n\3\2\2\289\7*\2\29\f\3\2\2\2"+
		":;\7+\2\2;\16\3\2\2\2<=\7=\2\2=\20\3\2\2\2>?\7X\2\2?@\7G\2\2@A\7E\2\2"+
		"AB\7K\2\2BC\7P\2\2CD\7F\2\2DE\7C\2\2EF\7F\2\2F\22\3\2\2\2GH\7.\2\2H\24"+
		"\3\2\2\2IJ\7U\2\2JK\7W\2\2KL\7U\2\2LM\7E\2\2MN\7G\2\2NO\7R\2\2OP\7V\2"+
		"\2PQ\7K\2\2QR\7D\2\2RS\7N\2\2ST\7G\2\2T\26\3\2\2\2UV\7K\2\2VW\7P\2\2W"+
		"X\7H\2\2XY\7G\2\2YZ\7E\2\2Z[\7V\2\2[\\\7C\2\2\\]\7F\2\2]^\7Q\2\2^\30\3"+
		"\2\2\2_`\7T\2\2`a\7G\2\2ab\7E\2\2bc\7W\2\2cd\7R\2\2de\7G\2\2ef\7T\2\2"+
		"fg\7C\2\2gh\7F\2\2hi\7Q\2\2i\32\3\2\2\2jk\7O\2\2kl\7W\2\2lm\7G\2\2mn\7"+
		"T\2\2no\7V\2\2op\7Q\2\2p\34\3\2\2\2qr\7T\2\2rs\7G\2\2st\7I\2\2tu\7N\2"+
		"\2uv\7C\2\2v\36\3\2\2\2wx\7/\2\2xy\7@\2\2y \3\2\2\2z{\7U\2\2{|\7K\2\2"+
		"|\"\3\2\2\2}~\7G\2\2~\177\7P\2\2\177$\3\2\2\2\u0080\u0084\t\2\2\2\u0081"+
		"\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085&\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089"+
		"\t\4\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\24\2\2\u008d(\3\2\2\2"+
		"\5\2\u0084\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}