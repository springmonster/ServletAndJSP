package cc.openhome.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete.do")
public class Delete extends HttpServlet {
    private final String USERS = "d:/workspace/Gossip/users";
    private final String LOGIN_VIEW = "weiboindex.html";
    private final String SUCCESS_VIEW = "weibomember.view";
    
	protected void doGet(HttpServletRequest request, 
	                     HttpServletResponse response) 
	                         throws ServletException, IOException {
        if(request.getSession().getAttribute("login") == null) {
            response.sendRedirect(LOGIN_VIEW);
            return;
        }
        
        String username = (String) request.getSession().getAttribute("login");
        String message = request.getParameter("message"); 
        File file = new File(USERS + "/" + username + "/" + message + ".txt");
        if(file.exists()) {
            file.delete();
        }
        response.sendRedirect(SUCCESS_VIEW);
	}
}
