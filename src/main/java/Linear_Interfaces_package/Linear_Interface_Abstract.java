package Linear_Interfaces_package;

import org.testng.IMethodInterceptor;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

public abstract interface Linear_Interface_Abstract {
	
	abstract public void unimplementMethod(ITestContext  itest);
	abstract public void unimplementMethod1(IMethodInterceptor interceptor ,String type);
	abstract public void unimplementMethod2(ISuite suite);
	abstract public void unimplementMethod3(ITestResult result,ITestContext itest,ISuite suite);
	abstract public void unimplementMethod4();
	public void nonAbstract();
	
	
	

}
