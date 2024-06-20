package info;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginForm() {
        setTitle("Hospital Information System - Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(20, 20, 80, 25);
        panel.add(lblUsername);

        txtUsername = new JTextField(20);
        txtUsername.setBounds(100, 20, 160, 25);
        panel.add(txtUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(20, 60, 80, 25);
        panel.add(lblPassword);

        txtPassword = new JPasswordField(20);
        txtPassword.setBounds(100, 60, 160, 25);
        panel.add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 100, 80, 25);
        panel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Authentication logic here
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    // Open Main Dashboard
                    new MainDashboard().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}

