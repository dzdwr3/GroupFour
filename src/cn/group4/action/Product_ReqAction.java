package cn.group4.action;

import org.openqa.selenium.WebDriver;
import org.python.modules.thread.thread;
import org.testng.Assert;

import cn.group4.page.MyDocument;
import cn.group4.page.Product_Req;
import cn.group4.page.Product_Req_Add;
import cn.group4.utils.PageFactory;

public class Product_ReqAction {
	
	private static WebDriver driver;
	private static Product_Req product_Req;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Product_ReqAction.driver = driver;
	}
	
	//进入提需求页面业务流程
	public static Product_Req_Add intoAddReq() throws Exception{
		ProductAction.setDriver(driver);
		product_Req = ProductAction.intoRequirement();
		product_Req.clickOnbtnAddRequirement();
		return (Product_Req_Add) PageFactory.getPage(Product_Req_Add.class, getDriver());
	}
	//点击关闭按钮业务流程（关闭需求成功测试用例）
	public static Product_Req closeReq(String closereason) throws Exception{
		ProductAction.setDriver(driver);
		product_Req = ProductAction.intoRequirement();
		product_Req.clickOnbtnNotClose();
		product_Req.clickOnbtnClose();
		product_Req.waitForPageLoad(5);
		product_Req.selcCloseReason(closereason);
		product_Req.clickOnbtnSave();
		return product_Req;
	}
	//点击关闭按钮业务流程(关闭需求失败测试用例4)
	public static Product_Req failCloseReq() throws Exception{
		ProductAction.setDriver(driver);
		product_Req = ProductAction.intoRequirement();
		product_Req.clickOnbtnNotClose();
		product_Req.clickOnbtnClose();
		product_Req.waitForPageLoad(5);
		product_Req.clickOnbtnSave();
		System.out.println(product_Req.getJsText());
		Assert.assertEquals(product_Req.getJsText(), "『关闭原因』不能为空。\n");
		Thread.sleep(5000);
		product_Req.intoCloseReasonJs();
		return product_Req;
	}

}
