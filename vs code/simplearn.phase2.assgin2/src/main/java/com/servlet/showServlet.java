package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.Products;
import com.Dao.ProductsDao;

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
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		ProductsDao dao = new ProductsDao();
		
		
		Products p = dao.search(id);
		if(p!= null) {
			session.setAttribute("product", p);
			response.sendRedirect("product.jsp");
		}
		else {
			session.setAttribute("msg", "not found");
			response.sendRedirect("home.jsp");
		}
		
	}

}
