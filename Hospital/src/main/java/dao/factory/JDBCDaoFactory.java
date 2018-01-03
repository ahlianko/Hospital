package dao.factory;

import dao.HospitalDao;
import dao.dao_impl.HospitalDaoImpl;

import java.sql.Connection;


public class JDBCDaoFactory extends DaoFactory {
    private Connection connection;

    private JDBCDaoFactory(Connection connection) {
        this.connection = connection;
    }
    @Override
    public HospitalDao createHospitalDao() {
        return HospitalDaoImpl.getInstance(connection);
    }


    private static class JDBCDaoFactoryHolder {
        private static JDBCDaoFactory instance(Connection connection) {
            return new JDBCDaoFactory(connection);
        }
    }

    public static JDBCDaoFactory getInstance(Connection connection) {
        return JDBCDaoFactoryHolder.instance(connection);
    }
}
