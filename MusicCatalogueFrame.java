import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class MusicCatalogueFrameTest {
    private MusicCatalogueFrame musicCatalogueFrame;

    @BeforeEach
    void setUp() {
        // Create an instance of MusicCatalogueFrame
        musicCatalogueFrame = new MusicCatalogueFrame();
    }

    @Test
    void testFrameTitle() {
        // Verify the title of the frame
        assertEquals("My Music Catalogue", musicCatalogueFrame.getTitle(),
                "Frame title should be 'My Music Catalogue'");
    }

    @Test
    void testFrameLayout() {
        // Verify the frame layout is BorderLayout
        assertTrue(musicCatalogueFrame.getLayout() instanceof BorderLayout,
                "Frame layout should be BorderLayout");
    }

    @Test
    void testFrameHasTitleLabel() {
        // Retrieve the component at the NORTH position (title label)
        Component component;
        component = ((BorderLayout) musicCatalogueFrame.getLayout()).getLayoutComponent(BorderLayout.NORTH);

        // Ensure it's a JLabel
        assertNotNull(component, "Title label should exist in the frame");
        assertTrue(component instanceof JLabel, "Title label should be a JLabel");

        // Check its properties
        JLabel titleLabel = (JLabel) component;
        assertEquals("My Music Catalogue", titleLabel.getText(), "Title label text should match");
        assertEquals(SwingConstants.CENTER, titleLabel.getHorizontalAlignment(), "Title label should be centered");
        assertEquals(new Font("Arial", Font.BOLD, 24), titleLabel.getFont(), "Title label font should be Arial, Bold, Size 24");
    }

    @Test
    void testFrameHasButtonPanel() {
        // Retrieve the component at the SOUTH position (button panel)
        Component component = ((BorderLayout) musicCatalogueFrame.getLayout()).getLayoutComponent(BorderLayout.SOUTH);

        // Ensure it's not null
        assertNotNull(component, "ButtonPanel should exist in the frame");
    }

    @Test
    void testFrameHasCategoryListPanel() {
        // Retrieve the component at the WEST position (category list panel)
        Component component = ((BorderLayout) musicCatalogueFrame.getLayout()).getLayoutComponent(BorderLayout.WEST);

        // Ensure it's not null
        assertNotNull(component, "CategoryListPanel should exist in the frame");
    }

    @Test
    void testFrameHasMusicDetailsPanel() {
        // Retrieve the component at the CENTER position (music details panel)
        Component component = ((BorderLayout) musicCatalogueFrame.getLayout()).getLayoutComponent(BorderLayout.CENTER);

        // Ensure it's not null
        assertNotNull(component, "MusicDetailsPanel should exist in the frame");
    }

    private class MusicCatalogueFrame {
        private Object layout;

        public Object getLayout() {
            return layout;
        }

        public void setLayout(Object layout) {
            this.layout = layout;
        }

        public String getTitle() {
            return null;
        }
    }
}
