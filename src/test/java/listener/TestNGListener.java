package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	public void onStart(ITestResult result)
	{
		System.out.println("Test Started"+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Success"+result.getName());

	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped"+result.getName());

	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed"+result.getName());

	}
	
	public void onFinish(ITestResult result)
	{
		System.out.println("on Finish"+result.getName());

	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("on Start"+result.getName());

	}

}
