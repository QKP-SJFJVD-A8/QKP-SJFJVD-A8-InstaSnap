package CatsProduct;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyCatsProduct extends BaseTest {
	@Test
	public void addProduct() {
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

	}

	@Test
	public void removeProduct() {
		driver.findElement(By.xpath("//area[contains(@alt,'Cats')]")).click();
		driver.findElement(By.linkText("FL-DSH-01")).click();
		driver.findElement(By.linkText("EST-14")).click();
		driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.name("EST-14")).click();
		driver.findElement(By.name("EST-14")).clear();
		driver.findElement(By.name("EST-14")).sendKeys("10");
		driver.findElement(By.name("updateCartQuantities")).click();
		driver.findElement(By.linkText("Remove")).click();

	}

}
