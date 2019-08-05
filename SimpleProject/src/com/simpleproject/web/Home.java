package com.simpleproject.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("first");
		String lastName = request.getParameter("last");
		String favLan = request.getParameter("language");
		String homeTown = request.getParameter("town");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			
		// TODO 
		// Allow users to pass parameters. If a parameter is not given, have it default to Unknown.
		// Trying to write an if statement, that if firstName.equals(null) then to print out "unknonwn". Does not work. 
		
		
		out.write("<h1>Welcome, " + firstName+ " " + lastName + "</h1>");
		out.write("<h3>Your favorite language is: " + favLan + "</h3>");
		out.write("<h3>Your hometown is:  " + homeTown + "</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
