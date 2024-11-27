/*
 * Write a program to demonstrate the use of mouseDragged and mouseMoved methods
 * of the MouseMotionListener interface.
 */

 import java.awt.*;
 import java.awt.event.*;
 
 public class prac11d extends java.applet.Applet implements MouseMotionListener {
     private String message = "";
     private int mouseX = 0, mouseY = 0; // Coordinates of the mouse pointer
 
     @Override
     public void init() {
         setSize(400, 300); // Set the applet size
         addMouseMotionListener(this); // Add MouseMotionListener to the applet
         setBackground(Color.WHITE); // Set background color
     }
 
     @Override
     public void paint(Graphics g) {
         g.setColor(Color.BLACK);
         g.drawString(message, mouseX, mouseY); // Display the message at the current mouse position
     }
 
     // Called when the mouse is dragged
     @Override
     public void mouseDragged(MouseEvent e) {
         mouseX = e.getX();
         mouseY = e.getY();
         message = "Mouse Dragged: (" + mouseX + ", " + mouseY + ")";
         repaint(); // Repaint to show the updated position
     }
 
     // Called when the mouse is moved
     @Override
     public void mouseMoved(MouseEvent e) {
         mouseX = e.getX();
         mouseY = e.getY();
         message = "Mouse Moved: (" + mouseX + ", " + mouseY + ")";
         repaint(); // Repaint to show the updated position
     }
 
     // Main method for testing in a Frame
     public static void main(String[] args) {
         Frame frame = new Frame("Mouse Motion Example");
         prac11d applet = new prac11d();
         applet.init();
         frame.add(applet);
         frame.setSize(400, 300);
         frame.setVisible(true);
         frame.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
     }
 }
 
 /*
 <applet code="prac11d.class" width="400" height="300">
 </applet>
 */
 