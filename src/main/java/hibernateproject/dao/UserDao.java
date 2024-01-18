package hibernateproject.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateproject.dto.User;

public class UserDao {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
EntityManager manager=factory.createEntityManager();
	public User saveUser(User user)
	
	{
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(user);
	transaction.begin();
	transaction.commit();
	return user;
	}

}
