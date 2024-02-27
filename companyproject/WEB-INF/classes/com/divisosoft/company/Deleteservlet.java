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
import java.sql.Statement;
import java.sql.SQLException;
import javax.smartcardio.ResponseAPDU;

@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet{

    String url = "jdbc:mysql://localhost:3306/companydata";
    String username = "root";
    String password = "Magesh@96";

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{
        
        String nameToDelete = request.getParameter("nametodelete");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection  = DriverManager.getConnection(url,username,password);
            String deleteQuery = "DELETE FROM companytable WHERE name =?";
                try{
                    PreparedStatement delPrepStmnt = connection.prepareStatement(deleteQuery);
                    delPrepStmnt.setString(1,nameToDelete);
                    delPrepStmnt.executeUpdate();
                    }
                catch(Exception e){
                    e.printStackTrace();
                    }
            }
        catch (Exception e) {
            e.printStackTrace();
        }
        response.getWriter().println("Deleted Successfully !");

    }

}