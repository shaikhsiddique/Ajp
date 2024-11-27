/*
    Question: Write a program to display a JTree with nodes representing countries, states, and cities.
*/

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class prac7b {
    public static void main(String[] args) {
        // Create root node
        DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
        
        // Add states and cities
        DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
        maharashtra.add(new DefaultMutableTreeNode("Mumbai"));
        maharashtra.add(new DefaultMutableTreeNode("Pune"));
        maharashtra.add(new DefaultMutableTreeNode("Nashik"));
        maharashtra.add(new DefaultMutableTreeNode("Nagpur"));

        DefaultMutableTreeNode gujarat = new DefaultMutableTreeNode("Gujarat");
        gujarat.add(new DefaultMutableTreeNode("Ahmedabad"));
        gujarat.add(new DefaultMutableTreeNode("Surat"));

        india.add(maharashtra);
        india.add(gujarat);

        // Create tree
        JTree tree = new JTree(india);

        // Display tree
        JFrame frame = new JFrame("JTree Example");
        frame.add(new JScrollPane(tree));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*<applet code="prac7b.class" width="400" height="300"></applet>*/

