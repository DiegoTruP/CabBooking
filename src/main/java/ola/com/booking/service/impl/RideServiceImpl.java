package ola.com.booking.service.impl;

import java.util.List;

import ola.com.booking.dao.RideDao;
import ola.com.booking.dao.impl.RideDaoImpl;
import ola.com.booking.model.Ride;
import ola.com.booking.service.RideService;

public class RideServiceImpl implements RideService{

	RideDao rideDao = new RideDaoImpl();
	
	
	
	
	@Override
	public List<Ride> getRides() {
		
		return rideDao.getListRide();
	}




	@Override
	public void saveRide(Ride ride) {
		rideDao.saveRide(ride);
		
	}




	@Override
	public List<Ride> getUserRides(int userId) {
		
		return rideDao.getUserRides(userId);
	}

}
