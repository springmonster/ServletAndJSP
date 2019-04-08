package cc.openhome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response)
                      throws ServletException, IOException {
        String user = request.getParameter("user");
        String passwd = request.getParameter("passwd");
        if("caterpillar".equals(user) && "123456".equals(passwd)) {
            String login = request.getParameter("login");
            /*
             * 实作步骤1、2
             * */
            request.setAttribute("user", user);
            request.getRequestDispatcher("user.view")
                    .forward(request, response);
        }
        else {
            response.sendRedirect("login.html");
        }
    }
} 
