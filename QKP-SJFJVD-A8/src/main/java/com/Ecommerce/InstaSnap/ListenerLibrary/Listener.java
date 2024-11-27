package com.Ecommerce.InstaSnap.ListenerLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;
import com.Ecommerce.InstaSnap.WebDriverLibrary.WebDriverUtility;

public class Listener implements ITestListener {

	public void onTestFailure(ITestResult result) {

		String methodname = result.getName();

		// Takes Screenshot implements
		TakesScreenshot tsobj = (TakesScreenshot) BaseTest.static_driver;

		// call the Screenshot method
		File temp = tsobj.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./ListenerSS/" + methodname + ".png");
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
