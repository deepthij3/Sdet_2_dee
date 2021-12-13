package com.VTiger.genericUtil;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener
{

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" "+"Test Passed");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+" "+"Test Failed");
	
	try {
		BaseClass.takeScreenshot(result.getMethod().getMethodName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}


