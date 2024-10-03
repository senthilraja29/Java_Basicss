package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_096_tagname 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.google.co.in/");
		
		WebElement w1 = drive.findElement(By.xpath("(//textarea)[1]"));
		w1.sendKeys("India" + Keys.ENTER);
		
		Thread.sleep(3000);
		drive.quit();
	}
}
