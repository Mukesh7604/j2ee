package mywebapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/productdata")
public class product extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id=Integer.parseInt(req.getParameter("pid"));
		String brand=req.getParameter("pbrand");
		double price=Double.parseDouble(req.getParameter("pprice"));
		double discount=Double.parseDouble(req.getParameter("pdiscount"));
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql:///players?","root","hello");
			PreparedStatement ps=connection.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, brand);;
			ps.setDouble(3, price);
			ps.setDouble(4, discount);
			
			int a=ps.executeUpdate();
			res.getWriter().print(a +" roes inserted");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
