package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticeTwoResult
 */
@WebServlet("/PracticeTwoResult")
public class PracticeTwoResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PracticeTwoResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String usernameString = request.getParameter("name");
		String passwordString = request.getParameter("password");
		System.out.println(usernameString);
		System.out.println(passwordString);
		if("james".equals(usernameString)&&"111111".equals(passwordString)) {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Success</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1> Login Success! </h1>");
			writer.println("<body>");
			writer.println("</html>");
			writer.close();
		}else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>Failure</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1> Login Failure! </h1>");
			writer.println("<a href=\"http://localhost:8080/FirstServlet/nameandpassword.view\">back to login</a>");
			writer.println("<body>");
			writer.println("</html>");
			writer.close();
		}
	}

}
