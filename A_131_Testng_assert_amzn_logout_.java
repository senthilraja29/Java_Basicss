package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_131_Testng_assert_amzn_logout_ 
{
	String value1;
	String value2;
	WebDriver driver;
	@BeforeTest
	public void login_data() throws EncryptedDocumentException, IOException
	{
		FileInputStream data_locat = new FileInputStream("D:\\JAva\\Automation\\DataFetching\\Assignment_134.xlsx");
		Workbook excel = WorkbookFactory.create(data_locat);
		Sheet s1 = excel.getSheet("amazon_login");
		
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		value1 = c1.toString();
		System.out.println(value1);
		
		Row r2 = s1.getRow(1);
		Cell c2 = r2.getCell(1);
		value2 = c2.toString();
		System.out.println(value2);
	}
	
	@Test
	public void login_amazon() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1 = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).click().perform();
		WebElement w2 = driver.findElement(By.id("ap_email"));
		w2.sendKeys(value1 + Keys.ENTER);
		WebElement w3 = driver.findElement(By.id("ap_password"));
		w3.sendKeys(value2 + Keys.ENTER);
		Thread.sleep(15000);
		
		String login_title  = driver.getTitle();
		Assert.assertEquals(login_title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@AfterTest
	public void logout_amazon() throws InterruptedException
	{
		Thread.sleep(15000);
		Actions a2 = new Actions(driver);
		WebElement w5 = driver.findElement(By.xpath("((//span[@class='nav-icon nav-arrow'])[2])"));
		a2.moveToElement(w5).perform();
		WebElement w4 = driver.findElement(By.linkText("Sign Out"));
		w4.click();
		
		String ti_tle  = driver.getTitle();
		Assert.assertEquals(ti_tle, "Amazon Sign In");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
