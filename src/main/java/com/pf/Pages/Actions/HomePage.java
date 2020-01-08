package com.pf.Pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.pf.Base.BasePage;
import com.pf.Pages.Locators.HomePageLocators;

public class HomePage extends BasePage {

	public HomePageLocators home;

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public int getTabCount() {
		return home.tabCount.size();
	}

	public HomePage goToFlight() {

		click(home.flightTab);
		return new HomePage();
	}

	public void goToHotels() {

	}

	public void goToFLightAndHotels() {

	}

	public void goToCarHire() {

	}

	public FlightsPage bookAFlight(String fromCity, String toCity, String departDate, String returnDate) {

		type(home.fromCity, fromCity);
		type(home.toCity, toCity);
		type(home.departDate, departDate);
		type(home.returnDate, returnDate);
		click(home.searchButton);

		return new FlightsPage(driver);
	}

	public void bookHotel() {

	}

}
