package com.Exercise1.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BasePage{

	public MainPage(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://www.travelocity.com");
	}
	
	@FindBy(id="tab-flight-tab-hp")	private WebElement tabflighttab;
	
		public void clickflight() { 
		tabflighttab.click();
	}
		public FlightPage returnflightpage() {

		return new FlightPage(getDriver());
	}
	
}
