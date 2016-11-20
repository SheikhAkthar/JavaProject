package Linear_Interfaces_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public interface Linear_Interface1 extends ITestListener{
	
		public WebDriver  getURL(String url);
		
	
		public void onFinish(ITestContext result) ;

		public void onStart(ITestContext result) ;

		public void onTestFailedButWithinSuccessPercentage(ITestResult result);

		public void onTestFailure(ITestResult result) ;

		public void onTestSkipped(ITestResult result) ;

		public void onTestStart(ITestResult result) ;

		public void onTestSuccess(ITestResult result) ;
		
	
	

}
