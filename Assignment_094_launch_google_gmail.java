package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_094_launch_google_gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.google.co.in/");
		
		
		WebElement w1 = drive.findElement(By.linkText("Gmail"));
		w1.click();
		
		Thread.sleep(3000);
		drive.quit();
	}
}
