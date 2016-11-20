package Learner_Class_Package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.IConfigureCallBack;
import org.testng.IHookCallBack;
import org.testng.IInvokedMethod;
import org.testng.IMethodInstance;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import Linear_Interfaces_package.Linear_Interface1;
import Linear_Interfaces_package.Linear_Interface_TestNG_Listeners;

public class LearnerClass2  {
	
	
	WebDriver driver;
	LearnerClass2(WebDriver driver){
		
	}
	
	
	/*This is one way to  use findBy annotation but it is old.
 	I declared FindBy to LearnerClass4. If i didn't declare in FindBy annotation
	i didn't get any error but  compiler couldn't go to LearnerClass4 because compiler not found any Element */
	@FindBy(how = How.NAME,using = "LearnerClass4") 
	public WebElement LearnerClass4;
	
	
	@FindBy(name = ("Learn3"))	//This is different way to use FindBy annotation and it's new .			
	public WebElement LearnerClass3;
	
	
	@FindBy(name = ("learnact"))
	public WebElement LearnerClass_Actions;
	
	@FindBy(name = ("learnStatic"))
	public WebElement Learner_Static_Class6;
	
	
	
	LearnerClass3 likeMenP(){
		return new LearnerClass3(driver);
	}
	
	LearnerClass4 likeWomen(){
		
		return new LearnerClass4(driver);
	}
	LearnerClass_Actions action(){
		return new LearnerClass_Actions(driver);
	}
	Learner_Static_Class6 neastedclass(){
		return new Learner_Static_Class6(driver);
	}

	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult arg0) {
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
	}

	public void onTestStart(ITestResult arg0) {
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}

	public void onFinish(ISuite arg0) {
		
	}

	public void onStart(ISuite arg0) {
		
	}

	public void onExecutionFinish() {
		
	}

	public void onExecutionStart() {
		
	}

	public void onConfigurationFailure(ITestResult arg0) {
		
	}

	public void onConfigurationSkip(ITestResult arg0) {
		
	}

	public void onConfigurationSuccess(ITestResult arg0) {
		
	}

	public void run(IConfigureCallBack arg0, ITestResult arg1) {
		
	}

	public void run(IHookCallBack arg0, ITestResult arg1) {
		
	}

	public void generateReport(List<XmlSuite> arg0, List<ISuite> arg1, String arg2) {
		
	}

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
	}

	public List<IMethodInstance> intercept(List<IMethodInstance> arg0, ITestContext arg1) {
		
		return null;
	}

	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		
	}

	public void transform(IDataProviderAnnotation arg0, Method arg1) {
		
	}

	public void transform(IFactoryAnnotation arg0, Method arg1) {
		
	}

	public void transform(IConfigurationAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		
	}
	
	
	
}
