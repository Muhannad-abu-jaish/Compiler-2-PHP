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
HashMap<String,String> SymbolTable = new HashMap<>();
    @Override
    public ForStatement visitFor_statement(PARSERCONTROLLER.For_statementContext ctx) {
        ForStatement forStatement =new ForStatement();


        if (ctx.CHARS(0)!=null)
            forStatement.setForID(ctx.CHARS(0).getText());

        if (ctx.CHARS(1)!=null)
            forStatement.setIdValue(ctx.CHARS(1).getText());

        if (ctx.CHARS(2)!=null)
            forStatement.setSecondID(ctx.CHARS(2).getText());

        if (ctx.operation_if()!=null)
            forStatement.setOperationIF(visitOperation_if(ctx.operation_if()));

        if (ctx.CHARS(3)!=null)
            forStatement.setCompareValue(ctx.CHARS(3).getText());

        if (ctx.for_statement_variable_number()!=null)
        {
            forStatement.setForStatementVariableNumber(visitFor_statement_variable_number(ctx.for_statement_variable_number()));
        }

        ArrayList<Code_attribuite> codeAttribuites = new ArrayList<>();
        for (int i = 0 ; i<ctx.code_attribute().size() ; i++)
        {
            codeAttribuites.add(visitCode_attribute(ctx.code_attribute(i)));
        }

        forStatement.setCode_attributes(codeAttribuites);
        return forStatement;
    }
    static  HashMap<String,String> symbolTable = new HashMap<>();//لتخزين اي شي بدي علمو واحفظو
    static  Stack<String> errors = new Stack<>(); // ستاك لتخزين الاخطاء يلي لح تظهر
    public static HashMap<String, String> getSymbolTable() { // منروح عالسطر 306 لنشوف المثال
        return symbolTable;
    }


    public static Stack<String> getErrors() {
        return errors;
    }
    private boolean isNumber(String data){ // تابع ليتحقق من انو السترينغ هو عبارة عن رقم
        try {
            double d = Double.parseDouble(data);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public ForStatementVariableNumber visitFor_statement_variable_number(PARSERCONTROLLER.For_statement_variable_numberContext ctx) {

        ForStatementVariableNumber forStatementVariableNumber = new ForStatementVariableNumber() ;

        if (ctx.CHARS(0)!=null && ctx.CHARS(1)!=null)
        {
            forStatementVariableNumber.setThirdID(ctx.CHARS(0).getText());
            forStatementVariableNumber.setCountValue(ctx.CHARS(1).getText());
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
            oneOperation.setNameOneOperation(ctx.CHARS().getText());

        if(ctx.SUMS()!=null)
            oneOperation.setOneOperation(ctx.SUMS().getText());


        return oneOperation;
    }

    @Override
    public OneOperation visitFor_statement_minuss_one(PARSERCONTROLLER.For_statement_minuss_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();


        if (ctx.CHARS()!=null)
            oneOperation.setNameOneOperation(ctx.CHARS().getText());

        if(ctx.MINUSS()!=null)
            oneOperation.setOneOperation(ctx.MINUSS().getText());


        return oneOperation;
    }

    @Override
    public Fast_math visitFor_statement_fast_math(PARSERCONTROLLER.For_statement_fast_mathContext ctx) {
        Fast_math fast_math = new Fast_math();

        if (ctx.CHARS()!=null)
        {
            fast_math.setName(ctx.CHARS(0).getText());
            fast_math.setNumber(ctx.CHARS(1).getText());
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
        }
        if_statement.setCode_attributes(code_attributes);
        if(ctx.ELSE()!=null){
            if_statement.setName_statement(ctx.ELSE().getText()+" "+ctx.IF().getText());
        }
        else if(ctx.IF()!=null) {
            if_statement.setName_statement(ctx.IF().getText());
        }
            if (ctx.CHARS(0) != null)
                if_statement.setVariable_one(ctx.CHARS(0).getText());
            if (ctx.CHARS(1) != null)
                if_statement.setVariable_two(ctx.CHARS(1).getText());
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
        }
        program.setCode_attribuites(code_attribuites);
        return program;
    }

    @Override
    public Code_attribuite visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx) {
        Code_attribuite code_attribuite=new Code_attribuite();
        if(ctx.variables()!=null)
        {
            code_attribuite.setVariables(visitVariables(ctx.variables()));
        }
         if(ctx.on_click()!=null)
        {
            code_attribuite.setClicking(visitOn_click(ctx.on_click()));
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
        return code_attribuite;
    }

    @Override
    public Object visitComment(PARSERCONTROLLER.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public Clicking visitOn_click(PARSERCONTROLLER.On_clickContext ctx) {
        Clicking clicking = new Clicking();
        clicking.setClick(ctx.CHARS().getText());
        ArrayList<Attribute_click> attribute_clicks = new ArrayList<>();
        for(int i =0 ;i<ctx.click_attribute().size();i++){
              attribute_clicks.add(visitClick_attribute(ctx.click_attribute(i)));
        }
        clicking.setAttribute_clickList(attribute_clicks);
        return clicking;
    }

    @Override
    public Attribute_click visitClick_attribute(PARSERCONTROLLER.Click_attributeContext ctx) {
        Attribute_click attribute_click = new Attribute_click();
        if(ctx.text()!=null)
        {
            attribute_click.setText(visitText(ctx.text()));
            attribute_click.setName_attribute(ctx.text().CHARS().getText());
        }
       if(ctx.button()!=null)
       {
           attribute_click.setName_attribute(ctx.button().CHARS().getText());
           attribute_click.setButton(visitButton(ctx.button()));
       }
       return attribute_click;
    }

    @Override
    public Text visitText(PARSERCONTROLLER.TextContext ctx) {
        Text text = new Text();
        text.setName_text(ctx.CHARS().getText());
        text.setText_attribute(visitText_attribute(ctx.text_attribute()));
        return  text;
    }

    @Override
    public Text_Attribute visitText_attribute(PARSERCONTROLLER.Text_attributeContext ctx) {
      Text_Attribute text_attribute = new Text_Attribute();
     if(ctx.color()!=null)
      text_attribute.setColor(visitColor(ctx.color()));
     if(ctx.content()!=null)
      text_attribute.setContent(visitContent(ctx.content()));
      return text_attribute;
    }

    @Override
    public String visitContent(PARSERCONTROLLER.ContentContext ctx) {
            return ctx.CHARS().getText();
    }

    @Override
    public String visitColor(PARSERCONTROLLER.ColorContext ctx) {
          return ctx.COLORS().getText();
    }

    @Override
    public Button visitButton(PARSERCONTROLLER.ButtonContext ctx) {
        Button button = new Button();
        button.setName_button(ctx.CHARS().getText());
        button.setButton_attribute(visitButton_attribute(ctx.button_attribute()));
        return button;
    }

    @Override
    public Button_Attribute visitButton_attribute(PARSERCONTROLLER.Button_attributeContext ctx) {
        Button_Attribute button_attribute = new Button_Attribute();
        if(ctx.width()!=null)
        button_attribute.setWidth(visitWidth(ctx.width()));
        if(ctx.background()!=null)
        button_attribute.setBackground(visitBackground(ctx.background()));
        return button_attribute;
    }

    @Override
    public String visitWidth(PARSERCONTROLLER.WidthContext ctx) {

        return ctx.SIZES().getText();
    }

    @Override
    public String visitBackground(PARSERCONTROLLER.BackgroundContext ctx) {

        return ctx.COLORS().getText();
    }

    @Override
    public Print visitPrint(PARSERCONTROLLER.PrintContext ctx) {
        Print print = new Print();
        print.setName_print(ctx.PRINT().getText());
        if(ctx.printattribute()!=null){
            print.setAttribute_print(visitPrintattribute(ctx.printattribute()));
        }
        return print;
    }

    @Override
    public Attribute_print visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx) {
        Attribute_print attribute_print = new Attribute_print();
        if (ctx.CHARS()!=null){
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

        if (ctx.CHARS()!=null)
            getData.setDataValue(ctx.CHARS().getText());

        return getData ;
    }
    @Override
    public Print_text visitPrint_text(PARSERCONTROLLER.Print_textContext ctx) {
        Print_text print_text = new Print_text();
        print_text.setContent(ctx.CHARS().getText());
        return  print_text;
    }

    @Override
    public Variables visitVariables(PARSERCONTROLLER.VariablesContext ctx) {
        Variables variables = new Variables();
        if(ctx.variable_text()!=null){
            variables.setVariables_text(visitVariable_text(ctx.variable_text()));
        }
        if(ctx.variable_number()!=null){
            variables.setVariable_numbers(visitVariable_number(ctx.variable_number()));
        }
        if(ctx.textinput()!=null){
            variables.setTextInput(visitTextinput(ctx.textinput()));
        }

        if (ctx.variable_get()!=null)
            variables.setVariableGet(visitVariable_get(ctx.variable_get()));
        return variables;
    }
       @Override
    public Variable_Numbers visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx) {
        Variable_Numbers variable_numbers = new Variable_Numbers();
        if (ctx.CHARS(0)!=null)
        {
            boolean number = false;
            variable_numbers.setName_variable(ctx.CHARS(0).getText());
            ArrayList<String>values_variables = new ArrayList<>();
            ArrayList<Number_Attribute>number_attributes = new ArrayList<>();
            for(int i = 1 ; i<ctx.CHARS().size();i++){
                values_variables.add(ctx.CHARS(i).getText());
                if(!isNumber(ctx.CHARS(i).getText())&&!isDefined(ctx.CHARS(i).getText())){
                    errors.push(ctx.CHARS(i).getText() +" Undefined Variable");
                }
                else if(isNumber(ctx.CHARS(i).getText())||getValueSymbolTable(ctx.CHARS(i).getText()).equals("Number")){
                    number = true;
                    symbolTable.put(ctx.CHARS(0).getText(),"Number");
                }
                else if (number&&!isNumber(ctx.CHARS(i).getText())&&getValueSymbolTable(ctx.CHARS(i).getText()).equals("String")){
                    errors.push(ctx.CHARS(i).getText()+" is not a number Variable!!");
                }
                //هلئ هون انا بشيك بركي كنت عبأسند لمتحول مو معروف متل x=y فال y مالي مأسندها لحدا من قبل
            //فلازم هون يعطيني ايرور انو ال y غير معرّفة فالشرط انا عبستعمل تابعين ال isNumber لأتحقق انو حرف ومو رقم
            // و إذا كان مو موجود بالsymbolTable فهون معناتا مو معرّف فهون بفوت عالشرط وبعبي الستاك وبحط نص الايرور
            }

            for(int i = 0 ;i<ctx.number_attribute().size();i++){
                number_attributes.add(visitNumber_attribute(ctx.number_attribute(i)));
            }

            variable_numbers.setValues_variables(values_variables);
            variable_numbers.setName_attributes(number_attributes);
            //String value = Result_Variable(values_variables,number_attributes);
            //System.out.println("Value = " + value);
            //منخزن المتغير يلي لح نأسندلو مثلا x=5 منخزن ال x والفاليو حطيتا True مؤقتا
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

    private String Result_Variable(ArrayList<String> values_variables, ArrayList<Number_Attribute> number_attributes) {
    String statement = "";
    int numOperation = 0;
        int Total = 0;
        ArrayList<Character> listOfOpertionsCharFORM = new ArrayList<>();
        ArrayList<Character> listOfNumbersCharFORM = new ArrayList<>();
        ArrayList<Integer> listOfNumbersINTEGERFORM = new ArrayList<>();

        for(int i = 0; i<values_variables.size();i++){

        statement+=values_variables.get(i);
        if(number_attributes.size()>0&&numOperation<number_attributes.size()){
            statement+=number_attributes.get(numOperation).getOperator();
            numOperation++;
        }
    }
        /*String operators[]=statement.split("[0-9]+");
        String operands[]=statement.split("[/*+-]");
        int agregate = Integer.parseInt(operands[0]);
        for(int i=1;i<operands.length;i++){
            if(operators[i].equals("+"))
                agregate += Integer.parseInt(operands[i]);
            else if(operators[i].equals("-"))
                agregate -= Integer.parseInt(operands[i]);
            else if (operators[i].equals("*"))
                agregate*=Integer.parseInt(operands[i]);
            else
                agregate/=Integer.parseInt(operands[i]);
        }
        statement = String.valueOf(agregate);*/
        String input = statement;
        System.out.println("string is : " + input);


        char[] convertAllToChar = input.toCharArray();

        for (char inputToChar : convertAllToChar) {
            System.out.println("convertAllToChar     " + inputToChar);
        }
        for (int i = 0; i < input.length(); i++) {

            if (convertAllToChar[i] == '+') {
                listOfOpertionsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '-') {
                listOfOpertionsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '*') {
                listOfOpertionsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '/') {
                listOfOpertionsCharFORM.add(convertAllToChar[i]);
            }
            if (Character.isDigit(convertAllToChar[i])) {
                listOfNumbersCharFORM.add(convertAllToChar[i]);
            }


        }
        for (Character aa : listOfOpertionsCharFORM) {
            System.out.println("list Of Operations Char FORM     " + aa);
        }
        for (Character aa : listOfNumbersCharFORM) {
            System.out.println("list Of Numbers Char FORM       " + aa);

        }

        for (Character aa : listOfNumbersCharFORM) {
            if (aa == '0') listOfNumbersINTEGERFORM.add(0);
            if (aa == '1') listOfNumbersINTEGERFORM.add(1);
            if (aa == '2') listOfNumbersINTEGERFORM.add(2);
            if (aa == '3') listOfNumbersINTEGERFORM.add(3);
            if (aa == '4') listOfNumbersINTEGERFORM.add(4);
            if (aa == '5') listOfNumbersINTEGERFORM.add(5);
            if (aa == '6') listOfNumbersINTEGERFORM.add(6);
            if (aa == '7') listOfNumbersINTEGERFORM.add(7);
            if (aa == '8') listOfNumbersINTEGERFORM.add(8);
            if (aa == '9') listOfNumbersINTEGERFORM.add(9);

        }

        for (Integer aaa : listOfNumbersINTEGERFORM) {
            System.out.println("list Of Numbers INTEGER FORM       " + aaa);
        }




        System.out.print(listOfNumbersINTEGERFORM);

        System.out.print(listOfOpertionsCharFORM);

        System.out.println();
        System.out.println();


        if (listOfNumbersINTEGERFORM.size() == (listOfOpertionsCharFORM.size() + 1)) {

            for (int i = 0; i < listOfOpertionsCharFORM.size(); i++) {
                System.out.println("i   :" + i);
                if (listOfOpertionsCharFORM.get(i) == '+') if (i == 0) {
                    Total = Total + listOfNumbersINTEGERFORM.get(i) + listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                } else {
                    Total = Total + listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                }
                if (listOfOpertionsCharFORM.get(i) == '-') if (i == 0) {
                    Total = Total + listOfNumbersINTEGERFORM.get(i) - listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                } else {
                    Total = Total - listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                }
                if (listOfOpertionsCharFORM.get(i) == '*') if (i == 0) {
                    Total = Total + listOfNumbersINTEGERFORM.get(i) * listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                } else {
                    Total = Total * listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                }
                if (listOfOpertionsCharFORM.get(i) == '/') if (i == 0) {
                    Total = Total + listOfNumbersINTEGERFORM.get(i) / listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                } else {
                    Total = Total / listOfNumbersINTEGERFORM.get(i + 1);
                    System.out.println("total   : " + Total);
                }

            }

        } else {
            System.out.println("*********###############**********");
            System.out.println("** your input not correct input **");
            System.out.println("*********###############**********");

        }

        System.out.println("*** Final Answer *** :  " + Total);

        return statement;
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
            fast_math.setName(ctx.CHARS(0).getText());
            fast_math.setNumber(ctx.CHARS(1).getText());
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
            oneOperation.setNameOneOperation(ctx.CHARS().getText());

        if(ctx.SUMS()!=null)
            oneOperation.setOneOperation(ctx.SUMS().getText());


        return oneOperation;
    }

    @Override
    public OneOperation visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx) {
        OneOperation oneOperation = new OneOperation();

        if (ctx.CHARS()!=null)
            oneOperation.setNameOneOperation(ctx.CHARS().getText());

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
        variables_text.setName_variable(ctx.CHARS(0).getText());
        symbolTable.put(ctx.CHARS(0).getText(),"String");
        ArrayList<String>values_variables = new ArrayList<>();
        ArrayList<String>operators = new ArrayList<>();
        for(int i = 1;i<ctx.CHARS().size();i++){
            values_variables.add(ctx.CHARS(i).getText());

        }
        for(int i = 0 ;i < ctx.SUM().size();i++){
            operators.add(ctx.SUM(i).getText());
        }
        symbolTable.put(ctx.CHARS(0).getText(),"String");
        variables_text.setValues_variables(values_variables);
        variables_text.setOperator(operators);
        return variables_text;
    }


    @Override
    public VariableGet visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx) {

        VariableGet variableGet =new VariableGet();

        if (ctx.CHARS()!=null)
            variableGet.setGetName(ctx.CHARS().getText());

        if (ctx.getdata()!=null)
            variableGet.setGetData(visitGetdata(ctx.getdata()));

        return variableGet ;
    }

    @Override
    public TextInput visitTextinput(PARSERCONTROLLER.TextinputContext ctx) {
        TextInput textInput = new TextInput();
        textInput.setKey(ctx.CHARS(0).getText());
        textInput.setValue(ctx.CHARS(1).getText());
        if(ctx.textinput_attribute()!=null) {
            textInput.setAttribute_textInput(visitTextinput_attribute(ctx.textinput_attribute()));
        }
        return textInput;
    }

    @Override
    public Attribute_TextInput visitTextinput_attribute(PARSERCONTROLLER.Textinput_attributeContext ctx) {
       Attribute_TextInput attribute_textInput = new Attribute_TextInput();
       if(ctx.COLOR()!=null)
           attribute_textInput.setName_attribute_TextInput(ctx.COLOR().getText());
       else if (ctx.CONTENT()!=null)
           attribute_textInput.setName_attribute_TextInput(ctx.CONTENT().getText());
        return attribute_textInput;
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
