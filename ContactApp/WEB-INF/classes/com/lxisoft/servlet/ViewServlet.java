package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.modal.*;

public class ViewServlet extends HttpServlet
{
		AddressBookRepository addressbookrepo = new AddressBookRepository();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		//if (request.isUserInRole("admin")) {

		ArrayList <Contact> contactList = new ArrayList<Contact>();

		contactList= addressbookrepo.read();


		request.setAttribute("contactList",contactList);

		RequestDispatcher rd = request.getRequestDispatcher("ViewContact.jsp");


		rd.forward(request,response);
	/*}
	else
	{
	   		response.sendRedirect("WrongUser.jsp");
	}*/
					
	}
}  