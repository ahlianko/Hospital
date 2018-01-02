package model.entity;

import java.util.List;

public class Hospital {
    private List<Medical_worker> medical_workers;
    private List<Patient> patients;
    private List<Appointment> notebook;

    public Hospital(List<Medical_worker> medical_workers, List<Patient> patients, List<Appointment> notebook) {
        this.medical_workers = medical_workers;
        this.patients = patients;
        this.notebook = notebook;
    }

    public List<Medical_worker> getMedical_workers() {
        return medical_workers;
    }

    public void setMedical_workers(List<Medical_worker> medical_workers) {
        this.medical_workers = medical_workers;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Appointment> getNotebook() {
        return notebook;
    }

    public void setNotebook(List<Appointment> notebook) {
        this.notebook = notebook;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "medical_workers=" + medical_workers +
                ", patients=" + patients +
                ", notebook=" + notebook +
                '}';
    }
}
