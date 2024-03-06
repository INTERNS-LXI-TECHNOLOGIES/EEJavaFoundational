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


@WebServlet("/ResultOne")
public class ResultOne extends HttpServlet
{
    String url = "jdbc:mysql://localhost:3306/airport";
    String user = "root";
    String pass = "Jayaram"; 
    

    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
try
{
    Airport ir =new Airport();
    ir.setSlNo(Integer.parseInt(request.getParameter("slno")));

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection(url,user,pass);
        
        String query = "select * from airportinfo where slno=?";
        PreparedStatement pre = con.prepareStatement(query);
        pre.setInt(1,ir.getSlNo());

        ResultSet re = pre.executeQuery();

        while(re.next())
        {
       
            ir.setSlNo(re.getInt("slno"));
            ir.setName(re.getString("name"));
            ir.setGpsCode(re.getString("gpsCode"));
            ir.setId(re.getInt("id"));


        }
       request.setAttribute("airr",ir);
       RequestDispatcher  req = request.getRequestDispatcher("ResultOne.jsp");
       req.forward(request,response);

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }

}