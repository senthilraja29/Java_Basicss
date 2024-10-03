package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_079_Flipkart_mobile_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.flipkart.com/");
		WebElement q1 = web.findElement(By.xpath("(//span[@class=\"_1XjE3T\"])[2]"));
		q1.click();
		Thread.sleep(5000);
		web.quit();
	}
}
