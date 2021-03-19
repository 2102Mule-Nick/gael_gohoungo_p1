package com.revature.service;

import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.dao.UserDao;
import com.revature.exception.InvalidPassword;
import com.revature.pojo.User;

@Component
public class UserServiceImpl implements UserService {
	
	Logger log = Logger.getRootLogger();
	
	private User currentUser;
	
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}
     @Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User registerUser(User user) throws UserNameTaken {
		log.trace("Register User method called");
		userDao.createUser(user);
		return user;
	}

	public boolean existingUser(User user) {
		log.trace("Existing User called");
		try {
			if (userDao.getUserByUsername(user.getUsername()) !=null) {
				log.info("getUserByUsername did not return null");
				return true;
			}
		} catch (UserNotFound e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public User authenticateUser(User user) throws InvalidPassword, UserNotFound {
		User existingUser = userDao.getUserByUsername(user.getUsername());

		if (existingUser.getPassword().equals(user.getPassword())) {
			this.currentUser = existingUser;
			return existingUser;
		}

		throw new InvalidPassword();
	}

	public User updateUser(User user, String password) {
		log.info("Update user in User ServiceImpl");
		userDao.updateUser(user, password);
		return null;
	}

	public boolean removeUser(User user) {
		if (existingUser(user)) {
			userDao.removeUser(user);
			return true;
		}
		return false;
	}

	@Override
	public User currentUser(User user) {
		return currentUser;
	}

}
