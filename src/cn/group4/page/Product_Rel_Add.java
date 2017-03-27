package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Rel_Add extends BasePage{

	
	Locator iptReleaseTitle = new Locator("iptReleaseTitle");
	Locator btnSaveRel = new Locator("btnSaveRel");
	
	public Product_Rel_Add(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public void typeOniptReleaseTitle(String name) throws Exception
	{
		type(iptReleaseTitle, name);
	}

	public void clickOnbtnSave() throws Exception
	{
		click(btnSaveRel);
	}
	
}
