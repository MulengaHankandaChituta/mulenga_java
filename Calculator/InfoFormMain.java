import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfoFormMain {

    public static void main(String[] args) {
        // Create main window
        JFrame frame = new JFrame("Personal Information Frame");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // Create form panel
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Labels and fields
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genders);

        JLabel bioLabel = new JLabel("Bio:");
        JTextArea bioArea = new JTextArea(3, 20);
        JScrollPane bioScroll = new JScrollPane(bioArea);

        // Add components to panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(ageLabel);
        formPanel.add(ageField);
        formPanel.add(genderLabel);
        formPanel.add(genderBox);
        formPanel.add(bioLabel);
        formPanel.add(bioScroll);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(70, 130, 180));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);

        // Message label
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);

        // Button action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String age = ageField.getText();
                String gender = (String) genderBox.getSelectedItem();
                String bio = bioArea.getText();

                messageLabel.setText("Thank you, " + name + "! Information saved.");

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                        "\nEmail: " + email +
                        "\nAge: " + age +
                        "\nGender: " + gender +
                        "\nBio: " + bio,
                        "Form Submitted",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components to frame
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(submitButton, BorderLayout.SOUTH);
        frame.add(messageLabel, BorderLayout.NORTH);

        // Make frame visible
        frame.setVisible(true);
    }
}