import javax.swing.*;
import java.awt.*;

public class MainSelectionPage extends JFrame {
    private JButton adminButton, userButton;

    public MainSelectionPage() {
        // Initialize components
        adminButton = new JButton("Admin Login");
        userButton = new JButton("User Login");

        // Add action listeners
        adminButton.addActionListener(e -> {
            new AdminLoginPage();
            dispose(); // Close the current window
        });

        userButton.addActionListener(e -> {
            new UserLoginPage();
            dispose(); // Close the current window
        });

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(adminButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between buttons
        panel.add(userButton);

        // Center the panel
        JPanel container = new JPanel(new GridBagLayout());
        container.add(panel);

        // Frame settings
        setTitle("Library Management System - Select Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(container);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainSelectionPage();
    }
}
