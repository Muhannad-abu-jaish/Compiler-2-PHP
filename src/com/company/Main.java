package com.company;

import com.company.ast.Nodes.*;
import com.company.ast.visitor.BaseVisitor;
import com.company.ast.Nodes.ForStatement;
import generated.LEXERCONTROLLER;
import generated.PARSERCONTROLLER;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.*;
import java.io.FileWriter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    static final String URL_FILE_PHP_MATH = "C:\\xampp\\htdocs\\code_math//my_generate_code_math.php";
    static final String URL_FILE_PHP_LOGIN = "C:\\xampp\\htdocs\\form//my_generate_code_login.php";

    public static void main(String[] args) throws IOException {

        String source = "D:\\Compiler-PHP\\Samples//sample_native.txt";
        CharStream charStream = fromFileName(source);
        LEXERCONTROLLER lexer = new LEXERCONTROLLER(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PARSERCONTROLLER parser = new PARSERCONTROLLER(tokenStream);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor().visit(tree);
        ErrorHandling(program);
        generateCode(program);



    }

    private static void generateCode(Program program) throws IOException {
    FileWriter fileWriter = new FileWriter(URL_FILE_PHP_MATH);
    fileWriter.write("<?php\n");
    for(int i = 0 ; i < program.getCode_attribuites().size();i++){
        if(program.getCode_attribuites().get(i).getVariables()!=null) {
            Variables_Text variables_text = program.getCode_attribuites().get(i).getVariables().getVariables_text();
            Variable_Numbers variable_numbers = program.getCode_attribuites().get(i).getVariables().getVariable_numbers();
            VariableGet variableGet = program.getCode_attribuites().get(i).getVariables().getVariableGet();
            Array_statement array_statement = program.getCode_attribuites().get(i).getVariables().getArray_statement();
            if (variableGet != null) {
                fileWriter.write("$" + variableGet.getGetName() + " = $_POST[\"" + variableGet.getGetData().getDataValue() + "\"];\n");
            }
        }
        Print print = program.getCode_attribuites().get(i).getPrint();
        If_Statement if_statement = program.getCode_attribuites().get(i).getIf_statement();
        Else_statement else_statement = program.getCode_attribuites().get(i).getElse_statement();
        if(if_statement!=null){
            int num_sums = 0 , num_operation = 0 ,num_operation_IF_Statement = 0 , num_logic_symbol_if = 0;
            fileWriter.write(if_statement.getName_statement() + " ( ");
            for(int p = 0; p < if_statement.getVariables_one().size();p++){

                if(if_statement.getVariables_two().get(p).equals("EMPTY")){
                    fileWriter.write(" empty ( $" + if_statement.getVariables_one().get(p) + " ) ");
                }
                else{
                    fileWriter.write("$"+if_statement.getVariables_one().get(p));
                }
                if(if_statement.getOperationIFS().size()>0&&num_operation_IF_Statement<if_statement.getOperationIFS().size()){

                    if(!if_statement.getVariables_two().get(p).equals("EMPTY"))
                    {
                        fileWriter.write(" "+if_statement.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                        fileWriter.write(" $"+if_statement.getVariables_two());
                    }
                    num_operation_IF_Statement++;
                }
                if(if_statement.getLogic_symbol().size()>0&&num_logic_symbol_if<if_statement.getLogic_symbol().size()){
                    fileWriter.write(" " + if_statement.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                    num_logic_symbol_if++;
                }
            }
            fileWriter.write(" ) {\n");
            if(if_statement.getCode_attributes().size()>0){
                recursive_if_generate(fileWriter,if_statement);
            }
            fileWriter.write("}\n");
        }

       else if(print!=null) {
            fileWriter.write("echo ");
            int numOfSums = 0;
            if (print.getAttribute_prints() != null) {
                for (int m = 0; m < print.getAttribute_prints().size(); m++) {
                    /*if (print.getAttribute_prints().get(m).getPrint_function() != null) {
                        System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName() + "("
                                + print.getAttribute_prints().get(m).getPrint_function().getDataValue() + ")");
                    }*/
                    if (print.getAttribute_prints().get(m).getPrint_text() != null) {
                        fileWriter.write("\" "+print.getAttribute_prints().get(m).getPrint_text().getContent()+" \"");
                    } else if (print.getAttribute_prints().get(m).getValue() != null) {
                        fileWriter.write(" $"+print.getAttribute_prints().get(m).getValue());
                    }
                    if (print.getOperation() != null && numOfSums != (print.getAttribute_prints().size() - 1)) {
                        fileWriter.write(" "+print.getOperation().get(numOfSums));
                        numOfSums++;
                    }
                }
                fileWriter.write(";");
            }
        }
        else if (else_statement!=null){
            fileWriter.write(" "+else_statement.getName_statement()+"{\n");
            if(else_statement.getCode_attributes().size()>0){
                recursive_else_generate(fileWriter,else_statement);
                fileWriter.write("}\n");
            }
        }




    }
    fileWriter.write("?>");
    fileWriter.close();
    }

    private static void recursive_else_generate(FileWriter fileWriter , Else_statement else_statement) throws IOException {


        for(int i = 0 ; i < else_statement.getCode_attributes().size();i++){
            if(else_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = else_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = else_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet = else_statement.getCode_attributes().get(i).getVariables().getVariableGet();
                Array_statement array_statement = else_statement.getCode_attributes().get(i).getVariables().getArray_statement();
                if (variableGet != null) {
                    fileWriter.write("$" + variableGet.getGetName() + " = $_POST[\"" + variableGet.getGetData().getDataValue() + "\"];\n");
                }
            }
            Print print = else_statement.getCode_attributes().get(i).getPrint();
            If_Statement if_statementInner = else_statement.getCode_attributes().get(i).getIf_statement();
            Else_statement else_statementInner = else_statement.getCode_attributes().get(i).getElse_statement();




            if(if_statementInner!=null){
                int num_sums = 0 , num_operation = 0 ,num_operation_IF_Statement = 0 , num_logic_symbol_if = 0;
                fileWriter.write(if_statementInner.getName_statement() + " ( ");
                for(int p = 0; p < if_statementInner.getVariables_one().size();p++){
                    if(if_statementInner.getVariables_two().get(p).equals("EMPTY")){
                        fileWriter.write("empty ( $" + if_statementInner.getVariables_one().get(p) + " ) ");
                    }
                    else{
                        fileWriter.write("$"+if_statementInner.getVariables_one().get(p));
                    }
                    if(if_statementInner.getOperationIFS().size()>0&&num_operation_IF_Statement<if_statementInner.getOperationIFS().size()){

                        if(!if_statementInner.getVariables_two().get(p).equals("EMPTY"))
                        {
                            fileWriter.write(" "+if_statementInner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                            fileWriter.write(" $"+if_statementInner.getVariables_two());
                        }
                        num_operation_IF_Statement++;
                    }
                    if(if_statementInner.getLogic_symbol().size()>0&&num_logic_symbol_if<if_statementInner.getLogic_symbol().size()){
                        fileWriter.write(" " + if_statementInner.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                        num_logic_symbol_if++;
                    }
                }
                fileWriter.write(" ) {");
                if(if_statementInner.getCode_attributes().size()>0){
                    recursive_if_generate(fileWriter,if_statementInner);
                    fileWriter.write("}\n");
                }
            }
            else if(print!=null) {
                fileWriter.write("echo ");
                int numOfSums = 0;
                if (print.getAttribute_prints() != null) {
                    for (int m = 0; m < print.getAttribute_prints().size(); m++) {
                    /*if (print.getAttribute_prints().get(m).getPrint_function() != null) {
                        System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName() + "("
                                + print.getAttribute_prints().get(m).getPrint_function().getDataValue() + ")");
                    }*/
                        if (print.getAttribute_prints().get(m).getPrint_text() != null) {
                            fileWriter.write("\" "+print.getAttribute_prints().get(m).getPrint_text().getContent()+" \"");
                        } else if (print.getAttribute_prints().get(m).getValue() != null) {
                            fileWriter.write(" $"+print.getAttribute_prints().get(m).getValue());
                        }
                        if (print.getOperation() != null && numOfSums != (print.getAttribute_prints().size() - 1)) {
                            fileWriter.write(" "+print.getOperation().get(numOfSums));
                            numOfSums++;
                        }
                    }
                    fileWriter.write(";\n");
                }
            }
            else if (else_statementInner!=null){
                fileWriter.write(" "+else_statementInner.getName_statement()+"{\n");
                if(else_statementInner.getCode_attributes().size()>0){
                    recursive_else_generate(fileWriter,else_statementInner);
                    fileWriter.write("}\n");
                }
            }



        }
    }

    private static void recursive_if_generate(FileWriter fileWriter ,If_Statement if_statement) throws IOException {

        for(int i = 0 ; i < if_statement.getCode_attributes().size();i++){
            if(if_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = if_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = if_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet = if_statement.getCode_attributes().get(i).getVariables().getVariableGet();
                Array_statement array_statement = if_statement.getCode_attributes().get(i).getVariables().getArray_statement();
                if (variableGet != null) {
                    fileWriter.write("$" + variableGet.getGetName() + " = $_POST[\"" + variableGet.getGetData().getDataValue() + "\"];\n");
                }
            }
            Print print = if_statement.getCode_attributes().get(i).getPrint();
            If_Statement if_statementInner = if_statement.getCode_attributes().get(i).getIf_statement();
            Else_statement else_statementInner = if_statement.getCode_attributes().get(i).getElse_statement();




            if(if_statementInner!=null){
                int num_sums = 0 , num_operation = 0 ,num_operation_IF_Statement = 0 , num_logic_symbol_if = 0;
                fileWriter.write(if_statementInner.getName_statement() + " ( ");
                for(int p = 0; p < if_statementInner.getVariables_one().size();p++){
                    if(if_statementInner.getVariables_two().get(p).equals("EMPTY")){
                        fileWriter.write("empty ( $" + if_statementInner.getVariables_one().get(p) + " ) ");
                    }
                    else{
                        fileWriter.write("$"+if_statementInner.getVariables_one().get(p));
                    }
                    if(if_statementInner.getOperationIFS().size()>0&&num_operation_IF_Statement<if_statementInner.getOperationIFS().size()){

                        if(!if_statementInner.getVariables_two().get(p).equals("EMPTY"))
                        {
                            fileWriter.write(" "+if_statementInner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                            fileWriter.write(" $"+if_statementInner.getVariables_two());
                        }
                        num_operation_IF_Statement++;
                    }
                    if(if_statementInner.getLogic_symbol().size()>0&&num_logic_symbol_if<if_statementInner.getLogic_symbol().size()){
                        fileWriter.write(" " + if_statementInner.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                        num_logic_symbol_if++;
                    }
                }
                fileWriter.write(" ) {");
                if(if_statementInner.getCode_attributes().size()>0){
                    recursive_if_generate(fileWriter,if_statementInner);
                    fileWriter.write("}\n");
                }
            }
            else if(print!=null) {
                fileWriter.write("echo ");
                int numOfSums = 0;
                if (print.getAttribute_prints() != null) {
                    for (int m = 0; m < print.getAttribute_prints().size(); m++) {
                    /*if (print.getAttribute_prints().get(m).getPrint_function() != null) {
                        System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName() + "("
                                + print.getAttribute_prints().get(m).getPrint_function().getDataValue() + ")");
                    }*/
                        if (print.getAttribute_prints().get(m).getPrint_text() != null) {
                            fileWriter.write("\" "+print.getAttribute_prints().get(m).getPrint_text().getContent()+" \"");
                        } else if (print.getAttribute_prints().get(m).getValue() != null) {
                            fileWriter.write(" $"+print.getAttribute_prints().get(m).getValue());
                        }
                        if (print.getOperation() != null && numOfSums != (print.getAttribute_prints().size() - 1)) {
                            fileWriter.write(" "+print.getOperation().get(numOfSums));
                            numOfSums++;
                        }
                    }
                    fileWriter.write(";\n");
                }
            }
            else if (else_statementInner!=null){
                fileWriter.write(" "+else_statementInner.getName_statement()+"{\n");
                if(else_statementInner.getCode_attributes().size()>0){
                    recursive_else_generate(fileWriter,else_statementInner);
                    fileWriter.write("}\n");
                }
            }



        }

    }

    private static void ErrorHandling(Program program) {
    Stack<String>stack = BaseVisitor.getErrors();// الحصول على ستاك الايرورات من داخل كلاس الفيزيتور
    Stack<String>temp = new Stack<>();
        if(stack.empty()){// إذا لم يوجد أي اخطاء
        generateAst(program);// توليد شجرة ال ast
    }
    else { // كان في اخطاء
        while (!stack.empty()) { // منمشي عليهن خطأ خطأ
            temp.push(stack.pop());
        }
        while(!temp.empty()){
            System.err.println(temp.pop());
        }
    }
    }

    public static void recursive_else(Else_statement else_statement){
        int num_sums = 0, num_operation = 0, num_operation_IF_Statement = 0, num_logic_symbol_if = 0;
        for (int i = 0; i < else_statement.getCode_attributes().size(); i++) {
            if(else_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = else_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = else_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet =else_statement.getCode_attributes().get(i).getVariables().getVariableGet();
                  if (variables_text != null) {
                    System.out.println("--------------VARIABLE_TEXT_ELSE-----------");
                    System.out.print(variables_text.getName_variable() + " = ");
                    for (int j = 0; j < variables_text.getValues_variables().size(); j++) {
                        System.out.print(variables_text.getValues_variables().get(j));
                        if (variables_text.getOperator().size() > 0 && num_sums < variables_text.getOperator().size()) {
                            System.out.print(" " + variables_text.getOperator().get(num_sums));
                            num_sums++;
                        } else {
                            System.out.println();
                        }
                    }
                    num_sums = 0;
                } else if (variable_numbers != null) {
                    System.out.println("--------------VARIABLE_Number-----------");
                    OneOperation oneOperation = variable_numbers.getOneOperation();
                    Fast_math fast_math = else_statement.getCode_attributes().get(i).getVariables().getVariable_numbers().getFast_math();
                    if (oneOperation!=null)
                        System.out.println(oneOperation.getNameOneOperation() + oneOperation.getOneOperation());

                    if (fast_math!=null)
                        System.out.println(fast_math.getName() + fast_math.getOperation() + fast_math.getNumber());

                    if(variable_numbers.getName_variable()!=null) {
                        System.out.print(variable_numbers.getName_variable() + " = ");
                        for (int j = 0; j < variable_numbers.getValues_variables().size(); j++) {
                            System.out.print(variable_numbers.getValues_variables().get(j));
                            if (variable_numbers.getName_attributes().size() > 0 && num_operation < variable_numbers.getName_attributes().size()) {
                                System.out.print(" " + variable_numbers.getName_attributes().get(num_operation).getOperator() + " ");
                                num_operation++;
                            } else {
                                System.out.println();
                            }
                        }
                        num_operation = 0;
                    }
                }
                else if (variableGet!=null) {
                    System.out.println(variableGet.getGetName() + " = " + variableGet.getGetData().getDataName() + "(" + variableGet.getGetData().getDataValue() + ")");
                }
            }

            boolean Break = else_statement.getCode_attributes().get(i).isBreak();
            if(Break){
                System.out.println("break ;");
            }

            //The Begin For Statement's Generate
            ForStatement forStatementInner = else_statement.getCode_attributes().get(i).getForStatement();
             if( forStatementInner!=null )
            {
                System.out.println("---------------Inner FOR Statement--------------");
                System.out.print("for ( " + forStatementInner.getForID() + " = " + forStatementInner.getIdValue() + " ; " + forStatementInner.getSecondID() + " ");
                System.out.print(forStatementInner.getOperationIF().getOperation() + " " + forStatementInner.getCompareValue() + " ; " );

                if (forStatementInner.getForStatementVariableNumber().getOneOperation()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getOneOperation().getNameOneOperation());
                    System.out.println(" = " + forStatementInner.getForStatementVariableNumber().getOneOperation().getOneOperation() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getFast_math()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getFast_math().getName() + forStatementInner.getForStatementVariableNumber().getFast_math().getOperation());
                    System.out.println( forStatementInner.getForStatementVariableNumber().getFast_math().getNumber() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getThirdID()!=null && forStatementInner.getForStatementVariableNumber().getCountValue()!=null)
                {
                    System.out.println(forStatementInner.getForStatementVariableNumber().getThirdID() + " = " + forStatementInner.getForStatementVariableNumber().getCountValue() + " )");
                }

                System.out.println( "{ "  );

                if (forStatementInner.getCode_attributes()!=null)
                {
                    recursive_for(forStatementInner);
                }

                System.out.println("} ");

            }//The End For Statement's Generate


            Print print = else_statement.getCode_attributes().get(i).getPrint();
            Else_statement else_statement_inner = else_statement.getCode_attributes().get(i).getElse_statement();
            If_Statement if_statement_inner = else_statement.getCode_attributes().get(i).getIf_statement();
              if (else_statement_inner != null) {
                System.out.println("---------------else Statement_inner--------------");
                System.out.println(else_statement_inner.getName_statement() + "{");

                if (else_statement_inner.getCode_attributes().size() > 0) {
                    recursive_else(else_statement_inner);
                    System.out.println("}");
                }
            }
             else if(if_statement_inner!=null) {
                 System.out.println("---------------IF Statement--------------");
                 System.out.print(if_statement_inner.getName_statement() + "( ");
                 for (int p = 0; p < if_statement_inner.getVariables_one().size(); p++) {
                     System.out.print(if_statement_inner.getVariables_one().get(p));
                     if (if_statement_inner.getOperationIFS().size() > 0 && num_operation_IF_Statement < if_statement_inner.getOperationIFS().size()) {
                         System.out.print(" " + if_statement_inner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                         num_operation_IF_Statement++;
                     }
                     System.out.print(if_statement_inner.getVariables_two().get(p));
                     if (if_statement_inner.getLogic_symbol().size() > 0 && num_logic_symbol_if < if_statement_inner.getLogic_symbol().size()) {
                         System.out.print(" " + if_statement_inner.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                         num_logic_symbol_if++;
                     }
                 }
                 System.out.print(")");
             }
             else if (print!=null){
                 System.out.println("--------PRINT--------");
                 System.out.print(print.getName_print()+"(");
                 if(print.getAttribute_prints()!=null){
                     for(int m = 0 ; m<print.getAttribute_prints().size();m++){
                         if(print.getAttribute_prints().get(m).getPrint_function()!=null)
                         {
                             System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName()+"("
                                     +print.getAttribute_prints().get(m).getPrint_function().getDataValue()+")");
                         }else if (print.getAttribute_prints().get(m).getPrint_text()!=null){
                             System.out.print(print.getAttribute_prints().get(m).getPrint_text().getContent());
                         }
                         else if (print.getAttribute_prints().get(m).getValue()!=null){
                             System.out.print(print.getAttribute_prints().get(m).getValue());
                         }
                         System.out.println(")");
                     }
                 }
             }
        }
    }
    public static void recursive_for(ForStatement forStatement) {
        int num_sums = 0, num_operation = 0, num_operation_IF_Statement = 0, num_logic_symbol_if = 0;

        for (int i = 0; i < forStatement.getCode_attributes().size(); i++) {
            if (forStatement.getCode_attributes().get(i).getVariables() != null) {
                Variables_Text variables_text = forStatement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = forStatement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet = forStatement.getCode_attributes().get(i).getVariables().getVariableGet();

                  if (variables_text != null) {
                    System.out.println("--------------VARIABLE_TEXT-----------");
                    System.out.print(variables_text.getName_variable() + " = ");
                    for (int j = 0; j < variables_text.getValues_variables().size(); j++) {
                        System.out.print(variables_text.getValues_variables().get(j));
                        if (variables_text.getOperator().size() > 0 && num_sums < variables_text.getOperator().size()) {
                            System.out.print(" " + variables_text.getOperator().get(num_sums));
                            num_sums++;
                        } else {
                            System.out.println();
                        }
                    }
                    num_sums = 0;
                } else if (variable_numbers != null) {
                    System.out.println("--------------VARIABLE_Number-----------");

                    OneOperation oneOperation = variable_numbers.getOneOperation();
                    Fast_math fast_math = forStatement.getCode_attributes().get(i).getVariables().getVariable_numbers().getFast_math();
                    if (oneOperation != null)
                        System.out.println(oneOperation.getNameOneOperation() + oneOperation.getOneOperation());

                    if (fast_math != null)
                        System.out.println(fast_math.getName() + fast_math.getOperation() + fast_math.getNumber());


                    if (variable_numbers.getName_variable() != null) {
                        System.out.print(variable_numbers.getName_variable() + " = ");
                        for (int j = 0; j < variable_numbers.getValues_variables().size(); j++) {
                            System.out.print(variable_numbers.getValues_variables().get(j));
                            if (variable_numbers.getName_attributes().size() > 0 && num_operation < variable_numbers.getName_attributes().size()) {
                                System.out.print(" " + variable_numbers.getName_attributes().get(num_operation).getOperator() + " ");
                                num_operation++;
                            } else {
                                System.out.println();
                            }
                        }

                        num_operation = 0;
                    }

                } else if (variableGet != null) {
                    System.out.println(variableGet.getGetName() + " = " + variableGet.getGetData().getDataName() + "(" + variableGet.getGetData().getDataValue() + ")");
                }


            }


            boolean Break = forStatement.getCode_attributes().get(i).isBreak();
            if(Break){
                System.out.println("break ; ");
            }
            //The Begin For Statement's Generate
            ForStatement forStatementInner = forStatement.getCode_attributes().get(i).getForStatement();
            if( forStatementInner!=null )
            {
                System.out.println("---------------Inner FOR Statement--------------");
                System.out.print("for ( " + forStatementInner.getForID() + " = " + forStatementInner.getIdValue() + " ; " + forStatementInner.getSecondID() + " ");
                System.out.print(forStatementInner.getOperationIF().getOperation() + " " + forStatementInner.getCompareValue() + " ; " );

                if (forStatementInner.getForStatementVariableNumber().getOneOperation()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getOneOperation().getNameOneOperation());
                    System.out.println(" = " + forStatementInner.getForStatementVariableNumber().getOneOperation().getOneOperation() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getFast_math()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getFast_math().getName() + forStatementInner.getForStatementVariableNumber().getFast_math().getOperation());
                    System.out.println( forStatementInner.getForStatementVariableNumber().getFast_math().getNumber() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getThirdID()!=null && forStatementInner.getForStatementVariableNumber().getCountValue()!=null)
                {
                    System.out.println(forStatementInner.getForStatementVariableNumber().getThirdID() + " = " + forStatementInner.getForStatementVariableNumber().getCountValue() + " )");
                }

                System.out.println( "{ "  );

                if (forStatementInner.getCode_attributes()!=null)
                {
                    recursive_for(forStatementInner);
                }

                System.out.println("} ");

            }//The End For Statement's Generate


            Print print = forStatement.getCode_attributes().get(i).getPrint();
            If_Statement if_statement_inner = forStatement.getCode_attributes().get(i).getIf_statement();
            Else_statement else_statement = forStatement.getCode_attributes().get(i).getElse_statement();
            if(if_statement_inner!=null) {
                System.out.println("---------------IF Statement--------------");
                System.out.print(if_statement_inner.getName_statement() + "( ");
                for (int p = 0; p < if_statement_inner.getVariables_one().size(); p++) {
                    System.out.print(if_statement_inner.getVariables_one().get(p));
                    if (if_statement_inner.getOperationIFS().size() > 0 && num_operation_IF_Statement < if_statement_inner.getOperationIFS().size()) {
                        System.out.print(" " + if_statement_inner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                        num_operation_IF_Statement++;
                    }
                    System.out.print(if_statement_inner.getVariables_two().get(p));
                    if (if_statement_inner.getLogic_symbol().size() > 0 && num_logic_symbol_if < if_statement_inner.getLogic_symbol().size()) {
                        System.out.print(" " + if_statement_inner.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                        num_logic_symbol_if++;
                    }
                }
                System.out.print(")");
            }
            else if (else_statement!=null){
                System.out.println("-----------ELSE STATEMENT-----------");
                System.out.println(else_statement.getName_statement()+"{");
                if(else_statement.getCode_attributes().size()>0){
                    recursive_else(else_statement);
                    System.out.println("}");
                }
            }
            else if (print!=null){
                System.out.println("--------PRINT--------");
                System.out.print(print.getName_print()+"(");
                if(print.getAttribute_prints()!=null){
                    for(int m = 0 ; m<print.getAttribute_prints().size();m++){
                        if(print.getAttribute_prints().get(m).getPrint_function()!=null)
                        {
                            System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName()+"("
                                    +print.getAttribute_prints().get(m).getPrint_function().getDataValue()+")");
                        }else if (print.getAttribute_prints().get(m).getPrint_text()!=null){
                            System.out.print(print.getAttribute_prints().get(m).getPrint_text().getContent());
                        }
                        else if (print.getAttribute_prints().get(m).getValue()!=null){
                            System.out.print(print.getAttribute_prints().get(m).getValue());
                        }
                        System.out.println(")");
                    }
                }
            }        }
    }

    public static void recursive_if(If_Statement if_statement) {
        int num_sums = 0, num_operation = 0, num_operation_IF_Statement = 0, num_logic_symbol_if = 0;
        for (int i = 0; i < if_statement.getCode_attributes().size(); i++) {
            if(if_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = if_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = if_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet =if_statement.getCode_attributes().get(i).getVariables().getVariableGet();
               if (variables_text != null) {
                    System.out.println("--------------VARIABLE_TEXT-----------");
                    System.out.print(variables_text.getName_variable() + " = ");
                    for (int j = 0; j < variables_text.getValues_variables().size(); j++) {
                        System.out.print(variables_text.getValues_variables().get(j));
                        if (variables_text.getOperator().size() > 0 && num_sums < variables_text.getOperator().size()) {
                            System.out.print(" " + variables_text.getOperator().get(num_sums));
                            num_sums++;
                        } else {
                            System.out.println();
                        }
                    }
                    num_sums = 0;
                }
                else if (variable_numbers != null) {
                    System.out.println("--------------VARIABLE_Number-----------");
                    OneOperation oneOperation = variable_numbers.getOneOperation();
                    Fast_math fast_math = if_statement.getCode_attributes().get(i).getVariables().getVariable_numbers().getFast_math();
                    if (oneOperation!=null)
                        System.out.println(oneOperation.getNameOneOperation() + oneOperation.getOneOperation());

                    if (fast_math!=null)
                        System.out.println(fast_math.getName() + fast_math.getOperation() + fast_math.getNumber());


                    if(variable_numbers.getName_variable()!=null) {
                        System.out.print(variable_numbers.getName_variable() + " = ");
                        for (int j = 0; j < variable_numbers.getValues_variables().size(); j++) {
                            System.out.print(variable_numbers.getValues_variables().get(j));
                            if (variable_numbers.getName_attributes().size() > 0 && num_operation < variable_numbers.getName_attributes().size()) {
                                System.out.print(" " + variable_numbers.getName_attributes().get(num_operation).getOperator() + " ");
                                num_operation++;
                            } else {
                                System.out.println();
                            }
                        }
                        num_operation = 0;
                    }
                }
                else if (variableGet!=null) {
                    System.out.println(variableGet.getGetName() + " = " + variableGet.getGetData().getDataName() + "(" + variableGet.getGetData().getDataValue() + ")");
                }

            }
            boolean Break = if_statement.getCode_attributes().get(i).isBreak();
            if(Break){
                System.out.println("break ; ");
            }
            //The Begin For Statement's Generate
            ForStatement forStatementInner = if_statement.getCode_attributes().get(i).getForStatement();
            if( forStatementInner!=null )
            {
                System.out.println("---------------Inner FOR Statement--------------");
                System.out.print("for ( " + forStatementInner.getForID() + " = " + forStatementInner.getIdValue() + " ; " + forStatementInner.getSecondID() + " ");
                System.out.print(forStatementInner.getOperationIF().getOperation() + " " + forStatementInner.getCompareValue() + " ; " );

                if (forStatementInner.getForStatementVariableNumber().getOneOperation()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getOneOperation().getNameOneOperation());
                    System.out.println(" = " + forStatementInner.getForStatementVariableNumber().getOneOperation().getOneOperation() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getFast_math()!=null)
                {
                    System.out.print( forStatementInner.getForStatementVariableNumber().getFast_math().getName() + forStatementInner.getForStatementVariableNumber().getFast_math().getOperation());
                    System.out.println( forStatementInner.getForStatementVariableNumber().getFast_math().getNumber() + " )");
                }

                else if (forStatementInner.getForStatementVariableNumber().getThirdID()!=null && forStatementInner.getForStatementVariableNumber().getCountValue()!=null)
                {
                    System.out.println(forStatementInner.getForStatementVariableNumber().getThirdID() + " = " + forStatementInner.getForStatementVariableNumber().getCountValue() + " )");
                }

                System.out.println( "{ "  );

                if (forStatementInner.getCode_attributes()!=null)
                {
                    recursive_for(forStatementInner);
                }

                System.out.println("} ");

            }//The End For Statement's Generate

            Print print = if_statement.getCode_attributes().get(i).getPrint();
            If_Statement if_statement_inner = if_statement.getCode_attributes().get(i).getIf_statement();
            Else_statement else_statement_inner = if_statement.getCode_attributes().get(i).getElse_statement();
              if(if_statement_inner!=null) {
                 System.out.println("---------------IF Statement--------------");
                 System.out.print(if_statement_inner.getName_statement() + "( ");
                 for (int p = 0; p < if_statement_inner.getVariables_one().size(); p++) {
                     System.out.print(if_statement_inner.getVariables_one().get(p));
                     if (if_statement_inner.getOperationIFS().size() > 0 && num_operation_IF_Statement < if_statement_inner.getOperationIFS().size()) {
                         System.out.print(" " + if_statement_inner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                         num_operation_IF_Statement++;
                     }
                     System.out.print(if_statement_inner.getVariables_two().get(p));
                     if (if_statement_inner.getLogic_symbol().size() > 0 && num_logic_symbol_if < if_statement_inner.getLogic_symbol().size()) {
                         System.out.print(" " + if_statement_inner.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                         num_logic_symbol_if++;
                     }
                 }
                 System.out.print(")");
             }
            else if (else_statement_inner != null) {
                System.out.println("---------------else Statement--------------");
                System.out.println(else_statement_inner.getName_statement() + "{");

                if (else_statement_inner.getCode_attributes().size() > 0) {
                    recursive_else(else_statement_inner);
                    System.out.println("}");
                }
            }
             else if (print!=null){
                 System.out.println("--------PRINT--------");
                 System.out.print(print.getName_print()+"(");
                 if(print.getAttribute_prints()!=null){
                     for(int m = 0 ; m<print.getAttribute_prints().size();m++){
                         if(print.getAttribute_prints().get(m).getPrint_function()!=null)
                         {
                             System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName()+"("
                                     +print.getAttribute_prints().get(m).getPrint_function().getDataValue()+")");
                         }else if (print.getAttribute_prints().get(m).getPrint_text()!=null){
                             System.out.print(print.getAttribute_prints().get(m).getPrint_text().getContent());
                         }
                         else if (print.getAttribute_prints().get(m).getValue()!=null){
                             System.out.print(print.getAttribute_prints().get(m).getValue());
                         }
                         System.out.println(")");
                     }
                 }
             }
        }
    }
    private static void generateAst(Program program) {
       int num_sums = 0 , num_operation = 0 ,num_operation_IF_Statement = 0 , num_logic_symbol_if = 0;
        System.out.println("\t\t\t<Controller>");
        for (int i = 0; i < program.getCode_attribuites().size(); i++) {
            if(program.getCode_attribuites().get(i).getVariables()!=null) {
                Variables_Text variables_text = program.getCode_attribuites().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = program.getCode_attribuites().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet = program.getCode_attribuites().get(i).getVariables().getVariableGet();
                Array_statement array_statement = program.getCode_attribuites().get(i).getVariables().getArray_statement();
                if(variables_text!=null){
                    System.out.println("--------------VARIABLE_TEXT-----------");
                    System.out.print(variables_text.getName_variable() + " = ");
                    for(int j = 0 ; j < variables_text.getValues_variables().size();j++){
                        System.out.print(variables_text.getValues_variables().get(j));
                        if(variables_text.getOperator().size()>0&&num_sums<variables_text.getOperator().size()){
                            System.out.print(" "+variables_text.getOperator().get(num_sums));
                            num_sums++;
                        }else{
                            System.out.println();
                        }
                    }
                    num_sums = 0;
                }
                else if(variable_numbers!=null){
                    System.out.println("--------------VARIABLE_Number-----------");

                    OneOperation oneOperation = variable_numbers.getOneOperation();
                    Fast_math fast_math = program.getCode_attribuites().get(i).getVariables().getVariable_numbers().getFast_math();
                    if (oneOperation!=null)
                        System.out.println(oneOperation.getNameOneOperation() + oneOperation.getOneOperation());

                    if (fast_math!=null)
                        System.out.println(fast_math.getName() + fast_math.getOperation() + fast_math.getNumber());


                    if (variable_numbers.getName_variable()!=null)
                    {
                        System.out.print(variable_numbers.getName_variable() + " = ");
                        for(int j = 0 ; j <variable_numbers.getValues_variables().size();j++){
                            System.out.print(variable_numbers.getValues_variables().get(j));
                            if(variable_numbers.getName_attributes().size()>0&&num_operation<variable_numbers.getName_attributes().size()){
                                System.out.print(" " + variable_numbers.getName_attributes().get(num_operation).getOperator()+" ");
                                num_operation++;
                            }else{
                                System.out.println();
                            }
                        }

                        num_operation = 0;
                    }

                }

                else if (variableGet!=null) {
                    System.out.println(variableGet.getGetName() + " = " + variableGet.getGetData().getDataName() + "(" + variableGet.getGetData().getDataValue() + ")");
                }
                else if(array_statement!=null){
                    System.out.println("----------------ARRAY-----------------");
                    System.out.print(array_statement.getName_Array() + " = array(");
                    for(int k = 0 ;k<array_statement.getElements().size();k++){
                        if(k==array_statement.getElements().size()-1){
                            System.out.print(array_statement.getElements().get(k));
                        }else{
                            System.out.print(array_statement.getElements().get(k)+" , ");

                        }
                    }
                    System.out.println(")");
                }
            }
            boolean Break = program.getCode_attribuites().get(i).isBreak();
            if(Break){
                System.out.println("break ; ");
            }
            //The Begin For Statement's Generate
            ForStatement forStatement = program.getCode_attribuites().get(i).getForStatement();


                if( forStatement!=null ) {
                    System.out.println("---------------FOR Statement--------------");

                    if (forStatement.getForID()!=null && forStatement.getForStatementVariableNumber()!=null)
                    {
                        System.out.print("for ( " + forStatement.getForID() + " = " + forStatement.getIdValue() + " ; " + forStatement.getSecondID() + " ");

                        if (forStatement.getCount()!=null)
                        System.out.print(forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " . "+ forStatement.getCount() + " ; ");
                        else
                            System.out.print(forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " ; ");


                        if (forStatement.getForStatementVariableNumber().getOneOperation() != null) {

                            System.out.print(forStatement.getForStatementVariableNumber().getOneOperation().getNameOneOperation());
                            System.out.println( forStatement.getForStatementVariableNumber().getOneOperation().getOneOperation() + " )");

                        } else if (forStatement.getForStatementVariableNumber().getFast_math() != null) {

                            System.out.print(forStatement.getForStatementVariableNumber().getFast_math().getName() + forStatement.getForStatementVariableNumber().getFast_math().getOperation());
                            System.out.println(forStatement.getForStatementVariableNumber().getFast_math().getNumber() + " )");

                        } else if (forStatement.getForStatementVariableNumber().getThirdID() != null && forStatement.getForStatementVariableNumber().getCountValue() != null) {

                            System.out.println(forStatement.getForStatementVariableNumber().getThirdID() + " = " + forStatement.getForStatementVariableNumber().getCountValue() + " )");
                        }
                    }

                    else if (forStatement.getForID()==null && forStatement.getForStatementVariableNumber()!=null)
                    {
                        if (forStatement.getCount()!=null)
                        System.out.print("for (  ; " + forStatement.getSecondID() + " " +forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " . " + forStatement.getCount() +  " ; " );
                        else
                            System.out.print("for (  ; " + forStatement.getSecondID() + " " +forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " ; " );

                        if (forStatement.getForStatementVariableNumber().getOneOperation() != null) {
                            System.out.print(forStatement.getForStatementVariableNumber().getOneOperation().getNameOneOperation());
                            System.out.println( forStatement.getForStatementVariableNumber().getOneOperation().getOneOperation() + " )");
                        } else if (forStatement.getForStatementVariableNumber().getFast_math() != null) {
                            System.out.print(forStatement.getForStatementVariableNumber().getFast_math().getName() + forStatement.getForStatementVariableNumber().getFast_math().getOperation());
                            System.out.println(forStatement.getForStatementVariableNumber().getFast_math().getNumber() + " )");
                        } else if (forStatement.getForStatementVariableNumber().getThirdID() != null && forStatement.getForStatementVariableNumber().getCountValue() != null) {
                            System.out.println(forStatement.getForStatementVariableNumber().getThirdID() + " = " + forStatement.getForStatementVariableNumber().getCountValue() + " )");
                        }
                    }

                    else if (forStatement.getForID()!=null && forStatement.getForStatementVariableNumber()==null)
                    {
                        System.out.print("for ( " + forStatement.getForID() + " = " + forStatement.getIdValue() + " ; " + forStatement.getSecondID() + " ");
                        if (forStatement.getCount()!=null)
                        System.out.print(forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " . " + forStatement.getCount() + " ;  )");
                        else
                            System.out.print(forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " ;  )");
                    }

                    else
                    {
                        if (forStatement.getCount()!=null)
                        System.out.println("for (  ; " +  forStatement.getSecondID() + " " +forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() +" . " + forStatement.getCount() +  " ; )" );
                        else
                            System.out.println("for (  ; " +  forStatement.getSecondID() + " " +forStatement.getOperationIF().getOperation() + " " + forStatement.getCompareValue() + " ; )" );

                    }
                System.out.println( "{ "  );

                    if (forStatement.getCode_attributes()!=null)
                    {
                       recursive_for(forStatement);
                    }

                System.out.println("} ");

            }//The End For Statement's Generate


            Print print = program.getCode_attribuites().get(i).getPrint();
            If_Statement if_statement = program.getCode_attribuites().get(i).getIf_statement();
            Else_statement else_statement = program.getCode_attribuites().get(i).getElse_statement();
             if(if_statement!=null){
                System.out.println("---------------IF Statement--------------");
                System.out.print(if_statement.getName_statement() + "( ");
                for(int p = 0; p < if_statement.getVariables_one().size();p++){
                    System.out.print(if_statement.getVariables_one().get(p));
                    if(if_statement.getOperationIFS().size()>0&&num_operation_IF_Statement<if_statement.getOperationIFS().size()){
                        System.out.print(" "+if_statement.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                        num_operation_IF_Statement++;
                    }
                    System.out.print(if_statement.getVariables_two().get(p));
                    if(if_statement.getLogic_symbol().size()>0&&num_logic_symbol_if<if_statement.getLogic_symbol().size()){
                        System.out.print(" "+if_statement.getLogic_symbol().get(num_logic_symbol_if).getSymbol());
                        num_logic_symbol_if++;
                    }
                }
                 System.out.print("){");
                if(if_statement.getCode_attributes().size()>0){
                    recursive_if(if_statement);
                }
                 System.out.println("}");
            }
            else if (else_statement!=null){
                System.out.println("-----------ELSE STATEMENT-----------");
                System.out.println(else_statement.getName_statement()+"{");
                if(else_statement.getCode_attributes().size()>0){
                    recursive_else(else_statement);
                    System.out.println("}");
                }
            }
            else if (print!=null){
                int numOfSums = 0;
                System.out.println("--------PRINT--------");
                System.out.print(print.getName_print()+"(");
                if(print.getAttribute_prints()!=null) {
                    for (int m = 0; m < print.getAttribute_prints().size(); m++) {
                        if (print.getAttribute_prints().get(m).getPrint_function() != null) {
                            System.out.print(print.getAttribute_prints().get(m).getPrint_function().getDataName() + "("
                                    + print.getAttribute_prints().get(m).getPrint_function().getDataValue() + ")");
                        } else if (print.getAttribute_prints().get(m).getPrint_text() != null) {
                            System.out.print(print.getAttribute_prints().get(m).getPrint_text().getContent());
                        } else if (print.getAttribute_prints().get(m).getValue() != null) {
                            String values = print.getAttribute_prints().get(m).getValue();
                            System.out.print(values);
                        }
                        if(print.getOperation()!=null&&numOfSums!=(print.getAttribute_prints().size()-1)){
                            System.out.print(" "+print.getOperation().get(numOfSums));
                            numOfSums++;
                        }
                    }
                }
                System.out.println(")");
            }


            }
            /*String nameText = program.getCode_attribuites().get(i).getVariables().getName();
            String oneOperation = program.getCode_attribuites().get(i).getVariables().getOneOperation();
            String oneValue = program.getCode_attribuites().get(i).getVariables().getOneValue();
            ArrayList<String> valueNumber = program.getCode_attribuites().get(i).getVariables().getValue();
            ArrayList<String> operation = program.getCode_attribuites().get(i).getVariables().getOperation();
            Fast_math fast_math = program.getCode_attribuites().get(i).getVariables().getFast_math();

            *//*if(oneOperation!=null&&nameText!=null)
               System.out.println(nameText +oneOperation);

            else if(fast_math!=null)
            {
                System.out.println(fast_math.getName() + " " +fast_math.getOperation() + " " + fast_math.getNumber() );
            }
*//*



            System.out.print(nameText +" = ");
            for(int j = 0 ; j<valueNumber.size() ; j++ )
            {
                System.out.print(valueNumber.get(j) +" " +operation.get(j) + " ");
            }

*/

           /* if (valueNumber!=null&&nameText!=null)
            {
                System.out.println(nameText +" : "+valueNumber);
            }*/

        }
    }