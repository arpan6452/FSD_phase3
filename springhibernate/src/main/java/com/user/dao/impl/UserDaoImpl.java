package com.user.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.user.dao.UserDAO;
import com.user.model.User;

public class UserDaoImpl implements UserDAO{
	
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public User createUser(User user) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		return user;
	}

	@Override
	public User updateUser(User user) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();
		return user;
	}

	@Override
	public User getUserById(int userID) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = (User) session.get(User.class, userID);
		transaction.commit();
		session.close();
		return u;
	}

	@Override
	public List<User> getUserByEmail(String emailId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query q = session.createQuery("select user from User user where emailId=:emailID");
		q.setParameter("emailID", emailId);
		List list = q.list();
		session.flush();
		//User u = (User) session.get(User.class, emailId);
		transaction.commit();
		session.close();
		return list;
	}

	@Override
	public void deleteUser(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		User u = new User();
		u.setUserID(id);
		session.delete(u);
		transaction.commit();
		session.close();
	}

	@Override
	public List<User> getAllUsers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.user.model.User");
		List<User> players=query.list();
		session.close();
		return players;
	}

}
