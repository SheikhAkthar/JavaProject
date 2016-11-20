package Learner_Class_Package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.IConfigureCallBack;
import org.testng.IInvokedMethod;
import org.testng.ISuite;
import org.testng.ITestResult;

import Linear_Interfaces_package.Linear_Interface2;

public class LearnerClass3 implements Linear_Interface2 {
	
	WebDriver driver;
	
	LearnerClass3(WebDriver driver){
		driver = driver;
		
		
	}
	public String verifyTitle(String title) {
		
		String vtitle = driver.getTitle();
		if(vtitle.equals(title)){
			System.out.println(vtitle);
		}else{
			System.out.println("Title not Verified");
		}
		
		return title;
	}

	public void verifyElement(WebElement element) {
		
		try {
			element.isDisplayed();
			
		}catch(ElementNotVisibleException e){
			e.printStackTrace();
			System.out.println("Element not Verify");
		}
		
	}

	public void getText(WebElement text) {
		try{
			String gtxt = text.getText();
			System.out.println(gtxt);
		}catch(Exception c){
			c.printStackTrace();
			System.out.println("Text not Found");
			
		}
		
		
	}

	public void getAttribute(By by, String attribute) {
		
		String property = driver.findElement(by).getAttribute(attribute);
		
		if(!property.isEmpty()){
			System.out.println(property);
		}
		else{
			System.out.println("Attribute is empty");
		}
			
	}
		


	public Object getclass() {
		
		Object getclas = driver.getClass();
			
		return getclas;
	}

	public void getpagesource() {
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
	}

	public void getcurrentURL() {
		String currentURL = driver.getCurrentUrl();
	
		
	}

	public void getwindowHandle(By by) {
		
		String windowhandle = driver.getWindowHandle();
		if( windowhandle.equals(driver)){
			driver.switchTo();
		}else {
			System.out.println("They are not equals");
			
		}
		
	}

	public void getWindowhandles(By by) {
	
		Set<String> moreWindows = driver.getWindowHandles();
		for(String windowNew :moreWindows){
			System.out.println(windowNew);
			}
		
	}

	public void manage() {
		Options manage = driver.manage();
		
	}

	public void navigate() {
		Navigation navigate = driver.navigate();
		
	}

	public void hashcode() {
		int code = driver.hashCode();
		
	}

	public void tostring() {
		
		String str = driver.toString();
		
		
	}

	public void swichTo() {
		
		TargetLocator t = driver.switchTo();
		if(t.activeElement().isDisplayed() ){
			System.out.println("Element is active & visibled");
			
		}else{
			System.out.println("not active & visibled");
		}
		
		
	}

	public void getallLink(String tagname) {
		driver.findElement(By.tagName(tagname));
		List<WebElement> element = driver.findElements(By.tagName(tagname));
		System.out.println(element);
		for (WebElement xp : element) {
			System.out.println(xp);
		}
		
	}

	public void quit() {
		driver.quit();
		
		
	}

	public void close() {
		driver.close();
		
	}
	

	

}