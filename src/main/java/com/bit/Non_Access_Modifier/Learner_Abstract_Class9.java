package com.bit.Non_Access_Modifier;

import org.testng.IMethodInterceptor;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestResult;

import Linear_Interfaces_package.Linear_Interface_Abstract;

public  abstract class  Learner_Abstract_Class9 implements Linear_Interface_Abstract {
	
	abstract void defaultAbstarctMethod();
	abstract protected  void protectedAbstractMethod();
	abstract public void publicAbstractMethod();
	public static  void  staticAbstractMethod(){
		
	}
	Learner_Abstract_Class9(int primitive,String reference){
		
	}
	
	//abstract int a =10;  u can't declared abstract variable.
	
	
	public void unimplementMethod(ITestContext itest) {
		
	}

	public void unimplementMethod1(IMethodInterceptor interceptor, String type) {
		
	}

	public void unimplementMethod2(ISuite suite) {
		
	}

	public void unimplementMethod3(ITestResult result, ITestContext itest, ISuite suite) {
		
	}

	public void unimplementMethod4() {
		
	}

	public void nonAbstract() {
		
	}

}
