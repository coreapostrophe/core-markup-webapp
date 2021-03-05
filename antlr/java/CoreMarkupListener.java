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
	 * Enter a parse tree produced by {@link CoreMarkupParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(CoreMarkupParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoreMarkupParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(CoreMarkupParser.QuestionContext ctx);
}