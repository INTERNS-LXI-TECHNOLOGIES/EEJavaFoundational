package com.lxisoft.app;

import java.util.*;
import java.sql.PreparedStatement;
import java.sql.*;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ReadServlet")
public class ReadServlet extends HttpServlet {

    Contact contact = new Contact();

    String url = "jdbc:mysql://localhost:3306/contacts";
    String password = "root";
    String username = "root";

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        readContact(request, response);
    }

    public void readContact(HttpServletRequest request, HttpServletResponse response) {
        try {
List<Contact> contacts =new ArrayList<>();
Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM contactinfo" ;

            PreparedStatement prep = connection.prepareStatement(query);
            ResultSet rs = prep.executeQuery();


            while (rs.next()){
                Contact contact = new Contact();
                contact.setName(rs.getString("name"));
                contact.setPhoneNo(rs.getString("phoneNo"));
                contacts.add(contact);
            }
            request.setAttribute("contacts", contacts);


            RequestDispatcher dispatch = request.getRequestDispatcher("in.jsp");
            dispatch.forward(request, response);
            prep.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
