package cn.group4.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import cn.group4.page.Product_Rel_Add;
import cn.group4.page.Product_Rel_Details;

public class Product_Rel_AddAction {

	private static WebDriver driver;
	private static Product_Rel_Add product_Rel_Add;
	private static Product_Rel_Details delRel;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		Product_Rel_AddAction.driver = driver;
	}

	public static Product_Rel_Add addRelease(String name) throws Exception{
		Product_RelAction.setDriver(driver);
		product_Rel_Add = Product_RelAction.btnAddRelease();
		product_Rel_Add.typeOniptReleaseTitle(name);
		product_Rel_Add.clickOnbtnSave();
		return product_Rel_Add;
	}
	
	public static Product_Rel_Add delRelease() throws Exception{
		Product_RelAction.setDriver(driver);
		delRel = Product_RelAction.btnDelRelease();
		delRel.clickOnbtnDel_Rel();
		return product_Rel_Add;
	
	}
	
}
