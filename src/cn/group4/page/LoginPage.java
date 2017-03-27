package cn.group4.page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;
import cn.group4.utils.Locator.ByType;

public class LoginPage extends BasePage{

	

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}
	
	public LoginPage(WebDriver driver) throws Exception {
			super(driver);
//			driver.get("http://192.168.0.113/zentao/user-login.html");
			driver.get("http://localhost/zentao/user-login.html");
	}
	
	Locator username = new Locator("username",30);
	Locator password = new Locator("password");
	Locator loginButton = new Locator("loginButton");
	Locator profile = new Locator(
			"profile");
	//自己定义的输入值的方法
	public void typeusername(String name) throws Exception {
		//输入内容
		type(username, name);
		
	}

	public void typePassword(String word) throws Exception {
		type(password, word);
	}
	//自己定义的点击的方法
	public void clickOnLoginButton() throws Exception {
		click(loginButton);
	}
	//判断元素是否可见
	public boolean isPrestentProfile() throws IOException {
		return isElementPresent(profile, 20);
	}






	
	
}
