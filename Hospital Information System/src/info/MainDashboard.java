package info;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainDashboard extends JFrame {
    public MainDashboard() {
        setTitle("Hospital Information System - Main Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JButton btnManagePatients = new JButton("Manage Patients");
        btnManagePatients.setBounds(50, 50, 200, 50);
        panel.add(btnManagePatients);

        JButton btnManageAppointments = new JButton("Manage Appointments");
        btnManageAppointments.setBounds(50, 150, 200, 50);
        panel.add(btnManageAppointments);

        JButton btnManageMedicalHistory = new JButton("Manage Medical History");
        btnManageMedicalHistory.setBounds(50, 250, 200, 50);
        panel.add(btnManageMedicalHistory);

        btnManagePatients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PatientManagementForm().setVisible(true);
            }
        });

        btnManageAppointments.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement AppointmentManagementForm
            }
        });

        btnManageMedicalHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement MedicalHistoryManagementForm
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainDashboard().setVisible(true));
    }
}
