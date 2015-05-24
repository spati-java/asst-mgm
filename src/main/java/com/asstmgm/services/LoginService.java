package com.asstmgm.services;

import java.util.List;

import com.asstmgm.model.Login;

public interface LoginService {
	
public void add(Login login);

public List<Login> getAllUser();

public Login getLoginName(String userName);

public Login getLogin(int loginId);

}
