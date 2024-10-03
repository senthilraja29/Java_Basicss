package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_077_amzn_srch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement web1= driver.findElement(By.id("twotabsearchtextbox"));
		
		if(web1.isDisplayed() && web1.isEnabled())
		{
			web1.sendKeys("shoe" + Keys.ENTER);
		}
		else 
		{
			System.out.println("Search Field isn't enabled and displayed");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
