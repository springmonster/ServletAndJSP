package cc.openhome.controller;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message.do")
public class Message extends HttpServlet {
	private final String USERS = "d:/workspace/Gossip/users";
	private final String LOGIN_VIEW = "weibo-index.html";
	private final String SUCCESS_VIEW = "weibomember.view";
	private final String ERROR_VIEW = "weibomember.view";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("login") == null) {
			response.sendRedirect(LOGIN_VIEW);
			return;
		}
		request.setCharacterEncoding("UTF-8");
		String blabla = request.getParameter("blabla");
		if (blabla != null && blabla.length() != 0) {
			if (blabla.length() < 140) {
				String username = (String) request.getSession().getAttribute("login");
				addMessage(username, blabla);
				response.sendRedirect(SUCCESS_VIEW);
			} else {
				request.getRequestDispatcher(ERROR_VIEW).forward(request, response);
			}
		}else {
			response.sendRedirect(ERROR_VIEW);
		}

	}

	private void addMessage(String username, String blabla) throws IOException {
		String file = USERS + "/" + username + "/" + new Date().getTime() + ".txt";
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		writer.write(blabla);
		writer.close();
	}

}
