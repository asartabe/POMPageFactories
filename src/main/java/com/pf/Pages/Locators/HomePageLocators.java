package com.pf.Pages.Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(css = "#tab-flight-tab-hp")
	public WebElement flightTab;
	
	@FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
	public WebElement fromCity;
	
	@FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
	public WebElement toCity;
	
	@FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
	public WebElement departDate;
	
	@FindBy(xpath = "//input[@id='flight-returning-hp-flight']")
	public WebElement returnDate;
	
//	@FindBy(xpath = "//div[@class='menu-bar gcw-travel-selector-wrapper']/ul/li/button/span")
//	public WebElement tarvellers;
	
//	@FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
//	public WebElement numOfChild;
	

	@FindBy(xpath = "//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
	public WebElement searchButton;

	@FindBy (xpath = "//li[@class='tab ']")
	public List<WebElement> tabCount;
}
