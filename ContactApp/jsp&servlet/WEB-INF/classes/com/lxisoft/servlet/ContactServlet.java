package com.lxisoft.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.dao.*;
import com.lxisoft.model.*;

public class ContactServlet extends HttpServlet{
     
     private static final long serialVersionUID = 1L;
     private ContactDAO contactDAO;

     public ContactServlet(){
          this.contactDAO = new ContactDAO();
     }


     protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
        try {
        System.out.println("contact servlet: doPost");
        insertContact(request, response);
        } catch (SQLException ex) {
               throw new ServletException(ex);
           }
     }

     protected void doPut(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException{
         try {
        System.out.println("contact servlet: doPut");
         updateContact(request, response);
         } catch (SQLException ex) {
               throw new ServletException(ex);
           }
     }

     protected void doGet(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
          String action = request.getServletPath();

          try {
          switch (action) {
               case "/new":
                   showNewForm(request, response);
                   break;
               case "/insert":
                   insertContact(request, response);
                   break;
               case "/delete":
                   deleteContact(request, response);
                   break;
               case "/edit":
                   showEditForm(request, response);
                   break;
               case "/update":
                   updateContact(request, response);
                   break;
               default:
                   listContact(request, response);
                   break;
           }
          } catch (SQLException ex) {
               throw new ServletException(ex);
           }
          }

          private void listContact(HttpServletRequest request, HttpServletResponse response)
          throws SQLException, IOException, ServletException {
              List < Contact > listUser = contactDAO.selectAllContacts();
              request.setAttribute("listUser", listUser);
              RequestDispatcher dispatcher = request.getRequestDispatcher("contact-list.jsp");
              dispatcher.forward(request, response);
          }


           private void showNewForm(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
               RequestDispatcher dispatcher = request.getRequestDispatcher("contact-form.jsp");
               dispatcher.forward(request, response);
           }

           private void showEditForm(HttpServletRequest request, HttpServletResponse response)
           throws SQLException, ServletException, IOException {
               int id = Integer.parseInt(request.getParameter("id"));
               Contact existingUser = contactDAO.selectContact(id);
               RequestDispatcher dispatcher = request.getRequestDispatcher("contact-form.jsp");
               request.setAttribute("user", existingUser);
               dispatcher.forward(request, response);
       
           }

           private void insertContact(HttpServletRequest request, HttpServletResponse response)
           throws SQLException, IOException {
               String firstName = request.getParameter("f_name");
               String lastName = request.getParameter("l_name");
               String phNumber = request.getParameter("ph_no");
               String email = request.getParameter("email");

               Contact newUser = new Contact(firstName, lastName, phNumber, email);
               System.out.println("Contact: "+ newUser);
               contactDAO.insertContact(newUser);
               response.sendRedirect("list");
           }

           private void updateContact(HttpServletRequest request, HttpServletResponse response)
           throws SQLException, IOException {
               int id = Integer.parseInt(request.getParameter("id"));
               String firstName = request.getParameter("f_name");
               String lastName = request.getParameter("l_name");
               String phNumber = request.getParameter("ph_no");
               String email = request.getParameter("email");
                
               Contact updateUser = new Contact(id, firstName, lastName, phNumber, email);
               System.out.println("Contact: "+updateUser);
               contactDAO.updateContact(updateUser);
               response.sendRedirect("list");
           }

           private void deleteContact(HttpServletRequest request, HttpServletResponse response)
           throws SQLException, IOException {
               int id = Integer.parseInt(request.getParameter("id"));
               contactDAO.deleteContact(id);
               response.sendRedirect("list");
       
           }





     }





















