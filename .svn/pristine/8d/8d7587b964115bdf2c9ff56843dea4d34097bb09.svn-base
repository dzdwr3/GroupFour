package cn.group4.page;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class MyDocument_CreatDoc extends BasePage {

	Locator iptDocTitle = new Locator("iptDocTitle");
	Locator btnSave = new Locator("btnSave");
	
	public MyDocument_CreatDoc(WebDriver driver) throws Exception {
		super(driver);
	}
	
	/**
	 * 这个方法用来操作MyDocument_CreatDoc界面 文章标题输入框iptDocTitle元素
	 * 
	 * @author Zither
	 * @param values
	 * @throws Exception
	 */
	public void typeTobtnAddDocument(String values ) throws Exception
	{
		type(iptDocTitle, values);
	}
	
	public void clickOnbtnSave() throws Exception
	{
		click(btnSave);
	}

	
	
}
