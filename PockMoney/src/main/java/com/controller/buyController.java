package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Product;
import com.service.AuctionItemsService;

@Controller
public class buyController {
	@Autowired
	AuctionItemsService service;

	@RequestMapping(value = "buyController", method = RequestMethod.GET)
	public String productSell(@RequestParam("name") String name,@RequestParam("bidchange") int currbid,ModelMap mv,HttpServletRequest request) {
		String username=(String) request.getSession(false).getAttribute("user");
		service.updateBid(name,currbid,username);
		return "redirect:buyProduct1.htm";

	}
}
