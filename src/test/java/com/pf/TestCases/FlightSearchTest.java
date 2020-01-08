package com.pf.TestCases;

import org.testng.annotations.Test;

import com.pf.Base.BasePage;
import com.pf.ErrorCollectors.ErrorCollector;
import com.pf.Pages.Actions.HomePage;

public class FlightSearchTest {

	@Test
	public void flightSearchTest() {

		BasePage.initConfiguration();
		HomePage home = new HomePage();

//		This is a hard assert so if it false execution will stop
//		Assert.assertEquals(home.getTabCount(), 5);
		
//		This is soft assert and will continue execution even if this fails.
//		This is implemented in the ErrorCollectors package and implement this we will need to call
//		implement the listeners in the testng.xml only this will work
		ErrorCollector.verifyEquals(home.getTabCount(), 5);
		ErrorCollector.verifyEquals(home.getTabCount(), 6);
		ErrorCollector.verifyEquals(home.getTabCount(), 7);

		home.goToFlight().bookAFlight("Pune", "Delhi", "20/01/2020", "22/01/2020");

//		we can directly use the below where no need to create object of HomePage.
//		new HomePage().goToFlight().bookAFlight("Pune", "Delhi", "20/01/2020", "22/01/2020");
		BasePage.quitBrowser();

	}
}
