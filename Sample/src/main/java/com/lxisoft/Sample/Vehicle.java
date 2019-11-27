package com.lxisoft.Sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle
{
	
	private Integer vehicleNo;
	private String vehicleName;
	public Integer getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(Integer vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	@ManyToOne
	private User user;
	public User getUser() {
		return user;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(Integer vehicleNo, String vehicleName, User user) {
		super();
		this.vehicleNo = vehicleNo;
		this.vehicleName = vehicleName;
		this.user = user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}