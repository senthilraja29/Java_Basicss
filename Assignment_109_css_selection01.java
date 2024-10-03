package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_109_css_selection01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://www.amazon.in/");
		web.manage().window().maximize();
		
		WebElement w1 = web.findElement(By.cssSelector("input[type='text']"));
		w1.sendKeys("SHoe" + Keys.ENTER);
		
		Thread.sleep(3000);
		web.quit();
	}
}
