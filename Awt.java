import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Awt extends JFrame {
    Awt() {
        // Create labels
        JLabel firstName, lastName, dob;

        // Create text fields
        JTextField firstNameTextField, lastNameTextField, dobTextField;
        // Create submit button
        JButton submit;

        // Initialize labels
        firstName = new JLabel("First Name");
        firstName.setBounds(20, 50, 80, 20);
        lastName = new JLabel("Last Name");
        lastName.setBounds(20, 80, 80, 20);
        dob = new JLabel("Date of Birth" + new Date());
        dob.setBounds(20, 110, 80, 20);

        // Initialize text fields
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(120, 50, 150, 20);
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(120, 80, 150, 20);
        dobTextField = new JTextField();
        dobTextField.setBounds(120, 110, 150, 20);

        // Initialize submit button
        submit = new JButton("Submit");
        submit.setBounds(120, 150, 80, 30);

        // Add action listener to the submit button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameTextField.getText();
                String lastName = lastNameTextField.getText();
                String dob = dobTextField.getText();
                // You can process the input data here
                JOptionPane.showMessageDialog(null, "Your information is submitted:\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nDate of Birth: " + dob);
            }
        });

        // Add components to the frame
        add(firstName);
        add(lastName);
        add(dob);
        add(firstNameTextField);
        add(lastNameTextField);
        add(dobTextField);
        add(submit);

        // Set layout to null for absolute positioning
        setLayout(null);

        // Set frame properties
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Awt(); // Create an instance of the Awt class
    }
}