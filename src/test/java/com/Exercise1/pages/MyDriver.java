package com.Exercise1.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
	private WebDriver driver;
	
	public MyDriver(String browser){
		switch (browser) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/david.nunez/Documents/clases/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/david.nunez/Downloads/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("test-type");
            options.addArguments("--start-maximized");
            options.addArguments("--disable-web-security");
            options.addArguments("--allow-running-insecure-content");
			driver=new ChromeDriver(options);
			break;
		default:
			break;
		}
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}

}
