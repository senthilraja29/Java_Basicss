package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_111_css_locator 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://www.amazon.in/");
		web.manage().window().maximize();
		
		WebElement w1 = web.findElement(By.cssSelector("[id='twotabsearchtextbox']"));
		w1.sendKeys("Groceries" + Keys.ENTER);
	}
}
