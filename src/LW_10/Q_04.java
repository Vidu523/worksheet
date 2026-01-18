package LW_10;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class Q_04{

    public static void main(String[] args) {
        // 1. Create JFrame
        JFrame frame = new JFrame("Combined GUI Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        // 2. Create JMenuBar

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");


        openItem.setEnabled(false);


        exitItem.addActionListener(e -> System.exit(0));


        fileMenu.add(openItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);


        frame.setJMenuBar(menuBar);


        // 3. Create JTable in center

        String[] columns = {"Name", "ID", "Marks"};
        Object[][] data = {
                {"Amal", "CS/2022/020", 85},
                {"Nimali", "ET/2022/014", 77},
                {"Kamal", "CT/2022/011", 92}
        };


        DefaultTableModel tableModel = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // make table non-editable
            }
        };

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane, BorderLayout.CENTER);

        // 4. Create JPanel with buttons at bottom

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");


        buttonPanel.add(saveButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);


        frame.add(buttonPanel, BorderLayout.SOUTH);


        // 5. Make frame visible

        frame.setVisible(true);
    }
}