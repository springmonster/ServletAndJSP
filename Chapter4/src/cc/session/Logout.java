package cc.session;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout.view")
public class Logout extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession();
		String user = (String) session.getAttribute("login");
		session.invalidate();

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.01" + " Transitional//EN'>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>logout</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>User " + user + " logout</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
