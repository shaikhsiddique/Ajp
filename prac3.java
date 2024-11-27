// Write a program to design simple calculator with the use of GridLayout
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac3 extends Applet implements ActionListener {
    TextField tf;
    String s1 = "", s2 = "", s3 = "";
    char operator;

    public void init() {
        tf = new TextField();
        add(tf, "North");
        
        setLayout(new GridLayout(4, 4));
        String[] buttons = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "C", "0", "=", "/"};
        
        for (String label : buttons) {
            Button b = new Button(label);
            add(b);
            b.addActionListener(this);
        }
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) == 'C') {
            tf.setText("");
            s1 = s2 = s3 = "";
        } else if (command.charAt(0) == '=') {
            s2 = tf.getText();
            switch (operator) {
                case '+': s3 = String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2)); break;
                case '-': s3 = String.valueOf(Integer.parseInt(s1) - Integer.parseInt(s2)); break;
                case '*': s3 = String.valueOf(Integer.parseInt(s1) * Integer.parseInt(s2)); break;
                case '/': s3 = String.valueOf(Integer.parseInt(s1) / Integer.parseInt(s2)); break;
            }
            tf.setText(s3);
            s1 = s3;
        } else {
            tf.setText(tf.getText() + command);
            if ("+-*/".indexOf(command.charAt(0)) != -1) {
                s1 = tf.getText();
                operator = command.charAt(0);
                tf.setText("");
            }
        }
    }
}

/*
 <applet code="prac3.class" width="400" height="300">
 */