package com.Exercise1.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Exercise1.pages.FlightPage;
import com.Exercise1.pages.MainPage;
import com.Exercise1.pages.FlightListPage;
import com.Exercise1.pages.MyDriver;

public class BaseTest {

	
MyDriver myDriver;
	
	private MainPage mainPage;
	private FlightPage flightpage;
	private FlightListPage flightlistpage;
	
	
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"browser"})
	public void beforeSuite(String browser){
		myDriver = new MyDriver(browser);
		mainPage = new MainPage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite(){
		mainPage.dispose();
	}

	public MainPage getMainPage(){
		return mainPage;
	}
	
	public FlightPage getFlightPage(){
		return flightpage;
	}
	
	public FlightListPage getFlightListPage() {
		return flightlistpage;
	}
}
