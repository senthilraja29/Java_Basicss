package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_129_Testng_assert_true 
{
	//WebDriver drive;
	@Test
	public void purchase()
	{
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in/");
		drive.manage().window().maximize();
		
		WebElement w1 = drive.findElement(By.linkText("Mobiles"));
		w1.click();
		
		Assert.assertTrue(true);
	}
}
