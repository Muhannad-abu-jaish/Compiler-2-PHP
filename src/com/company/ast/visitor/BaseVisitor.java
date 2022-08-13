package com.company.ast.visitor;

import com.company.ast.Nodes.*;
import generated.PARSERCONTROLLER;
import generated.PARSERCONTROLLERBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class BaseVisitor extends PARSERCONTROLLERBaseVisitor{

    public static final String MY_NUMBERS = "Number" ;
    public static final String MY_STRINGS = "String" ;
    public static final String MY_ARRAYS = "array" ;
    public static final String MY_IDS = "ID" ;
    public static final String MY_ELSE_IFS_Parent = "Else IF Parent" ;
    public static final String MY_IFS_Parent = "IF Parent" ;
    public static final String MY_ELSE_IFS_Inner = "Else IF Parent" ;
    public static final String MY_IFS_Inner = "IF Parent" ;
    static  HashMap<String,String> symbolTable = new HashMap<>();
    static  Stack<String> errors = new Stack<>();
    public static HashMap<String, String> getSymbolTable() {
        return symbolTable;
    }


    public static Stack<String> getErrors() {
        return errors;
    }
    private boolean isNumber(String data){
        try {
            double d = Double.parseDouble(data);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public Array_statement visitArray(PARSERCONTROLLER.ArrayContext ctx) {
        Array_statement array_statement = new Array_statement();
        ArrayList<String>elements = new ArrayList<>();


        if (!isDefined(ctx.CHARS(0).getText()))
        {
            symbolTable.put(ctx.CHARS(0).getText() , MY_ARRAYS);
            array_statement.setName_Array(ctx.CHARS(0).getText());
            for(int i = 1 ;i<ctx.CHARS().size();i++){
                elements.add(ctx.CHARS(i).getText());
            }
        }
        else if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
            errors.push(ctx.CHARS(0).getText() + " is a String variable ,,can't ba an array ");

        else if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_NUMBERS))
            errors.push(ctx.CHARS(0).getText() + " is a number variable ,,can't ba an array ");

        else if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_IDS))
            errors.push(ctx.CHARS(0).getText() + " is a ID variable ,,can't ba an array ");
        array_statement.setElements(elements);
        return array_statement;
    }

    @Override
    public ForStatement visitFor_statement(PARSERCONTROLLER.For_statementContext ctx) {
        ForStatement forStatement =new ForStatement();

        if (ctx.EQUAL()!=null) {

            if (isDefined(ctx.CHARS(0).getText()))
            {
                if (!getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
                {
                    forStatement.setForID(ctx.CHARS(0).getText());
                }else
                    errors.push("The first parameter in for" + ctx.CHARS(0).getText() + "must be a variable number not character or string");
            }
            else if (!isNumeric(ctx.CHARS(0).getText()))
            {
                forStatement.setForID(ctx.CHARS(0).getText());
                symbolTable.put(ctx.CHARS(0).getText() , MY_NUMBERS) ;

            }else
                errors.push("The first parameter in for should not be a direct number like this :" + ctx.CHARS(0).getText());


            if (isDefined(ctx.CHARS(1).getText()))
            {
                if (!getValueSymbolTable(ctx.CHARS(1).getText()).equals(MY_STRINGS))
                {
                    forStatement.setIdValue(ctx.CHARS(1).getText());
                }else
                    errors.push(  ctx.CHARS(1).getText() + " a String variable ,,must be a number");

            }
            else if (!isNumeric(ctx.CHARS(1).getText()))
            {
                if (!isDefined(ctx.CHARS(1).getText()))
                    errors.push(ctx.CHARS(1).getText() + " Undefined Variable ");

                else
                {
                    forStatement.setIdValue(ctx.CHARS(1).getText());
                    symbolTable.put(ctx.CHARS(1).getText(), MY_NUMBERS);
                }

            }else
                forStatement.setIdValue(ctx.CHARS(1).getText());


            if (ctx.CHARS(2)!=null)
            {
                if (isDefined(ctx.CHARS(2).getText()))
                {
                    if (getValueSymbolTable(ctx.CHARS(2).getText()).equals(MY_NUMBERS))
                    {
                        forStatement.setSecondID(ctx.CHARS(2).getText());
                        forStatement.setOperationIF(visitOperation_if(ctx.operation_if()));
                    }else
                        errors.push("The compare variable " + ctx.CHARS(2).getText() + "must be a variable number") ;
                } else
                {
                    if (isNumeric(ctx.CHARS(2).getText()))
                        errors.push("The compare variable in for must be a variable number not like this "  + ctx.CHARS(2).getText() ) ;

                    else
                    errors.push(ctx.CHARS(2).getText() + " Undefined Variable") ;
                }

                if (isDefined(ctx.CHARS(3).getText()))
                {
                    if (/*getValueSymbolTable(ctx.CHARS(3).getText()).equals(MY_NUMBERS) ||*/ getValueSymbolTable(ctx.CHARS(3).getText()).equals(MY_ARRAYS))
                    {
                        forStatement.setCompareValue(ctx.CHARS(3).getText());
                        if (ctx.COUNT()!=null)
                        {
                            forStatement.setCount(ctx.COUNT().getText());
                        }
                    }else
                        errors.push("The compare variable " + ctx.CHARS(3).getText() + " must be a variable number") ;
                } else
                {
                    if (isNumeric(ctx.CHARS(3).getText()))
                        forStatement.setCompareValue(ctx.CHARS(3).getText());

                    else if (ctx.COUNT()!=null)
                        errors.push("The array " + ctx.CHARS(3).getText() + " must be initialized to have a size");
                    else
                    {
                       errors.push(ctx.CHARS(3).getText() + "  Undefined variable") ;
                    }
                }

            }

        }

        else if (ctx.operation_if()!=null)
        {
            if (isDefined(ctx.CHARS(0).getText()))
            {
                if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_NUMBERS))
                {
                    forStatement.setSecondID(ctx.CHARS(0).getText());
                    forStatement.setOperationIF(visitOperation_if(ctx.operation_if()));
                }else
                    errors.push("The compare variable " + ctx.CHARS(0) + " must be number not character or string") ;

            }
            else if(isNumeric(ctx.CHARS(0).getText()))
                errors.push(ctx.CHARS(0).getText() + " must be a Variable number  ") ;
            else
                errors.push( ctx.CHARS(0) + " Undefined Variable");


            if (isDefined(ctx.CHARS(1).getText()))
            {
                if (getValueSymbolTable(ctx.CHARS(1).getText()).equals(MY_NUMBERS) || getValueSymbolTable(ctx.CHARS(1).getText()).equals(MY_ARRAYS))
                {
                    forStatement.setCompareValue(ctx.CHARS(1).getText());
                    if (ctx.COUNT()!=null)
                    {
                        forStatement.setCount(ctx.COUNT().getText());
                    }

                }else
                    errors.push("The compare variable " + ctx.CHARS(1).getText() + " must be a variable number") ;
            } else
            {
                if (isNumeric(ctx.CHARS(1).getText()))
                    forStatement.setCompareValue(ctx.CHARS(1).getText());

                else if (ctx.COUNT()!=null)
                    errors.push("The array " + ctx.CHARS(1).getText() + " must be initialized to have a size");
                else
                {
                    errors.push(ctx.CHARS(1).getText() + "  Undefined variable") ;
                }
            }

        }

        if (ctx.for_statement_variable_number()!=null)
        {
            forStatement.setForStatementVariableNumber(visitFor_statement_variable_number(ctx.for_statement_variable_number()));
        }

        ArrayList<Code_attribuite> codeAttribuites = new ArrayList<>();
        for (int i = 0 ; i<ctx.code_attribute().size() ; i++) {
            codeAttribuites.add(visitCode_attribute(ctx.code_attribute(i)));
            if (ctx.code_attribute(i).if_statment() != null) {
                if (ctx.code_attribute(i).if_statment().ELSE_IF() == null) {
                    symbolTable.put(MY_IFS_Parent, String.valueOf(i));
                } else {
                    if (!isDefined(MY_IFS_Parent)) {
                        errors.push("IF Statement is not Define!!");
                    } else if (!getValueSymbolTable(MY_IFS_Parent).equals(String.valueOf(i - 1))) {
                        errors.push("Else IF Statement must be after IF statement!!");
                    }
                    symbolTable.put(MY_ELSE_IFS_Parent, String.valueOf(i));
                }
            }
            if (ctx.code_attribute(i).else_statment() != null) {
                if (!isDefined(MY_IFS_Parent)) {
                    errors.push("IF Statement is not Define!!");
                } else if (!getValueSymbolTable(MY_IFS_Parent).equals(String.valueOf(i - 1))) {
                    if (isDefined("Else IF")) {
                        if (!getValueSymbolTable(MY_ELSE_IFS_Parent).equals(String.valueOf(i - 1))) {
                            errors.push("Else Statement must be after Else IF statement!!");
                        }
                    } else {
                        errors.push("Else Statement must be after IF statement!!");
                    }
                }
            }
        }
        forStatement.setCode_attributes(codeAttribuites);
        return forStatement;
    }


    @Override
    public ForStatementVariableNumber visitFor_statement_variable_number(PARSERCONTROLLER.For_statement_variable_numberContext ctx) {

        ForStatementVariableNumber forStatementVariableNumber = new ForStatementVariableNumber() ;

        if (ctx.CHARS(0)!=null && ctx.CHARS(1)!=null)
        {
            ArrayList<String> countValue = new ArrayList<>() ;

            if(isDefined(ctx.CHARS(0).getText()))
            {
                if (!getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
                    forStatementVariableNumber.setThirdID(ctx.CHARS(0).getText());

                else
                    errors.push("The Variable " + ctx.CHARS(0).getText() + " is String one ,, must be number");

            }
            else if(!isNumeric(ctx.CHARS(0).getText())) {
                forStatementVariableNumber.setThirdID(ctx.CHARS(0).getText());
                symbolTable.put(ctx.CHARS(0).getText() , MY_NUMBERS);
            }
            else
                errors.push(ctx.CHARS(0).getText() + " must be a variable not just a direct number");


            for (int i=0 ; i<(ctx.CHARS().size())-1 ; i++  )
            {
                if (isDefined(ctx.CHARS(i+1).getText()))
                {
                    if (!getValueSymbolTable(ctx.CHARS(i+1).getText()).equals(MY_STRINGS))
                        countValue.add(ctx.CHARS(i+1).getText());

                    else
                        errors.push("The Variable " + ctx.CHARS(i+1).getText() + " is String one ,, must be number") ;
                }
                else if (isNumeric(ctx.CHARS(i+1).getText()))
                    countValue.add(ctx.CHARS(i+1).getText());

                else
                    errors.push(ctx.CHARS(i+1).getText() + " Undefined Variable ") ;


            }
            forStatementVariableNumber.setCountValue(countValue);
        }

        else if (ctx.for_statement_fast_math()!=null)
            forStatementVariableNumber.setFast_math(visitFor_statement_fast_math(ctx.for_statement_fast_math()));

        else if (ctx.for_statement_adding_one()!=null)
            forStatementVariableNumber.setOneOperation(visitFor_statement_adding_one(ctx.for_statement_adding_one()));

        else if (ctx.for_statement_minuss_one()!=null)
            forStatementVariableNumber.setOneOperation(visitFor_statement_minuss_one(ctx.for_statement_minuss_one()));

        return forStatementVariableNumber;
    }

    @Override
    public OneOperation visitFor_statement_adding_one(PARSERCONTROLLER.For_statement_adding_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();


        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS().getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS().getText()).equals(MY_STRINGS))
                    oneOperation.setNameOneOperation(ctx.CHARS().getText());

                else
                    errors.push("The Variable " + ctx.CHARS().getText() + " is String one ,, must be number");

            }
            else if(isNumeric(ctx.CHARS().getText()))
                errors.push(ctx.CHARS().getText()+" must be a variable number not just a direct number") ;

            else
                errors.push(ctx.CHARS().getText() + " Undefined Variable");

        }

        if(ctx.SUMS()!=null)
            oneOperation.setOneOperation(ctx.SUMS().getText());


        return oneOperation;
    }

    @Override
    public OneOperation visitFor_statement_minuss_one(PARSERCONTROLLER.For_statement_minuss_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();


        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS().getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS().getText()).equals(MY_STRINGS))
                    oneOperation.setNameOneOperation(ctx.CHARS().getText());

                else
                    errors.push("The Variable " + ctx.CHARS().getText() + " is String one ,, must be number");

            }
            else if(isNumeric(ctx.CHARS().getText()))
                errors.push(ctx.CHARS().getText()+" must be a variable number not just a direct number") ;

            else
                errors.push(ctx.CHARS().getText() + " Undefined Variable");
        }


        if(ctx.MINUSS()!=null)
            oneOperation.setOneOperation(ctx.MINUSS().getText());


        return oneOperation;
    }

    @Override
    public Fast_math visitFor_statement_fast_math(PARSERCONTROLLER.For_statement_fast_mathContext ctx) {
        Fast_math fast_math = new Fast_math();

        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS(0).getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
                    fast_math.setName(ctx.CHARS(0).getText());
                else
                    errors.push("The Variable " + ctx.CHARS(0).getText() + " is String one");

            }
            else if(!isNumeric(ctx.CHARS(0).getText())) {
                fast_math.setName(ctx.CHARS(0).getText());
                symbolTable.put(ctx.CHARS(0).getText() , MY_NUMBERS);
            }

            else
                errors.push(ctx.CHARS(0).getText() + " must be a variable not just a direct number");


            if (isDefined(ctx.CHARS(1).getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS(1).getText()).equals(MY_STRINGS))
                    fast_math.setNumber(ctx.CHARS(1).getText()) ;

                else
                    errors.push("The Variable " + ctx.CHARS(1).getText() + " is String one") ;

            }else if (isNumeric(ctx.CHARS(1).getText()))
                    fast_math.setNumber(ctx.CHARS(1).getText()) ;

                else
                errors.push( ctx.CHARS(1).getText() + " Undefined Variable") ;

        }

        if (ctx.SUM_EQUAL()!=null)
            fast_math.setOperation(ctx.SUM_EQUAL().getText());

        else if (ctx.MINUS_EQUAL()!=null)
            fast_math.setOperation(ctx.MINUS_EQUAL().getText());

        else if(ctx.DIVID_EQUAL()!=null)
            fast_math.setOperation(ctx.DIVID_EQUAL().getText());

        else if (ctx.MULTIPLY_EQUAL()!=null)
            fast_math.setOperation(ctx.MULTIPLY_EQUAL().getText());

        return fast_math;
    }

    @Override
    public If_Statement visitIf_statment(PARSERCONTROLLER.If_statmentContext ctx) {
        If_Statement if_statement = new If_Statement();
        ArrayList<Code_attribuite>code_attributes = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++) {
            code_attributes.add(visitCode_attribute(ctx.code_attribute(i)));
            if(ctx.code_attribute(i).if_statment()!=null){
                if(ctx.code_attribute(i).if_statment().ELSE_IF()==null){
                    symbolTable.put(MY_IFS_Inner, String.valueOf(i));
                }else{
                    if(!isDefined(MY_IFS_Inner)){
                        errors.push("IF Statement Inner is not Define!!");
                    }else if(!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i-1))){
                        errors.push("Else IF Inner Statement must be after IF statement Inner!!");
                    }
                    symbolTable.put(MY_ELSE_IFS_Inner,String.valueOf(i));
                }
            }
            if(ctx.code_attribute(i).else_statment()!=null){
                if(!isDefined(MY_IFS_Inner)){
                    errors.push("IF Statement Inner is not Define!!");
                }else if(!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i-1))) {
                    if (isDefined(MY_IFS_Inner)) {
                        if (!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i - 1))) {
                            errors.push("Else Statement Inner must be after Else IF statement Inner!!");
                        }
                    } else {
                        errors.push("Else Statement Inner must be after IF statement Inner!!");
                    }
                }
            }

        }
        if_statement.setCode_attributes(code_attributes);
        if(ctx.ELSE_IF()!=null){
            if_statement.setName_statement(ctx.ELSE_IF().getText());
        }
        else if(ctx.IF()!=null) {
            if_statement.setName_statement(ctx.IF().getText());
        }
        ArrayList<String>variablesOne = new ArrayList<>();
        ArrayList<String>variablesTwo = new ArrayList<>();
        for(int i = 0 ;i <ctx.CHARS().size();i++)
            {
                if(!isNumber(ctx.CHARS(i).getText())&&ctx.SINGLE_QUOTE().size()==0) {
                    if (isArray(ctx.CHARS(i).getText())) {
                        if (!getValueSymbolTable(NAMEARRAY).equals(MY_ARRAYS)) {
                            errors.push("The " + NAMEARRAY + " is not Array assignment!!");
                        }
                    }else
                        errors.push("The " + NAMEARRAY + " is not defined!!");
                    if(!isArray(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())&&!ctx.CHARS(i).getText().equals("EMPTY")){
                        if(ctx.ELSE_IF()!=null){
                                errors.push("The Variable " + ctx.CHARS(i).getText() + " is not defined in Else IF Statement");
                    }else{
                                errors.push("The Variable " + ctx.CHARS(i).getText() + " is not defined in IF Statement");
                         }
                    }
                    else{
                        if(i%2==0){
                            variablesOne.add(ctx.CHARS(i).getText());
                        }else{
                            variablesTwo.add(ctx.CHARS(i).getText());
                        }
                    }
                }else{
                    if(i%2==0){
                        variablesOne.add(ctx.CHARS(i).getText());
                    }else{
                        variablesTwo.add(ctx.CHARS(i).getText());
                    }
                }
            }
        if_statement.setVariables_one(variablesOne);
        if_statement.setVariables_two(variablesTwo);
        ArrayList<OperationIF>operationIFS = new ArrayList<>();
        for(int i=0;i<ctx.operation_if().size();i++){
            operationIFS.add(visitOperation_if(ctx.operation_if(i)));
        }
        if_statement.setOperationIFS(operationIFS);
        ArrayList<Logic_symbol>logic_symbols = new ArrayList<>();
        for(int i = 0 ; i<ctx.logical_sympol().size();i++){
            logic_symbols.add(visitLogical_sympol(ctx.logical_sympol(i)));
        }
        if_statement.setLogic_symbol(logic_symbols);
        return if_statement;
    }

    @Override
    public Logic_symbol visitLogical_sympol(PARSERCONTROLLER.Logical_sympolContext ctx) {
        Logic_symbol logic_symbol = new Logic_symbol();
        if(ctx.OR()!=null) {
            logic_symbol.setSymbol(ctx.OR().getText());
        }else{
            logic_symbol.setSymbol(ctx.AND().getText());
        }
        return logic_symbol;
    }

    @Override
    public OperationIF visitOperation_if(PARSERCONTROLLER.Operation_ifContext ctx) {
       OperationIF operationIF  = new OperationIF();
       if(ctx.TAG_CLOSE()!=null){
           operationIF.setOperation(ctx.TAG_CLOSE().getText());
       }else if (ctx.TAG_OPEN()!=null){
          operationIF.setOperation(ctx.TAG_OPEN().getText());
        }else if(ctx.NOT_EQUAL()!=null){
           operationIF.setOperation(ctx.NOT_EQUAL().getText());
       }else if (ctx.EQUALEQUAL()!=null){
           operationIF.setOperation(ctx.EQUALEQUAL().getText());
       }else if (ctx.TAG_CLOSE_EQUAL()!=null){
           operationIF.setOperation(ctx.TAG_CLOSE_EQUAL().getText());
       }else if (ctx.TAG_OPEN_EQUAL()!=null) {
           operationIF.setOperation(ctx.TAG_OPEN_EQUAL().getText());
       }
       return operationIF;
    }
    @Override
    public Else_statement visitElse_statment(PARSERCONTROLLER.Else_statmentContext ctx) {
        Else_statement else_statement = new Else_statement();
        else_statement.setName_statement(ctx.ELSE().getText());
        ArrayList<Code_attribuite>code_attributes = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++)
        {
            code_attributes.add(visitCode_attribute(ctx.code_attribute(i)));
            if(ctx.code_attribute(i).if_statment()!=null){
                if(ctx.code_attribute(i).if_statment().ELSE_IF()==null){
                    symbolTable.put(MY_IFS_Inner, String.valueOf(i));
                }else{
                    if(!isDefined(MY_IFS_Inner)){
                        errors.push("IF Statement Inner is not Define!!");
                    }else if(!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i-1))){
                        errors.push("Else IF Inner Statement must be after IF statement Inner!!");
                    }
                    symbolTable.put(MY_ELSE_IFS_Inner,String.valueOf(i));
                }
            }
            if(ctx.code_attribute(i).else_statment()!=null){
                if(!isDefined(MY_IFS_Inner)){
                    errors.push("IF Statement Inner is not Define!!");
                }else if(!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i-1))) {
                    if (isDefined(MY_IFS_Inner)) {
                        if (!getValueSymbolTable(MY_IFS_Inner).equals(String.valueOf(i - 1))) {
                            errors.push("Else Statement Inner must be after Else IF statement Inner!!");
                        }
                    } else {
                        errors.push("Else Statement Inner must be after IF statement Inner!!");
                    }
                }
            }

        }
        else_statement.setCode_attributes(code_attributes);
        return else_statement;
    }

    @Override
    public Program visitProgram(PARSERCONTROLLER.ProgramContext ctx) {
        Program program = new Program();
        ArrayList<Code_attribuite>code_attribuites = new ArrayList<>();
        for(int i = 0;i<ctx.code_attribute().size();i++)
        {
            code_attribuites.add(visitCode_attribute(ctx.code_attribute(i)));
            if(ctx.code_attribute(i).if_statment()!=null){
               if(ctx.code_attribute(i).if_statment().ELSE_IF()==null){
                   symbolTable.put(MY_IFS_Parent, String.valueOf(i));
               }else{
                   if(!isDefined(MY_IFS_Parent)){
                       errors.push("IF Statement is not Define!!");
                   }else if(!getValueSymbolTable(MY_IFS_Parent).equals(String.valueOf(i-1))){
                       errors.push("Else IF Statement must be after IF statement!!");
                   }
                   symbolTable.put(MY_ELSE_IFS_Parent,String.valueOf(i));
               }
            }
            if(ctx.code_attribute(i).else_statment()!=null){
                if(!isDefined(MY_IFS_Parent)){
                    errors.push("IF Statement is not Define!!");
                }else if(!getValueSymbolTable(MY_IFS_Parent).equals(String.valueOf(i-1))) {
                    if (isDefined(MY_IFS_Parent)) {
                        if (!getValueSymbolTable(MY_IFS_Parent).equals(String.valueOf(i - 1))) {
                            errors.push("Else Statement must be after Else IF statement!!");
                        }
                    } else {
                        errors.push("Else Statement must be after IF statement!!");
                    }
                }
            }
        }
        program.setCode_attribuites(code_attribuites);
        return program;
    }

    @Override
    public Code_attribuite visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx) {
        Code_attribuite code_attribuite=new Code_attribuite();
        if(ctx.variables()!=null) {
            code_attribuite.setVariables(visitVariables(ctx.variables()));
        }
         if (ctx.if_statment()!=null)
        {
            code_attribuite.setIf_statement(visitIf_statment(ctx.if_statment()));
        }
         if(ctx.else_statment()!=null)
         {
             code_attribuite.setElse_statement(visitElse_statment(ctx.else_statment()));
         }
         if(ctx.print()!=null){
             code_attribuite.setPrint(visitPrint(ctx.print()));
         }
         if (ctx.for_statement()!=null)
         {
             code_attribuite.setForStatement(visitFor_statement(ctx.for_statement()));
         }
         if(ctx.BREAK()!=null){
             code_attribuite.setBreak(true);
         }
        return code_attribuite;
    }

    @Override
    public Object visitComment(PARSERCONTROLLER.CommentContext ctx) {
        return super.visitComment(ctx);
    }
    @Override
    public Print visitPrint(PARSERCONTROLLER.PrintContext ctx) {
        Print print = new Print();
        print.setName_print(ctx.PRINT().getText());
        if(ctx.printattribute()!=null){
            ArrayList<Attribute_print>attribute_prints  = new ArrayList<>();
            for(int i = 0 ; i < ctx.printattribute().size();i++){
                attribute_prints.add(visitPrintattribute(ctx.printattribute(i)));
            }
            print.setAttribute_prints(attribute_prints);
        }
        if(ctx.SUM()!=null){
            ArrayList<String>operations  = new ArrayList<>();
            for(int i = 0 ; i < ctx.SUM().size();i++){
                operations.add(ctx.SUM(i).getText());
            }
            print.setOperation(operations);
        }
        return print;
    }

    @Override
    public Print_text visitPrint_text(PARSERCONTROLLER.Print_textContext ctx) {
        Print_text print_text = new Print_text();
        if(ctx.CHARS()!=null){
            print_text.setContent(ctx.CHARS().getText());
        }
        return print_text;
    }

    @Override
    public Attribute_print visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx) {
        Attribute_print attribute_print = new Attribute_print();

        if (ctx.CHARS()!=null){
            if (!isDefined(ctx.CHARS().getText()) && !isNumeric(ctx.CHARS().getText()))
                errors.push(ctx.CHARS().getText() +" Undefined Variable");

            else
                attribute_print.setValue(ctx.CHARS().getText());
        }

        else if (ctx.print_text()!=null){
            attribute_print.setPrint_text(visitPrint_text(ctx.print_text()));
        }
        else if (ctx.getdata()!=null){
            attribute_print.setPrint_function(visitGetdata(ctx.getdata()));
        }
        return attribute_print;
    }

    @Override
    public GetData visitGetdata(PARSERCONTROLLER.GetdataContext ctx) {

        GetData getData = new GetData();

        if (ctx.GET_DATA()!=null)
            getData.setDataName(ctx.GET_DATA().getText());
        if(ctx.SINGLE_QUOTE().size()>0)
        {
            if (ctx.CHARS()!=null)
                getData.setDataValue(ctx.CHARS().getText());
        }else if(ctx.SINGLE_QUOTE().size()==0) {
            if (ctx.CHARS() != null) {
                if (!isDefined(ctx.CHARS().getText())) {
                    if (isNumeric((ctx.CHARS().getText())))
                        errors.push("The ID of getData must be variable not like this ( " + ctx.CHARS().getText() + " )");
                    else
                        errors.push(ctx.CHARS().getText() + "  Undefined Variable");
                } else if (isNumber(ctx.CHARS().getText()) || getValueSymbolTable(ctx.CHARS().getText()).equals("Number")) {
                    errors.push("The variable " + ctx.CHARS().getText() + " is number must be character");
                } else {
                    getData.setDataValue(ctx.CHARS().getText());
                }

            }

        }
        return getData ;
    }
    /*@Override
    public Print_text visitPrint_text(PARSERCONTROLLER.Print_textContext ctx) {
        Print_text print_text = new Print_text();
        print_text.setContent(ctx.CHARS().getText());
        return  print_text;
    }*/

    @Override
    public Variables visitVariables(PARSERCONTROLLER.VariablesContext ctx) {
        Variables variables = new Variables();
        if(ctx.variable_text()!=null){
            variables.setVariables_text(visitVariable_text(ctx.variable_text()));
        }
        if(ctx.variable_number()!=null){
            variables.setVariable_numbers(visitVariable_number(ctx.variable_number()));
        }
        if(ctx.array()!=null){
            variables.setArray_statement(visitArray(ctx.array()));
        }
        if (ctx.variable_get()!=null)
            variables.setVariableGet(visitVariable_get(ctx.variable_get()));
        return variables;
    }
    String NAMEARRAY = "";
    boolean isArray(String data){
        for(int i = 0 ; i<data.length() ; i++){
            if(data.charAt(i)=='['){
                NAMEARRAY = data.substring(0,i);
                return true;
            }
        }
        return false;
    }
       @Override
    public Variable_Numbers visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx) {
        Variable_Numbers variable_numbers = new Variable_Numbers();
        if (ctx.CHARS(0)!=null)
        {
            boolean number = false;
            boolean STRING = false;
            variable_numbers.setName_variable(ctx.CHARS(0).getText());
            ArrayList<String>values_variables = new ArrayList<>();
            ArrayList<Number_Attribute>number_attributes = new ArrayList<>();
            for(int i = 1 ; i<ctx.CHARS().size();i++){
                values_variables.add(ctx.CHARS(i).getText());
                if(isArray(ctx.CHARS(i).getText())){
                    if(isDefined(NAMEARRAY)){
                        if(!getValueSymbolTable(NAMEARRAY).equals(MY_ARRAYS)) {
                            errors.push("The " + NAMEARRAY + " is not Array assignment!!");
                        }
                    }else{
                    errors.push("The " + NAMEARRAY + " is not defined!!");
                    }
                }
                else if(isDefined(ctx.CHARS(0).getText())) {
                    if(getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_IDS)){
                        errors.push(ctx.CHARS(i).getText() + " aren't initialize with operations!!");
                    }
                    else if(getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_NUMBERS)){
                        if(!isNumber(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())){
                            errors.push(ctx.CHARS(i).getText() +" Undefined Variable");
                        }
                        else if (number&&(!isNumber(ctx.CHARS(i).getText())&&getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_STRINGS))){
                            STRING = true;
                            errors.push( ctx.CHARS(0).getText() + " is variable number");
                        }
                    }else if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS)){
                        if(!isNumber(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())){
                            errors.push(ctx.CHARS(i).getText() +" Undefined Variable");
                        }
                        else if(STRING&&(isNumber(ctx.CHARS(i).getText())||getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_NUMBERS))){
                            number = true;
                            errors.push(ctx.CHARS(0).getText() + " is variable string");
                        }
                        }else if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_IDS)){
                        if(!isNumber(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())){
                            errors.push(ctx.CHARS(i).getText() +" Undefined Variable");
                        }
                        else if (number&&(!isNumber(ctx.CHARS(i).getText())&&getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_STRINGS))){
                            STRING = true;
                            errors.push( ctx.CHARS(0).getText() + " is variable ID");
                        }
                        else if(STRING&&(isNumber(ctx.CHARS(i).getText())||getValueSymbolTable(ctx.CHARS(i).getText()).equals("Number"))){
                            number = true;
                            errors.push(ctx.CHARS(0).getText() + " is variable ID");
                        }
                    }
                }
                else{
                    if(!isNumber(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())){
                        errors.push(ctx.CHARS(i).getText() +" Undefined Variable");
                    }
                    else if(!STRING&&(isNumber(ctx.CHARS(i).getText())||getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_NUMBERS))){
                        number = true;
                        symbolTable.put(ctx.CHARS(0).getText(),MY_NUMBERS);
                    }
                    else if (!number&&(!isNumber(ctx.CHARS(i).getText())&&getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_STRINGS))){
                        STRING = true;
                        symbolTable.put(ctx.CHARS(0).getText(),MY_STRINGS);
                    }
                    else if (STRING&&(isNumber(ctx.CHARS(i).getText())||getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_NUMBERS))){
                        errors.push(ctx.CHARS(i).getText()+" is not a String Variable!!");
                    }
                    else if (number&&!isNumber(ctx.CHARS(i).getText())&&getValueSymbolTable(ctx.CHARS(i).getText()).equals(MY_STRINGS)){
                        errors.push(ctx.CHARS(i).getText()+" is not a number Variable!!");
                    }
                }
              }
            for(int i = 0 ;i<ctx.number_attribute().size();i++){
                number_attributes.add(visitNumber_attribute(ctx.number_attribute(i)));

                if (STRING && ( number_attributes.get(i).getOperator().equals("*") || number_attributes.get(i).getOperator().equals("/") || number_attributes.get(i).getOperator().equals("-") ) )
                {
                    errors.push( " Can't do a " + number_attributes.get(i).getOperator() + " on String ");
                }
            }


            variable_numbers.setValues_variables(values_variables);
            variable_numbers.setName_attributes(number_attributes);
           }


           if (ctx.adding_one()!=null)
               variable_numbers.setOneOperation(visitAdding_one(ctx.adding_one()));

           if (ctx.minus_one()!=null)
               variable_numbers.setOneOperation(visitMinus_one(ctx.minus_one()));

           if (ctx.fast_math()!=null)
               variable_numbers.setFast_math(visitFast_math(ctx.fast_math()));

           return variable_numbers;

        }


    private String getValueSymbolTable(String text) {
    return symbolTable.get(text);
    }


    private boolean isDefined(String text) {//هاد التابع بيفحص إذا السترينغ موجود من قبل ولا لاء
     if(symbolTable.containsKey(text)){ // إذا كان موجود يعني متعرّف عليه
         return true;
     }
     return false;
    }

    @Override
    public Fast_math visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx) {
        Fast_math fast_math = new Fast_math();

        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS(0).getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
                    fast_math.setName(ctx.CHARS(0).getText());
                else
                    errors.push("The Variable " + ctx.CHARS(0).getText() + " is String one");

            }
            /*else if(!isNumeric(ctx.CHARS(0).getText())) {
                fast_math.setName(ctx.CHARS(0).getText());
                symbolTable.put(ctx.CHARS(0).getText() , MY_NUMBERS);
            }*/

            else
                errors.push(ctx.CHARS(0).getText() + " undefined variables");


            if (isDefined(ctx.CHARS(1).getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS(1).getText()).equals(MY_STRINGS))
                    fast_math.setNumber(ctx.CHARS(1).getText()) ;

                else
                    errors.push("The Variable " + ctx.CHARS(1).getText() + " is String one") ;

            }else if (isNumeric(ctx.CHARS(1).getText()))
                fast_math.setNumber(ctx.CHARS(1).getText()) ;

            else
                errors.push( ctx.CHARS(1).getText() + " Undefined Variable") ;

        }

        if (ctx.SUM_EQUAL()!=null)
            fast_math.setOperation(ctx.SUM_EQUAL().getText());

        else if (ctx.MINUS_EQUAL()!=null)
            fast_math.setOperation(ctx.MINUS_EQUAL().getText());

        else if(ctx.DIVID_EQUAL()!=null)
            fast_math.setOperation(ctx.DIVID_EQUAL().getText());

        else if (ctx.MULTIPLY_EQUAL()!=null)
            fast_math.setOperation(ctx.MULTIPLY_EQUAL().getText());

        return fast_math;

    }

    @Override
    public OneOperation visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();

        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS().getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS().getText()).equals(MY_STRINGS))
                    oneOperation.setNameOneOperation(ctx.CHARS().getText());

                else
                    errors.push("The Variable " + ctx.CHARS().getText() + " is String one ,, must be number");

            }
            else if(isNumeric(ctx.CHARS().getText()))
                errors.push(ctx.CHARS().getText()+" must be a variable number not just a direct number") ;

            else
                errors.push(ctx.CHARS().getText() + " Undefined Variable");

        }
        if(ctx.SUMS()!=null)
            oneOperation.setOneOperation(ctx.SUMS().getText());


        return oneOperation;
    }

    @Override
    public OneOperation visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();

        if (ctx.CHARS()!=null)
        {
            if (isDefined(ctx.CHARS().getText()))
            {

                if (!getValueSymbolTable(ctx.CHARS().getText()).equals(MY_STRINGS))
                    oneOperation.setNameOneOperation(ctx.CHARS().getText());

                else
                    errors.push("The Variable " + ctx.CHARS().getText() + " is String one ,, must be number");

            }
            else if(isNumeric(ctx.CHARS().getText()))
                errors.push(ctx.CHARS().getText()+" must be a variable number not just a direct number") ;

            else
                errors.push(ctx.CHARS().getText() + " Undefined Variable");
        }

        if (ctx.MINUSS()!=null)
            oneOperation.setOneOperation(ctx.MINUSS().getText());

        return oneOperation;
    }

    @Override
    public Number_Attribute visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx) {
       Number_Attribute number_attribute = new Number_Attribute();
        if (ctx.SUM()!=null)
        number_attribute.setOperator(ctx.SUM().getText());
        if (ctx.DIVID()!=null)
            number_attribute.setOperator(ctx.DIVID().getText());
        if (ctx.MULTIPLY()!=null)
            number_attribute.setOperator(ctx.MULTIPLY().getText());
        if (ctx.MINUS()!=null)
            number_attribute.setOperator(ctx.MINUS().getText());
        return number_attribute;
    }

    @Override
    public Variables_Text visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx) {
        Variables_Text variables_text = new Variables_Text();
        if (isDefined(ctx.CHARS(0).getText()))
        {
            if (getValueSymbolTable(ctx.CHARS(0).getText()).equals(MY_STRINGS))
            variables_text.setName_variable(ctx.CHARS(0).getText());

            else
                errors.push(ctx.CHARS(0).getText() + " is not a String variable");

        }else
        {
            variables_text.setName_variable(ctx.CHARS(0).getText());
            symbolTable.put(ctx.CHARS(0).getText(),MY_STRINGS);
        }

        ArrayList<String>values_variables = new ArrayList<>();
        ArrayList<String>operators = new ArrayList<>();
        for(int i = 1;i<ctx.CHARS().size();i++){
            values_variables.add(ctx.CHARS(i).getText());

        }
        for(int i = 0 ;i < ctx.SUM().size();i++){
            operators.add(ctx.SUM(i).getText());
        }
        variables_text.setValues_variables(values_variables);
        variables_text.setOperator(operators);
        return variables_text;
    }


    @Override
    public VariableGet visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx) {

        VariableGet variableGet =new VariableGet();

        if (ctx.CHARS()!=null)
            if (isDefined(ctx.CHARS().getText()))
            {
                if (getValueSymbolTable(ctx.CHARS().getText()).equals(MY_IDS))
                {
                    variableGet.setGetName(ctx.CHARS().getText());
                }else
                    errors.push("The variable " + ctx.CHARS().getText() + " must be ID variable ");
            }else
            {
                variableGet.setGetName(ctx.CHARS().getText());
                symbolTable.put(ctx.CHARS().getText() , MY_IDS);
            }


        if (ctx.getdata()!=null)
            variableGet.setGetData(visitGetdata(ctx.getdata()));

        return variableGet ;
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
