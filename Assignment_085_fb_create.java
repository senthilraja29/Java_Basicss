package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_085_fb_create 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.facebook.com/");
		WebElement x1 = web.findElement(By.xpath("(//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"])"));
		x1.click();
		WebElement x2 = web.findElement(By.xpath("(//input[@name='firstname'])"));
		x2.sendKeys("Bhava" + Keys.ENTER);
		WebElement x3 = web.findElement(By.xpath("(//input[@aria-label='Surname'])"));
		x3.sendKeys("Sent" + Keys.ENTER);
		
	
	
	
	}
}
