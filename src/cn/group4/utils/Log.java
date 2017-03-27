package cn.group4.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cn.group4.tests.SuiteSetting;

public class Log {
	private final Class<?> clazz;
	private Logger logger;
	protected ExtentReports extent=TestNGListener.getextent();
	protected ExtentTest test= extent.startTest("测试","描述：添加产品");
	/**
	 * 
	 * @param clazz
	 */
	Log(Class<?> clazz) {
		this.clazz = clazz;
		this.logger = LogManager.getLogger(this.clazz);
		System.out.println(extent);
	}

	/**
	 * @author Young
	 * @param message
	 * 
	 */
	public void info(String message) {
		logger.info(clazz.getCanonicalName() + ": " + message);
		test.log(LogStatus.INFO, message);
	}

	/**
	 * @author Young
	 * @param message
	 */
	public void debug(String message) {
		logger.debug(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @author Young
	 * @param message
	 */
	public void error(String message) {
		logger.error(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @author Young
	 * @param message
	 */
	public void trace(String message) {
		logger.trace(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @author Young
	 * @param message
	 */
	public void warn(String message) {
		logger.warn(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @author Young
	 * @param message
	 */
	public void fatal(String message) {
		logger.fatal(clazz.getCanonicalName() + ": " + message);
	}
}
