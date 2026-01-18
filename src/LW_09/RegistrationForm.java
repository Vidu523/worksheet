package LW_09;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationForm extends javax.swing.JFrame {

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Registration Successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

