package com.company.ast.Nodes;
import java.util.ArrayList;
public class Clicking {
    String click;
    ArrayList <Attribute_click> attribute_clickList = new ArrayList();

    public ArrayList<Attribute_click> getAttribute_clickList() {
        return attribute_clickList;
    }

    public void setAttribute_clickList(ArrayList<Attribute_click> attribute_clickList) {
        this.attribute_clickList = attribute_clickList;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }
}
