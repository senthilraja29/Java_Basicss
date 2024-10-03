package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_144_Testng_timeout_testcase 
{
	String User;
	String Pass;
	@BeforeTest
	public void datas() throws EncryptedDocumentException, IOException
	{
		FileInputStream folder_locate = new FileInputStream("D:\\JAva\\Automation\\DataFetching\\Assignment_134.xlsx");
		Workbook excel = WorkbookFactory.create(folder_locate);
		Sheet s1 = excel.getSheet("amazon_login");
		
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		User = c1.toString();
		
		Row r2 = s1.getRow(1);
		Cell c2 = r1.getCell(1);
		Pass = c2.toString();
	}
	
	@Test(timeOut = 1000)
	public void login_amazon()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement w1 = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions hover = new Actions(driver);
		hover.moveToElement(w1).click().perform();
		
		WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement w2 = waiting.until(ExpectedConditions.elementToBeClickable(By.id("ap_email")));
		w2.sendKeys(User);
	
		driver.findElement(By.id("continue")).click();
		
		WebElement w3 = waiting.until(ExpectedConditions.elementToBeClickable(By.id("ap_password")));
		w3.sendKeys(Pass + Keys.ENTER);
	}
}
