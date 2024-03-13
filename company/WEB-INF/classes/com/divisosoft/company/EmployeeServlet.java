package com.divisosoft.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpRetryException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employeeDetails")
public class EmployeeServlet extends HttpServlet
{
    PrintWriter out;

    String url="jdbc:mysql://localhost:3306/company";
    String userName="root";
    String passWord="Cutepixal@2023";

    public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String action=request.getParameter("action");
        switch (action) {
            case "Create":
                this.CreateEmployee(request);
                response.getWriter().println("Created Successfully !");
            break;

            case "Update" :
                this.updateEmployee(request);
                response.getWriter().println("Updated Successfully !");
            break;

            case "Delete":
                this.deleteEmployee(request);
                response.getWriter().println("Deleted Successfully !");
            break;

            default:
                response.getWriter().println("Sorry... Something went wrong");
            break;
        }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        
        List<Employee> employee = this.printEmployee(request);
        if(employee !=null)
        {
            request.setAttribute("PrintEmployee", employee);
        }
        else{
            response.getWriter().println("Employee is empty");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("printEmployee.jsp");
        dispatcher.forward(request, response);
    }

    public void CreateEmployee(HttpServletRequest request) {
        Employee employee = new Employee();
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, passWord);
    
            String insertQuery = "INSERT INTO employeeinfo VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
    
            preparedStatement.setString(1, request.getParameter("empId"));
            preparedStatement.setString(2, request.getParameter("empName"));
            int age = Integer.parseInt(request.getParameter("empAge"));
            int salary = Integer.parseInt(request.getParameter("empSalary"));
            preparedStatement.setInt(3, age);
            preparedStatement.setInt(4, salary);
            preparedStatement.setString(5, request.getParameter("empPhone"));
    
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public List<Employee> printEmployee(HttpServletRequest request)
    {
        
        List<Employee> employees = new ArrayList<>();
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, passWord);
            Statement statement = connection.createStatement();
            String viewQuery="SELECT * FROM employeeinfo";
            ResultSet rs = statement.executeQuery(viewQuery);
           
            while (rs.next()) {
               
                Employee emp = new Employee();
                emp.setId(rs.getString(1));
                emp.setName(rs.getString(2));
                emp.setAge(rs.getInt(3));
                emp.setSalary(rs.getInt(4));
                emp.setPhone(rs.getString(5));

                employees.add(emp);
                
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return employees;
        }

        public void updateEmployee(HttpServletRequest request)
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, userName, passWord);
                Statement statement = connection.createStatement();

                String updateQuery = "UPDATE employeeinfo SET id='" + request.getParameter("empId") + "', employeeName='"
                + request.getParameter("empName") + "', age=" + Integer.parseInt(request.getParameter("empAge"))
                + ", salary=" + Integer.parseInt(request.getParameter("empSalary")) + ", phone='"
                +request.getParameter("empPhone") + "' WHERE id='"
                + request.getParameter("updateId") + "'";

                statement.executeUpdate(updateQuery);
            }
            catch(Exception exp)
            {
                exp.printStackTrace();
            }
        }

        public void deleteEmployee(HttpServletRequest request)
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(url, userName, passWord);
                Statement statement = connection.createStatement();

                String deleteQuery = "DELETE FROM employeeinfo WHERE id='"+request.getParameter("updateId")+"'";
                statement.executeUpdate(deleteQuery);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }

