package com.revature.service;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.exception.invalidPassword;
import com.revature.pojo.User;

public class UserServiceImpl implements UserService {

	public User registerUser(User user) throws UserNameTaken {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existingUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User authenticateUser(User user) throws invalidPassword, UserNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(User user, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
