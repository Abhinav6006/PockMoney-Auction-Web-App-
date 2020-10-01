package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.AuctionItemsService;

@Controller
public class UserLoginController {

	@Autowired
	AuctionItemsService service;
	@RequestMapping(value="UserLogin1",method=RequestMethod.GET)
	public String userlogin(@RequestParam("username") String username,ModelMap mv,HttpServletRequest request){
		request.getSession().setAttribute("user",  username);
		if(service.userExist(username)){
			return "AuctionMethods";
		}
	
	return "Login";
}
}