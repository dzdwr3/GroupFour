package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.action.Product_ReqAction;
import cn.group4.utils.DriverFactory;
import cn.group4.utils.ThreadUtils;
import cn.group4.utils.UITest;

public class Product_ReqTest extends UITest {
	

	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {
		WebDriver driver= DriverFactory.getChromeDriver();
		super.init(driver);
		Product_ReqAction.setDriver(driver);
	}

	@Test(groups="Product_Req")
	public void addrequirement03() throws Exception {
		Product_ReqAction.closeReq("已取消");
	}
	@Test(groups="Product_Req")
	public void addrequirement04() throws Exception {
		Product_ReqAction.failCloseReq();
	}

	
	@AfterMethod(alwaysRun = true)
	public void stop() throws InterruptedException {
		super.stop();
	}
	
}

