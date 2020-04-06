package com.mockexam.model;
public class User
{
	private int id;
	private String username;
	private String password;
	private String role;
	private int score;
	public void setId(int id)
	{
		this.id = id;
	}
	public void getId()
	{
		return id;
	}
	public void setUserName(String uname)
	{
		this.username = uname;
	}
	public void getUserName()
	{
		return username;
	}

	public void setPassword(String pass)
	{
		this.password = pass;
	}
	public void getPassword()
	{
		return password;
	}

	public void setRole(String role)
	{
		this.role = role;
	}
	public void getRole()
	{
		return role;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public void getScore()
	{
		return score;
	}

}