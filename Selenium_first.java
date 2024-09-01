package Day41_selenium_start;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_first 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dri1	= new ChromeDriver();
		EdgeDriver dri2		= new EdgeDriver();
		
		Thread.sleep(3000);
		
		dri1.quit();
		dri2.get("https://www.facebook.com");
		System.out.println(dri2.getWindowHandle());
		System.out.println(dri2.getWindowHandles());
		Thread.sleep(3000);
		dri2.quit();
	}
}
