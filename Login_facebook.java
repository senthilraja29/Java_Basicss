package Day41_selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys("abcdef@gmail.come" + Keys.ENTER);
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys("abc123abc" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}
}
