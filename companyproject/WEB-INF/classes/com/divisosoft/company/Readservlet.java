package com.divisosoft.company;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/Readservlet")
public class Readservlet extends HttpServlet{
    List<String> dataList = new ArrayList<>();
    String url = "jdbc:mysql://localhost:3306/companydata";
    String username = "root";
    String password = "Magesh@96";

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        
        
        try{
        PrintWriter out = response.getWriter();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cnct = DriverManager.getConnection(url,username,password);
        
        Statement stmt = cnct.createStatement();
        //String read ="SELECT * FROM companytable";
        //PreparedStatement ps = cnct.prepareStatement(url);
    
        ResultSet rs = stmt.executeQuery("SELECT name,place FROM companytable");

            while(rs.next()){
             String na = rs.getString("name");
             String pl = rs.getString("place");
                out.println( na+" "+pl);
                String dataToAdd = na+pl;
                dataList.add(dataToAdd);
            }
            request.setAttribute("datalist", dataList);
            RequestDispatcher rd = request.getRequestDispatcher("readoutput.jsp");
            rd.forward(request, response);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        // request.setAttribute("datalist", dataList);



    }
}