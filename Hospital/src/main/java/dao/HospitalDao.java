package dao;

import model.entity.User;

import java.util.List;

public interface HospitalDao extends AutoCloseable {
        List<User> findAllUsers();
}
