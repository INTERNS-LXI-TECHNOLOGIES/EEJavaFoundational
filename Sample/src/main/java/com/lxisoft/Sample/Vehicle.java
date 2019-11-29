package com.lxisoft.Sample;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Vehicle
{
	@Id
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
	@JoinColumn(name="vNo")
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	
}