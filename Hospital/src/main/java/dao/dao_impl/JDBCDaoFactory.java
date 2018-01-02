package dao.dao_impl;

import dao.DaoFactory;
import dao.HospitalDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

    public HospitalDao createHospitalDao() {
        return new JDBCHospitalDao(this.getConnection());
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Hospital",
                    "root",
                    "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
