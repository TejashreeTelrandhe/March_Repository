package Guru99_Utilities;
	import org.testng.ITestContext;
import org.testng.ITestListener;
	import org.testng.ITestResult;

import Guru99_BaseClass.Base_Class;

	public class TestListener extends Base_Class implements ITestListener {
	    
	    @Override
	    public void onTestStart(ITestResult result) {
	        // This method is called when a test method starts
	        System.out.println("Test started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // This method is called when a test method succeeds
	        System.out.println("Test passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // This method is called when a test method fails
	        System.out.println("Test failed: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // This method is called when a test method is skipped
	        System.out.println("Test skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // This method is called when a test method fails within the success percentage
	        // defined in the testng.xml file
	        System.out.println("Test failed within success percentage: " + result.getName());
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // This method is called before any test method is run
	        System.out.println("Test suite started: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // This method is called after all test methods are run
	        System.out.println("Test suite finished: " + context.getName());
	    }
	}

