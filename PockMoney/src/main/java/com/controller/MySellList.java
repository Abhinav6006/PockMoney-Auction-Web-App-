package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.AuctionItemsService;
@Controller
public class MySellList {
	
	@Autowired
	AuctionItemsService service;
	@RequestMapping(value="MySell", method=RequestMethod.GET)
	public String purchaselist(ModelMap mv,HttpServletRequest request){
		String username=(String)request.getSession(false).getAttribute("user");
		mv.addAttribute("selllist",service.mySell(username));
		return "mysell";
	}

}
