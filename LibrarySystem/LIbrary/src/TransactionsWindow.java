import javax.swing.*;
import java.awt.*;

public class TransactionsWindow extends JFrame {
    private JButton checkAvailabilityButton, issueBookButton, returnBookButton, payFineButton, logOutButton;

    public TransactionsWindow() {
        // Initialize components
        initializeComponents();

        // Layout setup for buttons
        JPanel buttonPanel = createButtonPanel();

        // Center the panel
        JPanel container = new JPanel(new BorderLayout(10, 10));
        container.add(buttonPanel, BorderLayout.CENTER);
        container.add(logOutButton, BorderLayout.SOUTH);

        // Frame settings
        setupFrame(container);
    }

    private void initializeComponents() {
        checkAvailabilityButton = new JButton("Is book available?");
        issueBookButton = new JButton("Issue book?");
        returnBookButton = new JButton("Return book?");
        payFineButton = new JButton("Pay Fine?");
        logOutButton = new JButton("Log Out");

        // Add action listeners
        checkAvailabilityButton.addActionListener(e -> {
            // Check book availability
        });

        issueBookButton.addActionListener(e -> {
            // Issue book
        });

        returnBookButton.addActionListener(e -> {
            // Return book
        });

        payFineButton.addActionListener(e -> {
            // Pay fine
        });

        logOutButton.addActionListener(e -> {
            new MainSelectionPage();
            dispose(); // Close the current window
        });

        // Add some styling
        styleButtons();
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(checkAvailabilityButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
        buttonPanel.add(issueBookButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
        buttonPanel.add(returnBookButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
        buttonPanel.add(payFineButton);
        return buttonPanel;
    }

    private void setupFrame(JPanel container) {
        setTitle("Transactions");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(container);
        setSize(500, 400);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    private void styleButtons() {
        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        Color buttonColor = new Color(223, 216, 230); 

        checkAvailabilityButton.setFont(buttonFont);
        issueBookButton.setFont(buttonFont);
        returnBookButton.setFont(buttonFont);
        payFineButton.setFont(buttonFont);
        logOutButton.setFont(buttonFont);

        checkAvailabilityButton.setBackground(buttonColor);
        issueBookButton.setBackground(buttonColor);
        returnBookButton.setBackground(buttonColor);
        payFineButton.setBackground(buttonColor);
        logOutButton.setBackground(buttonColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TransactionsWindow());
    }
}
