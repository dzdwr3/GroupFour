package cn.group4.action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cn.group4.page.Product_Req_Add;

public class Product_Req_AddAction {
	
	private static WebDriver driver;
	private static Product_Req_Add product_Req_Add;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Product_Req_AddAction.driver = driver;
	}
	
	//提需求业务流程(测试用例1)
	public static Product_Req_Add addRequirement(String name) throws Exception{
		Product_ReqAction.setDriver(driver);
		product_Req_Add = Product_ReqAction.intoAddReq();
		product_Req_Add.typeToiptReqName(name);
		product_Req_Add.clickOnbtnSaveButton();
		return product_Req_Add;
	}
	//提需求失败测试用例2
	public static Product_Req_Add failaddRequirement() throws Exception{
		Product_ReqAction.setDriver(driver);
		product_Req_Add = Product_ReqAction.intoAddReq();
		product_Req_Add.clickOnbtnSaveButton();
		Assert.assertTrue(product_Req_Add.isPrestenttitleLabel(), "test failed");
		return product_Req_Add;
	}


}
