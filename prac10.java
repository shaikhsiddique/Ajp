/*Write a program to demonstrate status of key on Applet window such as KeyPressed, KeyReleased, KeyUp, KeyDown.                                                                                                                              */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class prac10 extends Applet implements KeyListener {
    String keyStatus = "Press any key";

    @Override
    public void init() {
        addKeyListener(this);
        setFocusable(true);  // This is necessary for the applet to receive key events
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawString(keyStatus, 50, 50);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyStatus = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyStatus = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed in this case, but must be implemented as part of the KeyListener interface
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Key Status Applet");
        prac10 applet = new prac10();
        applet.init();
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

/*
<applet code="prac10.class" width="400" height="300">
</applet>
*/
