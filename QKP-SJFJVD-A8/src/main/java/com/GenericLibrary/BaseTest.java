package com.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	public static WebDriver static_driver;
	public ExtentSparkReporter spark = null;
	public ExtentTest test = null;
	public ExtentReports report = null;

	@DataProvider
	public    Object[][] registerData() {

		Object[][] data = new Object[3][3];
		
		data[0][0]=101;
		data[0][1]="Ganesh";
		data[0][2]="Tesing";
		
		data[1][0]=102;
		data[1][1]="Kalesha";
		data[1][2]="Devops";
		
		
		data[2][0]=103;
		data[2][1]="Akshith";
		data[2][2]="Develeoper";
		
//		data[3][0]=101;
//		data[3][1]="Ganesh";
//		data[3][2]="Tesing";
		
		
		
		return data;
	}

	@BeforeSuite
	public void reportConfig() {

		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the SparkReport Information
		spark.config().setDocumentTitle("--Doc_Title--");
		spark.config().setReportName("--Report_Title--");
		spark.config().setTheme(Theme.DARK);

		// Create the Extent Report
		report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in Extent Report
		report.setSystemInfo("DeviceName:", "Harry");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-128.0.6613.85 ");

	}

	@AfterSuite
	public void reportTerminate() {

		// Flush the Report Information
		report.flush();

	}

	// @Parameters("BrowserName")
	@BeforeClass
	public void BrowserSetup() {

		String browser = "chrome";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		static_driver = driver;

		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void login() throws InterruptedException {
		String uname = "sravanthi";
		String pswd = "sravs@12345";

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
