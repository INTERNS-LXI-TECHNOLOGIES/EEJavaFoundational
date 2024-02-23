package com.lxisoft.company.controller;

import com.lxisoft.company.model.Company;
import com.lxisoft.company.model.Product;
import com.lxisoft.company.model.Employee;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
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

@WebServlet("/ReadAll")
public class ReadAll extends HttpServlet{

    String url ="jdbc:mysql://localhost:3306/company";
    String userName = "root";
    String pass="Jayaram";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
{    
    String option1 = request.getParameter("option1");
    String option2 = request.getParameter("option2");
    String option3 = request.getParameter("option3");

        if (option1 != null) 
          {
            viewC(request,response);
             }

            if(option2 != null) 
              {
                viewP(request,response);
                    }

                    if(option3 != null)
                    {
                        viewE(request,response);
                    }

}


public void viewC(HttpServletRequest request, HttpServletResponse response) throws IOException
{
    Company companyy = new Company();
    List<Company> list =new ArrayList<>();
    response.setContentType("text/html");
    //PrintWriter  out=response.getWriter();
    try{ 
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connect=DriverManager.getConnection(url,userName,pass);
    String view = "SELECT * FROM companyinfo";

    try{
    PreparedStatement statement =connect.prepareStatement(view);
    ResultSet set =  statement.executeQuery();
    
while(set.next())
{
     companyy.setName(set.getString("name"));
     companyy.setId(set.getString("id"));
     companyy.setCoName(set.getString("coName"));
     companyy.setLocation( set.getString("location"));
     companyy.setContactNumber(set.getString("contactNumber"));
     list.add(companyy);
    
}
request.setAttribute("a",list);
RequestDispatcher dis = request.getRequestDispatcher("companyReadAll.jsp");
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


public void viewP(HttpServletRequest request, HttpServletResponse response) throws IOException
{
    try{
        Product pro = new Product();
        List<Product> list = new ArrayList<>();
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,userName,pass);
    String query = "select * from productinfo";
    PreparedStatement pre = con.prepareStatement(query);
    ResultSet p = pre.executeQuery();
while(p.next())
{
   pro.setName(p.getString("name"));
   pro.setId(p.getString("id"));
   pro.setCost(p.getString("cost"));
   pro.setMfDate(p.getString("mfDate"));
   pro.setLsDate(p.getString("lsDate"));
        list.add(pro);
}

        request.setAttribute("queryy", list);

        RequestDispatcher dis = request.getRequestDispatcher("ProductReadAll.jsp");
        dis.forward(request, response); 

    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
    
}

public void viewE(HttpServletRequest request, HttpServletResponse response)throws IOException
{
    try
    {
        Employee employee = new Employee();
        List<Employee> le = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,pass);
        
        String query = "select *from employeeinfo ";

       try
       {
       PreparedStatement statement = connection.prepareStatement(query);
       ResultSet rr =  statement.executeQuery();
        
        while(rr.next())
        {
            employee.setName(rr.getString("name"));
            employee.setId(rr.getString("id"));
            employee.setAge(rr.getString("age"));
            employee.setPhoneNumber(rr.getString("phoneNumber"));
            employee.setAddress(rr.getString("address"));
            le.add(employee);
        }

        request.setAttribute("employeee",le);
        RequestDispatcher rq = request.getRequestDispatcher("EmployeeResultAll.jsp");
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
}
