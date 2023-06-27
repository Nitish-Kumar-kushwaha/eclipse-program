package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.ProductDao;
import com.hibernate.model.Products;

/**
 * Servlet implementation class showServlet
 */
@WebServlet("/show")
public class showServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ProductDao dao = new ProductDao();
		List<Products> product = dao.showAll();
		
		if(!product.isEmpty()) {
			for(Products p : product) {
				System.out.println(p);
			}
			session.setAttribute("product", product);
			response.sendRedirect("data.jsp");
		}
		else {
			System.out.println("some thing got error !!!!");
			response.sendRedirect("home.jsp");
		}
		
	}

}
