import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ButtonPanelTest {
    private ButtonPanel buttonPanel;
    private JButton submitButton;
    private JButton exitButton;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Redirect system output for testing
        System.setOut(new PrintStream(outputStream));

        // Create ButtonPanel instance
        buttonPanel = new ButtonPanel();

        // Get buttons from the panel
        submitButton = (JButton) buttonPanel.getComponent(0);
        exitButton = (JButton) buttonPanel.getComponent(1);
    }

    @AfterEach
    void tearDown() {
        // Restore original System.out
        System.setOut(originalOut);
    }

    @Test
    void testSubmitButtonAction() {
        // Simulate button click
        for (ActionListener al : submitButton.getActionListeners()) {
            al.actionPerformed(null);
        }

        // Check console output
        assertEquals("Details submitted.\n", outputStream.toString(), "Submit button did not print expected output.");
    }

    @Test
    void testExitButtonHasActionListener() {
        // Ensure exit button has at least one ActionListener
        assertTrue(exitButton.getActionListeners().length > 0, "Exit button should have an ActionListener.");
    }

    private class ButtonPanel {
        public Object getComponent(int i) {
            return null;
        }
    }
}

