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
    public String accountHome(@ModelAttribute LoginUser loginUser,ModelMap model) {
    	System.out.println(loginUser);
        return "accountHome";
    }
 
}