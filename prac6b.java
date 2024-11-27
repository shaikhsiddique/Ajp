/*Write a program using swing to display a ScrollPane and JComboBox in an JApplet with  the items – English, Marathi, Hindi, Sanskrit.

 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class prac6b extends JApplet {
    JLabel label;
    JComboBox<String> comboBox;

    @Override
    public void init() {
        setLayout(new FlowLayout());

        String[] cities = {"Mumbai", "Solapur", "Pune", "Bangalore"};
        comboBox = new JComboBox<>(cities);

        label = new JLabel("You are in Mumbai");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity = (String) comboBox.getSelectedItem();
                label.setText("You are in " + selectedCity);
            }
        });

        add(comboBox);
        add(label);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("City Selector Applet");
        prac6b applet = new prac6b();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
/*
 <applet code="prac6b.class" width="400" height="300">
    </applet>
 */