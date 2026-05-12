// Generated from c:/Users/Mateo/ssl-antlr-calculator/Vuelo.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import VueloListener from './VueloListener.js';
import VueloVisitor from './VueloVisitor.js';

const serializedATN = [4,1,13,23,2,0,7,0,2,1,7,1,1,0,4,0,6,8,0,11,0,12,0,
7,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,2,0,2,0,0,
21,0,5,1,0,0,0,2,11,1,0,0,0,4,6,3,2,1,0,5,4,1,0,0,0,6,7,1,0,0,0,7,5,1,0,
0,0,7,8,1,0,0,0,8,9,1,0,0,0,9,10,5,0,0,1,10,1,1,0,0,0,11,12,5,6,0,0,12,13,
5,7,0,0,13,14,5,1,0,0,14,15,5,7,0,0,15,16,5,5,0,0,16,17,5,2,0,0,17,18,5,
4,0,0,18,19,5,2,0,0,19,20,5,3,0,0,20,21,5,8,0,0,21,3,1,0,0,0,1,7];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class VueloParser extends antlr4.Parser {

    static grammarFileName = "Vuelo.g4";
    static literalNames = [ null, "'-'", "','", "'Gate:'" ];
    static symbolicNames = [ null, null, null, null, "ESTADO", "HORA", "CODIGO_VUELO", 
                             "AEROPUERTO", "PUERTA", "FECHA", "OPERADOR", 
                             "ASIENTO", "TERMINAL", "WS" ];
    static ruleNames = [ "prog", "vuelo" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = VueloParser.ruleNames;
        this.literalNames = VueloParser.literalNames;
        this.symbolicNames = VueloParser.symbolicNames;
    }



	prog() {
	    let localctx = new ProgContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, VueloParser.RULE_prog);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 5; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 4;
	            this.vuelo();
	            this.state = 7; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===6);
	        this.state = 9;
	        this.match(VueloParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	vuelo() {
	    let localctx = new VueloContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, VueloParser.RULE_vuelo);
	    try {
	        localctx = new InfoVueloContext(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 11;
	        this.match(VueloParser.CODIGO_VUELO);
	        this.state = 12;
	        localctx.origen = this.match(VueloParser.AEROPUERTO);
	        this.state = 13;
	        this.match(VueloParser.T__0);
	        this.state = 14;
	        localctx.destino = this.match(VueloParser.AEROPUERTO);
	        this.state = 15;
	        this.match(VueloParser.HORA);
	        this.state = 16;
	        this.match(VueloParser.T__1);
	        this.state = 17;
	        this.match(VueloParser.ESTADO);
	        this.state = 18;
	        this.match(VueloParser.T__1);
	        this.state = 19;
	        this.match(VueloParser.T__2);
	        this.state = 20;
	        this.match(VueloParser.PUERTA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

VueloParser.EOF = antlr4.Token.EOF;
VueloParser.T__0 = 1;
VueloParser.T__1 = 2;
VueloParser.T__2 = 3;
VueloParser.ESTADO = 4;
VueloParser.HORA = 5;
VueloParser.CODIGO_VUELO = 6;
VueloParser.AEROPUERTO = 7;
VueloParser.PUERTA = 8;
VueloParser.FECHA = 9;
VueloParser.OPERADOR = 10;
VueloParser.ASIENTO = 11;
VueloParser.TERMINAL = 12;
VueloParser.WS = 13;

VueloParser.RULE_prog = 0;
VueloParser.RULE_vuelo = 1;

class ProgContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VueloParser.RULE_prog;
    }

	EOF() {
	    return this.getToken(VueloParser.EOF, 0);
	};

	vuelo = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(VueloContext);
	    } else {
	        return this.getTypedRuleContext(VueloContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof VueloListener ) {
	        listener.enterProg(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VueloListener ) {
	        listener.exitProg(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof VueloVisitor ) {
	        return visitor.visitProg(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class VueloContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = VueloParser.RULE_vuelo;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class InfoVueloContext extends VueloContext {

    constructor(parser, ctx) {
        super(parser);
        this.origen = null;;
        this.destino = null;;
        super.copyFrom(ctx);
    }

	CODIGO_VUELO() {
	    return this.getToken(VueloParser.CODIGO_VUELO, 0);
	};

	HORA() {
	    return this.getToken(VueloParser.HORA, 0);
	};

	ESTADO() {
	    return this.getToken(VueloParser.ESTADO, 0);
	};

	PUERTA() {
	    return this.getToken(VueloParser.PUERTA, 0);
	};

	AEROPUERTO = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(VueloParser.AEROPUERTO);
	    } else {
	        return this.getToken(VueloParser.AEROPUERTO, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof VueloListener ) {
	        listener.enterInfoVuelo(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof VueloListener ) {
	        listener.exitInfoVuelo(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof VueloVisitor ) {
	        return visitor.visitInfoVuelo(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

VueloParser.InfoVueloContext = InfoVueloContext;


VueloParser.ProgContext = ProgContext; 
VueloParser.VueloContext = VueloContext; 
