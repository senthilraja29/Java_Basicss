package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_101_Auto_suggestion_pharmacy 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		
		WebElement q1 = driver.findElement(By.xpath("(//div//div[@data-placeholder='Search Medicines'])"));
		q1.click();
		
		WebElement q2 = driver.findElement(By.id("searchProduct"));
		q2.sendKeys("PCM" + Keys.ENTER);
		
		
		
	}
}
