package com.cryptokeeper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/logout.do")
public class Logout extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(Logout.class.getName());
    public Logout() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] myCookies = request.getCookies();
        if(myCookies != null){
            for(Cookie c : myCookies){
                c.setMaxAge(0);
                LOGGER.log(Level.INFO, "Setting " + c.getName() + " expiration date to " + c.getMaxAge());
                response.addCookie(c);
            }
        }
        response.sendRedirect("/");
    }
}
