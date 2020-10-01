package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.AuctionItemsService;

@Controller
public class AdminController {
	@Autowired
	
	AuctionItemsService service;
	@RequestMapping(value="AdminApprove1",method=RequestMethod.GET)
	public String adminApprove(@RequestParam("username") String username,ModelMap mv)
	{
		boolean flag=false;
		System.out.println(username);
    	for(User us:service.userTemp){
    		System.out.println(us.getUserName());
    		if(username.equals(us.getUserName())){
    			service.userList.add(us);
    			service.userTemp.remove(us);
    			flag=true;
    			break;
    			
    		}
    	}
    	mv.put("userList", service.userList);
    	
    	System.out.println(service.userList.size());
    	if(flag)
    	return "Approve";
    	else
    		return"index";
    }
	

}
