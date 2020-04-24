package com.rahul.servlet;
import com.rahul.model.*;
import com.rahul.repository.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddAffidavitData extends HttpServlet
{
	Model affidavit = new Model();
	Database db = new Database();
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		String nameRmp = request.getParameter("name");
		String phnoRmp = request.getParameter("phno");
		String adressRmp = request.getParameter("adr");
		String vehicleNoRmp = request.getParameter("vno");
		String vehicleTypeRmp = request.getParameter("vtype");
		String startRmp = request.getParameter("startLoc");
		String endRmp = request.getParameter("endLoc");
		String sDateRmp = request.getParameter("startDate");
		String eDateRmp= request.getParameter("endDate");
		String coNameRmp = request.getParameter("coName");
		String relationRmp = request.getParameter("relation");
		String reasonRmp = request.getParameter("reason");
		String startTimeRmp = request.getParameter("startTime");
		String endTimeRmp = request.getParameter("endTime");


		affidavit.setNameRmp(nameRmp);
		affidavit.setCopassengerRmp(coNameRmp);
		affidavit.setRelationRmp(relationRmp);
		affidavit.setReasonRmp(reasonRmp);
		affidavit.setPhnoRmp(phnoRmp);
		affidavit.setAddressRmp(adressRmp);
		affidavit.setVehicleNoRmp(vehicleNoRmp );
		affidavit.setVehivleTypeRmp(vehicleTypeRmp);
		affidavit.setStartLocRmp(startRmp);
		affidavit.setEndLocRmp(endRmp);
		affidavit.setStartDateRmp(sDateRmp);
		affidavit.setEndDateRmp(eDateRmp);
		affidavit.setStartTimeRmp(startTimeRmp);
		affidavit.setEndTimeRmp(endTimeRmp);

		db.insertData(affidavit);
		response.sendRedirect("../reqSuccessMsg.jsp");


	}
}
