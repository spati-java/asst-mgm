package com.asstmgm.services;

import java.util.List;

import com.asstmgm.model.UserDetails;

public interface UserDetailsService {

	public void addUser(UserDetails userDetails);

	public void editUser(UserDetails userDetails);
	public void deleteUser(int userId);
	
	public UserDetails getUser(long userId);
	
	public List getAllUser();
}
