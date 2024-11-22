package ReptileProduct;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyReptileProductTest {

	@Test
	public void addReptileProduct() {
		Reporter.log("Reptile Product Added Succesful", true);
	}

	@Test(dependsOnMethods = "addReptileProduct")
	public void removeReptileProduct() {
		Reporter.log("Reptile Product Removed Succesful", true);

	}
}
