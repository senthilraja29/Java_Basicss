package Assignments;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A_123_Testng_DDT_int_datatype 
{
	@Test(dataProvider="inputz")
	public void int_ddt(int inputz)
	{
		System.out.println("Enter value "+ inputz);
	}
	
	@DataProvider(name="inputz")
	public Object[][] data1()
	{
		return new Object[][] {{1},{2},{3},{4},{5},{6}};
	}
}
