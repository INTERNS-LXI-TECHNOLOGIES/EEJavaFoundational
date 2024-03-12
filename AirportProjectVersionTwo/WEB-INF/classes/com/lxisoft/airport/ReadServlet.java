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
    String url; 
    String user;
    String pass;

    public void init(){
         url = "jdbc:mysql://localhost:3306/airport";
         user = "root";
         pass = "Jayaram"; 

   
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {

        int start = 0;
        String paramValue = request.getParameter("pagination");
        if (paramValue != null && !paramValue.isEmpty()) {
            start = Integer.parseInt(paramValue) * 10;
        }

        String endd = request.getParameter("fi");
        if(endd != null && !endd.isEmpty()) { 
                start = Integer.parseInt(endd) * 10;    
        }
        
        int count = 10;

        String sorted="ASC";
        String sortOrderParam = request.getParameter("sorted");
        if (sortOrderParam != null && !sortOrderParam.isEmpty()) {
            sorted = sortOrderParam;
        }

try
{
    List<Airport> lis = new ArrayList<>();
            
        String query = " select * from airportinfo order by name " + sorted + " limit ?,? ";
        Connection con = DriverManager.getConnection(url, user, pass);
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