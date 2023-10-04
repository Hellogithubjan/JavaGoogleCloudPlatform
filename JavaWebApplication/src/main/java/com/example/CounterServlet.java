package com.example;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet {
    private int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        count++;
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Visitor Count: " + count + "</h2>");
        response.getWriter().println("</body></html>");
    }
}
