package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_117_Testng_invocation_google 
{
	@Test(invocationCount =10)
	public void google_invocation() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
