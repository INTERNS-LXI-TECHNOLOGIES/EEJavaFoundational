package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class DeleteServ extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		MysqlRepository myrepo=new MysqlRepository();
		String id=request.getParameter("id");
	    myrepo.deleteContact(id);
		RequestDispatcher rd=request.getRequestDispatcher("DeleteView.jsp");
		rd.forward(request,response);
	}
}