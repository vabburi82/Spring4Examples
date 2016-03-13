package com.currencybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.currencybank.model.LoginUser;


@Controller
@RequestMapping("/login")
public class LoginController {
	 /*
     * This method will serve as default GET handler.
     *
     */
    @RequestMapping(method = RequestMethod.GET)
    public String login(ModelMap model) {	
        return "login";
    }
    /*
     * This method will serve as default GET handler.
     *
     */
    @RequestMapping(method = RequestMethod.POST)
    public String accountHome(@ModelAttribute LoginUser form,ModelMap model) {
    	System.out.println("MODEL ATTRIB FORM = "+form.getLoginID());
    	System.out.println("MODEL ATTRIB FORM = "+form.getAcctpwd());
    	
        
    	LoginUser loginUser = new LoginUser();
//        loginUser.setLoginID(request.getParameter("loginID"));
//        loginUser.setAcctpwd(request.getParameter("acctpwd"));

    	
    	System.out.println(loginUser.getLoginID());
    	System.out.println(loginUser.getAcctpwd());
        return "accounthome";
  }
  
}