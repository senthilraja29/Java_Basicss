package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_126_Testng_Iretry 
{
	WebDriver driver;
	@Test(retryAnalyzer=Assignments.A_126_Testng_logic.class)
	public void google()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w1= driver.findElement(By.id("APjFqb"));
		w1.sendKeys("India" + Keys.ENTER);
	}
}
