package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class SignUpServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		User user=new User();
		user.setUserName(request.getParameter("user name"));
		user.setPassword(request.getParameter("password"));
		UserRepository urepo=new UserRepository();
		User u=urepo.saveUser(user);
		HttpSession session=request.getSession(); 
		session.setAttribute("user",user);
		RequestDispatcher rd=request.getRequestDispatcher("home");
		rd.forward(request,response);
	}
}