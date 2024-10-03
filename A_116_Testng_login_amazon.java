package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class A_116_Testng_login_amazon 
{
	WebDriver driver;
	@Test
	public void open_amazon()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1 = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).click().perform();
	}
	@AfterTest
	public void login_amazon()
	{
		WebElement w2 = driver.findElement(By.id("ap_email"));
		w2.sendKeys("abcdef@gmail.com" + Keys.ENTER);
		
		WebElement w3 = driver.findElement(By.id("ap_password"));
		w3.sendKeys("abcdef@gmail.com"+ Keys.ENTER);
		
		driver.quit();	
	}	
}
