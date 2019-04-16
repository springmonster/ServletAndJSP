package cc.openhome;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextParameterReader implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("this is init");
		ServletContext servletContext = arg0.getServletContext();
		String avatars = servletContext.getInitParameter("AVATAR");
		servletContext.setAttribute("avatars", avatars);
	}

}
