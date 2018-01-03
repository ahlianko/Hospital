package dao.dao_impl;


import dao.AbstractDao;
import dao.HospitalDao;
import model.Password;
import model.entity.User;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HospitalDaoImpl extends AbstractDao implements HospitalDao {
    private List<User> store = new ArrayList<>();
    private HospitalDaoImpl(Connection connection) {
        super(connection);
    }
    private static final class HospitalDaoImplHolder {
        private static HospitalDaoImpl instance(Connection connection) {
            return new HospitalDaoImpl(connection);
        }
    }

    public static HospitalDaoImpl getInstance(Connection connection) {
        return HospitalDaoImplHolder.instance(connection);
    }



        private List<User> loadAllUsers(){
           return findAllUsers();
        }

        private User extractUserFromResultSet(ResultSet rs)
                throws SQLException {
            User result = new User();
            result.setId(rs.getInt("id"));
            result.setFirst_name(rs.getString("first_name"));
            result.setLast_name(rs.getString("last_name"));
            result.setUsername(rs.getString("username"));
            result.setPassword(rs.getString("password"));
            if (rs.getString("role").equals("ADMIN")) result.setRole(User.ROLE.ADMIN);
            if (rs.getString("role").equals("PATIENT")) result.setRole(User.ROLE.PATIENT);
            if (rs.getString("role").equals("DOCTOR")) result.setRole(User.ROLE.DOCTOR);
            if (rs.getString("role").equals("NURSE")) result.setRole(User.ROLE.NURSE);
            if (rs.getString("role").equals("UNKNOWN")) result.setRole(User.ROLE.UNKNOWN);
            return result;

        }

    @Override
    public List<User> findAllUsers() {
        List<User> resultList = new ArrayList<>();
        try (Statement ps = HospitalDaoImpl.super.connection.createStatement()) {
            ResultSet rs = ps.executeQuery("SELECT * FROM USER ");

            while (rs.next()) {
                User result = extractUserFromResultSet(rs);
                resultList.add(result);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    @Override
    public boolean userIsExist(String username, String password) {
            store = loadAllUsers();
            boolean result = false;

            for (User user : store) {
                if (user.getUsername().equals(username) && Password.checkPassword(password,user.getPassword())/*user.getPassword().equals(password)*/) {
                    result = true;
                    break;
                }
            }

            return result;

    }

    @Override
    public User.ROLE getRoleByLoginPassword(String username, String password) {
            User.ROLE result = User.ROLE.UNKNOWN;

            for (User user : store) {
                if (user.getUsername().equals(username) && Password.checkPassword(password,user.getPassword())) {
                    result = user.getRole();
                }
            }

            return result;


    }

    @Override
    public boolean registerNewPatient(String username, String password, String firstName, String lastName) {
            boolean result = false;
            String ps = "insert into user (username, password, first_name, last_name, role) values ( ? , ? , ? , ? , ? ) ";
        try (PreparedStatement preparedStatement = HospitalDaoImpl.super.connection.prepareStatement(ps)) {
            System.out.println("connection " + HospitalDaoImpl.super.connection);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, Password.hashPassword(password));
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, lastName);
            preparedStatement.setString(5, "PATIENT");
            System.out.println("Pass"+Password.hashPassword(password));
            int rows = preparedStatement.executeUpdate();
            connection.commit();
            result = true;
            System.out.println("Record is inserted into USER table! rows = "+rows);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    @Override
    public void close() {
        try {
            HospitalDaoImpl.super.connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }
