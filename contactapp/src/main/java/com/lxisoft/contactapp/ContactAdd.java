package com.lxisoft.contactapp;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import com.lxisoft.contactapp.contactrepo.*;
import com.lxisoft.contactapp.model.*;
public class ContactAdd extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        String n = request.getParameter("Name");
        String p = request.getParameter("Number");
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts", "root", "root");
  
            PreparedStatement ps = con.prepareStatement("insert into contactlist(NAME,NUMBER) values(?,?)");
 
            ps.setString(1, n);
            ps.setString(2, p);

 
            int i = ps.executeUpdate();
            if (i > 0){
                out.print("You are successfully created...");
                RequestDispatcher rd = request.getRequestDispatcher("Contacts.jsp"); 
		        rd.forward(request,response);
            }
 
        } catch (Exception e2) {
            System.out.println("***************"+e2);
        }
 
        out.close();
    }
 
}