package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.AuctionItemsService;

@Controller
public class BidApprove {

	@Autowired
	AuctionItemsService service;
	@RequestMapping(value="BidApprove/{productName}",method=RequestMethod.GET)
	public String bidapprove(@PathVariable("productName") String prodName,ModelMap mv){
		service.bidapprove1(prodName);
		mv.addAttribute("adminname","admin");
		mv.addAttribute("adminpassword","admin");
		mv.addAttribute("Prodlist",service.prodList);
		return "redirect:/adminListShow.htm";
	}
}
