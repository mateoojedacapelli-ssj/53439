// Generated from c:/Users/Mateo/ssl-antlr-calculator/Vuelo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VueloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ESTADO=4, HORA=5, CODIGO_VUELO=6, AEROPUERTO=7, 
		PUERTA=8, FECHA=9, OPERADOR=10, ASIENTO=11, TERMINAL=12, WS=13;
	public static final int
		RULE_prog = 0, RULE_vuelo = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "vuelo"
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

	@Override
	public String getGrammarFileName() { return "Vuelo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VueloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VueloParser.EOF, 0); }
		public List<VueloContext> vuelo() {
			return getRuleContexts(VueloContext.class);
		}
		public VueloContext vuelo(int i) {
			return getRuleContext(VueloContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VueloListener ) ((VueloListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VueloListener ) ((VueloListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				vuelo();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CODIGO_VUELO );
			setState(9);
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
	public static class VueloContext extends ParserRuleContext {
		public VueloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vuelo; }
	 
		public VueloContext() { }
		public void copyFrom(VueloContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfoVueloContext extends VueloContext {
		public Token origen;
		public Token destino;
		public TerminalNode CODIGO_VUELO() { return getToken(VueloParser.CODIGO_VUELO, 0); }
		public TerminalNode HORA() { return getToken(VueloParser.HORA, 0); }
		public TerminalNode ESTADO() { return getToken(VueloParser.ESTADO, 0); }
		public TerminalNode PUERTA() { return getToken(VueloParser.PUERTA, 0); }
		public List<TerminalNode> AEROPUERTO() { return getTokens(VueloParser.AEROPUERTO); }
		public TerminalNode AEROPUERTO(int i) {
			return getToken(VueloParser.AEROPUERTO, i);
		}
		public InfoVueloContext(VueloContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VueloListener ) ((VueloListener)listener).enterInfoVuelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VueloListener ) ((VueloListener)listener).exitInfoVuelo(this);
		}
	}

	public final VueloContext vuelo() throws RecognitionException {
		VueloContext _localctx = new VueloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vuelo);
		try {
			_localctx = new InfoVueloContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(CODIGO_VUELO);
			setState(12);
			((InfoVueloContext)_localctx).origen = match(AEROPUERTO);
			setState(13);
			match(T__0);
			setState(14);
			((InfoVueloContext)_localctx).destino = match(AEROPUERTO);
			setState(15);
			match(HORA);
			setState(16);
			match(T__1);
			setState(17);
			match(ESTADO);
			setState(18);
			match(T__1);
			setState(19);
			match(T__2);
			setState(20);
			match(PUERTA);
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
		"\u0004\u0001\r\u0017\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0015\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0002\u000b\u0001\u0000\u0000\u0000\u0004\u0006"+
		"\u0003\u0002\u0001\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001"+
		"\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\n\u0005\u0000\u0000\u0001"+
		"\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0005\u0006\u0000\u0000\f\r\u0005"+
		"\u0007\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0007"+
		"\u0000\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010\u0011\u0005\u0002"+
		"\u0000\u0000\u0011\u0012\u0005\u0004\u0000\u0000\u0012\u0013\u0005\u0002"+
		"\u0000\u0000\u0013\u0014\u0005\u0003\u0000\u0000\u0014\u0015\u0005\b\u0000"+
		"\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0001\u0007";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}