package com.lxisoft.dictionary;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.*;
public class ControAdd extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
          PrintWriter out = response.getWriter();
        String n = request.getParameter("word");
        String p = request.getParameter("mean");
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/words", "root", "root");
  
            PreparedStatement ps = con.prepareStatement("insert into (word,mean) values(?,?)");
 
            ps.setString(1, n);
            ps.setString(2, p);

 
            int i = ps.executeUpdate();
            if (i > 0){
                out.print("added...");
                RequestDispatcher rd = request.getRequestDispatcher("Viewdic.jsp"); 
		        rd.forward(request,response);
            }
 
        } catch (Exception e2) {
            System.out.println("***************"+e2);
        }
 
        out.close();
    }
 
}