package com.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.model.User;

@WebServlet(description = "This Servlet is use to find an user from database", urlPatterns = { "/UpdateUser" })
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		try {
			UserController userController= new UserController();
			User user = new User();
			user.setUserID(Integer.parseInt(request.getParameter("userID")));
			user.setUsername(request.getParameter("username"));
			user.setEmailId(request.getParameter("email"));
			user.setPhoneNo(request.getParameter("phoneNo"));
			user.setAddress(request.getParameter("address"));
			
			userController.updateUser(user);
			response.setContentType("text/html");
			response.getWriter().print(
					"<h2 style=\"margin-left: 10px;color: red;\">User successfully updated.</h2>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.include(request, response);
		}catch (Exception e) {
			response.sendRedirect("ErrorPage.jsp");
		}
	}

}
