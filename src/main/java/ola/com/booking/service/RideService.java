package ola.com.booking.service;

import java.util.List;

import ola.com.booking.model.Ride;

public interface RideService {
	public List<Ride> getRides();
	public void saveRide(Ride ride);
	public List<Ride> getUserRides(int userId);
}
