package model.entity;

public class Patient {
    private int id;
    private User user;
    private String diagnosis;
    private Patient_status patient_status;

    public Patient(int id, User user, String diagnosis, Patient_status status) {
        this.id = id;
        this.user = user;
        this.diagnosis = diagnosis;
        this.patient_status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Patient_status getPatient_Status() {
        return patient_status;
    }

    public void setPatient_Status(Patient_status status) {
        this.patient_status = status;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", user=" + user +
                ", diagnosis='" + diagnosis + '\'' +
                ", patient_status=" + patient_status +
                '}';
    }
}
