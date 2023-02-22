package org.aba;

import java.util.List;

import org.Base.Final_baseclass;
import org.apache.commons.compress.utils.Lists;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.pom.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends Final_baseclass {
	
	Loginpage login;
	
	
//	@Given("User wants to open the Adactin application in chrome browser")
//	public void user_wants_to_open_the_Adactin_application_in_chrome_browser() {
//		driverLaunch("https://adactinhotelapp.com/");
//		maximize();
//		implicitWait(30);
//		
//		
//	} 
//	
//	@When("User wants to give valid {string} and {string} and click on the login button")
//	public void user_wants_to_give_valid_and_and_click_on_the_login_button(String string, String string2) {
//   
//		driver.findElement(By.id("username"));
//		driver.findElement(By.id("password"));
//	login = new Loginpage();
//    login.loginPageData();
//	}
//
//	@Then("User verify the login is completed succesfully")
//	public void user_verify_the_login_is_completed_succesfully() {
//	   
//	}
//
//	@When("User give valid details in search hotel")
//	public void user_give_valid_details_in_search_hotel() {
//	   
//	}
//
	@Given("user wants to open the Adactin Application in chrome browser")
	public void user_wants_to_open_the_Adactin_Application_in_chrome_browser() {
		driverLaunch("https://adactinhotelapp.com/");
		maximize();
		implicitWait(30);
		
	    	}

	@When("user wants to give valid user name and password using Data Table without header one-D, and click the login button")
	public void user_wants_to_give_valid_user_name_and_password_using_Data_Table_without_header_one_D_and_click_the_login_button(io.cucumber.datatable.DataTable dataTable) {
	    

		driver.findElement(By.id("username"));
		driver.findElement(By.id("password"));
		
	List<String> list = dataTable.asList();
	String username = list.get(0);
	String password = list.get(1);
	login=new Loginpage();
	login.loginPageData();
		
	   
	}
	@When("user wants to give valid user name and password using Data Table without header Two-D, and click the login button")
	public void user_wants_to_give_valid_user_name_and_password_using_Data_Table_without_header_Two_D_and_click_the_login_button(io.cucumber.datatable.DataTable dataTable) {

		driver.findElement(By.id("username"));
		driver.findElement(By.id("password"));
//		List<List<String>> list = dataTable.asLists();
//		String username = list.get(0).get(0);
//		String string = list.get(1).get(0);
//		login=new Loginpage();
//		login.loginPageData();
//		
		
	
}
}