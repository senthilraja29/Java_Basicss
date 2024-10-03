package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_130_Testng_assert_payment_method 
{
	@Test
	public void amazon_purchase() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("keys" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement w3 = driver.findElement(By.linkText("Royal Enfield KEY CHAIN BLACK"));
		w3.click();
		
		Set<String> webs = driver.getWindowHandles();
		System.out.println(webs);
		
		Iterator<String> i = webs.iterator();
		
		String a = i.next();
		String b = i.next();
		
		System.out.println("Parent window " + a);
		System.out.println("Child window " + b);
		driver.switchTo().window(b);
		
		WebElement Addcart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])"));
		Addcart.click();
		
		Thread.sleep(3000);
		WebElement Gocart = driver.findElement(By.xpath("((//span[@class='a-button-inner'])[1])"));
		Gocart.click();
		
		Assert.assertEquals(driver.getTitle() , "Amazon.in Shopping Cart");
		Thread.sleep(3000);
		driver.quit();
	}
}
