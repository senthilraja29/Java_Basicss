package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A_122_Testng_DDT_amazon_search 
{
	WebDriver driver;
	@Test(dataProvider="values")
	public void amazon_search(String values) throws InterruptedException
	{
		new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search =	driver.findElement(By.xpath("(//input[@type='text'])"));
		search.sendKeys(values + Keys.ENTER);
		Thread.sleep(3000);
	}
	@DataProvider(name="values")
	public Object[][] data1()
	{
		return new Object[][] {{"Bottle"},{"Pens"},{"Men's Dress"},{"Women's Dress"},{"Children's Dress"},{"Mobiles"}};
	}
}
