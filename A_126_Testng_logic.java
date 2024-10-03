package Assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class A_126_Testng_logic implements IRetryAnalyzer
{
	int initial = 0;
	int no_retry = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		if(initial < no_retry )
		{
			initial++;
			return true; // Give ReTry
		}
		return false; // Stop retry 
		
	}
	
}
