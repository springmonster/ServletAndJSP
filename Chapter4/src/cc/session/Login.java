package cc.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginsession.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String passwd = request.getParameter("passwd");
        if ("james".equals(user) && "111111".equals(passwd)) {
            request.getSession().setAttribute("login", user);
            request.getRequestDispatcher("/usersession.view").forward(request,
                    response);
        } else {
            response.sendRedirect("loginsession.html");
        }
    }
}
