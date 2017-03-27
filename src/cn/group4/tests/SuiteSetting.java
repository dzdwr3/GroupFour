package cn.group4.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import cn.group4.utils.UITest;

public class SuiteSetting extends UITest{
	@BeforeSuite
	public static void befores(){
	}
	

	@AfterSuite
	public static void afters(){
		
	   

	}
	public static ExtentReports getextent(){
		return null;
	    }
	
}
