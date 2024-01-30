package com.divisosoft.carproject;

public class Car
{
	private String name;
	private String color;
	public Steering steer;
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Car() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return " name: " + name + " color=" + color;
	}
	
	
	
}