package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_102_screenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Shoes");
		
		Thread.sleep(3000);
		
		WebElement w2 = driver.findElement(By.xpath("((//div[@class='left-pane-results-container'])/div)[4]"));
		w2.click();
		
		LocalTime times = LocalTime.now();
		String s1 = times.toString().replace(":", "_");
		System.out.println(s1);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File f1 = screenshot.getScreenshotAs(OutputType.FILE);
		
		File location = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\abc_"+ s1 +".png");
		FileHandler.copy(f1, location);
		
		/*
		LocalTime times = LocalTime.now();
		String s1 = times.toString().replace(":", "_");
		System.out.println(s1);
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File f1 = t1.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\abc_"+ s1 +".png");
		FileHandler.copy(f1, dest);
		*/
		
		driver.quit();
	}
}
