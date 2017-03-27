package cn.group4.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadUtils {
	
	/*使用ThreadLocal来保证程序的线程安全，以免TestNG在进行多线程并发测试时发生线程安全问题*/
    public static ThreadLocal<WebDriver> ThreadDriver=new ThreadLocal<WebDriver>();
    public static String browserType;
    
    public static WebDriver getDriver(){
        
            WebDriver driver=ThreadDriver.get();
            Log log = new Log(ThreadUtils.class);
            log.debug("浏览器类型为"+browserType);
            System.out.println(driver);
            if(driver==null){//如果当前线程没有绑定driver，则根据.xml配置文件创建driver并使用ThreadDriver.set()方法绑定到线程中。
                if(browserType.equals("firefox")){
                    driver=new FirefoxDriver();
                    ThreadDriver.set(driver);
                }else if(browserType.equals("chrome")){
                	System.setProperty("webdriver.chrome.driver", "D:\\program\\jdk-8u101\\bin\\chromedriver.exe");
                    driver=new ChromeDriver();
                    ThreadDriver.set(driver);
                }
            } 
            System.out.println(driver);
        return driver;
    }

    public static void setupDriver(String browser){
        browserType=browser;
    }

}
