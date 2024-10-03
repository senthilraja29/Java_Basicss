package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_070_Registration_02 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Senthilraja");
		driver.findElement(By.id("lastName")).sendKeys("Kumarapathi");
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		WebElement x1 = driver.findElement(By.id("gender"));
		Select a1 = new Select(x1);
		a1.selectByValue("male");
		WebElement x2 = driver.findElement(By.id("state"));
		Select a2 = new Select(x2);
		a2.selectByValue("bihar");
		driver.findElement(By.id("aadhaar")).sendKeys("986598659865");
		driver.findElement(By.id("pan")).sendKeys("ABCDE0000F");
		WebElement x3 = driver.findElement(By.id("terms"));
		
		if (x3.isSelected())
		{
			System.out.println("It's Selected");
		}	
		else
		{
			System.out.println("It's Not Selected. Now Let's check in");
			x3.click();
		}
		Thread.sleep(3000);	
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
