package Assignments;

import org.testng.annotations.Test;

public class A_142_Testng_group 
{
	@Test (groups = {"smoke"})
	public void test_case01()
	{
		
	}
	
	@Test (groups = {"smoke", "regression"})
	public void test_case02()
	{
		
	}
	
	@Test (groups = {"regression"})
	public void test_case03()
	{
		
	}
	
	@Test (groups = {"sanity","regression"})
	public void test_case04()
	{
		
	}
	
	@Test (groups = {"sanity"})
	public void test_case05()
	{
		
	}
	
	@Test (groups = {"smoke","sanity"})
	public void test_case06()
	{
		
	}
}
