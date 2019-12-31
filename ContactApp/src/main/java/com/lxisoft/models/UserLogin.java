package com.lxisoft.models;
	/**
	 * class UserLogin model to set and get username  and password
	 */
public class UserLogin
{
	private String username;
	private String password;
	/**
	 * set username of login
	 *@param username username
	 */
	public void setUsername(String username)
	{
		this.username=username;
	}
	/**
	 * get username of login
	 */
	public void getUsername()
	{
		return this.username;
	}
	/**
	 * set password of login
	 *@param password password
	 */
	public void setPassword(String password)
	{
		this.password=password;
	}
	/**
	 * get password of login
	 */
	public void getPassword()
	{
		return this.password;
	}
}