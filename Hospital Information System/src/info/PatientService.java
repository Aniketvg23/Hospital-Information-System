package info;

import java.sql.SQLException;
import java.util.List;

public class PatientService {
    private PatientDAO patientDAO;

    public PatientService() {
        this.patientDAO = new PatientDAO();
    }

    public void addPatient(Patient patient) throws SQLException {
        patientDAO.addPatient(patient);
    }

    public Patient getPatient(int id) throws SQLException {
        return patientDAO.getPatient(id);
    }

    public List<Patient> getAllPatients() throws SQLException {
        return patientDAO.getAllPatients();
    }

    public void updatePatient(Patient patient) throws SQLException {
        patientDAO.updatePatient(patient);
    }

    public void deletePatient(int id) throws SQLException {
        patientDAO.deletePatient(id);
    }
}

