package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_081_amzn_categroy 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.amazon.in/");
		WebElement x1 = web.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		x1.sendKeys(Keys.ARROW_DOWN);
		x1.sendKeys(Keys.ARROW_DOWN); 
		x1.sendKeys(Keys.ENTER);
		
	}
}
