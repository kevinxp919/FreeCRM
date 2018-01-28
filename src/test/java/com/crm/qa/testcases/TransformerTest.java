package com.crm.qa.testcases;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TransformerTest implements IAnnotation{
	public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(testClass);
		
	}

}
