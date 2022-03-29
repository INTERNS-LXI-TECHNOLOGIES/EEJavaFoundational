package com.lxisoft.dao;

import java.sql.*;

public class MyConnectionProvider implements MyProvider{


     public static Connection getConnection() {
          Connection connection = null;
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
          } catch (SQLException e) {
             
              e.printStackTrace();
          } catch (ClassNotFoundException e) {
             
              e.printStackTrace();
          }
          return connection;
      }
}
