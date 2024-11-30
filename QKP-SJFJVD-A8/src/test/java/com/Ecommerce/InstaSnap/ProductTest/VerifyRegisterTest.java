package com.Ecommerce.InstaSnap.ProductTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyRegisterTest {

	@Test()
	public void Register() throws InterruptedException, EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/ReffrenceDocument/RegisterPetStore.xlsx");

		Workbook book = WorkbookFactory.create(fis);

		String url = book.getSheet("Sheet 1").getRow(0).getCell(0).toString();

		String Userid = book.getSheet("Sheet 1").getRow(0).getCell(1).toString();

		String newpassword = book.getSheet("Sheet 1").getRow(0).getCell(2).toString();

		String repeatpassword = book.getSheet("Sheet 1").getRow(0).getCell(3).toString();

		String firstname = book.getSheet("Sheet 1").getRow(0).getCell(4).toString();

		String lastname = book.getSheet("Sheet 1").getRow(0).getCell(5).toString();

		String email = book.getSheet("Sheet 1").getRow(0).getCell(6).toString();

		String phone = book.getSheet("Sheet 1").getRow(0).getCell(7).toString();

		String adress1 = book.getSheet("Sheet 1").getRow(0).getCell(8).toString();

		String adress2 = book.getSheet("Sheet 1").getRow(0).getCell(9).toString();

		String city = book.getSheet("Sheet 1").getRow(0).getCell(10).toString();

		String state = book.getSheet("Sheet 1").getRow(0).getCell(11).toString();

		String zip = book.getSheet("Sheet 1").getRow(0).getCell(12).toString();

		String country = book.getSheet("Sheet 1").getRow(0).getCell(13).toString();

		//Step1:Launch Browser and Navigate To App
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);

		// Step 2 : Click on "sign in" link on top right center of the homepage
		driver.findElement(By.linkText("Sign In")).click();

		// Step 3 : Click on "Register Now!" button
		driver.findElement(By.partialLinkText("Register")).click();

		// Step 4 : Enter the registration details
		// Step 4.1 : Enter the User ID
		driver.findElement(By.name("username")).sendKeys(Userid);
		// Step 4.2 : Enter the New password
		driver.findElement(By.name("password")).sendKeys(newpassword);
		// Step 4.3 : Enter the Repeat password
		driver.findElement(By.name("repeatedPassword")).sendKeys(repeatpassword);

		// Step 4.4 : Enter the First Name
		driver.findElement(By.name("account.firstName")).sendKeys(firstname);
		// Step 4.5 : Enter the Last Name
		driver.findElement(By.name("account.lastName")).sendKeys(lastname);
		// Step 4.6 : Enter the Email
		driver.findElement(By.name("account.email")).sendKeys(email);
		// Step 4.7 : Enter the Phone
		driver.findElement(By.name("account.phone")).sendKeys(phone);
		// Step 4.8 : Enter the Address 1
		driver.findElement(By.name("account.address1")).sendKeys(adress1);
		// Step 4.9 : Enter the Address 2
		driver.findElement(By.name("account.address2")).sendKeys(adress2);
		// Step 4.10 : Enter the City
		driver.findElement(By.name("account.city")).sendKeys(city);
		// Step 4.11 : Enter the State
		driver.findElement(By.name("account.state")).sendKeys(state);
		// Step 4.12 : Enter the Zip
		driver.findElement(By.name("account.zip")).sendKeys(zip);
		// Step 4.13 : Enter the Country
		driver.findElement(By.name("account.country")).sendKeys(country);
		// Step 4.14 : Click on "Enable MyList" checkbox
		driver.findElement(By.name("account.listOption")).click();
		// Step 4.15 : Click on "Enable MyBanner" checkbox
		driver.findElement(By.name("account.bannerOption")).click();

		// Step 4.16 : Click on "Save Account Information" button
		driver.findElement(By.name("newAccount")).click();

		Thread.sleep(5000);

		// Step 5 : Click on "Sign in" link
		//driver.findElement(By.linkText("Sign In")).click();

		Reporter.log("Registeration completed", true);
		
		driver.close();

	}

	@Test(dataProvider = "registerData", enabled = false)
	public void demoRegisterTest(int id, String name, String dept) {

		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);

	}

}
