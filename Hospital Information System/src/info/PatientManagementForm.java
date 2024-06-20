package info;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;

public class PatientManagementForm extends JFrame {
    private JTextField txtName;
    private JTextField txtDateOfBirth;
    private JTextField txtGender;
    private JTextField txtAddress;
    private JTextField txtPhone;
    private JTextField txtEmail;
    private JButton btnAddPatient;
    private JButton btnUpdatePatient;
    private JButton btnDeletePatient;
    private JButton btnSearchPatient;

    private PatientService patientService;

    public PatientManagementForm() {
        patientService = new PatientService();

        setTitle("Patient Management");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 20, 80, 25);
        panel.add(lblName);

        txtName = new JTextField(20);
        txtName.setBounds(100, 20, 200, 25);
        panel.add(txtName);

        JLabel lblDateOfBirth = new JLabel("Date of Birth:");
        lblDateOfBirth.setBounds(20, 60, 80, 25);
        panel.add(lblDateOfBirth);

        txtDateOfBirth = new JTextField(20);
        txtDateOfBirth.setBounds(100, 60, 200, 25);
        panel.add(txtDateOfBirth);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(20, 100, 80, 25);
        panel.add(lblGender);

        txtGender = new JTextField(20);
        txtGender.setBounds(100, 100, 200, 25);
        panel.add(txtGender);

        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(20, 140, 80, 25);
        panel.add(lblAddress);

        txtAddress = new JTextField(20);
        txtAddress.setBounds(100, 140, 200, 25);
        panel.add(txtAddress);

        JLabel lblPhone = new JLabel("Phone:");
        lblPhone.setBounds(20, 180, 80, 25);
        panel.add(lblPhone);

        txtPhone = new JTextField(20);
        txtPhone.setBounds(100, 180, 200, 25);
        panel.add(txtPhone);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 220, 80, 25);
        panel.add(lblEmail);

        txtEmail = new JTextField(20);
        txtEmail.setBounds(100, 220, 200, 25);
        panel.add(txtEmail);

        btnAddPatient = new JButton("Add Patient");
        btnAddPatient.setBounds(20, 260, 120, 25);
        panel.add(btnAddPatient);

        btnUpdatePatient = new JButton("Update Patient");
        btnUpdatePatient.setBounds(160, 260, 140, 25);
        panel.add(btnUpdatePatient);

        btnDeletePatient = new JButton("Delete Patient");
        btnDeletePatient.setBounds(320, 260, 120, 25);
        panel.add(btnDeletePatient);

        btnSearchPatient = new JButton("Search Patient");
        btnSearchPatient.setBounds(460, 260, 140, 25);
        panel.add(btnSearchPatient);

        btnAddPatient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Patient patient = new Patient(
                        txtName.getText(),
                        LocalDate.parse(txtDateOfBirth.getText()),
                        txtGender.getText(),
                        txtAddress.getText(),
                        txtPhone.getText(),
                        txtEmail.getText()
                    );
                    patientService.addPatient(patient);
                    JOptionPane.showMessageDialog(PatientManagementForm.this, "Patient added successfully!");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(PatientManagementForm.this, "Error adding patient.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Similarly, add action listeners for update, delete, and search operations

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PatientManagementForm().setVisible(true));
    }
}
