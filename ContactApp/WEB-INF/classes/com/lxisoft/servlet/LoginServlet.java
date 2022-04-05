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
public class LoginServlet extends HttpServlet{

     private static final long serialVersionUID = 1L;

private UserDAO userDAO;

public LoginServlet(){
     this.userDAO = new UserDAO(MyConnectionProvider.getConnection());
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        try {



          String logemail = request.getParameter("email");
          String logpass = request.getParameter("password");
          
         
          User user = userDAO.logUser(logemail, logpass);
          
          if(user!=null){
              HttpSession session = request.getSession();
              session.setAttribute("logUser", user);
              response.sendRedirect("view/welcome.jsp");
          }else{
              System.out.println("user not found");
          }




     } catch (IOException ex) {
          System.out.println(ex);
                      //   throw new ServletException(ex);
          
                     }
               }
}
