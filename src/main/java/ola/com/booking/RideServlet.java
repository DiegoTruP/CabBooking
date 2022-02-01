package ola.com.booking;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ola.com.booking.model.Ride;
import ola.com.booking.model.User;
import ola.com.booking.service.RideService;
import ola.com.booking.service.RouteService;
import ola.com.booking.service.impl.RideServiceImpl;
import ola.com.booking.service.impl.RouteServiceImpl;

/**
 * Servlet implementation class RideServlet
 */
@WebServlet("/rides")
public class RideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	RideService rideService = new RideServiceImpl();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer route = Integer.parseInt(req.getParameter("route"));
		Integer user = (Integer) req.getAttribute("userId");
		
		Ride ride = new Ride();
		ride.setRouteId(route);
		ride.setUserId(user);
		ride.setDateTime(LocalDateTime.now());
		rideService.saveRide(ride);
		
		req.setAttribute("rideList", rideService.getUserRides(user));
		req.setAttribute("user", req.getAttribute("userId"));
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/rideview.jsp");
	    rd.forward(req, resp);

		
	}

}
