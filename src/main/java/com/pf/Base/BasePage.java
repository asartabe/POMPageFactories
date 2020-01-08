package com.pf.Base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pf.Pages.Actions.TopNavigations;
import com.pf.Utilities.ExcelReader;
import com.pf.Utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\TestData.xlsx");
	public WebDriverWait wait;
	public ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	public static TopNavigations topNav;

	public static void initConfiguration() {

		if (Constants.browser.equals("chrome")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options.setExperimentalOption("useAutomationExtension", false);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			topNav = new TopNavigations(driver);

		} else if (Constants.browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (Constants.browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}

		driver.get(Constants.siteurl);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Constants.implicitWait, TimeUnit.SECONDS);

	}

	public static void click(WebElement element) {

		element.click();
//		test.log(LogStatus.INFO, "Clicking on " + element);
	}

	public static void type(WebElement element, String value) {

		element.sendKeys(value);
//		test.log(LogStatus.INFO, "Typing " + value + " in " + element);
	}

//	static WebElement dropdown;

	public static void select(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);
		// this will record a step in Extent report each time this method is called
//		test.log(LogStatus.INFO, "Selecting from dropdown " + element + " and value as " + value);
	}

	public static void quitBrowser() {
		driver.quit();

	}
}
