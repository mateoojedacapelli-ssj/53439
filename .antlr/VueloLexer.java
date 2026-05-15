// Generated from c:/Users/Mateo/ssl-antlr-calculator/Vuelo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VueloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ESTADO=4, HORA=5, CODIGO_VUELO=6, AEROPUERTO=7, 
		PUERTA=8, FECHA=9, OPERADOR=10, ASIENTO=11, TERMINAL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ESTADO", "HORA", "CODIGO_VUELO", "AEROPUERTO", 
			"PUERTA", "FECHA", "OPERADOR", "ASIENTO", "TERMINAL", "WS", "LETRA", 
			"DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "','", "'Gate:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ESTADO", "HORA", "CODIGO_VUELO", "AEROPUERTO", 
			"PUERTA", "FECHA", "OPERADOR", "ASIENTO", "TERMINAL", "WS"
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


	public VueloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vuelo.g4"; }

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
		"\u0004\u0000\r\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0004\u0007]\b\u0007\u000b\u0007\f\u0007^\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\tm\b\t\n\t\f\tp\t\t\u0001\n\u0001\n\u0004\nt\b\n\u000b\n\f\n"+
		"u\u0001\u000b\u0001\u000b\u0003\u000bz\b\u000b\u0001\f\u0004\f}\b\f\u000b"+
		"\f\f\f~\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u0000\u001d\u0000\u0001\u0000\b\u0001\u000001\u0001\u000009\u0001\u0000"+
		"03\u0001\u000005\u0001\u0000AZ\u0001\u0000AF\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZaz\u008d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000"+
		"\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000\u0000\u0000\u0007"+
		"@\u0001\u0000\u0000\u0000\tN\u0001\u0000\u0000\u0000\u000bP\u0001\u0000"+
		"\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000"+
		"\u0011`\u0001\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015q"+
		"\u0001\u0000\u0000\u0000\u0017y\u0001\u0000\u0000\u0000\u0019|\u0001\u0000"+
		"\u0000\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0084\u0001\u0000"+
		"\u0000\u0000\u001f \u0005-\u0000\u0000 \u0002\u0001\u0000\u0000\u0000"+
		"!\"\u0005,\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005G\u0000"+
		"\u0000$%\u0005a\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005:\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005O\u0000\u0000"+
		"*+\u0005N\u0000\u0000+,\u0005_\u0000\u0000,-\u0005T\u0000\u0000-.\u0005"+
		"I\u0000\u0000./\u0005M\u0000\u0000/A\u0005E\u0000\u000001\u0005D\u0000"+
		"\u000012\u0005E\u0000\u000023\u0005L\u0000\u000034\u0005A\u0000\u0000"+
		"45\u0005Y\u0000\u000056\u0005E\u0000\u00006A\u0005D\u0000\u000078\u0005"+
		"C\u0000\u000089\u0005A\u0000\u00009:\u0005N\u0000\u0000:;\u0005C\u0000"+
		"\u0000;<\u0005E\u0000\u0000<=\u0005L\u0000\u0000=>\u0005L\u0000\u0000"+
		">?\u0005E\u0000\u0000?A\u0005D\u0000\u0000@)\u0001\u0000\u0000\u0000@"+
		"0\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000A\b\u0001\u0000\u0000"+
		"\u0000BC\u0007\u0000\u0000\u0000CG\u0007\u0001\u0000\u0000DE\u00052\u0000"+
		"\u0000EG\u0007\u0002\u0000\u0000FB\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0005:\u0000\u0000IJ\u0007\u0003"+
		"\u0000\u0000JO\u0007\u0001\u0000\u0000KL\u0005N\u0000\u0000LM\u0005O\u0000"+
		"\u0000MO\u0005W\u0000\u0000NF\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000"+
		"\u0000O\n\u0001\u0000\u0000\u0000PQ\u0007\u0004\u0000\u0000QR\u0007\u0004"+
		"\u0000\u0000RS\u0007\u0001\u0000\u0000ST\u0007\u0001\u0000\u0000TU\u0007"+
		"\u0001\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0007\u0004\u0000\u0000"+
		"WX\u0007\u0004\u0000\u0000XY\u0007\u0004\u0000\u0000Y\u000e\u0001\u0000"+
		"\u0000\u0000Z\\\u0007\u0004\u0000\u0000[]\u0007\u0001\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`a\u0003\u001d"+
		"\u000e\u0000ab\u0003\u001d\u000e\u0000bc\u0005/\u0000\u0000cd\u0003\u001d"+
		"\u000e\u0000de\u0003\u001d\u000e\u0000ef\u0005/\u0000\u0000fg\u0003\u001d"+
		"\u000e\u0000gh\u0003\u001d\u000e\u0000h\u0012\u0001\u0000\u0000\u0000"+
		"in\u0003\u001b\r\u0000jm\u0003\u001b\r\u0000km\u0005 \u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0014\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0007\u0005\u0000\u0000rt\u0003"+
		"\u001d\u000e\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0016\u0001\u0000"+
		"\u0000\u0000wz\u0003\u001d\u000e\u0000xz\u0003\u001b\r\u0000yw\u0001\u0000"+
		"\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0018\u0001\u0000\u0000\u0000"+
		"{}\u0007\u0006\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\f\u0000\u0000\u0081\u001a"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0007\u0000\u0000\u0083\u001c"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0001\u0000\u0000\u0085\u001e"+
		"\u0001\u0000\u0000\u0000\n\u0000@FN^lnuy~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}