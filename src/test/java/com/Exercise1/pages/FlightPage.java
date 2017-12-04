package com.Exercise1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightPage extends MainPage{

	public FlightPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="flight-adults-hp-flight")	private WebElement flightadults;
	Select selectadults =new Select(flightadults);
	
	@FindBy(id="flight-departing-hp-flight")	private WebElement calendardeparting;

	@FindBy(id="flight-returning-hp-flight")	private WebElement calendarreturning;
	
	@FindBy(xpath="//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/button[2]") private WebElement dateoriginxextmonth;
	
	@FindBy(xpath="//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/button[2]") private WebElement datereturnxextmonth;
	
	@FindBy(xpath="//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[1]/td[7]/button") private WebElement date1;
	
	@FindBy(xpath="//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[2]/td[7]/button") private WebElement date2;
	
	@FindBy(xpath="//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button") private WebElement searchbutton;
	
@FindBy(id="flight-type-roundtrip-label-hp-flight") private WebElement roundtriplabel;
	
	@FindBy(id="flight-origin-hp-flight")	private WebElement flightorigin;
	
	@FindBy(id="flight-destination-hp-flight")	private WebElement flightdestination;
	
	
	public void clicktroundtrip() {
		roundtriplabel.click();
	}
	
	public void sendkeysorigin(String origin) {
		flightorigin.sendKeys(origin);
	}
	
	public void sendkeysdestination(String destination) {
		flightdestination.sendKeys(destination);
	}


	public void selectadtultsdrop(String select) {
		selectadults.selectByVisibleText(select);
	}
	
	public void clickcalendar1() {
		calendardeparting.click();
	}
	
	public void clickcalendar2() {
		calendarreturning.click();
	}	
	public void nextoriginmonthclick() {
		dateoriginxextmonth.click();
	}
	
	public void nextreturnmonthclick() {
		datereturnxextmonth.click();
	}
	
	public void clickdate1() {
		date1.click();
	}
	
	public void clickdate2() {
		date2.click();
	}
	
	public FlightListPage clicksearch() {
		searchbutton.click();
		return new FlightListPage(getDriver());
	}
}
