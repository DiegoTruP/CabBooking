package ola.com.booking.service.impl;

import java.util.List;

import ola.com.booking.dao.RouteDao;
import ola.com.booking.dao.impl.RouteDaoImpl;
import ola.com.booking.model.Route;
import ola.com.booking.service.RouteService;

public class RouteServiceImpl implements RouteService{

	RouteDao routeDao = new RouteDaoImpl();
	
	@Override
	public List<Route> getRoutes() {
		return routeDao.getRoutes();
	}

}
