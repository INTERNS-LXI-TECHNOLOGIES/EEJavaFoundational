package com.lxisoft.school;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;


@WebServlet("/Delete")
public class Delete extends HttpServlet
{ 
    String url;
    String name;
    String pass;
    Connection con;

    public void init()
    {
        String  url = "jdbc:mysql://localhost:3306/school";
        String name = "root";
        String pass = "Jayaram";
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch(ClassNotFoundException e)
{
    e.printStackTrace();
}
        try{
 con = DriverManager.getConnection(url,name,pass);
}
catch(SQLException e)
{
    e.printStackTrace();
}


    }



public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException
{
    School sc = new School();
    sc.setId(Integer.parseInt(request.getParameter("id")));
    

try{
String query = "delete from schoolinfo where id=?";
PreparedStatement pre = con.prepareStatement(query);
pre.setInt(1,sc.getId());
pre.executeUpdate();

}
catch(SQLException e)
{
    e.printStackTrace();
}

}
}