package ola.com.booking.dao;

import ola.com.booking.model.User;

public interface UserDao {

	void saveUser(User user);
    boolean validateUser(String username, String password);
    User getUser(String username, String password);
}
