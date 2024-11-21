package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anusha {
	 public WebDriver  driver;

	@BeforeClass
	public void Browsersetup() {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver = new ChromeDriver();
		Reporter.log("Browser launched",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login successful", true);
		// navigate to application
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("Anusha");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Anusha@123");
		driver.findElement(By.name("signon")).click();
		
	}
	
	@Test
	public void addProduct() {
		Reporter.log("product added successfully", true);
		
		
		
		
	}
	
	@AfterMethod
	public void  logout() {
		Reporter.log("logout successfull", true);
		driver.findElement(By.linkText("Sign Out")).click();
		Reporter.log("logout successful", true);
		
	}
	@AfterClass
		public void TerminateBrowser() {
			Reporter.log("Browser Closed ", true);
			driver.close();
		
	}
	
	

}

