package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;



public class DeleteContact extends HttpServlet
{
	public DeleteContact(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		String name = request.getParameter("name");
	 try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();

	 String query="delete from contact where name=?";
	  PreparedStatement ps=con.prepareStatement(query);
	  ps.setString(1,name);
	  ps.executeUpdate();
	       	response.sendRedirect("boxDelete.html");

	   }
	 catch(Exception e){

	}
	//out.println("Contact\t"+name+"\tis removed");
}
}