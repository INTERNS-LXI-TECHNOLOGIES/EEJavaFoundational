package com.lxisoft.airport;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.util.*;

@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet
{
    String url = "jdbc:mysql://localhost:3306/airport";
    String user = "root";
    String pass = "Jayaram"; 
    

    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {

        int start = 0;
        String paramValue = request.getParameter("pagination");
        if (paramValue != null && !paramValue.isEmpty()) {
            start = Integer.parseInt(paramValue) * 10;
        }
        int count = 10;



try
{
    List<Airport> lis = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection(url,user,pass);
        
        String query = "select * from airportinfo limit ?,? ";
        PreparedStatement pre = con.prepareStatement(query);
        pre.setInt(1,start);
        pre.setInt(2,count);
        ResultSet re = pre.executeQuery();

        while(re.next())
        {
       
        Airport air =new Airport();
            air.setSlNo(re.getInt("slno"));
            air.setName(re.getString("name"));
            air.setGpsCode(re.getString("gpsCode"));
            air.setId(re.getInt("id"));
            
            lis.add(air);

        }
       request.setAttribute("airr",lis);
       RequestDispatcher  req = request.getRequestDispatcher("Result.jsp");
       req.forward(request,response);

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }

}