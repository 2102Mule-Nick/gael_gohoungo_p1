package com.revature.dao;

import java.util.List;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;


public class UserDaoPostgres implements UserDao{

	@Override
	public void createUser(User user) throws UserNameTaken {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user, String new_password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
