package com.company.ast.Nodes;
import java.util.*;

public class Array_statement {
    ArrayList<String> elements = new ArrayList<>();
    String name_Array ;

    public String getName_Array() {
        return name_Array;
    }

    public void setName_Array(String name_Array) {
        this.name_Array = name_Array;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }
}
