package Assignments;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class A_121_Testng_Multiple_browser 
{
	WebDriver driver;
	@Test
	public void mulitple_browser()
	{	
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter your Input");
		Integer v = inputs.nextInt(); 

		if(v==1)
		{
			new ChromeDriver();
		}
		else if(v==2)
		{
			new EdgeDriver();
		}
		else if(v==3)
		{
			new FirefoxDriver();
		}
		else if(v==4)
		{
			new SafariDriver();
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}
