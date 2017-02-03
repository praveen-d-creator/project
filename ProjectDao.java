package com.inautix.dao;

import com.inautix.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjectDao {
	// Select Statement
	public void select()
	{
		Connection con=DriverInitAndConnection.getConnection();
		Statement stmt=null;
		ResultSet rs = null;
		try 
			{
				stmt=con.createStatement();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			String searchQuery="select * from T_XBBNHGM_PRODUCT";
			try 
			{
				System.out.println("Contents are..");
				rs=stmt.executeQuery(searchQuery);
				System.out.println(searchQuery);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
	
			finally{
				try {
					if(rs != null)
					rs.close();
					if(stmt != null)					
					stmt.close();				
					con.commit();
					if(con != null)
					con.close();
				}			
				 catch (SQLException e) 
					{
						e.printStackTrace();
					}			
		}
	}
	
	// Update Statement
	public void update(String name, int id)
	{
		Connection con=DriverInitAndConnection.getConnection();
		Statement stmt=null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		String updateQuery="update T_XBBNHGM_PRODUCT set product_description=? where product_id=?";
		try
		{
			System.out.println("Updating Record...");
			pst=con.prepareStatement(updateQuery);
			pst.setString(1, name);
			pst.setInt(2,id );
			pst.executeUpdate();
			System.out.println("Record Updated");
			select();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				if(rs != null)
				rs.close();
				if(stmt != null)					
				stmt.close();				
				con.commit();
				if(con != null)
				con.close();
			}			
			 catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
	}

	// Delete Statement
	public void delete(int id)
	{
		Connection con=DriverInitAndConnection.getConnection();
		PreparedStatement pst = null;
		Statement stmt=null;
		ResultSet rs = null;
		String updateQuery="delete from T_XBBNHGM_PRODUCT where product_id=?";
		try
		{
			System.out.println("Deleting Record...");
			pst=con.prepareStatement(updateQuery);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("Record Deleted");
			select();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			try {
				if(rs != null)
				rs.close();
				if(stmt != null)					
				stmt.close();				
				con.commit();
				if(con != null)
				con.close();
			}			
			 catch (SQLException e) 
				{
					e.printStackTrace();
				}
		}
	}
}