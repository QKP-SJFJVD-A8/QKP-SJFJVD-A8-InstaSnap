package com.Ecommerce.InstaSnap.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public  WebDriver driver;

	@Parameters("BrowserName")
	@BeforeClass
	public void BrowserSetup(String browser) {
		Reporter.log("Browser Launched Succesfully", true);
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			// Step 1.1: Launch the browser - chrome
			driver = new ChromeDriver();
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
			Reporter.log("You Stupid Fellow Enter Valid Browser Name !!!!!!!!!!!!!!!!!!",true);
			Reporter.log("So I Will Run My Default Browser",true);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void login() throws InterruptedException {
		String uname="Sahithi83285";
		String pswd="Sahi@83285";
		
		
		Reporter.log("Login Successful", true);
		// Step 1.2 : Navigate to application
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");

		Thread.sleep(3000);

		// Step 5 : Click on "Sign in" link
		driver.findElement(By.linkText("Sign In")).click();

		// Step 5.1 : Enter the User ID
		driver.findElement(By.name("username")).sendKeys(uname);
		// Step 5.2 : Enter the Password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pswd);

		// Step 5.3 : Click on "Login" button
		driver.findElement(By.name("signon")).click();
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Log out Successful", true);
		// Click On "SignOut" Button
		driver.findElement(By.linkText("Sign Out")).click();

	}

	@AfterClass
	public void TerminateBrowser() {
		Reporter.log("Browser Closed Succesfully", true);
		driver.close();
	}
}
