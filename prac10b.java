/*
 Develop a program to accept two numbers and display product of two numbers when user pressed “Multiply” button
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prac10b extends JApplet {
    JTextField num1Field, num2Field, resultField;
    JButton multiplyButton;

    @Override
    public void init() {
        setLayout(new FlowLayout());

        // Creating text fields for input and output
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);  // Make result field non-editable

        // Create Multiply button
        multiplyButton = new JButton("Multiply");

        // Add ActionListener for the Multiply button
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from text fields
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    // Calculate the product
                    double product = num1 * num2;

                    // Display result in result field
                    resultField.setText(String.valueOf(product));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        // Add components to the applet
        add(new JLabel("Enter Number 1:"));
        add(num1Field);
        add(new JLabel("Enter Number 2:"));
        add(num2Field);
        add(multiplyButton);
        add(new JLabel("Product:"));
        add(resultField);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiply Two Numbers");
        prac10b applet = new prac10b();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
<applet code="prac10b.class" width="300" height="200">
</applet>
*/
