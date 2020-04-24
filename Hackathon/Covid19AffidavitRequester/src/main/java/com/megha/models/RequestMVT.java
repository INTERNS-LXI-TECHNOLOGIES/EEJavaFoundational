package com.megha.models;
import java.util.*;
import java.io.*;
public class RequestMVT
{
	private String id;
	private String name;
	private String phnNo;
	private String address;
	private String vehicleNO;
	private String vehicleType;
	private String startingLocation;
	private String destination;
	private String startingTime;
	private String startingDate;
	private String endingTime;
    private String endingDate;
    private String coPassengerName;
    private String relation;
    private String reason;

	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setPhnNo(String phnNo)
	{
		this.phnNo=phnNo;
	}
	public String getPhnNo()
	{
		return phnNo;
	}

	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}

	public void setVehicleNO(String vehicleNO)
	{
		this.vehicleNO=vehicleNO;
	}
	public String getVehicleNO()
	{
		return vehicleNO;
	}

	public void setVehicleType(String vehicleType)
	{
		this.vehicleType=vehicleType;
	}
	public String getVehicleType()
	{
		return vehicleType;
	}

	public void setStartingLocation(String startingLocation)
	{
		this.startingLocation=startingLocation;
	}
	public String getStartingLocation()
	{
		return startingLocation;
	}

	public void setDestination(String answer)
	{
		this.destination=destination;
	}
	public String getDestination()
	{
		return destination;
	}

	public void setStartingTime(String startingTime)
	{
		this.startingTime=startingTime;
	}
	public String getStartingTime()
	{
		return startingTime;
	}
	public void setStartingDate(String startingDate)
	{
		this.startingDate=startingDate;
	}
	public String getStartingDate()
	{
		return startingDate;
	}

	public void setEndingTime(String endingTime)
	{
		this.endingTime=endingTime;
	}
	public String getEndingTime()
	{
		return endingTime;
	}

	public void setEndingDate(String endingDate)
	{
		this.endingDate=endingDate;
	}
	public String getEndingDate()
	{
		return endingDate;
	}

	public void setCoPassengerName(String coPassengerName)
	{
		this.coPassengerName=coPassengerName;
	}
	public String getCoPassengerName()
	{
		return coPassengerName;
	}

	public void setRelation(String relation)
	{
		this.relation=relation;
	}
	public String getRelation()
	{
		return relation;
	}

	public void setReason(String reason)
	{
		this.reason=reason;
	}
	public String getReason()
	{
		return reason;
	}
}