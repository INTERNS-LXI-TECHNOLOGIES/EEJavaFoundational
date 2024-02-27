package com.divisosoft.company;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

@WebServlet("/Companyservlet")
public class Companyservlet extends HttpServlet{

    Company comp;

    String url = "jdbc:mysql://localhost:3306/companydata";
    String username = "root";
    String password = "Magesh@96";

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

       this.comp = createCompany(request,response);
        String c="insert into companytable (name, place) values('"+comp.getName()+"','"+comp.getPlace()+"')"; 
        statement.executeUpdate(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        request.setAttribute("CompanyData",comp);
        RequestDispatcher rd = request.getRequestDispatcher("finalpage.jsp");
        rd.forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

      /*Company comp = this.createCompany(request, response);
    
        if (comp != null) {
            out.println(comp.getName());
        } else {
            out.println("Company object is null");
        } 

        request.setAttribute("CompanyData",comp);
        RequestDispatcher rd = request.getRequestDispatcher("finalpage.jsp");
        rd.forward(request, response); */ 
    
    }


    public Company createCompany(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        Company com = new Company();
        com.setName(request.getParameter("companyName"));
        com.setPlace(request.getParameter("place"));
        return com;
    }


   // UPDATE companydata set name = ? where place=?
} 