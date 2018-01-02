package dao.dao_impl;

import dao.HospitalDao;
import model.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCHospitalDao implements HospitalDao {

        private Connection connection;

        public JDBCHospitalDao(Connection connection) {
            this.connection = connection;
        }

        public Connection getConnection() {
            return connection;
        }

        private User extractUserFromResultSet(ResultSet rs)
                throws SQLException {
            User result = new User();
            result.setId(rs.getInt("id"));
            result.setFirst_name(rs.getString("first_name"));
            result.setLast_name(rs.getString("last_name"));
            result.setUsername(rs.getString("username"));
            result.setPassword(rs.getString("password"));
            result.setRole_id(rs.getInt("role_id"));
            return result;
        }

    @Override
    public List<User> findAllUsers() {
        List<User> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()) {
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
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }
