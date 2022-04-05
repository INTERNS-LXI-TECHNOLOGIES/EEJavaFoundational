package com.lxisoft.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import java.sql.SQLException;


import com.lxisoft.dao.MyConnectionProvider;
import com.lxisoft.dao.UserDAO;
import com.lxisoft.model.User;

import java.io.IOException;

public class RegisterServlet extends HttpServlet{

     private static final long serialVersionUID = 1L;

     private UserDAO userDAO;

public RegisterServlet(){
     this.userDAO = new UserDAO(MyConnectionProvider.getConnection());
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        try {

       // System.out.println("contact servlet: doPost");
       String name = request.getParameter("name");
       String email = request.getParameter("email");
       String password = request.getParameter("password");

       User newUser = new User(name, email, password );



       if ( userDAO.saveUser(newUser)) {
          response.sendRedirect("index.jsp");
       } else {
           String errorMessage = "User Available";
           HttpSession regSession = request.getSession();
           regSession.setAttribute("RegError", errorMessage);
           response.sendRedirect("register.jsp");
           }


        } catch (IOException ex) {
System.out.println(ex);
            //   throw new ServletException(ex);

           }
     }


    /* private void printSQLException(SQLException ex) {
          for (Throwable e: ex) {
              if (e instanceof SQLException) {
                  e.printStackTrace(System.err);
                  System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                  System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                  System.err.println("Message: " + e.getMessage());
                  Throwable t = ex.getCause();
                  while (t != null) {
                      System.out.println("Cause: " + t);
                      t = t.getCause();
                  }
              }
          }
      }*/





}


























































