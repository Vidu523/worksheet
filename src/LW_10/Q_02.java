package LW_10;
import javax.swing.*;
import java.awt.event.*;

public class Q_02{

    public static void main(String[] args) {
        // 1. Create JFrame
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. Create JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // 3. Create "File" menu
        JMenu fileMenu = new JMenu("File");

        // 4. Create menu items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // 5. Add ActionListener to Exit
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // closes the application
            }
        });

        // 6. Disable Open menu item
        openItem.setEnabled(false);

        // 7. Add menu items to File menu
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // 8. Add File menu to menu bar
        menuBar.add(fileMenu);

        // 9. Set menu bar to JFrame
        frame.setJMenuBar(menuBar);

        // 10. Make frame visible
        frame.setVisible(true);
    }
}


