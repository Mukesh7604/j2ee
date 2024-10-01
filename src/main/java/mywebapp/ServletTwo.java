package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s2")
public class ServletTwo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=(String)req.getAttribute("name");
		String password=(String)req.getAttribute("password");
		
		res.getWriter().println("name is:"+name+" password :"+password);
		
	}
	

}
