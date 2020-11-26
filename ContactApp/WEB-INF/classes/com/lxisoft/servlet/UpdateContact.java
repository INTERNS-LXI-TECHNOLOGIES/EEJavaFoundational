package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;



public class UpdateContact extends HttpServlet
{
	public UpdateContact(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		String name = request.getParameter("name");
		String newname =request.getParameter("newname");
	 try{
	 	Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
				String updateQuery="UPDATE contact SET name = '"+newname+"' where name= '"+name+"'";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				ps.executeUpdate();
				response.sendRedirect("boxUpdate.html");
		   }
		catch(Exception e)
		{}
	}
}
