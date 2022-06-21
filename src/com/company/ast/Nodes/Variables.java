package com.company.ast.Nodes;

import java.util.ArrayList;

public class Variables {

    Variables_Text variables_text;
    Variable_Numbers variable_numbers;
    TextInput textInput ;
    VariableGet variableGet;

    public VariableGet getVariableGet() {
        return variableGet;
    }

    public void setVariableGet(VariableGet variableGet) {
        this.variableGet = variableGet;
    }

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






}
