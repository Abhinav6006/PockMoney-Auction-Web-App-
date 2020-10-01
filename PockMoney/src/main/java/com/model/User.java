package com.model;

import java.util.ArrayList;
import java.util.List;

public class User {
private String userName;
private String userPass;
private String Name;
private String status;
public List<Product> mysell=new ArrayList<Product>();
public List<Product> mybuy=new ArrayList<Product>();
public User(){
	super();
}

public User(String userName, String userPass, String name,String status) {
	super();
	this.userName = userName;
	this.userPass = userPass;
	Name = name;
	this.status=status;
	
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}
public String getName() {
	return Name;
}
public List<Product> getMysell() {
	return mysell;
}

public void setMysell(List<Product> mysell) {
	this.mysell = mysell;
}

public List<Product> getMybuy() {
	return mybuy;
}

public void setMybuy(List<Product> mybuy) {
	this.mybuy = mybuy;
}

public void setName(String name) {
	Name = name;
}

public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
