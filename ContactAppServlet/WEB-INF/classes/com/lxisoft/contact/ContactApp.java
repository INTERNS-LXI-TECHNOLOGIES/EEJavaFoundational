package com.lxisoft.contact;

import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher; 
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ContactApp")
public class ContactApp extends HttpServlet
{
String url = "jdbc:mysql://localhost:3306/contact";
String user = "root";
String pass = "Jayaram";

public void doPost(HttpServletRequest request,HttpServletResponse responce) throws IOException
{
    if(request.getParameter("select").equals("create"))
    {
        Create(request,responce);
        responce.getWriter().println("Create Successfully");
    }

    if(request.getParameter("select").equals("read"))
    {
        Read(request,responce);
        responce.getWriter().println("Read Successfully");
    } 
   
    if(request.getParameter("select").equals("update"))
    {
        Update(request,responce);
        responce.getWriter().println("Update Successfully");
    }

    if(request.getParameter("select").equals("delete"))
    {
        Delete(request,responce);
        responce.getWriter().println("Delete Successfully");
    }



}
public void doGet(HttpServletRequest request,HttpServletResponse responce) throws IOException
{
  
   
}

public void Create(HttpServletRequest request,HttpServletResponse responce)
{
    try{

    Contact contact = new Contact();
String name = request.getParameter("name");
int con = Integer.parseInt(request.getParameter("contactNumber"));

contact.setName(name);
contact.setContactNumber(con);
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection = DriverManager.getConnection(url, user, pass);
String query = "insert into contactinfo (name,contactNumber) values (?,?)";
PreparedStatement sta = connection.prepareStatement(query);

sta.setString(1,contact.getName());
sta.setInt(2,contact.getContactNumber());
sta.executeUpdate();

 PrintWriter out = responce.getWriter();
            out.println("Contact added successfully!");

}
catch(SQLException e)
{
    e.printStackTrace();
}
}

catch(Exception e)
{
    e.printStackTrace();
}

}

public void Read(HttpServletRequest request,HttpServletResponse responce) 
{
    try{
        
        List<Contact> list = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conect = DriverManager.getConnection( url,user, pass);
try{
    String query ="select * from contactinfo"; 
    PreparedStatement pre = conect.prepareStatement(query);
    ResultSet re = pre.executeQuery();

while(re.next())
{
    Contact con =new Contact();
    con.setName(re.getString("name"));
    con.setContactNumber(re.getInt("contactNumber"));
    list.add(con);
}
request.setAttribute("contact",list);
RequestDispatcher rr = request.getRequestDispatcher("Result.jsp");
rr.forward(request,responce);
}
catch(SQLException e)
{
e.printStackTrace();
}
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

public void Update(HttpServletRequest request,HttpServletResponse responce)
{
    Contact contact = new Contact();
    String aa = request.getParameter("name");
   int a = Integer.parseInt(request.getParameter("contactNumber"));
   contact.setName(aa);
    contact.setContactNumber(a);
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conect = DriverManager.getConnection( url,user, pass);
    
        String query ="update contactinfo set name =? where contactNumber =?"; 
        PreparedStatement pre = conect.prepareStatement(query);
        pre.setString(1,contact.getName());
        pre.setInt(2,contact.getContactNumber());
        pre.executeUpdate();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}

public void Delete(HttpServletRequest request,HttpServletResponse responce)
{
    Contact contact = new Contact();
   int a = Integer.parseInt(request.getParameter("contactNumber"));
    contact.setContactNumber(a);
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conect = DriverManager.getConnection( url,user, pass);
    
        String query ="delete from contactinfo  where contactNumber =?"; 
        PreparedStatement pre = conect.prepareStatement(query);
        pre.setInt(1,contact.getContactNumber());
        pre.executeUpdate();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

}
}

