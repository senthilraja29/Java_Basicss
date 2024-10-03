package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_132_Testng_window_handles_close 
{
	@Test
	public void window_handles() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement w1 = driver.findElement(By.linkText("Register"));
		w1.click();
		
		WebElement w2 =  driver.findElement(By.xpath("(//span[@class='google-text'])"));
		w2.click();

		Set<String> links = driver.getWindowHandles();
		
		Iterator<String> total_windows = links.iterator();
			
		String a = total_windows.next();
		String b =total_windows.next();
		
		System.out.println("Parent Window " + a);
		System.out.println("Child Window " + b);
		
		driver.close();
		driver.switchTo().window(b);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}
}
