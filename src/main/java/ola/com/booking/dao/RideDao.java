package ola.com.booking.dao;

import java.util.List;

import ola.com.booking.model.Ride;

public interface RideDao {
	
	void saveRide(Ride ride);
	List<Ride> getListRide();
	List<Ride> getUserRides(int userId);
	
}
