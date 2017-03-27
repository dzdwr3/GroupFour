package cn.group4.page;


import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class MyZone extends BasePage{

	Locator btnSignOut = new Locator("btnSignOut");
	private Locator profile= new Locator("profile");
	private Locator myMainPage= new Locator("myMainPage");
	private Locator btnProduct = new Locator("btnProduct");
	private Locator btnDocument = new Locator("btnDocument");
	
	
	/**
	 *	click SignOut button
	 *	@author Zither
	 */
	public void  clickbtnSignOut() throws Exception
	{
		click(btnSignOut);
	}
	
	public MyZone(WebDriver driver) throws Exception {
		super(driver);
	}

	public void clickOnMyProfile() throws Exception
	{
		click(profile);
	}
	public void clickOnbtnProduct() throws Exception
	{
		click(btnProduct);
	}
	/* 封装点及文档按钮的方法  */
	public void clickOnbtnDocument() throws Exception
	{
		click(btnDocument);
	}
	
	public void clickOnMainPage() throws Exception
	{
		clickOnMyProfile();
		click(myMainPage);
	}

}
