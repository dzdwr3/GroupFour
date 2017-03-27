package cn.group4.utils;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.Secur32.EXTENDED_NAME_FORMAT;

import bsh.This;
import cn.group4.tests.SuiteSetting;

public class TestNGListener extends TestListenerAdapter {
	Log logger = new Log(This.class);
    protected static ExtentReports extent = new ExtentReports("report/ExtentReoprt.html", true);
    protected static ExtentTest test;

    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        logger.info("【" + tr.getName() + " Start】");
        test= extent.startTest(tr.getName(),"");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        logger.info("【" + tr.getName() + " Failure】");
        test.log(LogStatus.FAIL, tr.getThrowable());
        extent.endTest(test);
        
    }
    
    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        logger.info("【" + tr.getName() + " Skipped】");
        test.log(LogStatus.SKIP, "SKIP");
        extent.endTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info("【" + tr.getName() + " Success】");
        test.log(LogStatus.PASS, "Pass");
        extent.endTest(test);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }
    
	public static ExtentReports getextent(){
		return extent;
	    }
}