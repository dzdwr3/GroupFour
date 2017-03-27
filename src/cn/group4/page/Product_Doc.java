package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Doc extends BasePage {

	Locator btnCreateDoc = new Locator("btnCreateDoc");
	
	public Product_Doc(WebDriver driver) throws Exception {
		super(driver);
	}

	public void clickOnbtnCreateDoc() throws Exception
	{
		click(btnCreateDoc);
	}
	
	
}
