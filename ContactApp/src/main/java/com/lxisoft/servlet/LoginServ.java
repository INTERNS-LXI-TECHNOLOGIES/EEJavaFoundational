package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class LoginServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		LogRepository lRepo=new LogRepository();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		UserLogin uLog=new UserLogin();
		uLog.setUname(uname);
		uLog.setPwd(pwd);
		List<UserLogin> login=lRepo.getAllContact();
		RequestDispatcher rd=null;
		for(int i=0;i<login.size();i++)
		{
			String u=login.get(i).getUname();
			String p=login.get(i).getPwd(); 
			if((u.equals(uname))&&(p.equals(pwd)))
			{
				rd=request.getRequestDispatcher("url");
				rd.forward(request,response);
			}
			else
			{
				rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request,response);
			}
		} 
	}
}