package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Product;
import com.service.AuctionItemsService;

@Controller
public class productSell {
	@Autowired
	AuctionItemsService service;
@RequestMapping(value="productSell", method=RequestMethod.POST)
public String productSell1(@RequestParam("product") String prodname,@RequestParam("bid") int bid,ModelMap mv,HttpServletRequest request){
	String username=(String) request.getSession(false).getAttribute("user");
	Product prod=new Product();
	prod.setProductName(prodname);
	prod.setMinBidPrice(bid);
	prod.setCurrBid(bid);
	prod.setOwnerName(username);
	System.out.println(prod.getOwnerName());
	mv.addAttribute("prodList",service.prodList);
    service.sellProd(prod);
   
    return "messageProd";
	
}
}
