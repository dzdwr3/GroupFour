package cn.group4.action;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cn.group4.page.MyZone;
import cn.group4.page.LoginPage;
import cn.group4.utils.PageFactory;


public class LoginPageAction {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		LoginPageAction.driver = driver;
	}
	
	static LoginPage loginPage;
	
	public static MyZone login(String name, String password)
			throws Exception {
		loginPage = new LoginPage(getDriver());
		loginPage.waitForPageLoad(3);
		loginPage.typeusername(name);;
		loginPage.typePassword(password);
		loginPage.clickOnLoginButton();
		Assert.assertTrue(loginPage.isPrestentProfile(), "login failed");

		return (MyZone) PageFactory.getPage(MyZone.class, getDriver());
	}
	
	public static MyZone login() throws Exception {
		return LoginPageAction.login("admin", "123456");
	}

	
	

}
