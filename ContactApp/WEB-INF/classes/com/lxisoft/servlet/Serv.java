package com.lxisoft.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
// import com.lxisoft.repository.*;
// import com.lxisoft.domain.*;
public class Serv extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		// List<Contact>contactList=new ArrayList<Contact>();
		// myrepo.getAllContact();
		 PrintWriter out = response.getWriter();
		out.println("welcome");
	}
	// doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IoException
	// {
	// 	String name=request.getParameter("name");
	// }
}