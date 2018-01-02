package model.entity;
import java.util.Date;

public class Appointment {
    private int id;
    private Medical_worker medical_worker;
    private Patient patient;
    private Type_of_treatment type_of_treatment;
    private String status;
    private Date date;
    private String description;

    public Appointment(int id, Medical_worker medical_worker, Patient patient, Type_of_treatment type_of_treatment, String status, Date date, String description) {
        this.id = id;
        this.medical_worker = medical_worker;
        this.patient = patient;
        this.type_of_treatment = type_of_treatment;
        this.status = status;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medical_worker getMedical_worker() {
        return medical_worker;
    }

    public void setMedical_worker(Medical_worker medical_worker) {
        this.medical_worker = medical_worker;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Type_of_treatment getType_of_treatment() {
        return type_of_treatment;
    }

    public void setType_of_treatment(Type_of_treatment type_of_treatment) {
        this.type_of_treatment = type_of_treatment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
