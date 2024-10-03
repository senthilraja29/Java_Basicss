package Assignments;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_119_Testng_priority 
{
		@BeforeTest
		public void beforeTest01()
		{
			System.out.println("Before Test Case Initiated-01");
		}
		@Test(priority=3)
		public void testcase03()
		{
			System.out.println("Test case 03");
		}
		@Test(priority=1)
		public void testcase01()
		{
			System.out.println("Test Case 01");
		}
		@AfterTest
		public void afterTest02()
		{
			System.out.println("After Test Case Completed-01");
		}
		@BeforeTest
		public void beforeTest02()
		{
			System.out.println("Before Test Case Initiated-02");
		}
		@Test(priority=2,invocationCount = 3)
		public void testcase()
		{
			System.out.println("Test case 02");
		}
		@AfterTest
		public void afterTest01()
		{
			System.out.println("After Test Case Completed-02");
		}
}
	
