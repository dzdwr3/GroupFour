package cn.group4.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.group4.utils.DriverFactory;
import cn.group4.utils.UITest;

public class Product_Gen extends UITest {
	WebDriver driver = DriverFactory.getChromeDriver();

	@BeforeMethod(alwaysRun = true)
	public void init() throws Exception {
		super.init(driver);
		
	}

	@Test
	public void addProduct() throws Exception {
	}
	

	@AfterMethod(alwaysRun = true)
	public void stop() throws InterruptedException {
		super.stop();
	}
}
