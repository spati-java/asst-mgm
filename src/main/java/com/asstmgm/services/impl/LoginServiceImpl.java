package com.asstmgm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asstmgm.dao.LoginDao;
import com.asstmgm.model.Login;
import com.asstmgm.services.LoginService;
@Service
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao loginDao;
	
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
	public void add(Login login) {
		loginDao.add(login);
		
	}

	@Override
	public List<Login> getAllUser() {
		
		return loginDao.getAllUser();
	}

	
	public Login getLoginName(String userName) {
		
		return loginDao.getLoginName(userName);
	}

	@Override
	public Login getLogin(int loginId) {
		
		return loginDao.getLogin(loginId);
	}

	

}
