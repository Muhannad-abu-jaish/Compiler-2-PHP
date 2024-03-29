package generated;// Generated from C:/Users/muhannad/IdeaProjects/Compiler-2-2-\PARSERCONTROLLER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PARSERCONTROLLER}.
 */
public interface PARSERCONTROLLERListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PARSERCONTROLLER.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PARSERCONTROLLER.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(PARSERCONTROLLER.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(PARSERCONTROLLER.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(PARSERCONTROLLER.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(PARSERCONTROLLER.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#logical_sympol}.
	 * @param ctx the parse tree
	 */
	void enterLogical_sympol(PARSERCONTROLLER.Logical_sympolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#logical_sympol}.
	 * @param ctx the parse tree
	 */
	void exitLogical_sympol(PARSERCONTROLLER.Logical_sympolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterOperation_if(PARSERCONTROLLER.Operation_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitOperation_if(PARSERCONTROLLER.Operation_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#else_statment}.
	 * @param ctx the parse tree
	 */
	void enterElse_statment(PARSERCONTROLLER.Else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#else_statment}.
	 * @param ctx the parse tree
	 */
	void exitElse_statment(PARSERCONTROLLER.Else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PARSERCONTROLLER.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PARSERCONTROLLER.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PARSERCONTROLLER.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PARSERCONTROLLER.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#printattribute}.
	 * @param ctx the parse tree
	 */
	void enterPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#printattribute}.
	 * @param ctx the parse tree
	 */
	void exitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#getdata}.
	 * @param ctx the parse tree
	 */
	void enterGetdata(PARSERCONTROLLER.GetdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#getdata}.
	 * @param ctx the parse tree
	 */
	void exitGetdata(PARSERCONTROLLER.GetdataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#print_text}.
	 * @param ctx the parse tree
	 */
	void enterPrint_text(PARSERCONTROLLER.Print_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#print_text}.
	 * @param ctx the parse tree
	 */
	void exitPrint_text(PARSERCONTROLLER.Print_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(PARSERCONTROLLER.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(PARSERCONTROLLER.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PARSERCONTROLLER.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PARSERCONTROLLER.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_variable_number(PARSERCONTROLLER.For_statement_variable_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_variable_number(PARSERCONTROLLER.For_statement_variable_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#variable_number}.
	 * @param ctx the parse tree
	 */
	void enterVariable_number(PARSERCONTROLLER.Variable_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#variable_number}.
	 * @param ctx the parse tree
	 */
	void exitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#fast_math}.
	 * @param ctx the parse tree
	 */
	void enterFast_math(PARSERCONTROLLER.Fast_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#fast_math}.
	 * @param ctx the parse tree
	 */
	void exitFast_math(PARSERCONTROLLER.Fast_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#for_statement_adding_one}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_adding_one(PARSERCONTROLLER.For_statement_adding_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#for_statement_adding_one}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_adding_one(PARSERCONTROLLER.For_statement_adding_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_minuss_one(PARSERCONTROLLER.For_statement_minuss_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_minuss_one(PARSERCONTROLLER.For_statement_minuss_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#for_statement_fast_math}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_fast_math(PARSERCONTROLLER.For_statement_fast_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#for_statement_fast_math}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_fast_math(PARSERCONTROLLER.For_statement_fast_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#adding_one}.
	 * @param ctx the parse tree
	 */
	void enterAdding_one(PARSERCONTROLLER.Adding_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#adding_one}.
	 * @param ctx the parse tree
	 */
	void exitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#minus_one}.
	 * @param ctx the parse tree
	 */
	void enterMinus_one(PARSERCONTROLLER.Minus_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#minus_one}.
	 * @param ctx the parse tree
	 */
	void exitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#number_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#number_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#variable_text}.
	 * @param ctx the parse tree
	 */
	void enterVariable_text(PARSERCONTROLLER.Variable_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#variable_text}.
	 * @param ctx the parse tree
	 */
	void exitVariable_text(PARSERCONTROLLER.Variable_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSERCONTROLLER#variable_get}.
	 * @param ctx the parse tree
	 */
	void enterVariable_get(PARSERCONTROLLER.Variable_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSERCONTROLLER#variable_get}.
	 * @param ctx the parse tree
	 */
	void exitVariable_get(PARSERCONTROLLER.Variable_getContext ctx);
}