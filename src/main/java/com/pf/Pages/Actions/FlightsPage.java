package com.pf.Pages.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FlightsPage {
	
	
	
	public FlightsPage(WebDriver driver) {

//		this.signInPageLocators = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
//		PageFactory.initElements(factory, this.signInPageLocators);

	}

}
