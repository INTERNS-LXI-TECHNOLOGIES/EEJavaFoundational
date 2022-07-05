package com.lxisoft.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.lxisoft.controller.DictionaryServlet.*;
import javax.servlet.http.*;

import com.lxisoft.dao.DictionaryDAO;
import com.lxisoft.model.Word;

//@WebServlet("/")
public class DictionaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DictionaryDAO dictionaryDAO;

    public DictionaryServlet () {
        this.dictionaryDAO = new DictionaryDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet (request, response);
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
                    insertData(request, response);
                    break;
                case "/delete":
                    deleteData(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateData(request, response);
                    break;
                case "/logout":
                    logOut(request, response);
                    break;
                case "/listdata":
                    listData(request, response);
                    break;
                default:
                    response.sendRedirect("listdata");
                    break;

            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Word> listData = dictionaryDAO.selectAllDatas();
        request.setAttribute("listData", listData);
        RequestDispatcher dispatcher = request.getRequestDispatcher("data-list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("data-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Word existingData = dictionaryDAO.selectData(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("data-form.jsp");
        request.setAttribute("data", existingData);
        dispatcher.forward(request, response);

    }

    private void insertData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String words = request.getParameter("word");
        String meaning = request.getParameter("meaning");
        Word newData = new Word(words, meaning);
        System.out.println("Dictionary: "+ newData);
        dictionaryDAO.insertData(newData);
        response.sendRedirect("list");
    }

    private void updateData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String words = request.getParameter("word");
        String meaning = request.getParameter("meaning");

        Word book = new Word(id,words, meaning);
        System.out.println("Dictionary: "+ book);
        dictionaryDAO.updateData(book);
        response.sendRedirect("list");
    }
    private void deleteData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        dictionaryDAO.deleteData(id);
        response.sendRedirect("list");

    }

    private void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("listdata");
    }


}

