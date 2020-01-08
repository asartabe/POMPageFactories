package com.pf.Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	
	@FindBy (xpath = "//button[@id='header-account-menu']")
	public WebElement accounts;
	
	@FindBy (css = "#account-signin")
	public WebElement signIn;

	@FindBy (css = "#account-register")
	public WebElement createAccount;
	

}
