package cc.openhome;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;

@WebServlet(
        /*
         * 完成步骤1
         */ 
    urlPatterns = {"/login.do"},
    /*
     * 完成步骤2
     */ 
)
public class Login extends HttpServlet {
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    /*
     * 完成步骤3
     * 
     */

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");
        if ("caterpillar".equals(name) && "123456".equals(passwd)) {
            request.getRequestDispatcher(SUCCESS_VIEW)
                    .forward(request, response);
        } else {
            request.getRequestDispatcher(ERROR_VIEW)
                    .forward(request, response);
        }
    }
}
