package Assignments;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_092_drag_and_drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://grotechminds.com/drag-and-drop/");
	
		WebElement loc1 = drive.findElement(By.id("drag7"));
		WebElement loc2 = drive.findElement(By.id("div2"));
		
		Actions a1 = new Actions(drive);
		a1.dragAndDrop(loc1, loc2).perform();
		
		Thread.sleep(2000);
		drive.quit();
	}
}
