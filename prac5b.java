/*
    Question: Write a program which creates a Menu of different colors and disable menu item for Black color.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prac5b {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Color Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to change the background color
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu for colors
        JMenu colorMenu = new JMenu("Colors");

        // Create menu items for different colors
        JMenuItem redItem = new JMenuItem("Red");
        JMenuItem greenItem = new JMenuItem("Green");
        JMenuItem blueItem = new JMenuItem("Blue");
        JMenuItem blackItem = new JMenuItem("Black");

        // Disable the "Black" color menu item
        blackItem.setEnabled(false);

        // Add action listeners for menu items
        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED); // Change background to Red
            }
        });

        greenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN); // Change background to Green
            }
        });

        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE); // Change background to Blue
            }
        });

        // Add menu items to the menu
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        colorMenu.add(blackItem); // "Black" item is added but disabled

        // Add the color menu to the menu bar
        menuBar.add(colorMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Make the frame visible
        frame.setVisible(true);
    }
}

/*<applet code="prac5b.class" width="400" height="300"></applet>*/
