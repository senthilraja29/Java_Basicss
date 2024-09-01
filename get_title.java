package Day42_selenium02;

import org.openqa.selenium.chrome.ChromeDriver;

public class get_title 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
