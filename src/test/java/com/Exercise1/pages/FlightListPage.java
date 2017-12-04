package com.Exercise1.pages;

import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightListPage extends BasePage{

	public FlightListPage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}

	@FindBy (xpath="//*[@id=\"flight-wizard-search-button\"]") private WebElement button1;
	
	@FindBy(xpath="//*[@id=\"titleBar\"]/h1/div/span[1]")	private WebElement titleBar;

	@FindBy(xpath="//*[@id=\"sortBar\"]/div/fieldset/label/select")	private WebElement sortlist;
	Select sort =new Select(sortlist);
	
	@FindBy(partialLinkText="Select")	public WebElement test1;
	
	public String gettitle() {
		return (titleBar.getText());
	}
	
		
	public boolean verifysort(String element) {
		List<WebElement> list1=sort.getOptions();
		for (int i=0; i<list1.size();i++) {
			sort.selectByIndex(i);
			String selected=sort.getFirstSelectedOption().getText();
			if (selected.contains(element)) {
					return true;}
		}
		return false;
	}
}
