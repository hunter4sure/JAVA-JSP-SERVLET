package com.bac.awd.services;

import java.util.List;

import com.bac.awd.model.Advisor;
import com.bac.awd.repository.I_UserService;

public class AdvisorService implements I_UserService<Advisor> {

	@Override
	public Advisor getUserInfor(Advisor t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Authenticate(Advisor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean SignUp(Advisor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Advisor> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IsUsernameAvailable(Advisor t) {
		// TODO Auto-generated method stub
		return false;
	}

}
