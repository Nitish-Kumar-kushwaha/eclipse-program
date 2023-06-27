package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.connection.HibernateConfigure;
import com.hibernate.dao.ProductDao;
import com.hibernate.model.Products;

/**
 * Servlet implementation class insertServlet
 */
@WebServlet("/insert")
public class insertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession ses = request.getSession();
		
		String name = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		
		Products p = new Products(name, price);
		
		
		System.out.println(p);
		ProductDao dao = new ProductDao();
		
		
		String res = dao.saveProduct(p);
		System.out.println("saved");
		
		if(res.equals("sucess")) {
			System.out.println("product inserted");
			ses.setAttribute("msg", "Product inserted sucessfull");
			response.sendRedirect("home.jsp");
			
//			out.println("Product inserted");
		}else {
			System.out.println("Product is not inserted");
			ses.setAttribute("msg", "unsucessfull");
			response.sendRedirect("home.jsp");
		}
		
	}

}
