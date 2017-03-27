package cn.group4.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Plan_Create extends BasePage{
	
	Locator iptPlanName = new Locator("iptPlanName");
	static Locator iptBeginTime = new Locator("iptBeginTime");
	Locator iptEndTime = new Locator("iptEndTime");
	Locator btnSaveButton = new Locator("btnSaveButton");

	public Product_Plan_Create(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public void typeiptPlanName(String planname) throws Exception{
		type(iptPlanName, planname);
	}
	
	public void typeiptBeginTime(String begintime) throws Exception{
		type(iptBeginTime, begintime);
	}
	
	public void typeiptEndTime(String endtime) throws Exception{
		type(iptEndTime, endtime);
	}
	
	public void clickOnbtnSaveButton() throws Exception{
		click(btnSaveButton);
	}
	
	public void deleteiptBeginTimeText() throws Exception{
		clearInputText(iptBeginTime);
	}

	public void alertAccept(){
		alertConfirm();
	}

}
