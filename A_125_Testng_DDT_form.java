package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A_125_Testng_DDT_form 
{	
	@Test(dataProvider="inputs")
	public void registration_form(String fname,String lname,String mail,String number,String gend,String union,String id_01,String id_02)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		
		WebElement fn = driver.findElement(By.id("firstName"));
		fn.sendKeys(fname);
		
		WebElement ln = driver.findElement(By.id("lastName"));
		ln.sendKeys(lname);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(mail);
		
		WebElement mobile = driver.findElement(By.id("phone"));
		mobile.sendKeys(number);
		
		WebElement gender = driver.findElement(By.id("gender"));
		Select s1 = new Select(gender);
		s1.selectByVisibleText(gend);
		
		WebElement state = driver.findElement(By.id("state"));
		Select s2 = new Select(state);
		s2.selectByVisibleText(union);
		
		WebElement aadhaar = driver.findElement(By.id("aadhaar"));
		aadhaar.sendKeys(id_01);
		
		WebElement pan = driver.findElement(By.id("pan"));
		pan.sendKeys(id_02);
		
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
	}
	
	@DataProvider(name="inputs")
	public Object[][] datas()
	{
		Object[][] data = new Object[1][8];
		data[0][0] = "Senthilraja";
		data[0][1] = "Kumarapathi";
		data[0][2] = "abcdef@gmail.com";
		data[0][3] = "9876543210";
		data[0][4] = "Male";
		data[0][5] = "Assam";
		data[0][6] = "1111000022223333";
		data[0][7] = "ABCDE0000Z";

		return data;
	}
}
