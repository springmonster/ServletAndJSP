package cc.openhome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet(name = "ServletConfigDemo", urlPatterns = { "/conf" }, initParams = {
		@WebInitParam(name = "PARAM1", value = "VALUE1"), @WebInitParam(name = "PARAM2", value = "VALUE2") })
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletConfigDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
//		String param1 = getServletConfig().getInitParameter("PARAM1");
//		String param2 = getServletConfig().getInitParameter("PARAM2");
//		System.out.println(param1);
//		System.out.println(param2);
		
		String param1 = getInitParameter("PARAM1");
		String param2 = getServletConfig().getInitParameter("PARAM2");
		System.out.println(param1);
		System.out.println(param2);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
