package com.lxisoft.airport;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet
{
String url = "jdbc:mysql://localhost:3306/airport";
String user = "root";
String pass = "Jayaram"; 

public void doPost(HttpServletRequest Request,HttpServletResponse response)throws IOException{
 Airport air = new Airport();
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection(url,user,pass);
        
        String query = "insert into airportinfo (slno,name,gpsCode,id) values(?,?,?,?)";
        PreparedStatement pre = con.prepareStatement(query);
  try(BufferedReader buff = new BufferedReader(new FileReader("D:\\lxi\\tomcat\\apache-tomcat-10.1.18\\apache-tomcat-10.1.18\\webapps\\AirportProject\\MOCK_DATA (6).csv")))
  {
 String line;
            boolean firstLine = true; 
            while ((line = buff.readLine()) != null) 
			{
                if (firstLine)
					{
                    firstLine = false;
                    continue; 
                }

                String[] fields = line.split(",");
                if (fields.length >= 4) { 
                    air.setSlNo(Integer.parseInt(fields[0]));
                    air.setName(fields[1]);
                    air.setGpsCode(fields[2]);
                    air.setId(Integer.parseInt(fields[3]));
                        
                    pre.setInt(1,air.getSlNo());
                    pre.setString(2,air.getName());
                    pre.setString(3,air.getGpsCode());
                    pre.setInt(4,air.getId());
                    pre.executeUpdate();
                }
            }
        }
   




    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
