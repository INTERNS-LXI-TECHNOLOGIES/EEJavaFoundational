package com.lxisoft.carshowroom.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.carshowroom.dao.CarDAO;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CarDAO carDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		carDAO = new CarDAO(jdbcURL, jdbcUsername, jdbcPassword);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/create":
				createCar(request, response);
				break;
			case "/insert":
				insertCar(request, response);
				break;
			case "/delete":
				deleteCar(request, response);
				break;
			case "/edit":
				editCar(request, response);
				break;
			case "/update":
				updateCar(request, response);
				break;
			default:
				home(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void createCar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("createOrUpadateCar.jsp");
		dispatcher.forward(request, response);
	}

	private void insertCar(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void deleteCar(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void editCar(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void updateCar(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		List<Car> carList = carDAO.listAllCars();
		request.setAttribute("carList", carList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}
}
