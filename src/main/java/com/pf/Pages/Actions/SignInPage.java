package com.pf.Pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pf.Base.BasePage;
import com.pf.Pages.Locators.SignInPageLocators;

public class SignInPage extends BasePage {

	public SignInPageLocators signInPageLocators;

	public SignInPage() {

		this.signInPageLocators = new SignInPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.signInPageLocators);

	}

	public void doLogin(String username, String password) {

		type(signInPageLocators.username, username);
		type(signInPageLocators.password, password);
		click(signInPageLocators.signInBtn);

	}

}
