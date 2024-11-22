package BirdsProduct;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class verifyBirdsProductTest extends BaseTest {
	@Test
	public void addBirdsProduct() throws IOException {

		driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();
		driver.findElement(By.linkText("AV-CB-01")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-18")).clear();
		driver.findElement(By.name("EST-18")).sendKeys("20");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.linkText("Confirm")).click();
		WebElement addmsg = driver.findElement(By.xpath("//li[contains(text(),'Thank')]"));
		Reporter.log(addmsg.getText(),true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File addtemp = ts.getScreenshotAs(OutputType.FILE);
		File addper = new File("./BirdsScreenshot/Addbirdproduct.png");
		FileHandler.copy(addtemp, addper);
		Reporter.log("Screenshot taken succesfully",true);
	}
	
	@Test
	public void removeBirdsProduct() throws IOException {
		driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();
		driver.findElement(By.linkText("AV-CB-01")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-18")).clear();
		driver.findElement(By.name("EST-18")).sendKeys("20");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Remove")).click();
		WebElement remmsg = driver.findElement(By.xpath("//b[contains(text(),'empty')]"));
		Reporter.log(remmsg.getText(),true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File remtemp = ts.getScreenshotAs(OutputType.FILE);
		File remper = new File("./BirdsScreenshot/Removebirdproduct.png");
		FileHandler.copy(remtemp, remper);
		Reporter.log("Screenshot taken succesfully",true);
	}

}
