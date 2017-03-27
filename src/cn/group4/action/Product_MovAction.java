package cn.group4.action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cn.group4.page.Product_Mov;

public class Product_MovAction {
	
	private static WebDriver driver;
	private static Product_Mov product_Mov;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Product_MovAction.driver = driver;
	}
	//测试用例5，是否能跳转动态页面
	public static Product_Mov viewMovPage() throws Exception{
		ProductAction.setDriver(driver);
		product_Mov = ProductAction.intoMovement();
		Assert.assertTrue(product_Mov.isPrestentbtnToDay(),"failClickMovement");
		return product_Mov;
	}

}
