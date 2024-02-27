package com.divisosoft.company;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.smartcardio.ResponseAPDU;

//import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

@WebServlet("/Employeeservlet")
public class Employeeservlet extends HttpServlet{

    String url = "jdbc:mysql://localhost:3306/companydata";
    String username="root";
    String password = "Magesh@96";

    public void doPost(HttpServletRequest request,HttpServletResponse response){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);

            if(request.getParameter("option").equals("addemployee")){
                Employee employee =createEmployee(request,response);
                Statement statement = connection.createStatement();
                String addEmploye = "insert into employeetable (name,salary) values(?,?)";         
                PreparedStatement psAddEmploye = connection.prepareStatement(addEmploye);
                //psAddEmploye.setInt(1,1);
                psAddEmploye.setString(1,employee.getEmployeName());
                psAddEmploye.setString(2,Integer.toString(employee.getSalary()));
                psAddEmploye.executeUpdate();
            }
           /*else{
                response.getWriter().println("not added");
            } */ 

            if(request.getParameter("option").equals("updateemployee")){
                String updateEmploye = "UPDATE employeetable SET salary =? WHERE name=?";
                PreparedStatement psUpdateEmployee = connection.prepareStatement(updateEmploye);
                psUpdateEmployee.setInt(1,Integer.parseInt((request.getParameter("employesalary"))));
                psUpdateEmployee.setString(2,(request.getParameter("employename")));   
                psUpdateEmployee.executeUpdate();

            }
            /*else{
                response.getWriter().println("not updated");
            }*/


            if(request.getParameter("option").equals("reademploye")){
                String readStatement = "SELECT * FROM employeetable WHERE name=?";
                PreparedStatement psReademployee = connection.prepareStatement(readStatement);
                psReademployee.setString(1,request.getParameter("employename"));
                ResultSet resultset = psReademployee.executeQuery();
                while(resultset.next()){
                response.getWriter().println("id : "+resultset.getInt(1));
                response.getWriter().println("name : "+resultset.getString(2));
                response.getWriter().println("salary : "+resultset.getInt(3));
               }
            }


            if(request.getParameter("option").equals("deleteemploye")){
                String deleteStatement = "DELETE FROM employeetable WHERE name=?";
                PreparedStatement psDeleteemployee = connection.prepareStatement(deleteStatement);
                psDeleteemployee.setString(1,request.getParameter("employename"));
                psDeleteemployee.executeUpdate();
            }
            
            
         }
         catch(Exception e){
            e.printStackTrace();
        }
    }

    public Employee createEmployee(HttpServletRequest request,HttpServletResponse response){
        Employee emp = new Employee();
        emp.setEmployeName(request.getParameter("employename"));
        emp.setSalary(Integer.parseInt(request.getParameter("employesalary")));
        return emp;
    }
    
}