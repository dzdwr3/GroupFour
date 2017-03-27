package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.action.Product_Plan_CreateAction;
import cn.group4.utils.DriverFactory;
import cn.group4.utils.UITest;

public class Product_PlanTest extends UITest {
	WebDriver driver = DriverFactory.getChromeDriver();

	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {
		super.init(driver);
		Product_Plan_CreateAction.setDriver(driver);		
	}

//	@Test
//	public void addProduct01() throws Exception {
//		Product_Plan_CreateAction.createplanpage("计划01", "2017-03-16", "2017-03-21");
//	}
	@Test
	public void addProduct02() throws Exception {
		Product_Plan_CreateAction.createplanpage("计划02", "2017-03-27", "2017-03-21");
	}
	

	@AfterMethod(alwaysRun = true)
	public void stop() throws InterruptedException {
		super.stop();
	}
}
