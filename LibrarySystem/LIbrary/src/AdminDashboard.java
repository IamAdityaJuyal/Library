import javax.swing.*;
import java.awt.*;

public class AdminDashboard extends JFrame {
    private JButton maintenanceButton, reportsButton, transactionsButton, backButton, logOutButton;

    public AdminDashboard() {
        // Initialize components
        maintenanceButton = new JButton("Maintenance");
        reportsButton = new JButton("Reports");
        transactionsButton = new JButton("Transactions");
        backButton = new JButton("Back");
        logOutButton = new JButton("Log Out");

        // Add action listeners
        maintenanceButton.addActionListener(e -> {
            // Navigate to Maintenance Module
        });

        reportsButton.addActionListener(e -> {
            // Navigate to Reports Module
        });

        transactionsButton.addActionListener(e -> {
            new TransactionsWindow();
            dispose(); // Close the current window
        });

        backButton.addActionListener(e -> {
            new AdminLoginPage();
            dispose(); // Close the current window
        });

        logOutButton.addActionListener(e -> {
            new MainSelectionPage();
            dispose(); // Close the current window
        });

        // Layout setup for buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 20, 20));
        buttonPanel.add(maintenanceButton);
        buttonPanel.add(reportsButton);
        buttonPanel.add(transactionsButton);
        buttonPanel.add(backButton);

        // Layout setup for product details
        String[] columnNames = {"Code No From", "Code No To", "Category"};
        Object[][] data = {
            {"SC/B/MJ000001", "SC/B/MJ000004", "Science"},
            {"EC/B/MJ000001", "EC/B/MJ000004", "Economics"},
            {"FC/B/MJ000001", "FC/B/MJ000004", "Fiction"},
            {"CH/B/MJ000001", "CH/B/MJ000004", "Children"},
            {"PD/B/MJ000001", "PD/B/MJ000004", "Personal Development"}
        };
        JTable productTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(productTable);

        // Center the panel
        JPanel container = new JPanel(new BorderLayout());
        container.add(buttonPanel, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.CENTER);
        container.add(logOutButton, BorderLayout.SOUTH);

        // Frame settings
        setTitle("Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(container);
        setSize(800, 400);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Add some styling
        maintenanceButton.setFont(new Font("Arial", Font.BOLD, 14));
        reportsButton.setFont(new Font("Arial", Font.BOLD, 14));
        transactionsButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        logOutButton.setFont(new Font("Arial", Font.BOLD, 14));

        maintenanceButton.setBackground(Color.LIGHT_GRAY);
        reportsButton.setBackground(Color.LIGHT_GRAY);
        transactionsButton.setBackground(Color.LIGHT_GRAY);
        backButton.setBackground(Color.LIGHT_GRAY);
        logOutButton.setBackground(Color.LIGHT_GRAY);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminDashboard());
    }
}
