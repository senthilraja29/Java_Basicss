package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_080_amzn_1st_prod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.amazon.in/");
		WebElement e1 = web.findElement(By.xpath("(//a[@tabindex=\"0\"])[7]"));
		e1.click();
		WebElement e2 = web.findElement(By.xpath("(//div[@data-rows=\"4\"])[1]"));
		e2.click();
		Thread.sleep(3000);
		web.quit();
	}
}
