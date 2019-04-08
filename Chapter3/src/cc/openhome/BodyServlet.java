package cc.openhome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BodyServlet
 */
@WebServlet("/body.view")
public class BodyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BodyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bodyString = readBodyString(request);
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("<html>");
		outPrintWriter.println("<head>");
		outPrintWriter.println("<title>HeaderServlet</title>");
		outPrintWriter.println("</head>");
		outPrintWriter.println("<body>");
		outPrintWriter.println(bodyString);
		outPrintWriter.println("</body>");
		outPrintWriter.println("</html>");
		outPrintWriter.close();
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

	private String readBodyString(HttpServletRequest httpServletRequest) throws IOException {
		BufferedReader bufferedReader = httpServletRequest.getReader();
		String inputString = null;
		String resultString = "";
		while ((inputString = bufferedReader.readLine()) != null) {
			resultString = resultString + inputString + "<br>";
		}
		return resultString;
	}

}
