package dao;

import model.entity.User;

import java.util.List;

public interface HospitalDao extends AutoCloseable {
        List<User> findAllUsers();

        boolean userIsExist(String login, String password);

        User.ROLE getRoleByLoginPassword(String login, String password);

        boolean registerNewPatient(String username, String password, String firstName, String lastName);
}
