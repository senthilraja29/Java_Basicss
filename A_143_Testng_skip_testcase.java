package Assignments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A_143_Testng_skip_testcase 
{
	@Test
	public void input()
	{
		System.out.println("Input Accepted");
	}
	
	@Test
	public void process()
	{
		System.out.println("Process Accept");
		Assert.assertEquals(0, 0);
	}
	
	@Test(dependsOnMethods = "process")
	public void output()
	{
		System.out.println("Output Accept");
		Assert.assertEquals(0, 0);
	}
}
