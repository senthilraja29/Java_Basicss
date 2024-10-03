package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_084_fb_login_xpat 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.facebook.com/");
		WebElement	q = web.findElement(By.xpath("(//input[@id=\"email\"])"));
		q.sendKeys("poiuytr@gmail.com");
		WebElement	p = web.findElement(By.xpath("(//input[@id=\"pass\"])"));
		p.sendKeys("xyzabc123");
		WebElement	r = web.findElement(By.xpath("(//button[@name=\"login\"])"));
		r.click();
		Thread.sleep(2000);
		web.quit();
	}
}
