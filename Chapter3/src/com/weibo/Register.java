package com.weibo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register.do")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final String USERS = "c:/workspace/ServletPractices/users";
	private final String SUCCESS_VIEW = "success.view";
	private final String ERROR_VIEW = "error.view";
	private String requestPageString = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
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
		String emailString = request.getParameter("email");
		String usernameString = request.getParameter("username");
		String passwordString = request.getParameter("password");
		String confirmedPasswordString = request.getParameter("confirmedPasswd");

		List<String> errors = new ArrayList<>();
		if (isInvalidUsername(usernameString)) {
			errors.add("error user name");
		}
		if (isInvalidEmail(emailString)) {
			errors.add("error email");
		}
		if (isInvalidPassword(passwordString, confirmedPasswordString)) {
			errors.add("error password");
		}
		if (!errors.isEmpty()) {
			System.out.println("error is not empty");
			requestPageString = ERROR_VIEW;
			request.setAttribute("registerErrors", errors);
		} else {
			requestPageString = SUCCESS_VIEW;
			createUserData(emailString, usernameString, confirmedPasswordString);
		}
		request.getRequestDispatcher(requestPageString).forward(request, response);
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
