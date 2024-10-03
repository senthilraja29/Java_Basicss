package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(A_141_Testng_itest02.class)
public class A_141_Testng_Itestlistener_amazon 
{
	@Test
	public void login_amazon()
	{
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in/");
		drive.manage().window().maximize();
		
	}
}
