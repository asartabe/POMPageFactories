package com.pf.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocators {

	
	@FindBy (css = "input#gss-signin-email" )
	public WebElement username;

	@FindBy (css = "input#gss-signin-password" )
	public WebElement password;
	
	@FindBy (xpath = "//button[@id='gss-signin-submit']" )
	public WebElement signInBtn;
	
}
