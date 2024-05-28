package com.lxisoft.profile;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Users")
public class Users extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
 
        boolean isAdmin = request.isUserInRole("admin");
        boolean isIntern =request.isUserInRole("intern");

        request.setAttribute("isAdmin", isAdmin);
       
        request.setAttribute("isIntern", isIntern);
        
       RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
       dispatcher.forward(request, response);
     
        }
    }
  
