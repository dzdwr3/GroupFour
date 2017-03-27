package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Mod extends BasePage{
	Locator iptModName = new Locator("iptModName");
	Locator iptModNick = new Locator("iptModNick");

	public Product_Mod(WebDriver driver) throws Exception {
		super(driver);
	}
	
	
	

}
