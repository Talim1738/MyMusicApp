import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MusicDetailsPanelTest {
    private MusicDetailsPanel panel;

    @BeforeEach
    public void setUp() {
        panel = new MusicDetailsPanel();
    }

    @Test
    public void testComponentsArePresent() {
        assertNotNull(panel);
        assertEquals(10, panel.getComponentCount());
        assertTrue(panel.getComponent(0) instanceof JLabel);
        assertTrue(panel.getComponent(1) instanceof JTextField);
        assertTrue(panel.getComponent(2) instanceof JLabel);
        assertTrue(panel.getComponent(3) instanceof JTextField);
        assertTrue(panel.getComponent(4) instanceof JLabel);
        assertTrue(panel.getComponent(5) instanceof JComboBox);
        assertTrue(panel.getComponent(6) instanceof JLabel);
        assertTrue(panel.getComponent(7) instanceof JCheckBox);
    }

    @Test
    public void testComboBoxItems() {
        JComboBox<?> comboBox = (JComboBox<?>) panel.getComponent(5);
        assertEquals(3, comboBox.getItemCount());
        assertEquals("Rap", comboBox.getItemAt(0));
        assertEquals("Reggae", comboBox.getItemAt(1));
        assertEquals("Ballads", comboBox.getItemAt(2));
    }
}
