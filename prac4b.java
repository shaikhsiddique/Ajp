import javax.swing.*;
import java.awt.*;

public class prac4b extends JApplet {
    @Override
    public void init() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1
        gbc.gridx = 0; gbc.gridy = 0; 
        add(new JButton("Button One"), gbc);

        // Button 2
        gbc.gridx = 1; gbc.gridy = 0; 
        add(new JButton("Button Two"), gbc);

        // Button 3
        gbc.gridx = 0; gbc.gridy = 1; 
        add(new JButton("Button Three"), gbc);

        // Button 4
        gbc.gridx = 1; gbc.gridy = 1; 
        add(new JButton("Button Four"), gbc);

        // Button 5
        gbc.gridx = 0; gbc.gridy = 2; 
        gbc.gridwidth = 2; 
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        add(new JButton("Button Five"), gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Layout Example");
        prac4b applet = new prac4b();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
<applet code="prac4b.class" width="400" height="300">
</applet>
*/
