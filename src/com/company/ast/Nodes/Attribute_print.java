package com.company.ast.Nodes;

import java.util.ArrayList;

public class Attribute_print {
    Print_text print_text;
    GetData getData;
    ArrayList<String> value;
    ArrayList<String> operation ;

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }

    public ArrayList<String> getOperation() {
        return operation;
    }

    public void setOperation(ArrayList<String> operation) {
        this.operation = operation;
    }

    public Print_text getPrint_text() {
        return print_text;
    }

    public void setPrint_text(Print_text print_text) {
        this.print_text = print_text;
    }

    public GetData getPrint_function() {
        return getData;
    }

    public void setPrint_function(GetData getData) {
        this.getData = getData;
    }


}
