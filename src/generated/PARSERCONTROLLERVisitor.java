package generated;// Generated from C:/Users/muhannad/IdeaProjects/Compiler-2-2-\PARSERCONTROLLER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PARSERCONTROLLER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PARSERCONTROLLERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PARSERCONTROLLER.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(PARSERCONTROLLER.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(PARSERCONTROLLER.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#logical_sympol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_sympol(PARSERCONTROLLER.Logical_sympolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_if(PARSERCONTROLLER.Operation_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statment(PARSERCONTROLLER.Else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PARSERCONTROLLER.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PARSERCONTROLLER.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#printattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#getdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdata(PARSERCONTROLLER.GetdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#print_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_text(PARSERCONTROLLER.Print_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(PARSERCONTROLLER.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PARSERCONTROLLER.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#for_statement_variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_variable_number(PARSERCONTROLLER.For_statement_variable_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#fast_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#for_statement_adding_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_adding_one(PARSERCONTROLLER.For_statement_adding_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_minuss_one(PARSERCONTROLLER.For_statement_minuss_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#for_statement_fast_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_fast_math(PARSERCONTROLLER.For_statement_fast_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#adding_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#minus_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#number_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx);
}