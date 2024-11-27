import javax.swing.*;

public class prac9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar");
        JProgressBar progressBar = new JProgressBar();
        
        progressBar.setValue(100); // Set progress to 100%
        progressBar.setString("100%"); // Display percentage text
        progressBar.setStringPainted(true); // Show string on the bar

        frame.add(progressBar);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }
}

/*<applet code="prac9.class" width="300" height="100"></applet>*/
