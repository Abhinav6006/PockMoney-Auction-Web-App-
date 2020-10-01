package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Product;
import com.model.User;

@Component
public class AuctionItemsService {
public static List<User> userList=new ArrayList<User>();
public static List<User> userTemp=new ArrayList<User>();
public static List<Product> prodList=new ArrayList<Product>();
//User userObj=new User();
//Product prod=new Product();
    public void userEntry(User us){
         	
         	userTemp.add(us);
    }
    
    public boolean userExist(String username){
    	boolean flag=false;
    	for(User usr:userList){
    		if(username.equals(usr.getUserName())){
    			//System.out.println("Username Already Exists");
    		 flag=true;
    		 break;
    		}
    	}
    	return flag;
    }
    
    public void sellProd(Product prod){
    	prodList.add(prod);
    }
    
    public void showProd(String username){
    	for(Product pro:prodList){
    		if(username.equals(pro.getUser().getUserName())){
    			System.out.println("Can't Show the Product to the User");
    		}
    		else{
    			prodList.add(pro);
    		}
    	}
    }
    
    public void updateBid(String name, int bid,String username){
    	for(Product P:prodList){
    		if(P.getProductName().equals(name)){
    			if(P.getCurrBid()<bid){
    				P.setCurrBid(bid);
    				P.setCurrBidName(username);
    				System.out.println(P.getCurrBid());
    			}
    			break;
    		}
    	}
    }
    
    boolean addowner(Product p){
    	boolean flag=false;
    	for(User usr:userList){
    		if(usr.getUserName().equals(p.getOwnerName())){
    			usr.getMysell().add(p);
    			flag=true;
    			break;
    		}
    	}
    	return flag;
    }
    
    boolean addowner1(Product p){
    	boolean flag=false;
    	for(User usr:userList){
    		if(usr.getUserName().equals(p.getCurrBidName())){
    			usr.getMybuy().add(p);
    			flag=true;
    			break;
    		}
    	}
    	return flag;
    }
    
   public boolean bidapprove1(String prodName){
	   boolean flag=false;
	   boolean a,b;
	   if(prodName!=null){
		   for(Product p:prodList){
			   if(p.getProductName().equals(prodName)){
				   a=addowner(p);
				   b=addowner1(p);
				   prodList.remove(p);
				   flag=a&&b;
				   break;
			   }
		   }
	   }
	   return flag;
   }
   
   public List<Product> myPurchase(String username){
	   for(User usr:userList){
		   if(usr.getUserName().equals(username)){
			   return usr.getMybuy();
		   }
	   }
	   return null;
   }
   
   public List<Product> mySell(String username){
	   for(User usr:userList){
		   if(usr.getUserName().equals(username)){
			   return usr.getMysell();
		   }
	   }
	   return null;
   }
	
 }

