package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.AuctionItemsService;

@Controller
public class UserLoginExsist {

	@Autowired 
	AuctionItemsService service;
	@RequestMapping(value="UserLoginExsist",method=RequestMethod.POST)
	public String userloginexist(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap mv){
		User usr=new User();
		usr.setUserName(username);
		usr.setUserPass(password);
		service.userExist(usr.getUserName());
		//mv.addAttribute("user",usr);
		return "AuctionMethods";
	}
	
}
