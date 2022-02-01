package ola.com.booking.service;

import ola.com.booking.model.User;

public interface UserService {

	public void saveUser(User user);
	public boolean validateUser(String username, String password);
	public User getUser(String username, String password);
}
