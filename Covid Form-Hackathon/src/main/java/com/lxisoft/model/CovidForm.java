package com.lxisoft.model;
public class CovidForm
{
	private String name;
	private String phno;
	private String type;
	private String address;
	private String numberofPeople;

	public void setName(String name)
	{
		this.name=name;
	} 
	public void setPhoneNumber(String phno)
	{
		this.phno=phno;

	}
	public void setFunctionType(String type)
	{
		this.type=type;

	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setNumberOfPeople(String numberofPeople)
	{
		this.numberofPeople=numberofPeople;
	}

	public String getName()
	{
		return name;
	}
	public String getPhoneNumber()
	{
		return phno;
	}
	public String getFunctionType()
	{
		return type;
	}
	public String getAddress()
	{
		return address;
	}
	public String getNumberOfPeople()
	{
		return numberofPeople;
	}

}