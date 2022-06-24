package com.lxisoft.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import com.lxisoft.dao.VegetableDao;
import com.lxisoft.vegetable.Vegetable;


public class UpDateVegetableServlet extends HttpServlet {


 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException{

try{

	int id = Integer.parseInt(request.getParameter("id"));

      
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
    
    Statement st = con.createStatement();
    
    ResultSet rs = st.executeQuery("select * from vegetablestore where no =?");

    while(rs.next()) {
      
 String name = rs.getString(2);
 String price = rs.getString(3);
 String stock = rs.getString(4);
 String orderQuantity = rs.getString(5);

Vegetable vegetable = new Vegetable(name,price,stock,orderQuantity);

System.out.println(name+price+stock+orderQuantity);

request.setAttribute("vegetable",vegetable);
  RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/upDateVegetable.jsp");
        requestDispatcher.forward(request, response);
    }
}catch(Exception e) {
e.printStackTrace();

}


}

}