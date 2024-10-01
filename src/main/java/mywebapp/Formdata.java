package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class Formdata extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("username");
		String contactString=req.getParameter("contact");
		long contact=Long.parseLong(contactString);
		
		res.getWriter().println("hello "+name+" contact "+contact);
	}
}
