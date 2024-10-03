package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_103_screenshot_gmail 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.google.co.in/");
		
		drive.findElement(By.linkText("Gmail")).click();

		LocalTime time_now = LocalTime.now();
		String time_2_text = time_now.toString().replace(":", "_");
		
		TakesScreenshot screenshot = (TakesScreenshot) drive;
		File f1 = screenshot.getScreenshotAs(OutputType.FILE);
		
		File location = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\abc_"+ time_2_text +".png");
		FileHandler.copy(f1, location);	
			
	}
}
