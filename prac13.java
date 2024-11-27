/*
 Write a program to demonstrate the use of WindowAdapter class 
 */

 import java.awt.*;
 import java.awt.event.*;
 
 public class prac13 {
     public static void main(String[] args) {
         // Create a Frame
         Frame frame = new Frame("WindowAdapter Example");
 
         // Create a Button and set its bounds
         Button button = new Button("Click Me");
         button.setBounds(100, 100, 100, 50);
         frame.add(button);
 
         // Set Frame properties
         frame.setSize(300, 200);
         frame.setLayout(null);
         frame.setVisible(true);
 
         // Add a WindowListener using WindowAdapter
         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0); // Exit the program when the window is closed
             }
         });
     }
 }
 
 /*
 <applet code="prac13.class" width="300" height="200">
 </applet>
 */
 