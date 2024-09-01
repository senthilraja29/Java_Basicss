package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_073_icici_SBI_idfc_inspect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive1 = new ChromeDriver();
		drive1.get("https://sbi.co.in/");
		drive1.manage().window().maximize();
		WebElement web1 = drive1.findElement(By.xpath("(//a[@id=\"2\"])"));
		web1.click();
		Thread.sleep(3000);
		
		drive1.get("https://www.icicibank.com/");
		drive1.manage().window().maximize();
		WebElement web2 = drive1.findElement(By.partialLinkText("Payments"));
		web2.click();	
		Thread.sleep(3000);
		
		drive1.get("https://www.idfcfirstbank.com/");
		drive1.manage().window().maximize();
		WebElement web3 = drive1.findElement(By.partialLinkText("Wealth"));
		web3.click();

		
		
		
		Thread.sleep(5000);
		drive1.quit();
	}
}
