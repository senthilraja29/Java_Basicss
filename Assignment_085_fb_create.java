package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_085_fb_create 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.facebook.com/");
		WebElement x1 = web.findElement(By.xpath("(//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"])"));
		x1.click();
		Thread.sleep(5000);
		WebElement y2 = web.findElement(By.xpath("((//div/input[@class='inputtext _58mg _5dba _2ph-'])[1])"));
		y2.sendKeys("Senthil");
		
	/*	
		WebDriverWait wait = new WebDriverWait(web, Duration.ofSeconds(1));
		WebElement x2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div/input[@class='inputtext _58mg _5dba _2ph-'])[1])")));
		x2.sendKeys("Senthil");
		WebElement x3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div/input[@class='inputtext _58mg _5dba _2ph-'])[2])")));
		x3.sendKeys("Raja");
	*/
	
	}
}
