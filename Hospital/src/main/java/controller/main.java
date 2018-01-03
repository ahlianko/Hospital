package controller;
import java.util.List;
import dao.HospitalDao;
import dao.factory.JDBCDaoFactory;
import model.Model;
import model.entity.User;

public class main {
    public static void main (String [] args){
        Model m = new Model();
       /*() m.main();
        JDBCDaoFactory daoFactory = new JDBCDaoFactory();
        HospitalDao hdao = daoFactory.createHospitalDao();
        List<User> res = hdao.findAllUsers();
        for (User u :res
             ) {
            System.out.println(u);
        }*/
    }
}
