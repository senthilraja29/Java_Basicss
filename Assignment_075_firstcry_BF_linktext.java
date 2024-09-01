package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_075_firstcry_BF_linktext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		WebElement y1 = driver.findElement(By.linkText("BOY FASHION"));
		y1.click();
		Thread.sleep(3000);
		driver.quit();
	}
}
