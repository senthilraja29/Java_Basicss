package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112_css_AN_AV 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://www.amazon.in/");
		web.manage().window().maximize();
		
		WebElement w1 = web.findElement(By.cssSelector("input[type='text']"));
		w1.sendKeys("abcdef@gmail.com");
	}
}
