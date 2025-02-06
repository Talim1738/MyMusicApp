import javax.swing.*;

public class CategoryListPanel extends JPanel {
    public CategoryListPanel() {
        String[] categories = {"Rap", "Reggae", "Ballads"};
        JList<String> categoryList = new JList<>(categories);
        add(new JScrollPane(categoryList));
    }
}
