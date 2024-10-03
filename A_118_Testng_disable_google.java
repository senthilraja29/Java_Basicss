package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_118_Testng_disable_google 
{
	@Test(enabled=false)
	public void disable_google() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
