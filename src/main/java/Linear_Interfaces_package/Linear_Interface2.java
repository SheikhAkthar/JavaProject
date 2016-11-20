package Linear_Interfaces_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.IConfigurable;
import org.testng.IConfigurationListener;
import org.testng.IExecutionListener;
import org.testng.IInvokedMethodListener;
import org.testng.ISuiteListener;

public interface Linear_Interface2
 {  //Here is all method are ui level
	
	public String verifyTitle(String title);
	public void verifyElement(WebElement element);
	public void getText(WebElement text);
	public void getAttribute(By by ,String attribute);
	public Object getclass();
	public void getpagesource();
	public void getcurrentURL();
	public void getwindowHandle(By by);
	public void getWindowhandles(By by);
	public void manage();
	public void navigate();
	public void hashcode();
	public void tostring();
	public void swichTo();
	public void getallLink(String tagname);
	public void quit();
	public void close();

	
	
	
	
	

}
