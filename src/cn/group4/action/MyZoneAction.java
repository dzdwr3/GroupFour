package cn.group4.action;


import org.openqa.selenium.WebDriver;

import cn.group4.page.LoginPage;
import cn.group4.page.MyDocument;
import cn.group4.page.MyZone;
import cn.group4.page.Product;
import cn.group4.utils.PageFactory;

public class MyZoneAction {
	private static WebDriver driver;
	private static MyZone myZone;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		MyZoneAction.driver = driver;
	}
	
	/**
	 *	SignOut
	 *	@author Zither
	 */
	public static void signOut() 
	{
		try {
			myZone.clickbtnSignOut();
			myZone.waitForPageLoad(1);
		} catch (Exception e) {
		}
	}

	
	public static MyZone viewMyProfile() throws Exception {

		LoginPageAction.setDriver(driver);
		myZone = LoginPageAction.login();
		myZone.clickOnMainPage();
		return myZone;
	}
	
	public static Product intoProduct() throws Exception
	{
		LoginPageAction.setDriver(driver);
		myZone = LoginPageAction.login();
		myZone.clickOnbtnProduct();
		return (Product) PageFactory.getPage(Product.class, getDriver());
	}
	
	//进入文档页 的业务流程
	public static MyDocument intoDocument() throws Exception
	{
		LoginPageAction.setDriver(driver);
		myZone = LoginPageAction.login();
		myZone.clickOnbtnDocument();
		return (MyDocument) PageFactory.getPage(MyDocument.class, getDriver());
	}
}
