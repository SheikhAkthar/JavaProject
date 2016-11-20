package Learner_Class_Package;

import java.lang.reflect.Constructor;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.beust.jcommander.Parameter;

import Linear_Interfaces_package.Linear_Interface1;

public class LearnerClass1 implements Linear_Interface1 {
	
	WebDriver driver;
	LearnerClass1(){
		
	}
	LearnerClass1(FirefoxDriver dr){            /*cd:This is default Constructor.If you don't declare any constructor it has no problem 
								when you will create an Object of that class by default constructor will be run.
								But if you declare constructor with parameter then you have to do match parameter
								when you called.*/
		
	}
	LearnerClass1(ChromeDriver dr){	/*This is a constructor with parameter.I don't need to declare constructor.
								I Created for show all ;*/
		
	}
	LearnerClass1(SafariDriver dr){
		
	}
	LearnerClass1(InternetExplorerDriver dr){
		
	}
	
	public WebDriver getURL(String url) {
		return null;
	}
	public void onFinish(ITestContext result) {
		
	}
	public void onStart(ITestContext result) {
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTestFailure(ITestResult result) {
		
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestStart(ITestResult result) {
		
	}
	public void onTestSuccess(ITestResult result) {
		
	}
	
	

}
