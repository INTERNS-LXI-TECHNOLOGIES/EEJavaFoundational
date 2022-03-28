package com.lxisoft.carshowroom.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.carshowroom.dao.CarDAO;
import com.lxisoft.carshowroom.model.Car;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CarDAO carDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
		carDAO = new CarDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/insert":
				insertCar(request, response);
				break;
			case "/update":
				updateCar(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/create":
				createCar(request, response);
				break;
			case "/delete":
				deleteCar(request, response);
				break;
			case "/edit":
				editCar(request, response);
				break;
			case "/home":
				home(request, response);
				break;
			case "/logout":
				logout(request, response);
				break;
			default:
				response.sendRedirect("home");
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

	private void insertCar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String manufacturer = request.getParameter("manufacturer");
		String model = request.getParameter("model");
		String variant = request.getParameter("variant");
		int year = Integer.parseInt(request.getParameter("year"));
		int totalKilometers = Integer.parseInt(request.getParameter("totalKilometers"));
		int expectedPrice = Integer.parseInt(request.getParameter("expectedPrice"));
		String otherDetails = request.getParameter("otherDetails");

		Car newCar = new Car();
		newCar.setManufacturer(manufacturer);
		newCar.setModel(model);
		newCar.setVariant(variant);
		newCar.setYear(year);
		newCar.setTotalKilometers(totalKilometers);
		newCar.setExpectedPrice(expectedPrice);
		newCar.setOtherDetails(otherDetails);
		carDAO.insertCar(newCar);
		response.sendRedirect("home");
	}

	private void deleteCar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int carId = Integer.parseInt(request.getParameter("carId"));

		Car car = new Car();
		car.setCarId(carId);
		carDAO.deleteCar(car);
		response.sendRedirect("home");
	}

	private void editCar(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int carId = Integer.parseInt(request.getParameter("carId"));
		Car existingCar = carDAO.getCar(carId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("createOrUpadateCar.jsp");
		request.setAttribute("car", existingCar);
		dispatcher.forward(request, response);

	}

	private void updateCar(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int carId = Integer.parseInt(request.getParameter("carId"));
		String manufacturer = request.getParameter("manufacturer");
		String model = request.getParameter("model");
		String variant = request.getParameter("variant");
		int year = Integer.parseInt(request.getParameter("year"));
		int totalKilometers = Integer.parseInt(request.getParameter("totalKilometers"));
		int expectedPrice = Integer.parseInt(request.getParameter("expectedPrice"));
		String otherDetails = request.getParameter("otherDetails");

		Car car = new Car();
		car.setCarId(carId);
		car.setManufacturer(manufacturer);
		car.setModel(model);
		car.setVariant(variant);
		car.setYear(year);
		car.setTotalKilometers(totalKilometers);
		car.setExpectedPrice(expectedPrice);
		car.setOtherDetails(otherDetails);
		carDAO.updateCar(car);
		response.sendRedirect("home");
	}

	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		List<Car> carList = carDAO.listAllCars();
		request.setAttribute("carList", carList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		dispatcher.forward(request, response);
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("home");
	}
}
