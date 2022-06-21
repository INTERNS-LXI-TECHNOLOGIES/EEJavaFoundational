package com.lxisoft.controller;
import com.lxisoft.dao.*;
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
import com.lxisoft.dao.DictionaryDAO;
import com.lxisoft.model.Dictionary;

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
                default:
                    listData(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Dictionary> listData = dictionaryDAO.selectAllDatas();
        request.setAttribute("listData", listData);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/data-list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/data-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Dictionary existingData = dictionaryDAO.selectData(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/data-form.jsp");
        request.setAttribute("data", existingData);
        dispatcher.forward(request, response);

    }

    private void insertData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String words = request.getParameter("word");
        String meaning = request.getParameter("meaning");
        Dictionary newData = new Dictionary(words, meaning);
        System.out.println("Dictionary: "+ newData);
        dictionaryDAO.insertData(newData);
        response.sendRedirect("list");
    }

    private void updateData(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String words = request.getParameter("word");
        String meaning = request.getParameter("meaning");

        Dictionary book = new Dictionary(id,words, meaning);
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

}