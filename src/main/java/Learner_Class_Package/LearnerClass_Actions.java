package Learner_Class_Package;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Linear_Interfaces_package.Linear_Interface_Actions;

public class LearnerClass_Actions implements Linear_Interface_Actions{
	
	WebDriver driver;
	LearnerClass_Actions(WebDriver driver){
		
	}
	public Actions build() {
		
		return new Actions(driver);
	}
	public Actions click() {
		return null;
	}
	public Actions click(WebElement onElement) {
		return new Actions(driver);
	}
	public Actions clickAndHold() {
		return new Actions(driver);
	}
	public Actions clickAndHold(WebElement onElement) {
		return new Actions(driver);
	}
	public Actions contextClick() {
		return new Actions(driver);
	}
	public Actions contextClick(WebElement onElement) {
		return new Actions(driver);
	}
	public Actions doubleClick() {
		return new Actions(driver);
	}
	public Actions doubleClick(WebElement onElement) {
		return new Actions(driver);
	}
	public Actions dragAndDrop(WebElement source, WebElement target) {
		return new Actions(driver);
	}
	public Actions dragAndDropBy(WebElement source, int xOffset, int yOffset) {
		return new Actions(driver);
	}
	public Actions keyDown(Keys thekey) {
		return new Actions(driver);
	}
	public Actions keyDown(WebElement element, Keys theKey) {
		return new Actions(driver);
	}
	public Actions keyUp(Keys theKey) {
		return new Actions(driver);
	}
	public Actions keyUp(WebElement element, Keys theKey) {
		return new Actions(driver);
	}
	public Actions pause(long pause) {
		return new Actions(driver);
	}
	public Actions perform() {
		return new Actions(driver);
	}
	public Actions release() {
		return new Actions(driver);
	}
	public Actions release(WebElement onElement) {
		return new Actions(driver);
	}
	public Actions sendKeys(CharSequence keysToSend) {
		return new Actions(driver);
	}
	public Actions sendKeys(WebElement element, CharSequence keysToSend) {
		return new Actions(driver);
	}
	public Actions moveByOffset(int xOffset, int yOffset) {
		return new Actions(driver);
	}
	public Actions moveToElement(WebElement toElement) {
		return new Actions(driver);
	}
	public Actions moveToElement(WebElement toElement, int xOffset, int yOffset) {
		return new Actions(driver);
	}
	

}
