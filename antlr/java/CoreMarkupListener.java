// Generated from CoreMarkup.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoreMarkupParser}.
 */
public interface CoreMarkupListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoreMarkupParser#cmu}.
	 * @param ctx the parse tree
	 */
	void enterCmu(CoreMarkupParser.CmuContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreMarkupParser#cmu}.
	 * @param ctx the parse tree
	 */
	void exitCmu(CoreMarkupParser.CmuContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreMarkupParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CoreMarkupParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreMarkupParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CoreMarkupParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreMarkupParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(CoreMarkupParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreMarkupParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(CoreMarkupParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoreMarkupParser#nested_question}.
	 * @param ctx the parse tree
	 */
	void enterNested_question(CoreMarkupParser.Nested_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreMarkupParser#nested_question}.
	 * @param ctx the parse tree
	 */
	void exitNested_question(CoreMarkupParser.Nested_questionContext ctx);
}