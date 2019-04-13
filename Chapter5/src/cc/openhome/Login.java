package cc.openhome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login", urlPatterns = { "/login.do" }, initParams = {
		@WebInitParam(name = "SUCCESS", value = "success.view"), @WebInitParam(name = "ERROR", value = "error.view") })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String SUCCESS_VIEW = "";
	private String ERROR_VIEW = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		SUCCESS_VIEW = getInitParameter("SUCCESS");
		ERROR_VIEW = getInitParameter("ERROR");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		if ("james".equals(username) && "111111".equals(password)) {
			request.getRequestDispatcher(SUCCESS_VIEW).forward(request, response);
		} else {
			request.getRequestDispatcher(ERROR_VIEW).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
