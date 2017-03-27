package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.Product_Doc_Add;

public class Product_Doc_AddAction {

		private static WebDriver driver;
		private static Product_Doc_Add product_Doc_Add;
		
		public static WebDriver getDriver() {
			return driver;
		}
		public static void setDriver(WebDriver driver) {
			Product_Doc_AddAction.driver = driver;
		}
		
		public static Product_Doc_Add createDoc(String value) throws Exception{
			
			Product_DocAction.setDriver(driver);
			product_Doc_Add = Product_DocAction.clickOnCreateDoc();
			product_Doc_Add.typeOniptDocTitle(value);
			product_Doc_Add.clickOnbtnSaveDoc();
			return product_Doc_Add;
		}
	}
