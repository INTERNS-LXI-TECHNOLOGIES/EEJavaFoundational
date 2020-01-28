package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
/**
 *class: servlet for deleting contact
 */
public class DeleteContactServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		RequestDispatcher rd=request.getRequestDispatcher("DeleteContact.jsp");
		rd.forward(request,response);
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String id=request.getParameter("id");
		int n=Integer.parseInt(id);
		MysqlRepository dbrepo=new MysqlRepository();
		dbrepo.deleteContact(n);
		RequestDispatcher rd=request.getRequestDispatcher("home");
		rd.forward(request,response);
	}
}