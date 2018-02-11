package com.cryptokeeper.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloWorld.do")
public class HelloServlet extends HttpServlet {
    private static final long servialVersionUID= 1L;

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TO DO
        PrintWriter out = response.getWriter();
        double sqrtVal = Math.sqrt(4.0);
        out.println("<html><body><h1>"+sqrtVal+"</h1></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TO DO
    }

}
