package org.pom;

import org.Base.Final_baseclass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Loginpage extends Final_baseclass {
	
	
	public Loginpage() { 
		
	PageFactory.initElements(driver, this);
		
	}
	public void Location() {
		
	}
	
	@FindBy(id="username")
	private  WebElement userName;
	@FindBy(id="password")
	private  WebElement passWord;
	@FindBy(xpath="//*[@id='login']")
	private  WebElement loginButton;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//td[@class='welcome_menu'][1]")
	private WebElement verification;
	
	
	public WebElement getVerification() {
		return verification;
	}
	public WebElement getLocation() {
		return location;
	
	}
	public  WebElement getUserName() {
		return userName;
	}
	public  WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLoginButton() {
		return loginButton;
	

}
	public void loginPageData() {
		sendText(userName, "Andrew07");
		sendText(getPassWord(), "UN45LL");
		clickElement(loginButton);
	}
//	public void locations() {
//		Selectoptionsbyindex(location, 2);
//		clickElement(location);
//	}
	@Test
	public void Verification() {
		String actual=getVerification().getText();
		System.out.println(actual);

		
		
		
	}
	
}
	