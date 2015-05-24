package com.asstmgm.dao;

import java.util.List;

import com.asstmgm.model.Login;
import com.asstmgm.model.UserDetails;

public interface UserDetailsDao {
	
public void addUser(UserDetails userDetails);

public void editUser(UserDetails userDetails);
public void deleteUser(int userID);

public UserDetails getUser(long userId);

public List getAllUser();


}
