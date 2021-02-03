package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class UpdateContactServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
  	Contact contact=new Contact();
    String id =request.getParameter("id");    
    String fname=request.getParameter("firstname");
    String lname=request.getParameter("lastname");
    String email=request.getParameter("email");
    String phno=request.getParameter("contactnumber");
    database.updateContacts(id,fname,lname,email,phno);


			RequestDispatcher req = request.getRequestDispatcher("UpdateContactMessage.jsp");
			req.forward(request, response);
	}
}
