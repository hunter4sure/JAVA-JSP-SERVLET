package com.bac.awd.services;

import java.util.ArrayList;
import java.util.List;

import com.bac.awd.dao.Database_Access_Key;
import com.bac.awd.model.Graduate;
import com.bac.awd.repository.I_UserService;
import java.sql.*;

public class GraduateService_Imple implements I_UserService<Graduate> {
	
	Connection conn = null;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public Graduate getUserInfor(Graduate t) {
		
		conn = Database_Access_Key.Connect();
		
		Graduate graduate = null;
		
		try 
		{
			
			ps = conn.prepareStatement("SELECT * FROM GRADUATE WHERE EMAIL = ?");
			ps.setString(1, t.getEmail());
			
			rs = ps.executeQuery();
			
			if(rs.next()) 
			{
				
			  graduate = new Graduate(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));	
			}
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return graduate;
	}

	@Override
	public boolean Authenticate(Graduate t) {
		
		conn = Database_Access_Key.Connect();
		boolean isSuccess = false;

		try 
		{
			ps = conn.prepareStatement("SELECT * FROM GRADUATE WHERE EMAIL= ? AND PASSWORD =?");
		    ps.setString(1, t.getEmail());
		    ps.setString(2, t.getPassword());
		    
		    rs = ps.executeQuery();
		   
		    if(rs.next()) 
		    {
		    	isSuccess =   true;
		    }
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		return isSuccess;
	}

	@Override
	public boolean SignUp(Graduate graduate) {

		conn = Database_Access_Key.Connect();
		boolean isSuccess = false;

		Graduate g = new Graduate();

		try {

			ps = conn.prepareStatement("INSERT INTO GRADUATE(FIRSTNAME, GENDER, DOB) VALUES(?,?,?)");
			ps.setString(1, graduate.getFirstName());
			ps.setString(2, graduate.getGender());
			ps.setString(3, graduate.getDob());
			ps.setString(4, graduate.getEmail());
			ps.setString(5, graduate.getPassword());


			if (ps.executeUpdate() > 0) {
				isSuccess = true;

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isSuccess;
	}

	@Override
	public List<Graduate> getAllUsers() {
		
		List<Graduate> graduates = new ArrayList<>();
		conn = Database_Access_Key.Connect();
		Graduate graduate = null;
		
		try 
		{
			ps = conn.prepareStatement("SELECT * FROM GRADUATE)");

			rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				 graduate = new Graduate(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				 
				 
			}
			graduates.add(graduate);
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		
		return graduates;
	}

	@Override
	public boolean IsUsernameAvailable(Graduate t) {
		
		conn = Database_Access_Key.Connect();
		boolean isValid  = false;
		try 
		{
			 ps = conn.prepareStatement("SELECT * FROM GRADUATE WHERE EMAIL = ?");
			 ps.setString(1, t.getEmail());
			 rs = ps.executeQuery();
			 
			 if(rs.next()) 
			 {
				 isValid = true;
			 }
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return isValid;
	}

}
