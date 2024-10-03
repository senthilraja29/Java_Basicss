package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_087_dropdowns 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://grotechminds.com/registration/");
		WebElement e1 = web.findElement(By.xpath("((//div/div/select[@class='Skills ss form-control'])/option[@value='select1'])"));
		e1.click();
		WebElement e2 = web.findElement(By.xpath("((//div/div/select[@class='Country ss form-control'])/option[@value='India'])"));
		e2.click();
		WebElement e3 = web.findElement(By.xpath("((//div/div/select[@class='Relegion ss form-control'])/option[@value='Jain'])"));
		e3.click();
		Thread.sleep(5000);
		web.quit();	
	}
}
