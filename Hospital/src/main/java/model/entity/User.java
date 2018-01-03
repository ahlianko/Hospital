package model.entity;

public class User {
    private int id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    ROLE ROLE;

    public User() {
    }

    public User(int id, String username, String password, String first_name, String last_name, User.ROLE role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.ROLE = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public User.ROLE getRole() {
        return ROLE;
    }

    public void setRole(User.ROLE role) {
        this.ROLE = role;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", role=" + ROLE +
                '}';
    }

    public enum ROLE {
        ADMIN, DOCTOR, PATIENT, NURSE, UNKNOWN
    }
}
