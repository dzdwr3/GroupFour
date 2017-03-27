package cn.group4.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Rel extends BasePage{

	Locator btnAddRelease = new Locator("btnAddRelease"); 
	Locator btnA_Release = new Locator("btnA_Release"); 
	
	public  Product_Rel(WebDriver driver) throws Exception {
		super(driver);
	}

	public void clickOnbtnAddRelease () throws Exception
	{
		click(btnAddRelease);
	}
	
	public void clickOnbtnA_Release () throws Exception
	{
		click(btnA_Release);
	}
	
	public void waitForPageLoad() {
		super.getDriver().manage().timeouts()
				.pageLoadTimeout(30, TimeUnit.SECONDS);
	}
}
