package com.pf.Pages.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pf.Base.BasePage;
import com.pf.Pages.Locators.TopNavigationLocators;

public class TopNavigations {

	
	public TopNavigationLocators topNavLocators;
	
	public TopNavigations(WebDriver driver) {

		this.topNavLocators = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavLocators);
		
		
	}

	public SignInPage goToSignIn() {

		BasePage.click(topNavLocators.accounts);;
		BasePage.click(topNavLocators.signIn);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new SignInPage();
	}

	public void goToCreateAccount() {

	}

	public void goToHome() {

	}

	public void goToAccounts() {

	}

	public void goToFlights() {

	}

	public void goToList() {

	}

	public void goToManageTrips() {

	}
}
