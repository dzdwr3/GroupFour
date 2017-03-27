package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.LoginPage;
import cn.group4.page.Product_CreatProduct;
import cn.group4.utils.PageFactory;

public class Product_CreatProductAction {
	private static WebDriver driver;
	private static Product_CreatProduct product_CreatProduct;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Product_CreatProductAction.driver = driver;
	}

	/**
	 *	Edit product details and save
	 *	@author Zither
	 */
	public static Product_CreatProduct addProductDetails(String productName , String productCode) throws Exception
	{
		ProductAction.setDriver(driver);
		product_CreatProduct = ProductAction.addProduct();
		product_CreatProduct.typeToiptProductName(productName);
		product_CreatProduct.typeToiptProductCode(productCode);
		product_CreatProduct.clickOnbtnSave();
		return product_CreatProduct;
	}
	
	/**
	 *	SignOut
	 *	@author Zither
	 */
	public static LoginPage signOut() 
	{
		try {
			product_CreatProduct.clickbtnSignOut();
			product_CreatProduct.waitForPageLoad(1);
		} catch (Exception e) {
		}
		return (LoginPage) PageFactory.getPage(LoginPage.class, getDriver());
	}
	
	
}
