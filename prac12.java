/*
 Write a program using JPasswordField to set the password character as ‘#’ instead of ‘*’     
 */

 import javax.swing.*;

 public class prac12 extends JApplet {
     @Override
     public void init() {
         // Create the JPasswordField and customize it
         JPasswordField passwordField = new JPasswordField(20); // 20 columns
         passwordField.setEchoChar('#'); // Set echo character for masking password input
 
         // Create a JLabel for the password field
         JLabel label = new JLabel("Enter Password: ");
 
         // Create a JPanel and add components
         JPanel panel = new JPanel();
         panel.add(label); // Add label to the panel
         panel.add(passwordField); // Add password field to the panel
 
         // Add panel to the applet
         add(panel);
     }
 
     public static void main(String[] args) {
         // Create a JFrame for testing the applet
         JFrame frame = new JFrame("JPasswordField Example");
         prac12 applet = new prac12();
         applet.init();
         frame.add(applet);
         frame.setSize(300, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
     }
 }
 
 /*
 <applet code="prac12.class" width="300" height="100">
 </applet>
 */
 