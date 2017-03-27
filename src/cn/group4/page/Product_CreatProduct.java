package cn.group4.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_CreatProduct extends BasePage{
	
	Locator btnSignOut = new Locator("btnSignOut");
	Locator iptProductName = new Locator("iptProductName");
	Locator iptProductCode = new Locator("iptProductCode");
	//ifream中的元素定位 待解决
	Locator btnSave = new Locator("btnSave");
	Locator infoProductName = new Locator("infoProductName");

	public Product_CreatProduct(WebDriver driver) throws Exception {
		super(driver);
	}
	
	/**
	 *	click SignOut button
	 *	@author Zither
	 */
	public void  clickbtnSignOut() throws Exception
	{
		click(btnSignOut);
	}
	
	public void typeToiptProductName(String values) throws Exception
	{
		type(iptProductName, values);
	}
	
	public void typeToiptProductCode(String values) throws Exception
	{
		type(iptProductCode, values);
	}
	
	public void  clickOnbtnSave() throws Exception
	{
		scrollToElement(btnSave);
		click(btnSave);
	}
	
	

}
