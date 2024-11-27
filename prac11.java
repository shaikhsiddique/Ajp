// Write a program to demonstrate various mouse events using MouseListener and MouseMotion listener interface.    
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac11 extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";

    @Override
    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        msg = "Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        msg = "Mouse Moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    /*<applet code="prac11.class" width="400" height="400">
    </applet>*/
}
