package com.lxisoft.servlets;

import java.sql.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

public class AddVegetableServlet extends HttpServlet {






public void doPost(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException
{
	

response.setContentType("text/html");
String name = request.getParameter("name");
String price = request.getParameter("price");
String stock= request.getParameter("stock");
String minOrderQuantity = request.getParameter("minOrderQuantity");

int i = 0;

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	   
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
    
    PreparedStatement ps = con.prepareStatement("insert into vegetablestore(name,price,stock,minOrderQuantity) values(?,?,?,?)");

    ps.setString(1,name);
    
    ps.setString(2,price);
ps.setString(3,stock);
ps.setString(4,minOrderQuantity);


i = ps.executeUpdate();
	
}catch (Exception e) {

e.printStackTrace();

}

if(i>0) {
	System.out.println("data");
}
else {
	System.out.println("no data");
}


}
}





