package com.lxisoft.contactapp.servelet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class ContactDelete extends HttpServlet{
Repository repo=new DbRepository();
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 
 		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n = request.getParameter("Name");

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("delete from contactlist where NAME ='"+n+"'");	
		RequestDispatcher rd = request.getRequestDispatcher("Contacts.jsp"); 
		rd.forward(request,response);
       }
    catch(Exception ee){
		System.out.println(ee);}
      }

   }