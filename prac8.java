import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class prac8 {
    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Employee Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Data for the table
        String[] columns = {"ID", "NAME", "SALARY"};
        String[][] data = {
            {"101", "Amit", "670000"},
            {"102", "Jai", "780000"},
            {"103", "Sachin", "700000"}
        };
        
        // Create table with data
        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table); // Add scrollable feature
        
        // Add table to frame
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}

/*<applet code="prac8.class" width="400" height="300"></applet>*/
