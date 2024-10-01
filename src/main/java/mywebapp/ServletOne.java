package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class ServletOne extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("email");
		String password=req.getParameter("password");
		
		req.setAttribute("name", name);
		req.setAttribute("password", password);
		
		req.getRequestDispatcher("s2").forward(req, res);
		
	}

}
