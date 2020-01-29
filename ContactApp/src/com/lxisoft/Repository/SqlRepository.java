package com.lxisoft.Repository;
import java.sql.*;
public class SqlRepository
{
	Connection con = null;
	PreparedStatement ps = null;
	public void databaseConnectionEstablishment()
	{
		try
		{
			if(con == null)
			{

			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}