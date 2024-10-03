package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_082_navigate 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://search.brave.com/");
		WebElement abc1 = web.findElement(By.name("q"));
		abc1.sendKeys("irctc.co.in"+ Keys.ENTER);
		Thread.sleep(2000);
		WebElement abc2 = web.findElement(By.xpath("(//div[@class=\"title svelte-1oi98xa\"])[1]"));
		abc2.click();
		Thread.sleep(2000);
		web.navigate().back();
		Thread.sleep(2000);
		web.navigate().forward();
		Thread.sleep(2000);
		web.navigate().refresh();
		Thread.sleep(2000);
		web.quit();
	}
}
