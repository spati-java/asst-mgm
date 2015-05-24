/**
 * 
 */
package com.asstmgm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asstmgm.dao.UserDetailsDao;
import com.asstmgm.model.UserDetails;
import com.asstmgm.services.UserDetailsService;

/**
 * @author Sou
 * 
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userDetailsDao;

	@Override
	public void addUser(UserDetails userDetails) {
		userDetailsDao.addUser(userDetails);
	}

	@Override
	public void editUser(UserDetails userDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public List getAllUser() {
		return userDetailsDao.getAllUser();
	}

	@Override
	public UserDetails getUser(long userId) {
		return userDetailsDao.getUser(userId);
	}
	@Override
	public void deleteUser(int userID) {
		userDetailsDao.deleteUser(userID);
		
	}

}
