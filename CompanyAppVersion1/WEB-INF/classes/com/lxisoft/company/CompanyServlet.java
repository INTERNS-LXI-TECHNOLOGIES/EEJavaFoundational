package com.lxisoft.company;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public Product product;


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
    {
        createC(request,response);
        createP(request,response);
 try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection=DriverManager.getConnection(url,userName,pass);
   
String query = "INSERT INTO Companyinfo (name, coName, id, location, contactNumber) VALUES (?, ?, ?, ?, ?)";

try (PreparedStatement preparedStatement = connection.prepareStatement(query))  {
    preparedStatement.setString(1, company.getName());
    preparedStatement.setString(2, company.getCoName());
    preparedStatement.setString(3, company.getId());
    preparedStatement.setString(4, company.getLocation());
    preparedStatement.setString(5, company.getContactNumber());

    // Execute the query
    preparedStatement.executeUpdate();
} catch (SQLException e) {
    e.printStackTrace();
}

 }
 catch(Exception e)
 {
    e.printStackTrace();
 }  
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {    
        readC(response);    
        readP(response);
    }

    public void createC(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        
        String name = request.getParameter("name");
        String coName = request.getParameter("coName");
        String id = request.getParameter("id");
        String location = request.getParameter("location");
        String contactNumber = request.getParameter("contactNumber");

        company = new Company(name, coName, id, location, contactNumber);
      
        // response.sendRedirect("CompanyServlet"); 

    }

    public void readC(HttpServletResponse response) throws IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (company != null) {
            out.println("Company Name is " + company.getName() + "<br/>" +
                        "Company CoName is " + company.getCoName() + "<br/>" +
                        "Company Id is " + company.getId() + "<br/>" +
                        "Company Location is " + company.getLocation() + "<br/>" +
                        "Company ContactNumber is " + company.getContactNumber() + "<br/><br/>");
        } else {
            out.println("No company information available.");
        }
    }

    public void createP(HttpServletRequest request,HttpServletResponse responce) throws IOException
    {
        String name = request.getParameter("namee");
        String id = request.getParameter("idd");
        String cost = request.getParameter("costt");
        String mfDate =request.getParameter("mfDatee");
        String lsDate = request.getParameter("lsDatee");

        product = new Product(name,id,cost,mfDate,lsDate);
         responce.sendRedirect("CompanyServlet"); 
    }

    public void readP(HttpServletResponse response) throws IOException
    {
       PrintWriter  out=response.getWriter();
       out.println("Product Name is"+ product.getName()+"<br/>"+product.getId()+"<br/>"+product.getCost()+"<br/>"+product. getMfDate()+"<br/>"+product.getLsDate());
    }

    public void updateC(HttpServletRequest request,HttpServletResponse response)
    {

    }
}
