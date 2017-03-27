package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Plan extends BasePage{
	
	Locator btnCreatePlan = new Locator("btnCreatePlan");

	public Product_Plan(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public void clickOnbtnCreatePlan() throws Exception{
		click(btnCreatePlan);
	}
	

}
