package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_106_screenshot_name_time 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://indianculture.gov.in/");
		Thread.sleep(5000);
		
		LocalTime time_ = LocalTime.now();
		String s1 = time_.toString().replace(":", "_");
		
		TakesScreenshot t1 = web;
		File f1 = t1.getScreenshotAs(OutputType.FILE);
		
		File locat = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\Senthilraja"+ s1 +".png");
		FileHandler.copy(f1, locat);
	}
}
