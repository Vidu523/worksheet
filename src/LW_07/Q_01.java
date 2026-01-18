package LW_07;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class Q_01 extends JFrame implements ActionListener {

        JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel, messageLabel;
        JTextField nameField, mobileField;
        JRadioButton maleButton, femaleButton;
        JComboBox<String> dayBox, monthBox, yearBox;
        JTextArea addressArea, displayArea;
        JCheckBox termsCheckBox;
        JButton submitButton, resetButton;
        ButtonGroup genderGroup;

        Q_01() {
            setTitle("Registration Form");
            setSize(700, 400);
            setLocationRelativeTo(null);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);


            nameLabel = new JLabel("Name:");
            nameLabel.setBounds(30, 30, 80, 25);
            add(nameLabel);

            nameField = new JTextField();
            nameField.setBounds(120, 30, 150, 25);
            add(nameField);


            mobileLabel = new JLabel("Mobile:");
            mobileLabel.setBounds(30, 70, 80, 25);
            add(mobileLabel);

            mobileField = new JTextField();
            mobileField.setBounds(120, 70, 150, 25);
            add(mobileField);


            genderLabel = new JLabel("Gender:");
            genderLabel.setBounds(30, 110, 80, 25);
            add(genderLabel);

            maleButton = new JRadioButton("Male");
            maleButton.setBounds(120, 110, 60, 25);
            femaleButton = new JRadioButton("Female");
            femaleButton.setBounds(180, 110, 80, 25);

            genderGroup = new ButtonGroup();
            genderGroup.add(maleButton);
            genderGroup.add(femaleButton);

            add(maleButton);
            add(femaleButton);


            dobLabel = new JLabel("DOB:");
            dobLabel.setBounds(30, 150, 80, 25);
            add(dobLabel);

            String[] days = new String[31];
            for (int i = 1; i <= 31; i++) days[i - 1] = String.valueOf(i);
            dayBox = new JComboBox<>(days);
            dayBox.setBounds(120, 150, 50, 25);

            String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
            monthBox = new JComboBox<>(months);
            monthBox.setBounds(180, 150, 70, 25);

            String[] years = new String[50];
            int startYear = 1970;
            for (int i = 0; i < 50; i++) years[i] = String.valueOf(startYear + i);
            yearBox = new JComboBox<>(years);
            yearBox.setBounds(260, 150, 60, 25);

            add(dayBox);
            add(monthBox);
            add(yearBox);


            addressLabel = new JLabel("Address:");
            addressLabel.setBounds(30, 190, 80, 25);
            add(addressLabel);

            addressArea = new JTextArea();
            addressArea.setBounds(120, 190, 200, 60);
            addressArea.setLineWrap(true);
            add(addressArea);


            termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
            termsCheckBox.setBounds(120, 260, 250, 25);
            add(termsCheckBox);


            submitButton = new JButton("Submit");
            submitButton.setBounds(120, 300, 80, 25);
            submitButton.addActionListener(this);
            add(submitButton);

            resetButton = new JButton("Reset");
            resetButton.setBounds(220, 300, 80, 25);
            resetButton.addActionListener(this);
            add(resetButton);


            displayArea = new JTextArea();
            displayArea.setBounds(350, 30, 300, 300);
            displayArea.setEditable(false);
            displayArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(displayArea);


            messageLabel = new JLabel("");
            messageLabel.setBounds(120, 340, 300, 25);
            messageLabel.setForeground(Color.BLUE);
            add(messageLabel);

            setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                if (!termsCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Please accept Terms and Conditions");
                    return;
                }
                String name = nameField.getText();
                String mobile = mobileField.getText();
                String gender = maleButton.isSelected() ? "Male" : femaleButton.isSelected() ? "Female" : "";
                String dob = dayBox.getSelectedItem() + "/" + monthBox.getSelectedItem() + "/" + yearBox.getSelectedItem();
                String address = addressArea.getText();

                displayArea.setText("Name : " + name + "\n" +
                        "Mobile : " + mobile + "\n" +
                        "Gender : " + gender + "\n" +
                        "DOB : " + dob + "\n" +
                        "Address : " + address);
                messageLabel.setText("Registration Successfully..");

            } else if (e.getSource() == resetButton) {
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                dayBox.setSelectedIndex(0);
                monthBox.setSelectedIndex(0);
                yearBox.setSelectedIndex(0);
                addressArea.setText("");
                termsCheckBox.setSelected(false);
                displayArea.setText("");
                messageLabel.setText("");
            }
        }

        public static void main(String[] args) {
            new Q_01();
        }
    }


