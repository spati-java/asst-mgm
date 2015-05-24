/**
 * 
 */
package com.asstmgm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asstmgm.dao.UserDetailsDao;
import com.asstmgm.model.Login;
import com.asstmgm.model.UserDetails;

/**
 * @author Sou
 *
 */
@Repository
@Transactional
public class UserDetailsDaoImpl implements UserDetailsDao {

	@Autowired
	private SessionFactory session;
	/* (non-Javadoc)
	 * @see com.asstmgm.dao.UserDetailsDao#addUser(com.asstmgm.model.UserDetails)
	 */
	
	@Override
	public void addUser(UserDetails userDetails) {
		session.getCurrentSession().save(userDetails);
	}

	/* (non-Javadoc)
	 * @see com.asstmgm.dao.UserDetailsDao#editUser(com.asstmgm.model.UserDetails)
	 */
	@Override
	public void editUser(UserDetails userDetails) {
		
		session.getCurrentSession().update(userDetails);

	}

	@Override
	public List getAllUser() {
		Criteria criteria = session.getCurrentSession().createCriteria(UserDetails.class);	
		return criteria.list(); 
	}

	@Override
	public UserDetails getUser(long userId) {
		return (UserDetails)session.getCurrentSession().get(Login.class,userId);
		
	}

	@Override
	public void deleteUser(int userID) {
		
		session.getCurrentSession().delete(getUser(userID));
	}



}
