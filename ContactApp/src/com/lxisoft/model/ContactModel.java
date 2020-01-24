package com.lxisoft.model;
public class ContactModel
{
	private String name;
	private long mob;
	private int id;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMob(long mob)
	{
		this.mob=mob;
	}
	public long getMob()
	{
		return mob;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
}