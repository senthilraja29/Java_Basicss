package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_089_amzn_categry_dropdown 
{
	public static void main(String[] args) 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://amazon.in");
		web.manage().window().maximize();
		
		WebElement w1 = web.findElement(By.id("searchDropdownBox"));
		w1.click();
	}
}
