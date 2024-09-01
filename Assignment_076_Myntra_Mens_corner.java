package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_076_Myntra_Mens_corner 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement web1 = driver.findElement(By.partialLinkText("Men"));
		web1.click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
