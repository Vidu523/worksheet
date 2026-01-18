package LW_08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Q_01 extends JFrame implements ActionListener {


        JLabel signUpLabel, nameLabel, emailLabel, genderLabel, birthdayLabel, passwordLabel;
        JTextField nameField, emailField;
        JPasswordField passwordField;
        JRadioButton maleButton, femaleButton;
        JComboBox<String> dayBox, monthBox, yearBox;
        JCheckBox robotCheckBox;
        JButton signUpButton;

        ButtonGroup genderGroup;


        JLabel signInLabel, emailSignInLabel, passwordSignInLabel;
        JTextField emailSignInField;
        JPasswordField passwordSignInField;
        JButton signInButton;

        JTextArea displayArea;

        public Q_01() {
            setTitle("Registration Form");
            setSize(450, 600);
            setLocationRelativeTo(null);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


            signUpLabel = new JLabel("Sign Up");
            signUpLabel.setFont(new Font("Arial", Font.BOLD, 18));
            signUpLabel.setForeground(Color.BLUE);
            signUpLabel.setBounds(170, 10, 100, 25);
            add(signUpLabel);

            nameLabel = new JLabel("Name:");
            nameLabel.setBounds(50, 50, 80, 25);
            add(nameLabel);
            nameField = new JTextField();
            nameField.setBounds(150, 50, 200, 25);
            add(nameField);

            emailLabel = new JLabel("Email:");
            emailLabel.setBounds(50, 90, 80, 25);
            add(emailLabel);
            emailField = new JTextField();
            emailField.setBounds(150, 90, 200, 25);
            add(emailField);

            genderLabel = new JLabel("Gender:");
            genderLabel.setBounds(50, 130, 80, 25);
            add(genderLabel);

            maleButton = new JRadioButton("Male");
            maleButton.setBounds(150, 130, 60, 25);
            femaleButton = new JRadioButton("Female");
            femaleButton.setBounds(220, 130, 80, 25);

            genderGroup = new ButtonGroup();
            genderGroup.add(maleButton);
            genderGroup.add(femaleButton);

            add(maleButton);
            add(femaleButton);

            birthdayLabel = new JLabel("Birthday:");
            birthdayLabel.setBounds(50, 170, 80, 25);
            add(birthdayLabel);

            String[] days = new String[31];
            for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
            dayBox = new JComboBox<>(days);
            dayBox.setBounds(150, 170, 50, 25);
            add(dayBox);

            String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
            monthBox = new JComboBox<>(months);
            monthBox.setBounds(210, 170, 90, 25);
            add(monthBox);

            String[] years = new String[50];
            int startYear = 1970;
            for (int i = 0; i < 50; i++) years[i] = String.valueOf(startYear + i);
            yearBox = new JComboBox<>(years);
            yearBox.setBounds(310, 170, 60, 25);
            add(yearBox);

            passwordLabel = new JLabel("Password:");
            passwordLabel.setBounds(50, 210, 80, 25);
            add(passwordLabel);
            passwordField = new JPasswordField();
            passwordField.setBounds(150, 210, 200, 25);
            add(passwordField);

            robotCheckBox = new JCheckBox("I am not a robot.");
            robotCheckBox.setBounds(150, 250, 200, 25);
            add(robotCheckBox);

            signUpButton = new JButton("Sign Up");
            signUpButton.setBackground(Color.BLUE);
            signUpButton.setForeground(Color.WHITE);
            signUpButton.setBounds(150, 290, 200, 30);
            signUpButton.addActionListener(this);
            add(signUpButton);


            signInLabel = new JLabel("Sign In");
            signInLabel.setFont(new Font("Arial", Font.BOLD, 16));
            signInLabel.setForeground(Color.BLUE);
            signInLabel.setBounds(180, 340, 100, 25);
            add(signInLabel);

            emailSignInLabel = new JLabel("Email:");
            emailSignInLabel.setBounds(50, 380, 80, 25);
            add(emailSignInLabel);
            emailSignInField = new JTextField();
            emailSignInField.setBounds(150, 380, 200, 25);
            add(emailSignInField);

            passwordSignInLabel = new JLabel("Password:");
            passwordSignInLabel.setBounds(50, 420, 80, 25);
            add(passwordSignInLabel);
            passwordSignInField = new JPasswordField();
            passwordSignInField.setBounds(150, 420, 200, 25);
            add(passwordSignInField);

            signInButton = new JButton("Sign In");
            signInButton.setBackground(Color.BLUE);
            signInButton.setForeground(Color.WHITE);
            signInButton.setBounds(150, 460, 200, 30);
            signInButton.addActionListener(this);
            add(signInButton);


            displayArea = new JTextArea();
            displayArea.setBounds(50, 500, 350, 50);
            displayArea.setEditable(false);
            add(displayArea);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == signUpButton) {
                if (!robotCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Please verify that you are not a robot!");
                    return;
                }
                String name = nameField.getText();
                String email = emailField.getText();
                String gender = maleButton.isSelected() ? "Male" : femaleButton.isSelected() ? "Female" : "";
                String birthday = dayBox.getSelectedItem() + " " + monthBox.getSelectedItem() + " " + yearBox.getSelectedItem();
                String password = new String(passwordField.getPassword());

                displayArea.setText("Sign-Up Details:\n" +
                        "Name: " + name + "\n" +
                        "Email: " + email + "\n" +
                        "Gender: " + gender + "\n" +
                        "Birthday: " + birthday + "\n" +
                        "Password: " + password);

            } else if (e.getSource() == signInButton) {
                String email = emailSignInField.getText();
                String password = new String(passwordSignInField.getPassword());

                displayArea.setText("Sign-In Details:\nEmail: " + email + "\nPassword: " + password);
            }
        }

        public static void main(String[] args) {
            new Q_01();
        }
    }


