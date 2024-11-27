import javax.swing.*;
import java.awt.*;

public class prac4 extends JApplet {
    @Override
    public void init() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding

        // Add Buttons
        addButton("Button One", 0, 0, 1, 1, gbc);
        addButton("Button Two", 1, 0, 1, 1, gbc);
        addButton("Button Three", 0, 1, 1, 1, gbc);
        addButton("Button Four", 1, 1, 1, 1, gbc);
        addButton("Button Five", 0, 2, 2, 1, gbc);
    }

    private void addButton(String text, int x, int y, int width, int height, GridBagConstraints gbc) {
        gbc.gridx = x; gbc.gridy = y;
        gbc.gridwidth = width; gbc.gridheight = height;
        gbc.fill = (width > 1) ? GridBagConstraints.HORIZONTAL : GridBagConstraints.NONE;
        add(new JButton(text), gbc);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Layout Example");
        prac4 applet = new prac4();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
<applet code="prac4a.class" width="400" height="300">
</applet>
*/
