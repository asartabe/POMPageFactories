package com.pf.TestCases;

import org.testng.annotations.Test;

import com.pf.Base.BasePage;

public class SignInTest {

	@Test
	public void signInTest() {
		
		BasePage.initConfiguration();
		
		BasePage.topNav.goToSignIn().doLogin("ajhvhj@gmail.com", "jhagsd");
		BasePage.quitBrowser();
		
	
	}
}
