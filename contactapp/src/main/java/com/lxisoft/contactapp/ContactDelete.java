package com.lxisoft.contactapp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class ContactDelete extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 
 		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n = request.getParameter("idd");
        int a=Integer.parseInt(n);

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","root");
		Statement s=con.createStatement();
		s.executeUpdate("delete from contactlist where ID ='"+a+"'");
		response.sendRedirect("Contacts.jsp");	
		//RequestDispatcher rd = request.getRequestDispatcher("Contacts.jsp"); 
		//rd.forward(request,response);
       }
    catch(Exception ee){
		System.out.println(ee);}
      }

   }