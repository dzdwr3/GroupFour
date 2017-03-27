package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product extends BasePage{
	
	Locator btnSignOut = new Locator("btnSignOut");
	Locator btnAddProduct = new Locator("btnAddProduct"); 
	Locator btnRequirement = new Locator("btnRequirement");
	Locator btnMovement = new Locator("btnMovement");
	Locator btnPlan = new Locator("btnPlan");
	Locator btnRelease = new Locator("btnRelease"); 
	Locator btnRoadMap = new Locator("btnRoadMap"); 
	Locator btnDoc = new Locator("btnDoc");
	Locator btnPrj = new Locator("btnPrj");
	Locator btnMod = new Locator("btnMod");
	Locator btnGen = new Locator("btnGen");
	
	//pageFactory类中要调用该有参构造，必须设置为公开
	public Product(WebDriver driver) throws Exception {
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
	
	
	public void clickOnbtnAddProduct() throws Exception
	{
		click(btnAddProduct);
	}
	public void clickOnbtnRequirement() throws Exception
	{
		click(btnRequirement);
	}
	
	public void clickOnbtnMovement () throws Exception
	{
		click(btnMovement);
	}
	
	public void clickOnbtnPlan () throws Exception
	{
		click(btnPlan);
	}
	
	public void clickOnbtnRelease () throws Exception
	{
		click(btnRelease);
	}
	
	public void clickOnbtnRoadMap () throws Exception
	{
		click(btnRoadMap);
	}
	
	public void clickOnbtnDoc () throws Exception
	{
		click(btnDoc);
	}
	public void clickOnbtnPrj () throws Exception
	{
		click(btnPrj);
	}
	public void clickOnbtnMod () throws Exception
	{
		click(btnMod);
	}
	public void clickOnbtnGen () throws Exception
	{
		click(btnGen);
	}
	
	
	
	

}
