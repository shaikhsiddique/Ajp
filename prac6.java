/*Write a program which creates Menu of different colors and disable menu item for 
Black color.                                                                                                                                         (15)

 */
import javax.swing.*;
import java.awt.*;

public class prac6 extends JApplet {
    public void init() {
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        String[] languages = {"English", "Marathi", "Hindi", "Sanskrit"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        panel.add(scrollPane);
        panel.add(comboBox);
        add(panel);
    }
}
/*
 <applet code="prac6.class" width="400" height="300">
    </applet>
 */