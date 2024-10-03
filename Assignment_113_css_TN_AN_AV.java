package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113_css_TN_AN_AV 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://www.google.com/");
		web.manage().window().maximize();
		
		WebElement w1 = web.findElement(By.cssSelector("textarea[class='gLFyf']"));
		w1.sendKeys("Chennai");
	}
}
input.nav-input