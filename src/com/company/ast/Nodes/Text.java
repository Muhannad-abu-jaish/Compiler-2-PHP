package com.company.ast.Nodes;
import java.util.ArrayList;
public class Text {
    String name_text;
    Text_Attribute text_attribute = new Text_Attribute();

    public String getName_text() {
        return name_text;
    }

    public void setName_text(String name_text) {
        this.name_text = name_text;
    }

    public Text_Attribute getText_attribute() {
        return text_attribute;
    }

    public void setText_attribute(Text_Attribute text_attribute) {
        this.text_attribute = text_attribute;
    }
}
