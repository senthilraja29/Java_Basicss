package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_099_Auto_suggestion_amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver cd =new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.amazon.in/");
		
		WebElement w1 = cd.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Men's Shoes");
		
		Thread.sleep(3000);
		WebElement w2 = cd.findElement(By.xpath("(//div//div[@class='left-pane-results-container']/div)[4]"));
		w2.click();
		
		Thread.sleep(2000);
		cd.quit();
	}
}
