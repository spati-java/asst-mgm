package com.asstmgm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="login")
public class Login {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // auto generated value
	private int loginId;
	
	@Column (name="USER_NAME")
	private String useerName;
	
	@Column (name="PASSWORD")
	private String password ;
	public Login(){}
	
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getUseerName() {
		return useerName;
	}
	public void setUseerName(String useerName) {
		this.useerName = useerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
