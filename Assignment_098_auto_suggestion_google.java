package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_098_auto_suggestion_google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		WebElement e2 = driver.findElement(By.xpath("((//div//div//ul)/li)[2]"));
		e2.click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
