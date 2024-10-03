package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_078_Google_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.google.com/");
		WebElement A1 = web.findElement(By.xpath("(//textarea[@title=\"Search\"])"));
		A1.sendKeys("India" + Keys.ENTER);
		Thread.sleep(5000);
		web.quit();
	}
}
