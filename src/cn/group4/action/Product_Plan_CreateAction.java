package cn.group4.action;


import org.openqa.selenium.WebDriver;

import cn.group4.page.Product_Plan_Create;

public class Product_Plan_CreateAction {
	
	private static WebDriver driver;
	private static Product_Plan_Create product_Plan_Create;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Product_Plan_CreateAction.driver = driver;
	}
	
	//创建计划（测试用例6）
	public static Product_Plan_Create createplanpage(String planname,String begintime,String endtime) throws Exception{
		Product_PlanAction.setDriver(driver);
		product_Plan_Create = Product_PlanAction.createPlan();
		product_Plan_Create.typeiptPlanName(planname);
		product_Plan_Create.deleteiptBeginTimeText();
		product_Plan_Create.typeiptBeginTime(begintime);
		product_Plan_Create.typeiptEndTime(endtime);
		product_Plan_Create.clickOnbtnSaveButton();	
		return product_Plan_Create;
	}
	//创建计划（测试用例7）
	public static Product_Plan_Create failCreateplanpage(String planname,String begintime,String endtime) throws Exception{
		Product_Plan_CreateAction.createplanpage(planname,begintime,endtime);
		product_Plan_Create.alertAccept();
		return product_Plan_Create;
	}
	

}
