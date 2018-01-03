package servlets.servlet;

import dao.HospitalDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

//
//        final HttpSession session = req.getSession();
//
//        session.removeAttribute("password");
//        session.removeAttribute("username");
//        session.removeAttribute("role");
//
//        resp.sendRedirect("/");
        req.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getSession().setAttribute("registrationSuccess", 0);
        final String username = req.getParameter("username");
        final String password = req.getParameter("password");
        final String firstName = req.getParameter("firstName");
        final String lastName = req.getParameter("lastName");
        @SuppressWarnings("unchecked")
        final AtomicReference<HospitalDao> dao = (AtomicReference< HospitalDao>) req.getServletContext().getAttribute("dao");
        dao.get().registerNewPatient(username,password,firstName,lastName);
        req.getSession().setAttribute("registrationSuccess", 1);
        req.getRequestDispatcher("/WEB-INF/view/registration.jsp").forward(req, resp);
    }



}

