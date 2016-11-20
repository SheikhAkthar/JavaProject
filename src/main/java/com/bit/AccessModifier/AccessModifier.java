package com.bit.AccessModifier;

import org.openqa.jetty.jetty.servlet.Default;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;

import junit.framework.Protectable;

public class AccessModifier {
	String type ;
	public int numeric;
	protected double duet;
	private Integer wraffer;
	
	class DefaultClass{
		
	}
	
	protected class ProtectedClass{
		
	}
	private class PrivateClass{
		
	}
	public class PublicClass{
		
	}
	
	void defaultMethod(Default defaultVariable){
		
	}
	public void publicMethod(Test test){
		
	}
	protected void protectedMethod(Protectable protect){
		
	}
	private void privateMethod(Predicate vh){
		
	}

}
