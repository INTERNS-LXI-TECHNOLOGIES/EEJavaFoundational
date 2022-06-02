package com.lxisoft.model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import com.lxisoft.model.Word;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class DictionaryServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {

        List<Word> words = new ArrayList <Word>();
               try {
                   Class.forName("com.mysql.cj.jdbc.Driver");

                   Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft", "root", "root");

                   Statement stmt = sql.createStatement();

                   ResultSet rst = stmt.executeQuery("select * from dictionary;");

                   while (rst.next()) {

                       words.add(new Word(rst.getString(1), rst.getString(2)));
                   }
                       request.setAttribute ("words", words);

                       RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/dictionary.jsp");
                       requestDispatcher.forward(request, response);

               }
                   catch (Exception ex) {
                   ex.printStackTrace();
               }

            }
    }
        
