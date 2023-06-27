package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		HttpSession session = request.getSession();
		
		
		if(username.equalsIgnoreCase("nitish") && password.equals("rash")) {
			
			
			
			session.setAttribute("msg", "Nitish");
			
			response.sendRedirect("home.jsp");
			
			
		}
		else {
			
			session.setAttribute("err", "something is wrong");
//			response.sendRedirect("Login.jsp");
			
//			out.println("Sorry !! ... Username or password is wrong");
			rd = request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
		
		
	}

}
