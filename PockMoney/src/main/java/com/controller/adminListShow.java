package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.AuctionItemsService;

@Controller
public class adminListShow {
  @Autowired AuctionItemsService service;
	@RequestMapping(value="adminListShow",method=RequestMethod.GET)
	public String adminListShow1(@RequestParam("adminname") String username,@RequestParam("adminpassword") String password,ModelMap mv){
		if(username.equals("admin") && password.equals("admin")){
			mv.addAttribute("userTemp",service.userTemp);
			mv.addAttribute("ProdList",service.prodList);
			return "adminTemp";
}
	else{
		return "adminValid";
	}
//		
	}
	
	
}
