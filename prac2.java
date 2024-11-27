// Write a program to design a form using the components List and Choice
import java.applet.Applet;
import java.awt.*;

public class prac2 extends Applet {
    public void init() {
       
        setLayout(new FlowLayout());

        
        add(new Label("Name:"));
        
   
        add(new TextField(20));
        
       
        add(new TextArea("Enter your address here", 5, 30));
        
     
        add(new Button("Submit"));
     
        add(new Checkbox("Subscribe to Newsletter"));
        
        
        CheckboxGroup genderGroup = new CheckboxGroup();
        add(new Label("Select Gender:"));
        add(new Checkbox("Male", genderGroup, false));
        add(new Checkbox("Female", genderGroup, false));
    }
}
/*<applet code="prac2.class" width="400" height="300">
    </applet> */ 