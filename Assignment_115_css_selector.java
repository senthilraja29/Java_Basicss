package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_115_css_selector 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://www.google.com/");
		web.manage().window().maximize();
	
		WebElement w1 = web.findElement(By.cssSelector("textarea.gLFyf"));
		w1.sendKeys("Independence Day of India" + Keys.ENTER);
	
	}
}
