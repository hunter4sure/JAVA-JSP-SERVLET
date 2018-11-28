package com.bac.awd.dao;

import java.sql.*;


public class Database_Access_Key {
	
	static Connection conn = null;
	static PreparedStatement ps;
	static ResultSet rs;
	
	
	public static Connection Connect() {
		if (conn == null) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AWD", "root", "");

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeResources() throws SQLException 
	{
		if (conn != null)
			conn.close();
		if(ps != null )
			ps.close();
		if(rs != null)
			rs.close();
	}
}
