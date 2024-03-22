        package com.lxisoft.app;
        import java.io.IOException;
        import java.io.PrintWriter;
        import jakarta.servlet.ServletException;
        import jakarta.servlet.annotation.WebServlet;
        import jakarta.servlet.http.HttpServlet;
        import jakarta.servlet.http.HttpServletRequest;
        import jakarta.servlet.http.HttpServletResponse;
        import java.sql.*;
        import jakarta.servlet.RequestDispatcher;
        import java.util.*;

        @WebServlet("/ContactServlet")
        public class ContactServlet extends HttpServlet {
            String url = "jdbc:mysql://localhost:3306/contact";
            String userName = "root";
            String password = "Arshaf@12345";

            Contact contact = new Contact();

            public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.setContentType("text/html");
                PrintWriter out = resp.getWriter();
                String select = req.getParameter("select");
                switch (select) {
                    case "create":
                        create(req, resp);
                        resp.getWriter().println("contact created");
                        out.println("<p><a href=\"ContactDetails.jsp\">Back to contact Details</a></p>");
                        break;

                    case "read":
                        doGet(req, resp);
                        resp.getWriter().println("contact created");
                        out.println("<p><a href=\"ContactDetails.jsp\">Back to contact Details</a></p>");
                        break;

                    case "update":
                        update(req, resp);
                        resp.getWriter().println("updated");
                        out.println("<p><a href=\"ContactDetails.jsp\">Back to contact Details</a></p>");
                        break;

                    case "delete":
                        delete(req, resp);
                        resp.getWriter().println("Deleted");
                        out.println("<p><a href=\"ContactDetails.jsp\">Back to contact Details</a></p>");
                        break;
                }
            }

            public void create(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
            {
                contact.setName(req.getParameter("name"));
                contact.setNumber(req.getParameter("number"));
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, userName, password);
                    String insert = "INSERT INTO contactinfo (name,number) VALUES(?,?)";
                    try {
                        PreparedStatement statement = connection.prepareStatement(insert);
                        statement.setString(1, contact.getName());
                        statement.setString(2, contact.getNumber());
                        statement.executeUpdate();
                    } catch (SQLException e)
                    {
                        e.printStackTrace();
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                //resp.sendRedirect("ContactServlet");
            }

            public void update(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
            {
                contact.setName(req.getParameter("name"));
                contact.setNumber(req.getParameter("number"));

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, userName, password);
                    String contactInfo = "update  contactinfo set name= ? where number = ?";
                    try {
                        PreparedStatement statement = connection.prepareStatement(contactInfo);
                        statement.setString(1, contact.getName());
                        statement.setString(2, contact.getNumber());

                        statement.executeUpdate();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                catch(Exception e)

                {
                    e.printStackTrace();
                }
            }
            public void delete(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException
            {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, userName, password);
                    String delete = "DELETE FROM contactinfo where number = ?";
                    PreparedStatement statement = connection.prepareStatement(delete);
                    int number = Integer.parseInt(req.getParameter("number"));
                    statement.setInt(1,number);
                    statement.executeUpdate();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

            public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                int start = 0;
                String st = req.getParameter("no");
                int constant = 2;


                while (st != null && !st.isEmpty()) {
                    try {
                        start = Integer.parseInt(st) * 2;
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }


                List<Contact> list = new ArrayList<>();
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, userName, password);
                    String insert = "select * from contactinfo limit ?,?";
                    try {
                        PreparedStatement statement = connection.prepareStatement(insert);
                        statement.setInt(1, start);
                        statement.setInt(2, constant);
                        ResultSet read = statement.executeQuery();
                        while (read.next()) {
                            Contact contact = new Contact();

                            contact.setName(read.getString("name"));
                            contact.setNumber(read.getString("number"));
                            list.add(contact);
                        }
                        req.setAttribute("contact", list);
                        RequestDispatcher dis = req.getRequestDispatcher("ContactRead.jsp");
                        dis.forward(req, resp);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }