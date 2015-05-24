package com.asstmgm.dao.impl;

import java.util.List;









import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.asstmgm.dao.LoginDao;
import com.asstmgm.model.Login;



@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory session;

	@Override
	public void add(Login login) {
		session.getCurrentSession().save(login);
		
	}
	

	@Override
	public List<Login> getAllUser() {
		Criteria criteria = session.getCurrentSession().createCriteria(Login.class);	
	return criteria.list(); 
		
		}


	@Override
	public Login getLoginName(String userName) {
		
		return (Login)session.getCurrentSession().get(Login.class,userName);
	}


	@Override
	public Login getLogin(int loginId) {
		return (Login)session.getCurrentSession().get(Login.class,loginId);
	}


	
	
	


	

}
