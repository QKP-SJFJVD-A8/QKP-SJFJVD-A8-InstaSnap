package ReptileProduct;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.GenericLibrary.BaseTest;


public class VerifyReptileProductTest extends BaseTest {
	@Test(groups = "A")
	public void addReptileProduct() throws InterruptedException, IOException {
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

		TakesScreenshot ts = (TakesScreenshot) driver;

		Thread.sleep(2000);
		File temp = ts.getScreenshotAs(OutputType.FILE);

		File perm = new File("./TestScreenshot/ReptileSS/demo1.png");

		FileHandler.copy(temp, perm);

		Thread.sleep(1000);
		Reporter.log("Thank you, your order has been submitted.", true);
	}

	@Test(dependsOnMethods = "addReptileProduct",groups = "B")
	public void removeReptileProduct() throws InterruptedException, IOException {
		// Thread.sleep(1000);
		// driver.findElement(By.partialLinkText("Return")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//area[@alt='Reptiles']")).click();

		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("RP-SN-01")).click();

		Thread.sleep(1000);
		driver.findElement(By.className("Button")).click();

		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Remove")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		Thread.sleep(2000);
		File temp = ts.getScreenshotAs(OutputType.FILE);

		File perm = new File("./TestScreenshot/ReptileSS/demo2.png");

		FileHandler.copy(temp, perm);

		Thread.sleep(1000);
		Reporter.log("Your cart is empty", true);
	}

}
