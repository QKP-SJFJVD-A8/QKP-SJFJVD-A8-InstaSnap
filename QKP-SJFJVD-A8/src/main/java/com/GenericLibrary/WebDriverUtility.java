package com.GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility 
{
	public WebDriver driver;
	public static WebDriver staticdriver;

	public void launchBrowser(String browser) 
	{
		Reporter.log("Browser Launched Succesfully", true);
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			// Step 1.1: Launch the browser - chrome
			driver = new ChromeDriver();
			staticdriver=driver;
		}

		else if (browser.equals("edge")) {
			// Step 1.1: Launch the browser - Edge
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else if (browser.equals("firefox")) {
			// Step 1.1: Launch the browser - Firefox
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			Reporter.log("You Stupid Fellow Enter Valid Browser Name !!!!!!!!!!!!!!!!!!", true);
			Reporter.log("So I Will Run My Default Browser", true);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

	}

	
		// TODO Auto-generated method stub
		
	

}
