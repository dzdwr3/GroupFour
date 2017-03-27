package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Mov extends BasePage{
	
	Locator btnToDay = new Locator("btnToDay");

	public Product_Mov(WebDriver driver) throws Exception {
		super(driver);
	}
	
	//判断动态页面中“今天”元素是否存在
	public  boolean isPrestentbtnToDay() throws Exception{
		return isElementPresent(btnToDay, 10);
	}
	

}
