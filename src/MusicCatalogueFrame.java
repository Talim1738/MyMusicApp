import javax.swing.*;
import java.awt.*;

public class MusicCatalogueFrame extends JFrame {
    public MusicCatalogueFrame() {
        setTitle("My Music Catalogue");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("My Music Catalogue", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); // Increased font size
        add(titleLabel, BorderLayout.NORTH);

        add(new ButtonPanel(), BorderLayout.SOUTH);
        add(new CategoryListPanel(), BorderLayout.WEST);
        add(new MusicDetailsPanel(), BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        }
}
