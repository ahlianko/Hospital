package model.entity;

public class Medical_worker {
    private int id;
    private User user;
    private Specialization specialization;

    public Medical_worker(int id, User user, Specialization specialization) {
        this.id = id;
        this.user = user;
        this.specialization = specialization;
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

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Medical_worker{" +
                "id=" + id +
                ", user=" + user +
                ", specialization=" + specialization +
                '}';
    }
}
