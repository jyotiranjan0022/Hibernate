package hibernateproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernateproject.dao.UserDao;
import hibernateproject.dto.User;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		long phone=Long.parseLong(req.getParameter("ph"));
		String password=req.getParameter("ps");
		UserDao dao=new UserDao();
		User user= new User();
		user.setPhone(phone);
		user.setPassword(password);
		user=dao.saveUser(user);
PrintWriter writer=resp.getWriter();
		
		writer.write("<html><body><h1>You are Rgester with Id:"+user.getId()+"</h1></body></html>");
		
		
		
	
		
	}

}
