package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.model.*;
import com.lxisoft.Repository.*;
import java.util.*;
import java.sql.*;

public class AddServlet extends HttpServlet 
{
	private MySqlRepository repo=new MySqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{
        W_Dictionary newword= new W_Dictionary();
              newword.setWord(request.getParameter("word"));
              newword.setMeaning(request.getParameter("meaning"));
              ArrayList<W_Dictionary> dictionary=repo.getAllWords();
              repo.insertDetails(newword);
              response.sendRedirect("view");

              
         }catch(Exception n)
         {
           n.printStackTrace();
         }
  	}
  }