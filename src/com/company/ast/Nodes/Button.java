package com.company.ast.Nodes;

public class Button {
    String name_button;
    Button_Attribute button_attribute = new Button_Attribute();

    public String getName_button() {
        return name_button;
    }

    public void setName_button(String name_button) {
        this.name_button = name_button;
    }

    public Button_Attribute getButton_attribute() {
        return button_attribute;
    }

    public void setButton_attribute(Button_Attribute button_attribute) {
        this.button_attribute = button_attribute;
    }
}
