import javax.swing.*;
import java.awt.*;

public class AdminLoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public AdminLoginPage() {
        // Initialize components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");

        // Add action listener
        loginButton.addActionListener(e -> {
            // Validate admin credentials and navigate to Admin Dashboard
            new AdminDashboard();
            dispose(); // Close the current window
        });

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Admin Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Admin Password:"));
        panel.add(passwordField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add space between fields and button
        panel.add(loginButton);

        // Center the panel
        JPanel container = new JPanel(new GridBagLayout());
        container.add(panel);

        // Frame settings
        setTitle("Admin Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(container);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }
}
