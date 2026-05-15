// Generated from c:/Users/Mateo/ssl-antlr-calculator/Vuelo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VueloParser}.
 */
public interface VueloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VueloParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(VueloParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VueloParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(VueloParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infoVuelo}
	 * labeled alternative in {@link VueloParser#vuelo}.
	 * @param ctx the parse tree
	 */
	void enterInfoVuelo(VueloParser.InfoVueloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infoVuelo}
	 * labeled alternative in {@link VueloParser#vuelo}.
	 * @param ctx the parse tree
	 */
	void exitInfoVuelo(VueloParser.InfoVueloContext ctx);
}