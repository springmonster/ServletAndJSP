package cc.openhome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharacterView
 */
@WebServlet("/CharacterView")
public class CharacterView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharacterView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("<html>");
		outPrintWriter.println("<head>");
		outPrintWriter.println("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=BIG5\">");
		outPrintWriter.println("</head>");
		outPrintWriter.println("<body>");
		outPrintWriter.println("<form method=\"get\" action=\"encoding\">");
		outPrintWriter.println("</>Name£º<input type=\"text\" name=\"nameGet\"><br><br>");
		outPrintWriter.println("<button>Send GET Request</button>");
		outPrintWriter.println("</form>");
		outPrintWriter.println("</body>");
		outPrintWriter.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
