package com.cryptokeeper;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/authorize.do")
public class Authorize extends HttpServlet {
    private static Logger LOGGER = Logger.getLogger(Authorize.class.getName());
    public Authorize() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(10);
        LOGGER.log(Level.WARNING, "New Session was generated: " + session.getId() + " @ " + session.getCreationTime());
        response.sendRedirect("index.html");
        session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(10);
        LOGGER.log(Level.INFO, "New Session was generated: " + session.getId() + " @ " + session.getCreationTime());
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        LOGGER.log(Level.INFO, "Username: " + user + " | Password: " + pass);
        LOGGER.log(Level.INFO, "Sending your ass back to Mars!");
        response.sendRedirect(response.encodeRedirectURL("/"));

    }
}
