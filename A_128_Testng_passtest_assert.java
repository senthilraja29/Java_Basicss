package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_128_Testng_passtest_assert 
{
	@Test
	public void testcase()
	{
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://www.google.com/");
		Assert.assertEquals(drive.getTitle(), "Google");
	}
}
