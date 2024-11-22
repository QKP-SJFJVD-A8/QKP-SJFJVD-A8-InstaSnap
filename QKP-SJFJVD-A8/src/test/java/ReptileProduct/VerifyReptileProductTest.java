package ReptileProduct;

	
	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.Reporter;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class VerifyReptileProductTest
	{
		WebDriver driver;
		@BeforeMethod
		public void Signin() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://petstore.octoperf.com/actions/Catalog.action");
			
			Thread.sleep(1000);
			// Step 1 : Click on "Sign in" link
			driver.findElement(By.linkText("Sign In")).click();

			Thread.sleep(1000);
			// Step 1.1 : Enter the User ID
			driver.findElement(By.name("username")).sendKeys("ganeshD609");
			
			Thread.sleep(1000);
			// Step 1.2 : Enter the Password
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("ganesh@609");

			Thread.sleep(1000);
			// Step 1.3 : Click on "Login" button
			driver.findElement(By.name("signon")).click();
			
			Reporter.log("Signin Successfully", true);
		}
		
		@Test
		public void AddProduct() throws InterruptedException, IOException
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//area[@alt='Reptiles']")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.partialLinkText("RP-SN-01")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.className("Button")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.name("EST-11")).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.name("EST-11")).sendKeys("10");
			
			Thread.sleep(1000);
			driver.findElement(By.name("updateCartQuantities")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[contains(text(),'Proceed')]")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.name("newOrder")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.className("Button")).click();
			
	        TakesScreenshot ts = (TakesScreenshot)driver;
			
			Thread.sleep(2000);
			File temp = ts.getScreenshotAs(OutputType.FILE);
			System.out.println(temp);
			
			File perm = new File("./ReptileSS/demo1.png");
			System.out.println(perm);
			
			FileHandler.copy(temp, perm);
			
			Thread.sleep(1000);
			Reporter.log("Thank you, your order has been submitted.", true);
		}
		
			@Test
			public void RemoveProduct() throws InterruptedException, IOException
			{
				//Thread.sleep(1000);
				//driver.findElement(By.partialLinkText("Return")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//area[@alt='Reptiles']")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.partialLinkText("RP-SN-01")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.className("Button")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.partialLinkText("Remove")).click();
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				
				Thread.sleep(2000);
				File temp = ts.getScreenshotAs(OutputType.FILE);
				System.out.println(temp);
				
				File perm = new File("./ReptileSS/demo2.png");
				System.out.println(perm);
				
				FileHandler.copy(temp, perm);
				
				Thread.sleep(1000);
				Reporter.log("Your cart is empty", true);
			}
			
			@AfterMethod
			public void Signout()
			{
				driver.close();
			}
	}


