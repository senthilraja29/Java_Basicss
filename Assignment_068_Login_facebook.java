package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_068_Login_facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com" + Keys.ENTER);
		driver.findElement(By.id("pass")).sendKeys("abc123def" + Keys.ENTER);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
