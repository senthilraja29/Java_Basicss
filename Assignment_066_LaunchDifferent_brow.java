package Day41_selenium_start;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment_066_LaunchDifferent_brow 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver1 = new ChromeDriver();
		EdgeDriver driver2 = new EdgeDriver();
		FirefoxDriver driver3 = new FirefoxDriver();
		
		driver1.get("https://www.google.com");
		driver2.get("https://www.google.com");
		driver3.get("https://www.google.com");
		
		driver1.close();
		driver2.close();
		driver3.close();		
	}
}
