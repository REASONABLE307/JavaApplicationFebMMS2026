import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppointmentForm extends JFrame {

    // Declare form components
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField phoneField;
    private JTextField dobField;
    private JTextField appointmentField;

    private JRadioButton maleButton;
    private JRadioButton femaleButton;

    private JButton submitButton;
    private JButton clearButton;

    public AppointmentForm() {

        setTitle("Appointment Registration Form");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 10, 10));
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        // First Name
        panel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        panel.add(firstNameField);

        // Last Name
        panel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        panel.add(lastNameField);

        // Gender
        panel.add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);

        panel.add(genderPanel);

        // Phone Number
        panel.add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        // Date of Birth
        panel.add(new JLabel("Date of Birth (DD/MM/YYYY):"));
        dobField = new JTextField();
        panel.add(dobField);

        // Appointment Date
        panel.add(new JLabel("Appointment Date (DD/MM/YYYY):"));
        appointmentField = new JTextField();
        panel.add(appointmentField);

        // Submit Button
        submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Clear Button
        clearButton = new JButton("Clear");
        panel.add(clearButton);

        // Submit button action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();
                String phone = phoneField.getText().trim();
                String dob = dobField.getText().trim();
                String appointment = appointmentField.getText().trim();

                String gender = "";

                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                }

                // Check for empty fields
                if (firstName.isEmpty() || lastName.isEmpty()
                    || phone.isEmpty() || dob.isEmpty()
                    || appointment.isEmpty() || gender.isEmpty()) {

                    JOptionPane.showMessageDialog(
                        null,
                        "Please fill in all fields!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );

                } else {

                    JOptionPane.showMessageDialog(
                        null,
                        "Registration Successful!\n\n" +
                        "First Name: " + firstName +
                        "\nLast Name: " + lastName +
                        "\nGender: " + gender +
                        "\nPhone Number: " + phone +
                        "\nDate of Birth: " + dob +
                        "\nAppointment Date: " + appointment,
                        "Appointment Details",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        // Clear button action
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstNameField.setText("");
                lastNameField.setText("");
                phoneField.setText("");
                dobField.setText("");
                appointmentField.setText("");

                maleButton.setSelected(false);
                femaleButton.setSelected(false);
            }
        });

        add(panel);
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {

        new AppointmentForm();

    }
}