package com.company.ast.Nodes;
import java.util.ArrayList;
public class Variable_Numbers {
    String name_variable;
    ArrayList<String>values_variables;
    ArrayList<Number_Attribute>name_attributes;
    OneOperation oneOperation ;
    Fast_math fast_math ;

    public Fast_math getFast_math() {
        return fast_math;
    }

    public void setFast_math(Fast_math fast_math) {
        this.fast_math = fast_math;
    }

    public OneOperation getOneOperation() {
        return oneOperation;
    }

    public void setOneOperation(OneOperation oneOperation) {
        this.oneOperation = oneOperation;
    }

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
