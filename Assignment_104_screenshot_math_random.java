package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_104_screenshot_math_random 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.google.co.in/");
		
		TakesScreenshot t1 = drive;
		File f1 = t1.getScreenshotAs(OutputType.FILE); 
		
		File locat = new File("C:\\Users\\Senthilraja K\\OneDrive\\Pictures\\abc_"+ Math.random() +".png");
		FileHandler.copy(f1, locat);
	}
}
