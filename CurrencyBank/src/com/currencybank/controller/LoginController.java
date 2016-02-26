package com.currencybank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.currencybank.model.LoginUser;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
    public String accountHome(ModelMap model,HttpServletRequest request, HttpServletResponse response) {
        
    	LoginUser loginUser = new LoginUser();
        loginUser.setLoginID(request.getParameter("loginID"));
        loginUser.setAcctpwd(request.getParameter("acctpwd"));

    	System.out.println(loginUser.getLoginID());
    	System.out.println(loginUser.getAcctpwd());
        return "accounthome";
  }
  
}