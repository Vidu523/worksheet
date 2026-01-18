package LW_10;
import javax.swing.*;
import java.awt.*;

public class Q_03 {

    public static void main(String[] args) {
        // 1. Create JFrame
        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create JPanel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        // 3. Create buttons
        JButton saveButton = new JButton("Save");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        // 4. Add buttons to panel
        panel.add(saveButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        // 5. Change panel background color to light gray
        panel.setBackground(Color.LIGHT_GRAY);

        // 6. Add panel to frame
        frame.add(panel);

        // 7. Make frame visible
        frame.setVisible(true);
    }
}