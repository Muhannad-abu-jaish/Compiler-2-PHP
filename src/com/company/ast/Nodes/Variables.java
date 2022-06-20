package com.company.ast.Nodes;

import java.util.ArrayList;

public class Variables {

    Variables_Text variables_text;
    Variable_Numbers variable_numbers;
    TextInput textInput ;

    public TextInput getTextInput() {
        return textInput;
    }

    public void setTextInput(TextInput textInput) {
        this.textInput = textInput;
    }

    public Variable_Numbers getVariable_numbers() {
        return variable_numbers;
    }

    public void setVariable_numbers(Variable_Numbers variable_numbers) {
        this.variable_numbers = variable_numbers;
    }

    public Variables_Text getVariables_text() {
        return variables_text;
    }

    public void setVariables_text(Variables_Text variables_text) {
        this.variables_text = variables_text;
    }

    String name;
    ArrayList<String> value;
    ArrayList<String> operation;
    String oneValue;
    String oneOperation ;
    Fast_math fast_math ;

    public Fast_math getFast_math() {
        return fast_math;
    }

    public void setFast_math(Fast_math fast_math) {
        this.fast_math = fast_math;
    }

    public String getOneOperation() {
        return oneOperation;
    }

    public void setOneOperation(String oneOperation) {
        this.oneOperation = oneOperation;
    }

    public Variables ()
    {


    }

    public String getOneValue() {
        return oneValue;
    }

    public void setOneValue(String oneValue) {
        this.oneValue = oneValue;
    }

    public String getName() {
        return name;
    }


    public ArrayList<String> getOperation() {
        return operation;
    }

    public void setOperation(ArrayList<String> operation) {
        this.operation = operation;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name=name;

    }
}
