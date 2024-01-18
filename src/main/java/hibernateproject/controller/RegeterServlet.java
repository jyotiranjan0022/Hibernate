package hibernateproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernateproject.dao.UserDao;
import hibernateproject.dto.User;
@WebServlet("/reg")
public class RegeterServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		long phone=Long.parseLong(req.getParameter("ph"));
		String password=req.getParameter("ps");
		int age=Integer.parseInt(req.getParameter("ag"));
		String name=req.getParameter("nm");
		UserDao dao=new UserDao();
		User u=new User();
	u.setPhone(phone);
	u.setPassword(password);
	u.setAge(age);
	u.setName(name);
		u=dao.saveUser(u);
		PrintWriter writer=resp.getWriter();
		
		writer.write("<html><body><h1>You are Rgester with Id:"+u.getId()+"</h1></body></html>");
		
	}

}
