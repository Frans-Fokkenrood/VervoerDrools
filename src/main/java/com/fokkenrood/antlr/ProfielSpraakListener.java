// Generated from src\main\java\com\fokkenrood\antlr\ProfielSpraak.g4 by ANTLR 4.2
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProfielSpraakParser}.
 */
public interface ProfielSpraakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void enterTestgeval(@NotNull ProfielSpraakParser.TestgevalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void exitTestgeval(@NotNull ProfielSpraakParser.TestgevalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void enterVergelijking(@NotNull ProfielSpraakParser.VergelijkingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void exitVergelijking(@NotNull ProfielSpraakParser.VergelijkingContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void enterFeit(@NotNull ProfielSpraakParser.FeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void exitFeit(@NotNull ProfielSpraakParser.FeitContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#invoer}.
	 * @param ctx the parse tree
	 */
	void enterInvoer(@NotNull ProfielSpraakParser.InvoerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#invoer}.
	 * @param ctx the parse tree
	 */
	void exitInvoer(@NotNull ProfielSpraakParser.InvoerContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void enterWaarde(@NotNull ProfielSpraakParser.WaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void exitWaarde(@NotNull ProfielSpraakParser.WaardeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull ProfielSpraakParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull ProfielSpraakParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#voorwaarde}.
	 * @param ctx the parse tree
	 */
	void enterVoorwaarde(@NotNull ProfielSpraakParser.VoorwaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#voorwaarde}.
	 * @param ctx the parse tree
	 */
	void exitVoorwaarde(@NotNull ProfielSpraakParser.VoorwaardeContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(@NotNull ProfielSpraakParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(@NotNull ProfielSpraakParser.RegelContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void enterTestcase(@NotNull ProfielSpraakParser.TestcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void exitTestcase(@NotNull ProfielSpraakParser.TestcaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#toekennen}.
	 * @param ctx the parse tree
	 */
	void enterToekennen(@NotNull ProfielSpraakParser.ToekennenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#toekennen}.
	 * @param ctx the parse tree
	 */
	void exitToekennen(@NotNull ProfielSpraakParser.ToekennenContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#maakscore}.
	 * @param ctx the parse tree
	 */
	void enterMaakscore(@NotNull ProfielSpraakParser.MaakscoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#maakscore}.
	 * @param ctx the parse tree
	 */
	void exitMaakscore(@NotNull ProfielSpraakParser.MaakscoreContext ctx);

	/**
	 * Enter a parse tree produced by {@link ProfielSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull ProfielSpraakParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProfielSpraakParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull ProfielSpraakParser.ObjectContext ctx);
}