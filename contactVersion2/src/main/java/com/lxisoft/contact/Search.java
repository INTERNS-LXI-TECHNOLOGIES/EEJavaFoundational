package com.lxisoft.contact;

import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Search")
public class Search extends HttpServlet
{
String url = "jdbc:mysql://localhost:3306/contact";
String user = "root";
String pass = "Jayaram";


public void doGet(HttpServletRequest request,HttpServletResponse responce) throws IOException
{
    try{
      Contact conn = new Contact();
   conn.setName(request.getParameter("name"));
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con = DriverManager.getConnection(url,user,pass);
  String query = "select * from contactinfo where name =?";
  PreparedStatement pre = con.prepareStatement(query);
pre.setString(1,conn.getName());
ResultSet re = pre.executeQuery();
while(re.next())
{
conn.setContactNumber(re.getLong("contactNumber"));
}

request.setAttribute("connection",conn);
RequestDispatcher ree = request.getRequestDispatcher("ResultSingle.jsp");
ree.forward(request,responce);


}
catch(Exception e)
{
    e.printStackTrace();
}
}
}