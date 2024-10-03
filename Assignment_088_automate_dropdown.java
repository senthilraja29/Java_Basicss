package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_088_automate_dropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		
		web.get("https://grotechminds.com/registeration-form/");
		WebElement w1 = web.findElement(By.xpath("(//select[@id='state'])"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("Goa");
		
		WebElement w2 = web.findElement(By.xpath("(//select[@id='gender'])"));
		Select s2 = new Select(w2);
		s2.selectByVisibleText("Male");
		
	//	WebElement w3 = web.findElement(By.id("file"));
	//	w3.sendKeys("C:\\Users\\Senthilraja K\\Downloads\\IPR New.pdf");
		
		Thread.sleep(5000);
		web.quit();	

	}
}
