package cn.group4.page;



import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Req_Add extends BasePage{
	
	Locator iptReqName = new Locator("iptReqName");
	Locator btnSaveButton = new Locator("btnSaveButton");
	Locator titleLabel = new Locator("titleLabel");
	
	public Product_Req_Add(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public void typeToiptReqName(String name) throws Exception{
		type(iptReqName, name);
	}
	
	public void clickOnbtnSaveButton() throws Exception{
		pageDown();
		click(btnSaveButton);
	}
	//判断元素是否可见
	public boolean isPrestenttitleLabel() throws Exception{
		return isElementPresent(titleLabel, 1);
	}

}
