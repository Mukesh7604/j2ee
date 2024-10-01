package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieone")
public class CookieOne extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("username");
		String contact=req.getParameter("usercontact");
		
		Cookie c1Cookie=new Cookie("k1",name );
		Cookie c2Cookie=new Cookie("k2", contact);
		
	
		resp.addCookie(c1Cookie);
		resp.addCookie(c2Cookie);
		
		req.getRequestDispatcher("cookietwo").forward(req, resp);
	}

}
