package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_093_amzn_ctgroy_books 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		drive.get("https://amazon.in/");
		
		WebElement w1 = drive.findElement(By.id("searchDropdownBox"));
	//	w1.click();
		
		Select s1 = new Select(w1);
		s1.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		drive.quit();
	}
}
