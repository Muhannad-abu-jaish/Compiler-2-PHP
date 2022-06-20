package com.company.ast.Nodes;
import java.util.ArrayList;
public class Variable_Numbers {
    String name_variable;
    ArrayList<String>values_variables;
    ArrayList<Number_Attribute>name_attributes;

    public String getName_variable() {
        return name_variable;
    }

    public void setName_variable(String name_variable) {
        this.name_variable = name_variable;
    }

    public ArrayList<String> getValues_variables() {
        return values_variables;
    }

    public void setValues_variables(ArrayList<String> values_variables) {
        this.values_variables = values_variables;
    }

    public ArrayList<Number_Attribute> getName_attributes() {
        return name_attributes;
    }

    public void setName_attributes(ArrayList<Number_Attribute> name_attributes) {
        this.name_attributes = name_attributes;
    }
}
