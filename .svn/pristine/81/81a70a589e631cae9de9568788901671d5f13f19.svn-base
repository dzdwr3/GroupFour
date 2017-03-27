package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.action.ProductAction;
import cn.group4.utils.DriverFactory;
import cn.group4.utils.UITest;

public class ProductTest extends UITest {	
	
	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {
		WebDriver driver = DriverFactory.getChromeDriver();
		super.init(driver);
		ProductAction.setDriver(driver);
	}
	
	
	/**
	 * yl-001 点击添加产品按钮进入添加产品页
	 * @author dzdwr
	 * 
	 * */
	@Test(groups="Product")
	public void addProductTest() throws Exception {
		ProductAction.addProduct();
	}
	
	/**
	 * yl-002 点击需求按钮进入需求子页面
	 * @author dzdwr
	 * 
	 * */
	@Test(groups="Product")
	public void intoRequirementTest() throws Exception {
		ProductAction.intoRequirement();
	}

	
	@AfterMethod(alwaysRun = true)
	public void stop() throws InterruptedException {
		super.stop();
	}
	

}