package CatsProduct;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;


public class VerifyCatsProduct extends BaseTest {
	@Test
	public void addProduct() throws IOException {
		driver.findElement(By.xpath("//area[contains(@alt,'Cats')]")).click();
		driver.findElement(By.linkText("FL-DSH-01")).click();
		driver.findElement(By.linkText("EST-14")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-14")).click();
		driver.findElement(By.name("EST-14")).clear();
		driver.findElement(By.name("EST-14")).sendKeys("10");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.linkText("Confirm")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./TestScreenshot/CatsProductscreenshot/CatsProduct.png");
		FileHandler.copy(temp, perm);
		Reporter.log("Added product screenshot taken successfully",true);	
	}

	@Test(dependsOnMethods = "addProduct")
	public void removeProduct() throws IOException {
		driver.findElement(By.xpath("//area[contains(@alt,'Cats')]")).click();
		driver.findElement(By.linkText("FL-DSH-01")).click();
		driver.findElement(By.linkText("EST-14")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-14")).click();
		driver.findElement(By.name("EST-14")).clear();
		driver.findElement(By.name("EST-14")).sendKeys("10");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Remove")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./TestScreenshot/CatsProductscreenshot/removecatsproduct.png");
		FileHandler.copy(temp, perm);
		Reporter.log("screenshot taken successfully after removing product",true);
	}

}
