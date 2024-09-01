package Day42_selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_amazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.in");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" + Keys.ENTER);
		
		
	}
}
