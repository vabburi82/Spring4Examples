package com.currencybank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.currencybank.model.LoginUser;
import com.currencybank.model.RegisterUser;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	 @RequestMapping(method = RequestMethod.GET)
	    public String login(ModelMap model) {	
	        return "register";
	    }
	 @RequestMapping(method = RequestMethod.POST)
	    public String accountHome(ModelMap model,HttpServletRequest request, HttpServletResponse response) {
	        
		 RegisterUser registerUser = new RegisterUser();
		 registerUser.setName(request.getParameter("name"));
		 registerUser.setGender(request.getParameter("gender"));
		 registerUser.setAddress(request.getParameter("address"));
		 registerUser.setEmail(request.getParameter("email"));

		    System.out.println(registerUser.getName());
	    	System.out.println(registerUser.getGender());
	    	System.out.println(registerUser.getAddress());
	    	System.out.println(registerUser.getEmail());
	        return "accounthome";
	  }
}
