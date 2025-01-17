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
    private final String USERS = "c:/workspace/Gossip/users";
    private final String LOGIN_VIEW = "index.html";
    private final String SUCCESS_VIEW = "member.view";
    private final String ERROR_VIEW = "member.view";
    
    
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                             throws ServletException, IOException {
        /*
         * 实作步骤1到4
         * 
         */
	    
	}

    private void addMessage(String username, String blabla) throws IOException {
        String file = USERS + "/" + username + "/" + new Date().getTime() + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        writer.write(blabla);
        writer.close();
    }
    
    

}
