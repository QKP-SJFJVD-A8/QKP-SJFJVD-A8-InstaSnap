package FishProduct;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;


public class VerifyFishProductTest extends BaseTest 
{

	@Test(groups = "A")
	public void addFishProduct() 
	{
		Reporter.log("Fish Product Added Succesful", true);
	}

	@Test(dependsOnMethods = "addFishProduct",groups = "B")
	public void removeFishProduct() 
	{
		Reporter.log("Fish Product Removed Succesful", true);

	}

}
