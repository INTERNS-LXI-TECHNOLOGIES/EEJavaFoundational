package com.lxisoft.company.view;

import com.lxisoft.company.model.Employee;


import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet 
{
    String url;
    String userName;
    String pass;
    
    public void init()throws ServletException // pre Initilisation method
    {
        url ="jdbc:mysql://localhost:3306/company";
        userName = "root";
        pass ="Jayaram";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new ServletException("Error loading JDBC Driver", e);
        }
    }
    
    
   
    public Employee employee;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        String ccc= request.getParameter("select");   
        switch(ccc){
            case "Create":
               createE(request, response);
               response.getWriter().println("Employee information Created successfully!");
                break;

                case "Read":
                readE(request,response);
                response.getWriter().println("Employee information Read successfully!");
                 break;

                 case "Update":
                 updateE(request, response);
                 response.getWriter().println("Employee information Update successfully!");
                  break;

                  case "Delete":
                  deleteE(request, response);
                  response.getWriter().println("Employee information Delete successfully!");
                   break;
       }       
     }

     
   public void createE(HttpServletRequest request, HttpServletResponse response)
   {
    String name = request.getParameter("nameee");
    String idd = request.getParameter("idd");
    String age = request.getParameter("age");
    String phoneNumber = request.getParameter("phoneNumber");
    String Address = request.getParameter("address");

    Employee employee = new Employee(name, idd, age, phoneNumber, Address);

    try
    {
       
        Connection connection = DriverManager.getConnection(url,userName,pass);
        
        String queryy = "insert into employeeinfo (name ,id , age , phoneNumber , address) values(?,?,?,?,?)";

       try
       {
       PreparedStatement statement = connection.prepareStatement(queryy);
        statement.setString(1, employee.getName());
        statement.setString(2, employee.getId());
        statement.setString(3, employee.getAge());
        statement.setString(4, employee.getPhoneNumber());
        statement.setString(5, employee.getAddress());
        statement.executeUpdate();
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
    

   public void readE( HttpServletRequest request,HttpServletResponse response)throws IOException
   {
 
    String name = request.getParameter("nameee");
    String idd = request.getParameter("idd");
    String age = request.getParameter("age");
    String phoneNumber = request.getParameter("phoneNumber");
    String Address = request.getParameter("address");

    Employee employee = new Employee(name, idd, age, phoneNumber, Address);
   
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,pass);
        
        String query = "select name ,age, phoneNumber, address from employeeinfo where id = ?";

       try
       {
       PreparedStatement statement = connection.prepareStatement(query);
       statement.setString(1,employee.getId());
       ResultSet rr =  statement.executeQuery();
        
        while(rr.next())
        {
            employee.setName(rr.getString("name"));
            employee.setAge(rr.getString("age"));
            employee.setPhoneNumber(rr.getString("phoneNumber"));
            employee.setAddress(rr.getString("address"));

        }

        request.setAttribute("employeee",employee);
        RequestDispatcher rq = request.getRequestDispatcher("EmployeeResult.jsp");
        rq.forward(request,response);
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

   public void updateE(HttpServletRequest request, HttpServletResponse response)
   {

    String name = request.getParameter("nameee");
    String idd = request.getParameter("idd");
    String age = request.getParameter("age");
    String phoneNumber = request.getParameter("phoneNumber");
    String Address = request.getParameter("address");

    Employee employee = new Employee(name, idd, age, phoneNumber, Address);

    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,pass);
        
        String query = "update employeeinfo set name = ?,age = ?, phoneNumber = ?, address = ? where id = ?";

       try
       {
       PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, employee.getName());
        statement.setString(2, employee.getAge());
        statement.setString(3, employee.getPhoneNumber());
        statement.setString(4, employee.getAddress());
        statement.setString(5, employee.getId());
        statement.executeUpdate();
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

   public void deleteE(HttpServletRequest request, HttpServletResponse response)
   {

    String name = request.getParameter("nameee");
    String idd = request.getParameter("idd");
    String age = request.getParameter("age");
    String phoneNumber = request.getParameter("phoneNumber");
    String Address = request.getParameter("address");

    Employee employee = new Employee(name, idd, age, phoneNumber, Address);

    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,pass);
        
        String query = "delete from employeeinfo where id = ?";

       try
       {
       PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, employee.getId());
        statement.executeUpdate();
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
}