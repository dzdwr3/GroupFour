package cn.group4.action;


import org.openqa.selenium.WebDriver;

import cn.group4.page.Product_Rel;
import cn.group4.page.LoginPage;
import cn.group4.page.Product;
import cn.group4.page.Product_CreatProduct;
import cn.group4.page.Product_Doc;
import cn.group4.page.Product_Mod;
import cn.group4.page.Product_Mov;
import cn.group4.page.Product_Plan;
import cn.group4.page.Product_Prj;
import cn.group4.page.Product_Req;
import cn.group4.utils.PageFactory;

public class ProductAction {
	private static WebDriver driver;
	private static Product product;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		ProductAction.driver = driver;
	}
	
	/**
	 *	SignOut
	 *	@author Zither
	 */
	public static LoginPage signOut() 
	{
		try {
			product.clickbtnSignOut();
			product.waitForPageLoad(1);
		} catch (Exception e) {
		}
		return (LoginPage) PageFactory.getPage(LoginPage.class, getDriver());
	}
	
	//进入产品页面点击创建产品按钮业务流程
	public static Product_CreatProduct  addProduct() throws Exception
	{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnAddProduct();
		return (Product_CreatProduct) PageFactory.getPage(Product_CreatProduct.class, getDriver());
	}
	
	//进入产品页面点击需求按钮业务流程
	public static Product_Req intoRequirement() throws Exception{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnRequirement();
		return (Product_Req) PageFactory.getPage(Product_Req.class, getDriver());
	}
	
	//进入产品页面点击动态按钮业务流程
	public static Product_Mov intoMovement() throws Exception{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnMovement();
		return (Product_Mov) PageFactory.getPage(Product_Mov.class, getDriver());
	}
		//进入产品页面点击计划按钮业务流程
	public static Product_Plan intoPlan() throws Exception{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnPlan();
		return (Product_Plan) PageFactory.getPage(Product_Plan.class, getDriver());
	}
	
	//进入产品页面点击发布按钮业务流程
	public static Product_Rel intoRelease() throws Exception
	{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnRelease();
		return (Product_Rel) PageFactory.getPage(Product_Rel.class, getDriver());
	}
	
	//进入产品页面点击路线图按钮业务流程

	
	//进入产品页面点击文档按钮业务流程
	public static Product_Doc intoDoc() throws Exception
	{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnDoc();
		return (Product_Doc) PageFactory.getPage(Product_Doc.class, getDriver());
	}
	
	//进入产品页面点击项目按钮业务流程
	public static Product_Prj intoProject() throws Exception
	{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnPrj();
		return (Product_Prj) PageFactory.getPage(Product_Prj.class, getDriver());
	}
	
	
	//进入产品页面点击模块按钮业务流程
	
	public static Product_Mod intoModule() throws Exception
	{
		MyZoneAction.setDriver(driver);
		product = MyZoneAction.intoProduct();
		product.clickOnbtnMod();
		return (Product_Mod) PageFactory.getPage(Product_Mod.class, getDriver());
	}
	
	//进入产品页面点击概况按钮业务流程

	

}
