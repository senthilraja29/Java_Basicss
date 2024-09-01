package Day41_selenium_start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_067_Login_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		e1.click();
		WebElement e2 = driver.findElement(By.name("email"));
		e2.sendKeys("abcdef@gmail.come" + Keys.ENTER);
	//	Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("123456787");
		WebElement e4 = driver.findElement(By.className("a-button-input"));
		e4.click();
	}
}
