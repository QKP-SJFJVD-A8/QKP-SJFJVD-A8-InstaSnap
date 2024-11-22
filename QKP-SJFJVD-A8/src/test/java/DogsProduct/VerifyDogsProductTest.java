package DogsProduct;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyDogsProductTest {
	@Test
	public void addDogsProduct() 
	{
		Reporter.log("Dogs Product Added Succesful", true);
	}

	@Test(dependsOnMethods = "addDogsProduct")
	public void removeDogsProduct() 
	{
		Reporter.log("Dogs Product Removed Succesful", true);

	}

}
