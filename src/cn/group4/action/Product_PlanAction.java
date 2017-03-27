package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.Product_Plan;
import cn.group4.page.Product_Plan_Create;
import cn.group4.utils.PageFactory;

public class Product_PlanAction {
	
	private static WebDriver driver;
	private static Product_Plan product_Plan; 

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Product_PlanAction.driver = driver;
	}
	//点击创建计划按钮业务流程
	public static Product_Plan_Create createPlan() throws Exception{
		ProductAction.setDriver(driver);
		product_Plan = ProductAction.intoPlan();
		product_Plan.clickOnbtnCreatePlan();
		return (Product_Plan_Create) PageFactory.getPage(Product_Plan_Create.class, getDriver());	
	}

}
