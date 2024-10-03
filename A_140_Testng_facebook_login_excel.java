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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A_140_Testng_facebook_login_excel 
{
	String User;
	String pass_1;
	@BeforeTest
	public void datas() throws EncryptedDocumentException, IOException
	{
		FileInputStream location = new FileInputStream("D:\\JAva\\Automation\\DataFetching\\Assignment_134.xlsx");
		Workbook excel_ = WorkbookFactory.create(location);
		Sheet value = excel_.getSheet("face_book");
		
		Row r1 = value.getRow(1);
		Cell c1 = r1.getCell(0);
		User = c1.toString();
		
		Row r2 = value.getRow(1);
		Cell c2 = r2.getCell(1);
		pass_1 = c2.toString();
	}
	@Test
	public void login_facebook()
	{
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		
		WebElement login = drive.findElement(By.id("email"));
		login.sendKeys(User);
		
		WebElement Password = drive.findElement(By.id("pass"));
		Password.sendKeys(pass_1);
		
		drive.findElement(By.xpath("(//button[@name='login'])")).click();
	}
}
