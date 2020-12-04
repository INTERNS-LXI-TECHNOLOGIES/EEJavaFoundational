package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBookRepository;



public class DeleteContactServlet extends HttpServlet
{
	public DeleteContactServlet(){
		super();
	}

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
	{
		AddressBookRepository addressbookrepo =new AddressBookRepository();
		String name = request.getParameter("name");
		String id =request.getParameter("id");
		addressbookrepo.deleteName(name);

		RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
		rd.forward(request,response);
	 try{
	 	
	response.sendRedirect("DeleteMessage.jsp");

	   }
	 catch(Exception e){}

}
}