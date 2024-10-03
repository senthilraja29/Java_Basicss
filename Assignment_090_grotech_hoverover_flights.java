package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_090_grotech_hoverover_flights 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.get("https://grotechminds.com/automate-me/");
		web.manage().window().maximize();
	
		WebElement w1 = web.findElement(By.xpath("((//div[@class='elementor-flip-box__layer__overlay'])[4])"));
		
		Actions a1 = new Actions(web);
		a1.moveToElement(w1).click().perform();
		
		
		Thread.sleep(2000);
		WebElement w2 = web.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[2]"));
		w2.click();
		
		Thread.sleep(2000);
		web.quit();
	}
}
