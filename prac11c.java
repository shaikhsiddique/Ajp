/*
 Write a program to count the number of clicks performed by the user in a Frame window                                                                                                                
 */
import java.awt.*;
import java.awt.event.*;

public class prac11c extends java.applet.Applet {
    private int clickCount = 0;  // To store the number of clicks

    public void init() {
        setSize(400, 300);  // Set applet size

        // Add mouse listener to capture mouse clicks
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                clickCount++;  // Increment click count on each mouse click
                repaint();  // Repaint the window to show updated count
            }
        });
    }

    // Override the paint method to display the click count
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Number of clicks: " + clickCount, 50, 50);  // Display the click count
    }

    // Main method for testing the applet in a Frame window
    public static void main(String[] args) {
        Frame f = new Frame("Click Counter");
        prac11c applet = new prac11c();
        applet.init();
        f.add(applet);
        f.setSize(400, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

/*
<applet code="prac11c.class" width="400" height="300">
</applet>
*/
