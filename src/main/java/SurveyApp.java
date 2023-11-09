import java.awt.*;

public class SurveyApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SurveyFrame window = new SurveyFrame();
                window.getFrame().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}