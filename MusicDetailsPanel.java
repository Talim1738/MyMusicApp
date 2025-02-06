import javax.swing.*;
import java.awt.*;

public class MusicDetailsPanel extends JPanel {
    public MusicDetailsPanel() {
        setLayout(new GridLayout(5, 2 ));
        add(new JLabel("Artist Name:"));
        add(new JTextField());
        add(new JLabel("Recording Studio:"));
        add(new JTextField());
        add(new JLabel("Category:"));
        add(new JComboBox<>(new String[]{"Rap", "Reggae", "Ballads"}));
        add(new JLabel("Available:"));
        add(new JCheckBox());
     }
}