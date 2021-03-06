package com.revature.service;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.exception.InvalidPassword;
import com.revature.pojo.User;

public interface UserService {

	public User registerUser(User user) throws UserNameTaken;
	
	public boolean existingUser(User user);
	
	public User currentUser (User user);
	
	public User authenticateUser(User user) throws InvalidPassword, UserNotFound;
	
	public User updateUser(User user, String password);
	
	public boolean removeUser(User user);
}
