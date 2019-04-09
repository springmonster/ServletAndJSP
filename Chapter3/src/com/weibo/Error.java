package com.weibo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Error
 */
@WebServlet("/error.view")
public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		// 实作步骤1
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("  <meta content='text/html; charset=UTF-8'" + "http-equiv='content-type'>");
		out.println("  <title>新增会员失败</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>新增会员失败</h1>");
		out.println("<ul style='color: rgb(255, 0, 0);'>");

		/*
		 * 实作步骤2、3
		 */
		List<String> errorStrings = (List<String>) request.getAttribute("registerErrors");
		for (String error : errorStrings) {
			out.println("<li>" + error + "</li>");
		}
		out.println("</ul>");
		out.println("<a href='register.html'>返回注册页面</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
