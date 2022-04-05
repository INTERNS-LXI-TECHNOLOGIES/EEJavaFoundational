package com.lxisoft.dao;

import java.sql.*;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.lxisoft.model.*;
public class ContactDAO implements MyProvider{
     
    /* private String jdbcURL ="jdbc:mysql://localhost:3306/lxisoft";
     private String jdbcUsername ="root";
     private String jdbcPassword ="root";*/

     private static final String INSERT_USERS_SQL = "INSERT INTO contacts" + "(f_name, l_name, ph_no, email)VALUES" + "(? ,? ,? ,?);";
     private static final String SELECT_USER_BY_ID = "select f_name, l_name, ph_no, email, sl_no from contacts where sl_no =?";
     private static final String SELECT_ALL_USERS = "select * from contacts";
     private static final String DELETE_USERS_SQL = "delete from contacts where sl_no = ?;";
     private static final String UPDATE_USERS_SQL = "update contacts set f_name = ?,l_name= ?, ph_no =?,email= ? where sl_no = ?;";

     public ContactDAO(){}

     protected Connection getConnection() {
          Connection connection = null;
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
          } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          } catch (ClassNotFoundException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
          return connection;
      }
      //create or insert contacts
      public void insertContact(Contact user) throws SQLException {
          System.out.println(INSERT_USERS_SQL);
          // try-with-resource statement will auto close the connection.
          try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
              preparedStatement.setString(1, user.getFirstName());
              preparedStatement.setString(2, user.getLastName());
              preparedStatement.setString(3, user.getPhNumber());
              preparedStatement.setString(4, user.getEmail());
              System.out.println(preparedStatement);
              System.out.println("\nContact to be inserted: "+user);
              preparedStatement.executeUpdate();
          } catch (SQLException e) {
              printSQLException(e);
             //e.printStackTrace();
          }
      }
      //select contacts by id
      public Contact selectContact(int id) {
          Contact user = null;
          // Step 1: Establishing a Connection
          try (Connection connection = getConnection();
              // Step 2:Create a statement using connection object
              PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
              preparedStatement.setInt(1, id);
              System.out.println(preparedStatement);
              // Step 3: Execute the query or update query
              ResultSet rs = preparedStatement.executeQuery();
  
              // Step 4: Process the ResultSet object.
              while (rs.next()) {
                  String name1 = rs.getString(1);
                  String name2 = rs.getString(2);
                  String phn = rs.getString(3);
                  String mail = rs.getString(4);
                  user = new Contact(id, name1, name2, phn, mail);
              }
          } catch (SQLException e) {
              printSQLException(e);
            // e.printStackTrace();

          }
          return user;
      }

      //select contacts
      public List < Contact > selectAllContacts() {

          // using try-with-resources to avoid closing resources (boiler plate code)
          List < Contact > users = new ArrayList < > ();
          // Step 1: Establishing a Connection
          try (Connection connection = getConnection();
  
              // Step 2:Create a statement using connection object
              PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
              System.out.println(preparedStatement);
              // Step 3: Execute the query or update query
              ResultSet rs = preparedStatement.executeQuery();
  
              // Step 4: Process the ResultSet object.
              while (rs.next()) {
                  int id = rs.getInt(5);
                  String name1 = rs.getString(1);
                  String name2 = rs.getString(2);
                  String phn = rs.getString(3);
                  String mail = rs.getString(4);
                  users.add(new Contact(id, name1, name2, phn, mail));
              }
          } catch (SQLException e) {
             printSQLException(e);
            // e.printStackTrace();

          }
          return users;
      }
      //delete contacts
      public boolean deleteContact(int id) throws SQLException {
          boolean rowDeleted;
          try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
              statement.setInt(1, id);
              rowDeleted = statement.executeUpdate() > 0;
          }
          return rowDeleted;
      }

     //update contacts
      public boolean updateContact(Contact user) throws SQLException {
          boolean rowUpdated;
          try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
             
              statement.setString(1, user.getFirstName());
              statement.setString(2, user.getLastName());
              statement.setString(3, user.getPhNumber());
              statement.setString(4, user.getEmail());
              statement.setInt(5, user.getId());
  System.out.println("contact"+user);
              rowUpdated = statement.executeUpdate() > 0;
          }
          return rowUpdated;
      }

      private void printSQLException(SQLException ex) {
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
      }

     }



