// Write a program to create a JTree
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class prac7 extends JApplet {
    @Override
    public void init() {
        setLayout(new BorderLayout());

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);

        child1.add(new DefaultMutableTreeNode("Sub-child 1.1"));
        child1.add(new DefaultMutableTreeNode("Sub-child 1.2"));
        child2.add(new DefaultMutableTreeNode("Sub-child 2.1"));

        JTree tree = new JTree(root);

        JScrollPane scrollPane = new JScrollPane(tree);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JTree Applet");
        prac7 applet = new prac7();
        applet.init();
        frame.add(applet);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/*
<applet code="prac7.class" width="400" height="300">
</applet>
*/
