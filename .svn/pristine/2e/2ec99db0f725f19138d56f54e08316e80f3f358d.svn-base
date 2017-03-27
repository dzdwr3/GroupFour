package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.action.Product_MovAction;
import cn.group4.utils.DriverFactory;
import cn.group4.utils.UITest;

public class Product_MovTest extends UITest {
	WebDriver driver = DriverFactory.getChromeDriver();

	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {
		super.init(driver);
		Product_MovAction.setDriver(driver);	
	}

	@Test
	public void viewMovpage() throws Exception {
		Product_MovAction.viewMovPage();
	}
	

	@AfterMethod(alwaysRun = true)
	public void stop() throws InterruptedException {
		super.stop();
	}
}
