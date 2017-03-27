package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.Product_Rel_Add;
import cn.group4.page.Product_Rel_Details;
import cn.group4.page.Product_Rel;
import cn.group4.utils.PageFactory;

public class Product_RelAction {

	private static WebDriver driver;
	private static Product_Rel release;
	private static Product_Rel intoRelDetails;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Product_RelAction.driver = driver;
	}
	
	public static Product_Rel_Add btnAddRelease() throws Exception {
		
		ProductAction.setDriver(driver);
		release = ProductAction.intoRelease();
		release.clickOnbtnAddRelease();
		return (Product_Rel_Add) PageFactory.getPage(Product_Rel_Add.class, getDriver());	
	}
	
	public static Product_Rel_Details btnDelRelease() throws Exception {
		
		ProductAction.setDriver(driver);
		intoRelDetails = ProductAction.intoRelease();
		intoRelDetails.clickOnbtnA_Release();
		return (Product_Rel_Details) PageFactory.getPage(Product_Rel_Details.class, getDriver());	
	}
}
