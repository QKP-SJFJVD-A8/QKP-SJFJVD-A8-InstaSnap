package com.pageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatsProductPage {
	@FindBy(xpath="//area[contains(@alt,'Cats')]")   
	private WebElement catsicon;
	
	@FindBy(linkText ="FL-DSH-01")   
	private WebElement catproductid;

	@FindBy(linkText ="EST-14")   
	private WebElement catitemid;

	@FindBy(linkText ="Add to Cart")   
	private WebElement addtocart;
	
	@FindBy(name ="EST-14")   
	private WebElement quantityclick;
	
	@FindBy(name ="EST-14")   
	private WebElement quantityclear;
	
	@FindBy(name="EST-14")   
	private WebElement quantity;

	@FindBy(name="updateCartQuantities")   
	private WebElement updatecart;
	
	@FindBy(linkText ="Proceed to Checkout")   
	private WebElement proceedtocheckout;
	
	@FindBy(name="newOrder")   
	private WebElement Continue;
	
	@FindBy(linkText ="Confirm")   
	private WebElement confirm;

	public CatsProductPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	 public void getCatsIcon()
	 {
		 catsicon.click();
	 }
	 public void getCatProductId()
	 {
		 catproductid.click();
	 }
	 public void getCatItemId()
	 {
		 catitemid.click();
	 }
	 public void getAddToCart()
	 {
		 addtocart.click();
	 }
	 public void getQuantityClick()
	 {
		 quantityclick.click();
	 }
	 public void getQuantityClear()
	 {
		 quantityclear.click();
	 }
	 public void getQuantity(String data)
	 {
		 quantity.sendKeys(data);
	 }
	 public void getUpdateCart()
	 {
		 updatecart.click();
	 }
	 public void getProceedToCheckout()
	 {
		 proceedtocheckout.click();
	 }
	 public void getContinue()
	 {
		 Continue.click();
	 }
	 public void getConfirm()
	 {
         confirm.click();
	 }
	
	//remove cats product
	 
	 @FindBy(xpath="//area[contains(@alt,'Cats')]")   
		private WebElement catsicon1;
		
		@FindBy(linkText ="FL-DSH-01")   
		private WebElement catproductid1;

		@FindBy(linkText ="EST-14")   
		private WebElement catitemid1;

		@FindBy(linkText ="Add to Cart")   
		private WebElement addtocart1;
		
		@FindBy(name ="EST-14")   
		private WebElement quantityclick1;
		
		@FindBy(name ="EST-14")   
		private WebElement quantityclear1;
	
		@FindBy(name="EST-14")   
		private WebElement quantity1;

		@FindBy(name="updateCartQuantities")   
		private WebElement updatecart1;
		
		@FindBy(linkText = "Remove")
		private WebElement remove;
		
		 public void getCatsIcon1()
		 {
			 catsicon1.click();
		 }
		 public void getCatProductId1()
		 {
			 catproductid1.click();
		 }
		 public void getCatItemId1()
		 {
			 catitemid1.click();
		 }
		 public void getAddToCart1()
		 {
			 addtocart1.click();
		 }
		 public void getQuantityClick1()
		 {
			 quantityclick1.click();
		 }
		 public void getQuantityClear1()
		 {
			 quantityclear1.click();
		 }

		 public void getQuantity1(String data)
		 {
			 quantity1.sendKeys(data);
		 }
		 public void getUpdateCart1()
		 {
			 updatecart1.click();
		 }
		 public void getRemove()
		 {
			 remove.click();
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
