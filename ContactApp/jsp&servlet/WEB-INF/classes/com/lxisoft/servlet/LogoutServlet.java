package com.lxisoft.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.dao.MyConnectionProvider;
import com.lxisoft.dao.UserDAO;
import com.lxisoft.model.User;

import javax.servlet.http.*;
import java.sql.SQLException;
public class LogoutServlet extends HttpServlet{

     private static final long serialVersionUID = 1L;

private UserDAO userDAO;

public LogoutServlet(){
     this.userDAO = new UserDAO(MyConnectionProvider.getConnection());
}


protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        try {

          HttpSession session = request.getSession();
          session.removeAttribute("logUser");
          response.sendRedirect("index.jsp");

     } catch (IOException ex) {
          System.out.println(ex);
                      //   throw new ServletException(ex);
          
                     }
               }

}