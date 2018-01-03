package servlets;


import dao.HospitalDao;
import dao.factory.DaoFactory;
import dao.factory.DataSourceFactory;
import model.entity.User;
import util.ConnectionUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@WebListener
public class ContextListener implements ServletContextListener {

    private AtomicReference<HospitalDao> dao;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        DataSource dataSource = DataSourceFactory.getInstance().getDataSource();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            connection.setAutoCommit(false);
            dao = new AtomicReference<>(DaoFactory.getDaoFactory(connection).createHospitalDao());
            List<User> users = dao.get().findAllUsers();
            final ServletContext servletContext =
                    servletContextEvent.getServletContext();

            servletContext.setAttribute("users", users);
            servletContext.setAttribute("dao", dao);

        } catch (SQLException e) {
        ConnectionUtil.rollback(connection);
        e.printStackTrace();
    }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        dao = null;
    }
}