package com.lxisoft.school;

import java.util.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Blob;
import java.sql.DriverManager;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@WebServlet("/Read")


public class Read extends HttpServlet
{ 
    String url;
    String name;
    String pass;


public void init()
{
    url = "jdbc:mysql://localhost:3306/school";
    name = "root";
    pass = "Jayaram";
}

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        List<School> list = new ArrayList<>();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try{
        Connection con = DriverManager.getConnection(url,name,pass);
        String query = "select * from schoolinfo";
        PreparedStatement pre = con.prepareStatement(query);
        ResultSet re = pre.executeQuery();

        while(re.next())
        {
             
            School school = new School();
            InputStream in = null ;
            Blob b = re.getBlob("img");
                school.setId(re.getInt("id"));
                school.setName(re.getString("name"));
                in = b.getBinaryStream();
                school.setInputstream(in);
                list.add(school);
        }
        request.setAttribute("list", list);
        RequestDispatcher ree = request.getRequestDispatcher("/output.jsp");
        ree.forward(request,response);
        }

        catch(Exception e)
        {
                e.printStackTrace();
        }

    }
}