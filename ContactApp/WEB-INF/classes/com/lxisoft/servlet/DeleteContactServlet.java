package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class DeleteContactServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		Contact contact=new Contact();
    	String delete= request.getParameter("delete");
    	database.deleteContacts(delete);
    	RequestDispatcher rd= request.getRequestDispatcher("DeleteContactMessage.jsp");
		rd.forward(request,response);

	}
}