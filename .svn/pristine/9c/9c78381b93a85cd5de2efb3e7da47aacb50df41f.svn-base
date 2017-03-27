package cn.group4.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Young
 *
 */
public class PageFactory {
	static Log log = new Log(PageFactory.class);

	public synchronized static Object getPage(Class<?> key, WebDriver d)
		 {
		Object obj = null;
		try {
			String pageClassName = key.getCanonicalName();
			log.info("page name is " + pageClassName);
			Class<?> clazz = Class.forName(pageClassName);
		
			try {
				Constructor<?> constructor = clazz.getConstructor(WebDriver.class);
				obj = constructor.newInstance(d);

			} catch (InstantiationException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return obj;
	}

}
