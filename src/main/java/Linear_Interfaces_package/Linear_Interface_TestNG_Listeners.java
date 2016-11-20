package Linear_Interfaces_package;

import org.testng.IAnnotationTransformer;
import org.testng.IAnnotationTransformer2;
import org.testng.IConfigurable;
import org.testng.IConfigurationListener;
import org.testng.IExecutionListener;
import org.testng.IHookable;
import org.testng.IInvokedMethodListener;
import org.testng.IMethodInterceptor;
import org.testng.IReporter;
import org.testng.ISuiteListener;
import org.testng.ITestListener;

public interface Linear_Interface_TestNG_Listeners extends ITestListener,ISuiteListener,IExecutionListener,
IConfigurationListener,IConfigurable,IHookable,IReporter,IInvokedMethodListener,IMethodInterceptor,
IAnnotationTransformer,IAnnotationTransformer2{
	
	

}
