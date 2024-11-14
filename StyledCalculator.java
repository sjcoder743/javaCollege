import javax.swing.*;
import java.awt.*;

public class StyledCalculator extends JFrame {
    private JTextField input1;
    private JTextField input2;
    private JTextField resultField;

    public StyledCalculator() {
        // Create the frame
        setTitle("Styled Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Set a background color
        getContentPane().setBackground(new Color(240, 240, 240));

        // Create components
        JLabel label1 = new JLabel("Input 1:");
        JLabel label2 = new JLabel("Input 2:");
        JLabel resultLabel = new JLabel("Result:");

        input1 = new JTextField(10);
        input2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field read-only

        // Style the text fields
        styleTextField(input1);
        styleTextField(input2);
        styleTextField(resultField);

        JButton addButton = createStyledButton("Add");
        JButton subtractButton = createStyledButton("Subtract");
        JButton multiplyButton = createStyledButton("Multiply");
        JButton divideButton = createStyledButton("Divide");

        // Set up action listeners for buttons
        addButton.addActionListener(e -> performOperation("add"));
        subtractButton.addActionListener(e -> performOperation("subtract"));
        multiplyButton.addActionListener(e -> performOperation("multiply"));
        divideButton.addActionListener(e -> performOperation("divide"));

        // Set up the layout
        setLayout(new GridLayout(5, 2, 10, 10)); // Add gaps between components

        // Add components to the frame
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultLabel);
        add(resultField);

        // Make the frame visible
        setVisible(true);
    }

    private void styleTextField(JTextField textField) {
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setBackground(Color.WHITE);
        textField.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100), 1));
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBackground(new Color(70, 130, 180)); // Steel Blue
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Padding
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return button;
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = 0;

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StyledCalculator());
    }
}