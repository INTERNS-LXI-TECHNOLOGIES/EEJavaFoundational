package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
// import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class SignUpServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		UserLogin uLogin=new UserLogin();
		LogRepository lRepo=new LogRepository();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		uLogin.setUname(uname);
		uLogin.setPwd(pwd);
		lRepo.insertLogin(uLogin);
		request.setAttribute("contacts",uLogin);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}