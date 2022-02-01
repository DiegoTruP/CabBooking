package ola.com.booking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ola.com.booking.ConectionManager;
import ola.com.booking.dao.RideDao;
import ola.com.booking.model.Ride;
import ola.com.booking.model.Route;

public class RideDaoImpl implements RideDao {
	
	Connection conn= ConectionManager.getConnection();

	@Override
	public void saveRide(Ride ride) {
		try {
			PreparedStatement stmt = conn.prepareStatement("insert into ride (userId, routeId, dateT) values (?,?,?);");
			stmt.setInt(1, ride.getUserId());
			stmt.setInt(2, ride.getRouteId());
			java.sql.Date sqlDate = java.sql.Date.valueOf(ride.getDateTime().toLocalDate());
			stmt.setDate(3, sqlDate);
		
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

	@Override
	public List<Ride> getListRide() {
		List<Ride> rideList = new ArrayList<Ride>();
		try {
			ResultSet result = conn.createStatement().executeQuery("select * from ride;");
			while(result.next()) {
				Ride ride = new Ride();
				ride.setRideId(result.getInt("rideId"));
				ride.setUserId(result.getInt("userId"));
				ride.setRouteId(result.getInt("routeId"));
				rideList.add(ride);
				
			}
			return rideList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Ride> getUserRides(int userId) {
		List<Ride> rideList = new ArrayList<Ride>();
		try {
			PreparedStatement stmt = conn.prepareStatement("select * from ride where userId=?");
			stmt.setInt(1, userId);
			
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) {
				Ride ride = new Ride();
				ride.setRideId(result.getInt("rideId"));
				ride.setUserId(result.getInt("userId"));
				ride.setRouteId(result.getInt("routeId"));
				rideList.add(ride);
				
			}
			return rideList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
