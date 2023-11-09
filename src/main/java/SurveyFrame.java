import javax.swing.*;
import java.awt.*;

class SurveyFrame {
    private JFrame frame;
    private JButton btnYes;

    public SurveyFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 600);
        frame.setTitle("Survey");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SurveyPanel panel = new SurveyPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return frame;
    }
}