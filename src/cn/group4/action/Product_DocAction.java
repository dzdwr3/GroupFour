package cn.group4.action;

import org.openqa.selenium.WebDriver;
import cn.group4.page.Product_Doc;
import cn.group4.page.Product_Doc_Add;
import cn.group4.utils.PageFactory;

public class Product_DocAction {

	private static WebDriver driver;
	private static Product_Doc product_Doc;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Product_DocAction.driver = driver;
	}
	
	public static Product_Doc_Add clickOnCreateDoc() throws Exception{
		
		ProductAction.setDriver(driver);
		product_Doc = ProductAction.intoDoc();
		product_Doc.clickOnbtnCreateDoc();
		return (Product_Doc_Add) PageFactory.getPage(Product_Doc_Add.class, getDriver());	
	}
}
