// Write a program to change the background color of Applet when user performs events using Mouse.                                                                               
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac11b extends Applet implements MouseListener {
    Color currentColor = Color.WHITE;  // Default background color

    @Override
    public void init() {
        addMouseListener(this);  // Register mouse listener
        setBackground(currentColor);  // Set the initial background color
    }

    @Override
    public void paint(Graphics g) {
        // Display the current background color message
        g.setColor(Color.BLACK);
        g.drawString("Background Color: " + getColorName(currentColor), 50, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Change the background color when the mouse is clicked
        if (currentColor.equals(Color.WHITE)) {
            currentColor = Color.GREEN;  // Change to green on click
        } else if (currentColor.equals(Color.GREEN)) {
            currentColor = Color.YELLOW;  // Change to yellow on click
        } else {
            currentColor = Color.WHITE;  // Reset to white on click
        }
        setBackground(currentColor);  // Update the background color
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    // Helper method to get color name
    private String getColorName(Color color) {
        if (color.equals(Color.WHITE)) {
            return "White";
        } else if (color.equals(Color.GREEN)) {
            return "Green";
        } else if (color.equals(Color.YELLOW)) {
            return "Yellow";
        } else {
            return "Unknown";
        }
    }

   
}
 /*<applet code="prac11b.class" width="400" height="300">
    </applet>*/