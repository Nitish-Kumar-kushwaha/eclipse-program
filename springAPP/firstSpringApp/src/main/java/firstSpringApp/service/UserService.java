package firstSpringApp.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import firstSpringApp.Dao.UserDao;
import firstSpringApp.model.User;


public class UserService {
	
	
	private UserDao userDao = new UserDao(); 
	
	public String createUser(User user) {
		return this.userDao.saveUser(user);
	}
	
	public List<User> showUser(){
		return this.userDao.showAll();
	}
	

}
