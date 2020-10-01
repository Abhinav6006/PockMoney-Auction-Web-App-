package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.AuctionItemsService;

@Controller

public class RegisterLoginSuccess 
{
	@Autowired
	AuctionItemsService service;
@RequestMapping(value="registerUserServlet1",method=RequestMethod.POST)
public String registerUser(@RequestParam("name") String name, @RequestParam("username") String username,@RequestParam("password") String password,ModelMap mv){
	//PrintWriter out=response.getWriter()
	User userObj=new User();
	userObj.setName(name);
 	userObj.setUserName(username);
 	userObj.setUserPass(password);
 	userObj.setStatus("Pending");
 //	if(service.userExist(username);)
	service.userEntry(userObj);
	mv.addAttribute("user",userObj);
	System.out.println(name);
//	System.out.println("<a href='index.jsp'>Back To Home</a> ");
	return "index";
}



}