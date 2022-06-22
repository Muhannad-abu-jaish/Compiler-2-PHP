package com.company;

import com.company.ast.Nodes.*;
import com.company.ast.visitor.BaseVisitor;
import generated.LEXERCONTROLLER;
import generated.PARSERCONTROLLER;
import jdk.nashorn.internal.runtime.ParserException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "D:\\Compiler-PHP\\Samples//sample_native.txt";
        CharStream charStream = fromFileName(source);
        LEXERCONTROLLER lexer = new LEXERCONTROLLER(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PARSERCONTROLLER parser = new PARSERCONTROLLER(tokenStream);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor().visit(tree);
        ErrorHandling(program);
        // write your code here
    }

    private static void ErrorHandling(Program program) {
    Stack<String>stack = BaseVisitor.getErrors();// الحصول على ستاك الايرورات من داخل كلاس الفيزيتور
    if(stack.empty()){// إذا لم يوجد أي اخطاء
        generateAst(program);// توليد شجرة ال ast
    }
    else { // كان في اخطاء
        while (!stack.empty()) { // منمشي عليهن خطأ خطأ
            System.err.println(stack.pop());//منطبعهن وحدة وحدة وسطر وسطر
        }
    }
    }

    public static void recursive_else(Else_statement else_statement){
        int num_sums = 0, num_operation = 0, num_operation_IF_Statement = 0, num_logic_symbol_if = 0;
        for (int i = 0; i < else_statement.getCode_attributes().size(); i++) {
            if(else_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = else_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = else_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                TextInput textInput = else_statement.getCode_attributes().get(i).getVariables().getTextInput();
                VariableGet variableGet =else_statement.getCode_attributes().get(i).getVariables().getVariableGet();
                if (textInput != null) {
                    System.out.println("------------TEXT_INPUT_ELSE---------");
                    System.out.println(textInput.getKey() + "=" + textInput.getValue() + "." + textInput.getAttribute_textInput().getName_attribute_TextInput());
                } else if (variables_text != null) {
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
            Print print = else_statement.getCode_attributes().get(i).getPrint();
            Clicking clicking = else_statement.getCode_attributes().get(i).getClicking();
            Else_statement else_statement_inner = else_statement.getCode_attributes().get(i).getElse_statement();
            If_Statement if_statement_inner = else_statement.getCode_attributes().get(i).getIf_statement();
             if (clicking != null) {
                System.out.println("-----------ON Click-------------");
                System.out.println("Click by : " + clicking.getClick());
                int size_attribute_click = clicking.getAttribute_clickList().size();
                if (size_attribute_click != 0) {
                    for (int j = 0; j < size_attribute_click; j++) {
                        System.out.println("name_attribute : " + clicking.getAttribute_clickList().get(j).getName_attribute());
                        System.out.println("-----------Attribute:------------");
                        if (clicking.getAttribute_clickList().get(j).getText() != null) {
                            Text text = clicking.getAttribute_clickList().get(j).getText();
                            System.out.println("-----Text----");
                            System.out.println("Name Text : " + text.getName_text());
                            Text_Attribute text_attribute = text.getText_attribute();
                            if (text_attribute.getColor() != null) {
                                System.out.println("Color : " + text_attribute.getColor());
                            }
                            if (text_attribute.getContent() != null) {
                                System.out.println("Content : " + text_attribute.getContent());
                            }
                        }
                        if (clicking.getAttribute_clickList().get(j).getButton() != null) {
                            Button button = clicking.getAttribute_clickList().get(j).getButton();
                            System.out.println("-----Button----");
                            System.out.println("Name Button : " + button.getName_button());
                            Button_Attribute button_attribute = button.getButton_attribute();
                            if (button_attribute.getWidth() != null) {
                                System.out.println("Width : " + button_attribute.getWidth());
                            }
                            if (button_attribute.getBackground() != null) {
                                System.out.println("Background : " + button_attribute.getBackground());
                            }
                        }
                    }
                }
            }
             else if (else_statement_inner != null) {
                System.out.println("---------------else Statement_inner--------------");
                System.out.println(else_statement_inner.getName_statement() + "{");

                if (else_statement_inner.getCode_attributes().size() > 0) {
                    recursive_else(else_statement_inner);
                    System.out.println("}");
                }
            }
             else if (if_statement_inner != null) {
                System.out.println("---------------IF Statement_inner--------------");
                System.out.print(if_statement_inner.getName_statement() + "(" + if_statement_inner.getVariable_one());
                if (if_statement_inner.getOperationIFS().size() > 0 && num_operation_IF_Statement < if_statement_inner.getOperationIFS().size()) {
                    System.out.print(" " + if_statement_inner.getOperationIFS().get(num_operation_IF_Statement).getOperation()+" ");
                    num_operation_IF_Statement++;
                }
                System.out.println(if_statement_inner.getVariable_two() + "){");
                if (if_statement_inner.getCode_attributes().size() > 0) {
                    recursive_if(if_statement_inner);
                    System.out.println("}");
                }
            }
             else if (print!=null){
                 System.out.println("--------PRINT--------");
                 System.out.print(print.getName_print()+"(");
                 if(print.getAttribute_print()!=null){
                     if(print.getAttribute_print().getPrint_function()!=null)
                     {
                         System.out.print(print.getAttribute_print().getPrint_function().getDataName()+"("
                                 +print.getAttribute_print().getPrint_function().getDataValue()+")");
                     }
                     else if (print.getAttribute_print().getPrint_text()!=null){
                         System.out.print(print.getAttribute_print().getPrint_text().getContent());
                     }
                     else if (print.getAttribute_print().getValue()!=null){
                         System.out.print(print.getAttribute_print().getValue());
                     }
                     System.out.println(")");
                 }
             }
        }
    }
    public static void recursive_if(If_Statement if_statement) {
        int num_sums = 0, num_operation = 0, num_operation_IF_Statement = 0, num_logic_symbol_if = 0;
        for (int i = 0; i < if_statement.getCode_attributes().size(); i++) {
            if(if_statement.getCode_attributes().get(i).getVariables()!=null) {
                Variables_Text variables_text = if_statement.getCode_attributes().get(i).getVariables().getVariables_text();
                Variable_Numbers variable_numbers = if_statement.getCode_attributes().get(i).getVariables().getVariable_numbers();
                VariableGet variableGet =if_statement.getCode_attributes().get(i).getVariables().getVariableGet();
                TextInput textInput = if_statement.getCode_attributes().get(i).getVariables().getTextInput();
                if (textInput != null) {
                    System.out.println("------------TEXT_INPUT---------");
                    System.out.println(textInput.getKey() + "=" + textInput.getValue() + "." + textInput.getAttribute_textInput().getName_attribute_TextInput());
                }
                else if (variables_text != null) {
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
            Print print = if_statement.getCode_attributes().get(i).getPrint();
            Clicking clicking = if_statement.getCode_attributes().get(i).getClicking();
            If_Statement if_statement_inner = if_statement.getCode_attributes().get(i).getIf_statement();
            Else_statement else_statement_inner = if_statement.getCode_attributes().get(i).getElse_statement();
             if (clicking != null) {
                System.out.println("-----------ON Click-------------");
                System.out.println("Click by : " + clicking.getClick());
                int size_attribute_click = clicking.getAttribute_clickList().size();
                if (size_attribute_click != 0) {
                    for (int j = 0; j < size_attribute_click; j++) {
                        System.out.println("name_attribute : " + clicking.getAttribute_clickList().get(j).getName_attribute());
                        System.out.println("-----------Attribute:------------");
                        if (clicking.getAttribute_clickList().get(j).getText() != null) {
                            Text text = clicking.getAttribute_clickList().get(j).getText();
                            System.out.println("-----Text----");
                            System.out.println("Name Text : " + text.getName_text());
                            Text_Attribute text_attribute = text.getText_attribute();
                            if (text_attribute.getColor() != null) {
                                System.out.println("Color : " + text_attribute.getColor());
                            }
                            if (text_attribute.getContent() != null) {
                                System.out.println("Content : " + text_attribute.getContent());
                            }
                        }
                        if (clicking.getAttribute_clickList().get(j).getButton() != null) {
                            Button button = clicking.getAttribute_clickList().get(j).getButton();
                            System.out.println("-----Button----");
                            System.out.println("Name Button : " + button.getName_button());
                            Button_Attribute button_attribute = button.getButton_attribute();
                            if (button_attribute.getWidth() != null) {
                                System.out.println("Width : " + button_attribute.getWidth());
                            }
                            if (button_attribute.getBackground() != null) {
                                System.out.println("Background : " + button_attribute.getBackground());
                            }
                        }
                    }
                }
            }
            else if (if_statement_inner != null) {
                System.out.println("---------------IF Statement_Inner--------------");
                System.out.print(if_statement_inner.getName_statement() + "(" + if_statement_inner.getVariable_one());
                if (if_statement_inner.getOperationIFS().size() > 0 && num_operation_IF_Statement < if_statement_inner.getOperationIFS().size()) {
                    System.out.print(" " + if_statement_inner.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                    num_operation_IF_Statement++;
                }
                System.out.println(if_statement.getVariable_two() + "){");
                if (if_statement_inner.getCode_attributes().size() > 0) {
                    recursive_if(if_statement_inner);
                    System.out.println("}");
                }
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
                 if(print.getAttribute_print()!=null){
                     if(print.getAttribute_print().getPrint_function()!=null)
                     {
                         System.out.print(print.getAttribute_print().getPrint_function().getDataName()+"("
                                 +print.getAttribute_print().getPrint_function().getDataValue()+")");
                     }
                     else if (print.getAttribute_print().getPrint_text()!=null){
                         System.out.print(print.getAttribute_print().getPrint_text().getContent());
                     }
                     else if (print.getAttribute_print().getValue()!=null){
                         System.out.print(print.getAttribute_print().getValue());
                     }
                     System.out.println(")");
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
                TextInput textInput = program.getCode_attribuites().get(i).getVariables().getTextInput();
                VariableGet variableGet =program.getCode_attribuites().get(i).getVariables().getVariableGet();

                if(textInput!=null){
                    System.out.println("------------TEXT_INPUT---------");
                    System.out.println(textInput.getKey()+ "=" + textInput.getValue() +"."+textInput.getAttribute_textInput().getName_attribute_TextInput());
                }
                else if(variables_text!=null){
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
            }

            Print print = program.getCode_attribuites().get(i).getPrint();
            Clicking clicking = program.getCode_attribuites().get(i).getClicking();
            If_Statement if_statement = program.getCode_attribuites().get(i).getIf_statement();
            Else_statement else_statement = program.getCode_attribuites().get(i).getElse_statement();
            if(clicking!=null)
            {
                System.out.println("I = " + i);
                System.out.println("-----------ON Click-------------");
                System.out.println("Click by : " + clicking.getClick());
                int size_attribute_click = clicking.getAttribute_clickList().size();
                if(size_attribute_click!=0){
                    for(int j = 0 ; j<size_attribute_click;j++){
                        System.out.println("name_attribute : " +clicking.getAttribute_clickList().get(j).getName_attribute());
                        System.out.println("-----------Attribute:------------");
                        if(clicking.getAttribute_clickList().get(j).getText()!=null){
                            Text text = clicking.getAttribute_clickList().get(j).getText();
                            System.out.println("-----Text----");
                            System.out.println("Name Text : " + text.getName_text());
                            Text_Attribute text_attribute = text.getText_attribute();
                            if(text_attribute.getColor()!=null){
                                System.out.println("Color : "+text_attribute.getColor());
                            }
                            if(text_attribute.getContent()!=null){
                                System.out.println("Content : " + text_attribute.getContent());
                            }
                        }if(clicking.getAttribute_clickList().get(j).getButton()!=null){
                            Button button = clicking.getAttribute_clickList().get(j).getButton();
                            System.out.println("-----Button----");
                            System.out.println("Name Button : " + button.getName_button());
                            Button_Attribute button_attribute = button.getButton_attribute();
                            if(button_attribute.getWidth()!=null){
                                System.out.println("Width : "+button_attribute.getWidth());
                            }
                            if(button_attribute.getBackground() !=null){
                                System.out.println("Background : " + button_attribute.getBackground());
                            }
                        }
                    }
                }
            }
            else if(if_statement!=null){
                System.out.println("---------------IF Statement--------------");
                System.out.print(if_statement.getName_statement()+"("+if_statement.getVariable_one());
                if(if_statement.getOperationIFS().size()>0&&num_operation_IF_Statement<if_statement.getOperationIFS().size()){
                    System.out.print(" "+if_statement.getOperationIFS().get(num_operation_IF_Statement).getOperation());
                    num_operation_IF_Statement++;
                }
                System.out.println(if_statement.getVariable_two()+"){");
                if(if_statement.getCode_attributes().size()>0){
                    recursive_if(if_statement);
                    System.out.println("}");
                }


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
                if(print.getAttribute_print()!=null){
                    if(print.getAttribute_print().getPrint_function()!=null)
                    {
                        System.out.print(print.getAttribute_print().getPrint_function().getDataName()+"("
                                +print.getAttribute_print().getPrint_function().getDataValue()+")");
                    }
                    else if (print.getAttribute_print().getPrint_text()!=null){
                        System.out.print(print.getAttribute_print().getPrint_text().getContent());
                    }
                    else if (print.getAttribute_print().getValue()!=null){
                        System.out.print(print.getAttribute_print().getValue());
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

}