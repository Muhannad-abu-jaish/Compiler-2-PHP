package com.company.ast.Nodes;
import java.util.ArrayList;
public class Attribute_click {
    String name_attribute;
    Text text;
    Button button;

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public String getName_attribute() {
        return name_attribute;
    }

    public void setName_attribute(String name_attribute) {
        this.name_attribute = name_attribute;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
