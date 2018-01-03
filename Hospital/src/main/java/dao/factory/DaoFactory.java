package dao.factory;

import dao.HospitalDao;
import java.sql.Connection;


public abstract class DaoFactory {

    public abstract HospitalDao createHospitalDao();

    public static DaoFactory getDaoFactory(Connection connection) {
        return JDBCDaoFactory.getInstance(connection);
    }
}
