package com.lxisoft.dictionary;
import com.lxisoft.dictionary.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class Controldic extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
	        String w = request.getParameter("word");
	        List<String> words=new ArrayList<String>();
	        ModelWords model=new ModelWords();

	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/words","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from words where word ='"+w+"'");
		rs.next();
		model.setWord(rs.getString("word"));
		model.setMean(rs.getString("mean"));
		request.setAttribute("mode",model);
		RequestDispatcher rd = request.getRequestDispatcher("Viewdic.jsp"); 
		rd.forward(request,response);

       } 

    catch(Exception ee){
    	request.setAttribute("mode",null);
		RequestDispatcher rd = request.getRequestDispatcher("Viewdic.jsp"); 
		rd.forward(request,response);
		System.out.println("****Exception*****"+ee);} 
		
    }

   }