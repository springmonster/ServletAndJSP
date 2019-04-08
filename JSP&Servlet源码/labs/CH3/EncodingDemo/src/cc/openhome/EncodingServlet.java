package cc.openhome;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encoding")
public class EncodingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        /*
         *  完成範例標號1內容
         */
        System.out.println("GET: " + name);
    }

    
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
    	/*
         *  完成範例標號2內容
         */
        System.out.println("POST: " + name);
    }
}
