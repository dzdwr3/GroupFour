package cn.group4.action;

import org.openqa.selenium.WebDriver;

import cn.group4.page.MyDocument;
import cn.group4.page.MyDocument_CreatDoc;
import cn.group4.utils.PageFactory;


public class MyDocument_CreatDocAction {

	private static WebDriver driver;
	private static MyDocument_CreatDoc myDocument_CreatDoc;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		MyDocument_CreatDocAction.driver = driver;
	}
	//业务流程
	public static MyDocument addDocDetails(String values) throws Exception
	{
		MyDocumentAction.setDriver(driver);
		myDocument_CreatDoc = MyDocumentAction.addDocument();
		myDocument_CreatDoc.typeTobtnAddDocument(values);
		myDocument_CreatDoc.clickOnbtnSave();
		return (MyDocument) PageFactory.getPage(MyDocument.class, getDriver());
		
	}
	
}
