package Assignments;

import java.io.File;
import java.io.IOException;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_105_screenshot_class_name 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		
		
		TakesScreenshot screenshot = driver;
		File initi = screenshot.getScreenshotAs(OutputType.FILE);
	
		File locate = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\"+ driver.getClass() +".png");
		FileHandler.copy(initi, locate);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
