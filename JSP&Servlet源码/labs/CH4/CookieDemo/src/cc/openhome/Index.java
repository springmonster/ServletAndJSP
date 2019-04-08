package cc.openhome;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.do")
public class Index extends HttpServlet {
    protected void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
                       throws ServletException, IOException {
        /*
         * 实作步骤1、2
         * */

        response.sendRedirect("login.html");
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                             throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                            throws ServletException, IOException {
        processRequest(request, response);
    }
} 