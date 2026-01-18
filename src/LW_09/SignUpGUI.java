package LW_09;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignUpGUI extends javax.swing.JFrame {

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM users WHERE email=? AND password=?";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // Correct credentials, go to Home GUI
                HomeGUI home = new HomeGUI();
                home.setVisible(true);
                this.dispose(); // Close current SignUp GUI
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Invalid credentials!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
