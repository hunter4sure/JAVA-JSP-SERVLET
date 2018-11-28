package com.bac.awd.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bac.awd.dao.Database_Access_Key;
import com.bac.awd.model.Company;
import com.bac.awd.repository.I_UserService;

public class CompanyService_Imple implements I_UserService<Company> {


	Connection conn = null;
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public Company getUserInfor(Company t) {
		conn = Database_Access_Key.Connect();

		Company company = null;

		try {

			ps = conn.prepareStatement("SELECT * FROM COMPANY WHERE EMAIL = ?");
			ps.setString(1, t.getEmail());

			rs = ps.executeQuery();

			if (rs.next()) {

				company = new Company(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return company;
	}
	
	
	@Override
	public boolean Authenticate(Company t) {
		conn = Database_Access_Key.Connect();
		boolean isSuccess = false;

		try 
		{
			ps = conn.prepareStatement("SELECT * FROM COMPANY WHERE EMAIL= ? AND PASSWORD =?");
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
	public boolean SignUp(Company company) {
		conn = Database_Access_Key.Connect();
		boolean isSuccess = false;

		Company g = new Company();

		try {

			ps = conn.prepareStatement("INSERT INTO COMPANY(COMPANYNAME, STATUS, BIOS,EMAIL,PASSWORD) VALUES(?,?,?)");
			ps.setString(1, company.getCompanyName());
			ps.setString(2, company.getStatus());
            ps.setString(3, company.getBio());
			ps.setString(4, company.getEmail());
			ps.setString(5, company.getPassword());


			if (ps.executeUpdate() > 0) {
				isSuccess = true;

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isSuccess;
	}
	@Override
	public List<Company> getAllUsers() {
		// TODO Auto-generated method stub
		
		

		List<Company> companylis = new ArrayList<>();
		conn = Database_Access_Key.Connect();
		Company c = null;
		
		try 
		{
			ps = conn.prepareStatement("SELECT * FROM COMPANY)");

			rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				 c = new Company(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				 
				 
			}
			companylis.add(c);
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		
		return companylis;
	}
	@Override
	public boolean IsUsernameAvailable(Company t) {
		// TODO Auto-generated method stub
		conn = Database_Access_Key.Connect();
		boolean isValid  = false;
		try 
		{
			 ps = conn.prepareStatement("SELECT * FROM COMPANY WHERE EMAIL = ?");
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