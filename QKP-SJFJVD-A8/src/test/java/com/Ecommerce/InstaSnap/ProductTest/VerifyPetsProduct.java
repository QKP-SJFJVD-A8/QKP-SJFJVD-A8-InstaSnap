package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyPetsProduct extends BaseTest {

	@Test(priority = 1)
	public void createProduct() {

		Reporter.log("Pets Product Created", true);
	}

	@Test(priority = 2,  dependsOnMethods = "createProduct")
	public void updateProduct() {
		Reporter.log("Pets Product Updated", true);

	}

}
