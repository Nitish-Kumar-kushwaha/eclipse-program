package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.connection.HibernateConfigure;

/**
 * Servlet implementation class InitHibernate
 */
@WebServlet("/InitHibernate")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ses = request.getSession();
		PrintWriter out = response.getWriter();
		System.out.println("Started1");
		
		 try {
			 System.out.println("Started");
             out.println("<html><body>");
             
             System.out.println("Started before session");

             SessionFactory factory = HibernateConfigure.getSessionFactory();
                    
             Session session = factory.openSession();
             out.println("Hibernate Session opened.<br>");
             System.out.println("Started2");
             
             if(session != null) {
//            	 ses.setAttribute("msg" , "connected!!!");
//            	 response.sendRedirect("home.jsp");
            	 
            	 out.println(" connected.<br>");
            	 System.out.println("Started3");
            	 
             }
             else {
//            	 ses.setAttribute("msg" , "error!!!");
//            	 response.sendRedirect("home.jsp");
            	 
            	 out.println("error.<br>");
            	 System.out.println("Started4");
             }
             
//             session.close();
//             out.println("Hibernate Session closed.<br>");
                    
             out.println("</body></html>");
                
                 
             } catch (Exception ex) {
//            	 	 ses.setAttribute("msg", "exception");
            	 System.out.println("Started5");
            	 out.println("excption .<br>");
                     throw ex;
                     
             }
		
	}

	
	

}
