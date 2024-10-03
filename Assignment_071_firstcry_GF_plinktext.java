package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_071_firstcry_GF_plinktext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebElement x1 = driver.findElement(By.partialLinkText("GIRL"));
		x1.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
