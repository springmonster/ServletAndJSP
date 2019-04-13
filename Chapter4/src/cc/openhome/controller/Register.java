package cc.openhome.controller;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weiboregister.do")
public class Register extends HttpServlet {
	private final String USERS = "d:/workspace/Gossip/users";
	private final String SUCCESS_VIEW = "weibosuccess.view";
	private final String ERROR_VIEW = "weiboerror.view";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmedPasswd = request.getParameter("confirmedPasswd");

		List<String> errors = new ArrayList<String>();
		if (isInvalidEmail(email)) {
			errors.add("δ��д�ʼ����ʼ���ʽ����ȷ");
		}
		if (isInvalidUsername(username)) {
			errors.add("ʹ��������Ϊ�ջ��Ѵ���");
		}
		if (isInvalidPassword(password, confirmedPasswd)) {
			errors.add("��ȷ��������ϸ�ʽ���ٶ�ȷ������");
		}
		String resultPage = ERROR_VIEW;
		if (!errors.isEmpty()) {
			request.setAttribute("errors", errors);
		} else {
			resultPage = SUCCESS_VIEW;
			createUserData(email, username, password);
		}

		request.getRequestDispatcher(resultPage).forward(request, response);
	}

	private boolean isInvalidEmail(String email) {
		return email == null || !email.matches("^[_a-z0-9-]+([.]" + "[_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$");
	}

	private boolean isInvalidUsername(String username) {
		for (String file : new File(USERS).list()) {
			if (file.equals(username)) {
				return true;
			}
		}
		return false;
	}

	private boolean isInvalidPassword(String password, String confirmedPasswd) {
		return password == null || password.length() < 6 || password.length() > 16 || !password.equals(confirmedPasswd);
	}

	private void createUserData(String email, String username, String password) throws IOException {
		File userhome = new File(USERS + "/" + username);
		userhome.mkdir();
		BufferedWriter writer = new BufferedWriter(new FileWriter(userhome + "/profile"));
		writer.write(email + "\t" + password);
		writer.close();
	}
}
