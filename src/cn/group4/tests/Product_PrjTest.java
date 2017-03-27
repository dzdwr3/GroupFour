package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.action.ProductAction;
import cn.group4.action.Product_CreatProductAction;
import cn.group4.utils.DriverFactory;
import cn.group4.utils.UITest;

public class Product_PrjTest extends UITest {
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		this.driver = DriverFactory.getChromeDriver();
		super.init(driver);
	}

	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {	
		ProductAction.setDriver(driver);
	}
	
	@Test
	public void addProduct01() throws Exception {
		ProductAction.intoProject();
	}

	
	@AfterMethod(alwaysRun = true)
	public void stop() {
		ProductAction.signOut();
	}
	
	@AfterClass
	public void shutDown() throws InterruptedException
	{
		super.stop();
	}
}

