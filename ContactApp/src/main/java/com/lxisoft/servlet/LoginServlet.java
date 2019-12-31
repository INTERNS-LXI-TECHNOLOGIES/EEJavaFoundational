package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class LoginServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		User user=new User();
		user.setUserName(request.getParameter("user name"));
		user.setPassword(request.getParameter("password"));
		UserRepository urepo=new UserRepository();
		List<User> users=urepo.findAllUser();
		PrintWriter out=response.getWriter();  
		RequestDispatcher rd=null;
		for(int i=0;i<users.size();i++)
		{
			String cname=user.getUserName();
			String pass=user.getPassword();
			if((cname.equals(users.get(i).getUserName()))&&(pass.equals(users.get(i).getPassword())))
			{
				HttpSession session=request.getSession(); 
				session.setAttribute("user",user);
				rd=request.getRequestDispatcher("home");
				rd.forward(request,response);
			}
			else
			{  
		        out.print("Sorry username or password error");  
		        rd=request.getRequestDispatcher("Login.jsp");  
		        rd.include(request,response);  
		    }  
		}
		
	}
}