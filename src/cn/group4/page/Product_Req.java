package cn.group4.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cn.group4.utils.BasePage;
import cn.group4.utils.Locator;

public class Product_Req extends BasePage{
	
	Locator btnAddRequirement = new Locator("btnAddRequirement");
	Locator btnNotClose = new Locator("btnNotClose");
	Locator btnClose = new Locator("btnClose");
	Locator selcCloseReason = new Locator("selcCloseReason");
	Locator iptNote = new Locator("iptNote");
	Locator btnSave = new Locator("btnSave");
	Locator frame = new Locator("frame");
	

	public Product_Req(WebDriver driver) throws Exception {
		super(driver);
	}
	
	public void clickOnbtnAddRequirement() throws Exception
	{
		click(btnAddRequirement);
	}
	
	public void clickOnbtnNotClose() throws Exception
	{
		click(btnNotClose);
	}
	
	public void clickOnbtnClose() throws Exception
	{
		click(btnClose);
	}
	public void clickOnselcCloseReason() throws Exception
	{
		click(selcCloseReason);
	}
	
	public void selcCloseReason(String closereason) throws Exception
	{	
		switchToIfream(frame);
		select(selcCloseReason, closereason);
		switchToDefaultContent();
	}
	
	public void typeToiptNote(String note) throws Exception
	{
		type(iptNote, note);
	}
	
	public void clickOnbtnSave() throws Exception
	{
		switchToIfream(frame);
		click(btnSave);
		switchToDefaultContent();
	}
	
	public void intoCloseReasonJs(){
		alertConfirm();		
	}
	
	public String getJsText(){	
		return getAlertText();	
		
	}

}
