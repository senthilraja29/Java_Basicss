package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A_124_Testng_login_amazon 
{
	@Test(dataProvider="abc")
	public void login(String user, String pass) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1 = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(w1).click().perform();
	
		WebElement username = driver.findElement(By.id("ap_email"));
		username.sendKeys(user + Keys.ENTER);
	
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(pass + Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="abc")
	public Object[][] data1()
	{
		Object[][] datas = new Object[4][2];
		
		// Set-01  - Valid Username - Valid Password
		datas[0][0] = "chennai@gmail.com";
		datas[0][1] = "Chennai@123";
		
		// Set-02 - Valid Username - INValid Password
		datas[1][0] = "chennai@gmail.com";
		datas[1][1] = "sebstin@9835@la";
		
		// Set-03 - InValid Username - Valid Password
		datas[2][0] = "abcdef@gmail.com";
		datas[2][1] = "Chennai@123";
		
		// Set-04 - InValid Username - INValid Password
		datas[3][0] = "qwerpoiu@gmail.com";
		datas[3][1] = "mnbvkjhgfd351498";	
		
		return datas;
	}
	
}
