package ola.com.booking.service.impl;

import ola.com.booking.dao.UserDao;
import ola.com.booking.dao.impl.UserDaoImpl;
import ola.com.booking.helper.UserHelper;
import ola.com.booking.model.User;
import ola.com.booking.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao;

	public void saveUser(User user) {
		userDao = new UserDaoImpl();
		
		user.setId(UserHelper.getIncrement());
		userDao.saveUser(user);	
	}

	@Override
	public boolean validateUser(String username, String password) {
		userDao = new UserDaoImpl();
		return userDao.validateUser(username, password);
	}

	@Override
	public User getUser(String username, String password) {
		userDao = new UserDaoImpl();
		return userDao.getUser(username, password);
	}
}
