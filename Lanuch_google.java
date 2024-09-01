package Day42_selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanuch_google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com");
		driver1.findElement(By.id("APjFqb"));
		driver1.findElement(By.name("q")).sendKeys("India");
		driver1.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver1.quit();
	}
}
