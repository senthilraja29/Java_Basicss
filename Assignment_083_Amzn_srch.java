package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_083_Amzn_srch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://amazon.in/");
		WebElement xyz = web.findElement(By.id("twotabsearchtextbox"));
		xyz.sendKeys("apple");
		web.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		Thread.sleep(3000);
		web.quit();
	}
}
