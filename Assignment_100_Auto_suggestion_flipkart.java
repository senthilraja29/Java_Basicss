package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_100_Auto_suggestion_flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement w1 = driver.findElement(By.xpath("(//input[@name='q'])"));
		w1.sendKeys("Men's Shoes");
		
		Thread.sleep(3000);
		WebElement w2 = driver.findElement(By.xpath("(//form//ul/li)[4]"));
		w2.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
