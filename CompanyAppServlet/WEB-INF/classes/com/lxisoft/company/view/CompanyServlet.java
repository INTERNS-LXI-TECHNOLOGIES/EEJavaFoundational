package com.lxisoft.company.view;

import com.lxisoft.company.model.Company;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
//import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CompanyServlet")
public class CompanyServlet extends HttpServlet 
{
    String url ="jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String pass="Jayaram";

    private Company company;   

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
       String c = request.getParameter("SELECT");
       switch(c){
        case "Create":
                createC(request, response);
                response.getWriter().println("Product information Created successfully!");
                break;

        case "Read":
                readC(request,response);    
                response.getWriter().println("Product information Read successfully!");
                break;

        case "Update":
                updateC(request,response);
                response.getWriter().println("Product information Update successfully!");
                break;

        case "Delete":
                deleteC(request,response);
                response.getWriter().println("Product information Delete successfully!");
                break;
       }
     }
  

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
{    
   readC(request,response);    
    //readE(response);
    }

    public void createC(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String coName = request.getParameter("coName");
        String location = request.getParameter("location");
        String contactNumber = request.getParameter("contactNumber");

        company = new Company(name, id, coName, location, contactNumber);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, pass);
    
            String query = "INSERT INTO companyinfo (name, coName, id, location, contactNumber) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, company.getName());
                preparedStatement.setString(3, company.getId());
                preparedStatement.setString(2, company.getCoName());
                preparedStatement.setString(4, company.getLocation());
                preparedStatement.setString(5, company.getContactNumber());
                preparedStatement.executeUpdate();
               
            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().println("Error updating company information: " + e.getMessage());
            }
        } catch(Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error connecting to database: " + e.getMessage());
        }  
        

    }

    public void readC(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String coName = request.getParameter("coName");
        String location = request.getParameter("location");
        String contactNumber = request.getParameter("contactNumber");

        company = new Company(name, id, coName, location, contactNumber);

         Company companyy = new Company();
        List<Company> list =new ArrayList<>();
        response.setContentType("text/html");
        //PrintWriter  out=response.getWriter();
        try{ 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect=DriverManager.getConnection(url,userName,pass);
        String view = "SELECT name, coName, location, contactNumber FROM companyinfo WHERE id = ?";

        try{
        PreparedStatement statement =connect.prepareStatement(view);
        statement.setString(1, company.getId());


        ResultSet set =  statement.executeQuery();
        
    while(set.next())
    {
         companyy.setName(set.getString("name"));
         companyy.setCoName(set.getString("coName"));
         companyy.setLocation( set.getString("location"));
         companyy.setContactNumber(set.getString("contactNumber"));
         list.add(companyy);
        
    }
    request.setAttribute("a",list);
    RequestDispatcher dis = request.getRequestDispatcher("CompanyResult.jsp");
    dis.forward(request,response);
        
        }catch(SQLException ee){
                    ee.printStackTrace();
                    response.getWriter().println("Error updating company information: " + ee.getMessage());
        }   
}
catch(Exception e)
{
    e.printStackTrace();
    response.getWriter().println("Error connecting to database: " + e.getMessage());
}
    }


    public void updateC(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String coName = request.getParameter("coName");
        String location = request.getParameter("location");
        String contactNumber = request.getParameter("contactNumber");
        Company company = new Company(name, id, coName, location, contactNumber);
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, pass);
    
            String query = "UPDATE companyinfo SET name = ?,coName = ?,location = ?,contactNumber = ? WHERE id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, company.getName());
                preparedStatement.setString(2, company.getCoName());
                preparedStatement.setString(3, company.getLocation());
                preparedStatement.setString(4, company.getContactNumber());
                preparedStatement.setString(5, company.getId());  
               preparedStatement.executeUpdate();

               response.getWriter().println("Company information updated successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().println("Error updating company information: " + e.getMessage());
            }
        } catch(Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error connecting to database: " + e.getMessage());
        }
    }
    

    public void deleteC(HttpServletRequest request, HttpServletResponse response) throws IOException {

       String name= request.getParameter("name");
       String id= request.getParameter("id");
       String coName= request.getParameter("coName");
       String location= request.getParameter("location");
       String phoneNumber= request.getParameter("contactNumber");
       Company company = new Company(name, id, coName, location, phoneNumber);

        try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection(url, userName, pass);

       String deleteQ="delete from companyinfo where id = ?";

      try(PreparedStatement statement =  connection.prepareStatement(deleteQ);)
      {
       statement.setString(1,company.getId());
            
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
