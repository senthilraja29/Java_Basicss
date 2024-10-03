package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_086_google_launch 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.google.com/");
		WebElement x1 = web.findElement(By.xpath("(//div/textarea[@name='q'])"));
		x1.sendKeys("India" + Keys.ENTER);
		
	}
}
