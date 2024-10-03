package Assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class A_120_Testng_multi_testcase 
{
	WebDriver driver;
	
	@Test(priority=2)
	public void testcase01() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1 = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).click().perform();
		
		WebElement w2 = driver.findElement(By.id("ap_email"));
		w2.sendKeys("abcdefg@gmail.com" + Keys.ENTER);
		
		WebElement w3 = driver.findElement(By.id("ap_password"));
		w3.sendKeys("9876543210"+ Keys.ENTER);
		
		WebElement w4 = driver.findElement(By.id("twotabsearchtextbox"));
		w4.sendKeys("Bottle" + Keys.ENTER);
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File f1 = t1.getScreenshotAs(OutputType.FILE);
		
		File location = new File("C:\\Users\\Senthilraja K\\OneDrive\\Testing\\A_120_Testng_01.png");
		FileHandler.copy(f1, location);	
	}
	
	@Test(priority=1)
	public void testcase02()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement tc01 = driver.findElement(By.xpath("//input[@name='q']"));
		tc01.sendKeys("Mobiles" + Keys.ENTER);
		
		WebElement tc02 = driver.findElement(By.xpath("((//div//div[@class='DOjaWF gdgoEp']/div)[5])"));
		tc02.click();
		driver.quit();
	}
}
