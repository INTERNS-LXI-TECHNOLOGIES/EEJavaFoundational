package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.modal.Contact;
import com.lxisoft.repository.AddressBook;



public class AddContact extends HttpServlet
{
	public AddContact(){
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	{


		String name= request.getParameter("name");
	   String number= request.getParameter("number");
	   String email= request.getParameter("email"); 
	   Contact contact=new Contact();
	   		 contact.setName(name);
	   		 contact.setNumber(number);
	   		 contact.setEmail(email);
	   		try
		   	{

		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","Karthik1996$");
			Statement stmt = con.createStatement();
			//out.println("Succesfull"+"\n");

			
           PreparedStatement ps=con.prepareStatement("insert into contact(NAME,Number,Email) values(?,?,?)");
		     ps.setString(1,contact.getName());
		     ps.setString(2,contact.getNumber());
		     ps.setString(3,contact.getEmail());
		  			
			int a=ps.executeUpdate();
		
         
     	response.sendRedirect("box.html");

		}catch(Exception e)
		{
		}

	}
}
