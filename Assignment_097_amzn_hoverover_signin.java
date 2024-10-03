package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_097_amzn_hoverover_signin 
{
	public static void main(String[] args) 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://www.amazon.in/");
		
		WebElement w1 = drive.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		
		Actions a1 = new Actions(drive);
		a1.moveToElement(w1).click().perform();
		
		WebElement w2 = drive.findElement(By.linkText("Sign in"));
		w2.click();
	}
}
