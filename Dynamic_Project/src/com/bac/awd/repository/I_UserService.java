package com.bac.awd.repository;

import java.util.*;

public interface I_UserService<T> {
	
	T getUserInfor(T t);
	boolean Authenticate(T t);
	boolean SignUp(T t);
	List<T> getAllUsers();
	boolean IsUsernameAvailable(T t);
}
