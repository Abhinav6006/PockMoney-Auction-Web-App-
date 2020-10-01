package com.model;

import java.util.Date;

public class Product {
//private String productId;
private String productName;
private int minBidPrice;
private int currBid;
private String ownerName;
private String currBidName=null;
public String getCurrBidName() {
	return currBidName;
}
public void setCurrBidName(String currBidName) {
	this.currBidName = currBidName;
}
private User user;
public Product(){
	
}
public Product( String productName, int minBidPrice,String ownerName,int currBid,User user,String currBidName) {
	super();
	//this.productId = productId;
	this.productName = productName;
	this.minBidPrice = minBidPrice;
	this.currBid=currBid;
	//this.endDate = endDate;
	this.ownerName=ownerName;
	this.user=user;
	this.currBidName=currBidName;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public int getCurrBid() {
	return currBid;
}
public void setCurrBid(int currBid) {
	this.currBid = currBid;
}


public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
//public String getProductId() {
//	return productId;
//}
//public void setProductId(String productId) {
//	this.productId = productId;
//}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getMinBidPrice() {
	return minBidPrice;
}
public void setMinBidPrice(int minBidPrice) {
	this.minBidPrice = minBidPrice;
}
//public String getEndDate() {
//	return endDate;
//}
//public void setEndDate(String endDate) {
//	this.endDate = endDate;
//}

}
