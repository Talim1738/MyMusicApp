import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public ButtonPanel() {
        JButton submitButton = new JButton("Submit");
        JButton exitButton = new JButton("Exit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Details submitted.");
            }
        });

        exitButton.addActionListener(e -> System.exit(0));

        add(submitButton);
        add(exitButton);
        }
}
