package com.Exercise1.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Exercise1.pages.FlightPage;
import com.Exercise1.pages.MainPage;
import com.Exercise1.pages.FlightListPage;

public class Test1 extends BaseTest{
	
	@Test
	public void Test() {
		FlightPage page=testMainPage();
		FlightListPage fpage=testFlightPage(page);
		testFlightListPage(fpage);
		
	}
	
	public FlightPage testMainPage(){
		MainPage page = getMainPage();
		page.clickflight();
		FlightPage fpage= page.returnflightpage();
		return fpage;
	}
	
	public FlightListPage testFlightPage(FlightPage page) {
		page.clicktroundtrip();
		page.sendkeysorigin("LAS");
		page.sendkeysdestination("LAX");
		page.selectadtultsdrop("1");
		page.clickcalendar1();
		page.nextoriginmonthclick();
		page.nextoriginmonthclick();
		page.nextoriginmonthclick();
		page.clickdate1();
		page.clickcalendar2();
		page.clickdate2();
		FlightListPage fpage= page.clicksearch();
		return fpage;
	}
	
	public void testFlightListPage(FlightListPage page) {
		Assert.assertTrue(page.verifysort("Price"));
		Assert.assertTrue(page.verifysort("Departure"));
		Assert.assertTrue(page.verifysort("Arrival"));
		Assert.assertTrue(page.verifysort("Duration"));

	  	}
}
