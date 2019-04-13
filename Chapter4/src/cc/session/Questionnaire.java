package cc.session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/questionnaire")
public class Questionnaire extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN'>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");

        String page = request.getParameter("page");

        out.println("<form action='questionnaire' method='post'>");
        if (page == null) {
            out.println("闂涓�锛�<input type='text' name='p1q1'><br>");
            out.println("闂浜岋細<input type='text' name='p1q2'><br>");
            out.println("<input type='submit' name='page' value='涓嬩竴椤�'>");
        } else if ("涓嬩竴椤�".equals(page)) {
            /*
             * 瀹炰綔姝ラ1
             * */
            out.println("闂涓夛細<input type='text' name='p2q1'><br>");
            out.println("<input type='submit' name='page' value='瀹屾垚'>");
        } else if ("瀹屾垚".equals(page)) {
            /*
             * 瀹炰綔姝ラ2
             * */
            out.println(request.getParameter("p2q1") + "<br>");
        }
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
