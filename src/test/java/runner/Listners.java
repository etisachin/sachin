package runner;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import sachinTest.Base;

public class Listners implements ITestListener

{
	Base b= new Base();
	public void onTestFailure(ITestResult Result)
	
	{
		
		try {
			b.getScreenshot(Result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
