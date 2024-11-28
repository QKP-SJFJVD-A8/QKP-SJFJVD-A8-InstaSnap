package com.pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReptileProductPage {

	// Step1:Declaration
	@FindBy(xpath = "")
	private WebElement reptileicon;

	// Step2:Initilization
	public ReptileProductPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	
	// Step3:Utilization
	public WebElement getReptileicon() {
		return reptileicon;
	}

	public void setReptileicon(WebElement reptileicon) {
		this.reptileicon = reptileicon;
	}



}
