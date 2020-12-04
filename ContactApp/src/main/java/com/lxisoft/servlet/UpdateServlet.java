
package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.modal.*;

public class UpdateServlet extends HttpServlet
{
		AddressBookRepository addressbookrepo = new AddressBookRepository();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		
		String newname= request.getParameter("name");
				String id= request.getParameter("id");

	   String newnumber= request.getParameter("number");
	   String newemail= request.getParameter("email"); 
		

	
	   Contact contact=new Contact();
	   		 contact.setName(newname);
	   		 contact.setNumber(newnumber);
	   		 contact.setEmail(newemail);

	   		 addressbookrepo.edit(id,newname,newnumber,newemail);
try
	   		 {
	   		response.sendRedirect("ContactAddedMessage.jsp");
	   	}
	   	catch(Exception e)
		{
		}

		RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
		rd.forward(request,response);
		

	}

}