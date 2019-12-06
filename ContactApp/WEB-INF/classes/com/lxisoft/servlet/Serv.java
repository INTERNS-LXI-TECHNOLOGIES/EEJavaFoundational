package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
public class Serv extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		MysqlRepository myrepo=new MysqlRepository();
		List<Contact> contactList=myrepo.getAllContact();
		request.setAttribute("contactlist",contactList);
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
		// PrintWriter out = response.getWriter();
		// out.println("welcome");
	}
}