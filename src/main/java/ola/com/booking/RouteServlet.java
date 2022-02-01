package ola.com.booking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ola.com.booking.model.User;
import ola.com.booking.service.RouteService;
import ola.com.booking.service.impl.RouteServiceImpl;

@WebServlet("/routes")
public class RouteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RouteService routeService = new RouteServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//u have userId
		if(req.getParameter("action").equals("book")) {
			Integer userId = Integer.parseInt(req.getParameter("user")) ; 
			RequestDispatcher rd = req.getRequestDispatcher("rides");
			req.setAttribute("userId", userId);
            rd.forward(req, resp);
		}else {
			req.setAttribute("rList", routeService.getRoutes()); //all rout info + userId
			Integer userId = (Integer) req.getAttribute("userId");
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/routeview.jsp");
			req.setAttribute("userId",userId);
			rd.forward(req, resp);
		}
	}

	
}
