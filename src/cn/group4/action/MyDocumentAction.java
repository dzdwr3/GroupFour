package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.MyDocument;
import cn.group4.page.MyDocument_CreatDoc;
import cn.group4.utils.PageFactory;

public class MyDocumentAction {

	private static WebDriver driver;
	private static MyDocument mydocument;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		MyDocumentAction.driver = driver;
	}

	//业务流程  点击创建文档的流程
	public static MyDocument_CreatDoc addDocument() throws Exception
	{
		MyZoneAction.setDriver(driver);
		mydocument= MyZoneAction.intoDocument();
		mydocument.clickOnbtnAddDocument();
		return (MyDocument_CreatDoc) PageFactory.getPage(MyDocument_CreatDoc.class, getDriver());
		
		
	}
	
}
