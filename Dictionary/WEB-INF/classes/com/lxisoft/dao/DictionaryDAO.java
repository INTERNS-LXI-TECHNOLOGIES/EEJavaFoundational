package com.lxisoft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.model.Word;

public class DictionaryDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/lxisoft?true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";

    private static final String INSERT_WORDS_SQL = "INSERT INTO dictionary" + "  (Words, Meanings) VALUES "
            + " (?, ?);";

    private static final String SELECT_WORDS_BY_id = "select id,Words,Meanings from dictionary where id =?";
    private static final String SELECT_ALL_WORDS = "select * from dictionary";
    private static final String DELETE_WORDS_SQL = "delete from dictionary where id = ?;";
    private static final String UPDATE_WORDS_SQL = "update dictionary set Words = ?, Meanings = ? where id = ?;";

    public DictionaryDAO() {
    }

    protected Connection getConnection() {
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

    public void insertData(Word dictonary) throws SQLException {
        System.out.println(INSERT_WORDS_SQL);

        try { Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_WORDS_SQL); 
            preparedStatement.setString(1, dictonary.getWord());
            preparedStatement.setString(2, dictonary.getMeaning());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public Word selectData(int id) {
        Word dictionary = null;

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_WORDS_BY_id);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                String Words = rs.getString("Words");
                String Meanings = rs.getString("Meanings");
                dictionary = new Word(id, Words, Meanings);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return dictionary;
    }

    public List <Word> selectAllDatas() {


        List<Word> datas = new ArrayList<>();

        try (Connection connection = getConnection();


             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_WORDS);) {
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();


            while (rs.next()) {
                int id= rs.getInt("id");
                String Words = rs.getString("Words");
                String Meanings = rs.getString("Meanings");
                datas.add(new Word(id, Words, Meanings));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return datas;
    }

    public boolean deleteData(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_WORDS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateData(Word dictionary) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_WORDS_SQL);) {
            System.out.println("updated Words:"+statement);
            statement.setString(1, dictionary.getWord());
            statement.setString(2, dictionary.getMeaning());
            statement.setInt(3, dictionary.getId());

            System.out.println("datas :"+dictionary);
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
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