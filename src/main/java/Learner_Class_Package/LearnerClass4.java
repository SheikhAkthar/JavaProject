package Learner_Class_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Keyboard;

import Linear_Interfaces_package.Linear_Interface3;

public class LearnerClass4 implements  Linear_Interface3{
	WebDriver driver;
	LearnerClass4(WebDriver driver){
		
		
	}
	public WebElement getClick(By by) {
		driver.findElement(by).click();
		return driver.findElement(by);
	}
	public void writeAnything(WebElement element, String type) {
		
	}
	public void selectDropDown(By by, String dd) {
		
	}
	public WebElement hoverOver(By by) {
		return null;
	}
	public WebElement rightMoClic(By by) {
		return null;
	}
	public Keyboard getKeyboard() {
		return null;
	}
	public WebElement scrollDown() {
		return null;
	}
	public WebElement elementMoreWork(WebElement ele) {
		return null;
	}
	public void tekeScreensot() {
		
	}
	public WebElement dragAndDrop() {
		return null;
	}
	public WebElement windowHandle() {
		return null;
	}
	public List<WebElement> multipleWindowHandles() {
		return null;
	}

}
