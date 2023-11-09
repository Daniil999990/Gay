import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class SurveyPanel extends JPanel {
    private JButton btnYes;

    public SurveyPanel() {
        setBackground(Color.WHITE);
        setLayout(null);

        JLabel label = new JLabel("Are you gay?");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(220, 50, 200, 30);
        add(label);

        btnYes = new JButton("no");
        btnYes.setFont(new Font("Arial", Font.BOLD, 20));
        btnYes.setBounds(170, 100, 100, 50);
        add(btnYes);

        JButton btnNo = new JButton("yes");
        btnNo.setFont(new Font("Arial", Font.BOLD, 20));
        btnNo.setBounds(350, 100, 100, 50);
        add(btnNo);

        btnNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showMessage("Thanks bro");
                System.exit(0);
            }
        });

        btnYes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnYes.setLocation(randomNumber(500), randomNumber(500));
            }
        });
    }

    private int randomNumber(int max) {
        return (int) (Math.random() * max);
    }

    private void showMessage(String message) {
        JOptionPane.showConfirmDialog(this, message, "", JOptionPane.DEFAULT_OPTION);
    }
}
