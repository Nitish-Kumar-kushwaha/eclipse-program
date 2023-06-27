package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.models.Products;

/**
 * Servlet implementation class productServlet
 */
@WebServlet("/products")
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		int id = Integer.parseInt(request.getParameter("pid"));
		String name = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		
		Products p = new Products(id, name, price);
		
		session.setAttribute("product", p);
		
		response.sendRedirect("show.jsp");
		
	}

}
