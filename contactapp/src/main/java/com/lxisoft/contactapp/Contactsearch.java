package com.lxisoft.contactapp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class Contactsearch extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 
 		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n = request.getParameter("Name");

        
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		Contact contact=new Contact();
		ResultSet rs=s.executeQuery("select * from contactlist where NAME ='"+n+"'");
		rs.next();
		contact.setId(rs.getInt("ID"));
		contact.setName(rs.getString("NAME"));
		contact.setNumber(rs.getString("NUMBER"));
		request.setAttribute("con",contact);
		RequestDispatcher rd = request.getRequestDispatcher("search.jsp"); 
		rd.forward(request,response);

        }
    catch(Exception ee){
    	request.setAttribute("con",null);
		RequestDispatcher rd = request.getRequestDispatcher("search.jsp"); 
		rd.forward(request,response);
		System.out.println("****Exception*****"+ee);} 
		
   }
}