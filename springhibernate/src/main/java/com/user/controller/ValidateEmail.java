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
//"This is the Authentication Servlet. Used to check whether the user is logged in or out a valid user or need to register or an admin."
@WebServlet(description = "This Servlet is use to find an user from database", urlPatterns = {
"/ValidateEmail" })
public class ValidateEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		UserController userController= new UserController();
		List<User> user = userController.serachUserByEmail(email);
		if(user.size()>0) {
			request.setAttribute("user", user.get(0));
			RequestDispatcher reqestDispatcher = request.getRequestDispatcher("UpdateForm.jsp");
			reqestDispatcher.forward(request, response);			
		}
		else
			response.sendRedirect("ErrorPage.jsp");
	}

}
