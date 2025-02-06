import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

class CategoryListPanelTest {
    private CategoryListPanel categoryListPanel;
    private JList<String> categoryList;

    @BeforeEach
    void setUp() {
        // Create an instance of CategoryListPanel
        categoryListPanel = new CategoryListPanel();

        // Retrieve the scroll pane from the panel
        assertEquals(1, categoryListPanel.getComponentCount(), "Panel should contain only one component");

        Component component = categoryListPanel.getComponent(0);
        assertTrue(component instanceof JScrollPane, "Panel should contain a JScrollPane");

        // Retrieve the JList from the JScrollPane
        JScrollPane scrollPane = (JScrollPane) component;
        JViewport viewport = scrollPane.getViewport();
        assertNotNull(viewport, "JScrollPane should have a viewport");

        Component viewComponent = viewport.getView();
        assertTrue(viewComponent instanceof JList, "Viewport should contain a JList");

        categoryList = (JList<String>) viewComponent;
    }

    @Test
    void testCategoryListHasCorrectItems() {
        // Expected category list
        String[] expectedCategories = {"Rap", "Reggae", "Ballads"};

        // Get list items
        ListModel<String> model = categoryList.getModel();
        assertEquals(expectedCategories.length, model.getSize(), "JList should contain 3 items");

        for (int i = 0; i < expectedCategories.length; i++) {
            assertEquals(expectedCategories[i], model.getElementAt(i), "Category list item mismatch at index " + i);
        }
    }

    @Test
    void testCategoryListSelectionMode() {
        // Ensure the selection mode is MULTIPLE_INTERVAL_SELECTION by default
        assertEquals(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION, categoryList.getSelectionMode(),
                "JList selection mode should allow multiple selections");
    }
}
