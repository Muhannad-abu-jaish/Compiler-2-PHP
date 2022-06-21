package com.company.ast.Nodes;

public class Attribute_print {
    Print_text print_text;
    GetData getData;
    String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
