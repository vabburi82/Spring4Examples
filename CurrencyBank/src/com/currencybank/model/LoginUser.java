package com.currencybank.model;

public class LoginUser {
	private String loginID;
	private String acctpwd;
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getAcctpwd() {
		return acctpwd;
	}
	public void setAcctpwd(String acctpwd) {
		this.acctpwd = acctpwd;
	}
	
	
	@Override
	public String toString() {
		return "LoginUser [loginID=" + loginID + ", acctpwd=" + acctpwd + "]";
	}
	
}
