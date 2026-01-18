package LW_09;
public class HomeGUI extends javax.swing.JFrame {

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        SignUpGUI signUp = new SignUpGUI();
        signUp.setVisible(true);
        this.dispose(); // Close Home GUI
    }
}


