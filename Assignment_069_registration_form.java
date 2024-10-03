package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_069_registration_form 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Senthilraja");
		driver.findElement(By.id("lname")).sendKeys("Kumarapathi");
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc1234def");
		driver.findElement(By.id("male")).click();
		WebElement e1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Non-Technical Skills");
		WebElement e2 = driver.findElement(By.name("nontechnicalskills"));
		Thread.sleep(3000);
		Select s2 = new Select(e2);
		s2.selectByVisibleText("History");
		WebElement e3 = driver.findElement(By.name("Country"));
		Select s3 = new Select(e3);
		s3.selectByVisibleText("Nepal ");
		
		WebElement e4 = driver.findElement(By.id("Present-Address"));
		WebElement e5 = driver.findElement(By.id("Permanent-Address"));
		WebElement e6 = driver.findElement(By.id("Pincode"));
		e4.sendKeys("Chennai, Tamilnadu");
		e5.sendKeys("Vijayawada, Telungana");
		e6.sendKeys("636006");
		
		WebElement e7 = driver.findElement(By.id("Relegion"));
		Select s4 = new Select(e7);
		s4.selectByValue("Hindu");
		
		Thread.sleep(3000);	
		driver.quit();
	}
}
