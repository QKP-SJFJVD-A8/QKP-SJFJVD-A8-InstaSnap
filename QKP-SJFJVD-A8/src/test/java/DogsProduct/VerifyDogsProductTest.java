package DogsProduct;
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

public class VerifyDogsProductTest extends BaseTest{
	@Test
	public void adddogsproduct() throws IOException {
		driver.findElement(By.xpath("//area[contains(@alt,'Dogs')]")).click();
		;
		driver.findElement(By.linkText("K9-BD-01")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-6")).clear();
		driver.findElement(By.name("EST-6")).sendKeys("20");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Proceed to Checkout")).click();
		driver.findElement(By.name("newOrder")).click();
		driver.findElement(By.linkText("Confirm")).click();
		WebElement addmsg = driver.findElement(By.xpath("//li[contains(text(),'Thank you')]"));
		Reporter.log(addmsg.getText(), true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./DogsProductScreenshot/AddDogProduct.png");
		FileHandler.copy(temp, perm);
		Reporter.log("Screenshot taken succesfully", true);
	}

@Test
public void removeBirdsProduct() throws IOException {
	driver.findElement(By.xpath("//area[contains(@alt,'Dogs')]")).click();
	driver.findElement(By.linkText("K9-BD-01")).click();
	driver.findElement(By.linkText("Add to Cart")).click();
	driver.findElement(By.name("EST-6")).clear();
	driver.findElement(By.name("EST-6")).sendKeys("20");
	driver.findElement(By.name("updateCartQuantities")).click();
	driver.findElement(By.linkText("Remove")).click();
	WebElement remmsg = driver.findElement(By.xpath("//b[contains(text(),'Your cart is empty.')]"));
	Reporter.log(remmsg.getText(),true);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File perm = new File("./DogsProductScreenshot/RemoveDogsProduct.png");
	FileHandler.copy(temp, perm);
	Reporter.log("Screenshot taken succesfully",true);

}

}
