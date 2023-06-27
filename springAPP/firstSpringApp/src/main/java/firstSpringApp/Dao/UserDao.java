package firstSpringApp.Dao;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;



import firstSpringApp.hibernate.connection.HibernateConfigure;
import firstSpringApp.model.User;


public class UserDao {
	
	
	private SessionFactory sessionFactory;
	
	
	
	public UserDao() {
		
		sessionFactory = HibernateConfigure.getconnection();
	}
	
	public String saveUser(User user) {
		
		String res = null;
		
		Session session = sessionFactory.openSession();
		
		Transaction tnx = session.beginTransaction();
		
		int i= (Integer)session.save(user);
		
		if(i>0) {
			res="sucess";
		}
		else {
			res = "error";
		}
		
		tnx.commit();
		session.close();
		
		return res;
		
	}
	
	public List<User> showAll(){
		List<User> userAll = new ArrayList<User>();
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from User"); 
		userAll= query.list();
		
		return userAll;
	}

	
}
