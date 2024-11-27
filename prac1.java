// Write a program to demonstrate the use of AWT components like Label, Textfield, TextArea, Button, Checkbox, RadioButton etc

import java.applet.Applet;
import java.awt.*;

public class prac1 extends Applet {
    public void init() {
        // Set layout for the applet
        setLayout(new FlowLayout());

        // Label
        add(new Label("Name:"));
        
        // TextField
        add(new TextField(20));
        
        // TextArea
        add(new TextArea("Enter your address here", 5, 30));
        
        // Button
        add(new Button("Submit"));
        
        // Checkbox
        add(new Checkbox("Subscribe to Newsletter"));
        
        // RadioButton using CheckboxGroup
        CheckboxGroup genderGroup = new CheckboxGroup();
        add(new Label("Select Gender:"));
        add(new Checkbox("Male", genderGroup, false));
        add(new Checkbox("Female", genderGroup, false));
    }
}

/*<applet code="prac1.class" width="400" height="300">
    </applet> */ 