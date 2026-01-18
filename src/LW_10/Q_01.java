package LW_10;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Q_01{

    public static void main(String[] args) {
        // 1. Create JFrame
        JFrame frame = new JFrame("Student Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // 2. Define column names
        String[] columns = {"Name", "ID", "Marks"};

        // 3. Define student data
        Object[][] data = {
                {"Amal", "CS/2022/020", 85},
                {"Nimali", "ET/2022/014", 77},
                {"Kamal", "CT/2022/011", 92}
        };

        // 4. Create a non-editable table model
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // makes the JTable non-editable
            }
        };

        // 5. Create JTable using the model
        JTable table = new JTable(model);

        // Optional: Allow column resizing with mouse (default is true)
        table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);

        // 6. Put JTable inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // 7. Add JScrollPane to JFrame using BorderLayout.CENTER
        frame.add(scrollPane, BorderLayout.CENTER);

        // 8. Make frame visible
        frame.setVisible(true);
    }
}
