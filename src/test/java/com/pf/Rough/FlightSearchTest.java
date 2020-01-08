package com.pf.Rough;

import com.pf.Base.BasePage;
import com.pf.Pages.Actions.HomePage;

public class FlightSearchTest {

	public static void main(String[] args) {

		BasePage.initConfiguration();
		HomePage home = new HomePage();
		home.goToFlight().bookAFlight("Pune", "Delhi", "20/01/2020", "22/01/2020");

		BasePage.driver.navigate().back();
		
		BasePage.topNav.goToSignIn().doLogin("ajhvhj@gmail.com", "jhagsd");

		BasePage.quitBrowser();

	}
}
