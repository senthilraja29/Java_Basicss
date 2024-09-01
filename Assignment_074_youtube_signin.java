package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_074_youtube_signin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://youtube.com");
		WebElement w1 = driver.findElement(By.xpath("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[4]"));
		w1.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
