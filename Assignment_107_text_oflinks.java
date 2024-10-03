package Assignments;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpConnectTimeoutException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_107_text_oflinks 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cza.nic.in/page/en/important-govt-of-india-websites");
		List<WebElement> elements = (List<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for(int i = 0; i < elements.size() ; i++) 
		{
			WebElement w1 = elements.get(i);
			String link = w1.getAttribute("href");
			System.out.println(link);
			verify_url(link);
			
		//	String webname    = w1.getText();
		//	System.out.println(webname);	
		}
	}

	static void verify_url(String link) throws IOException
	{
		try
		{
			URL url_ = new URL(link);
			HttpsURLConnection z1 = (HttpsURLConnection) url_.openConnection();
			
			if(z1.getResponseCode()==200)
			{
				System.out.println("Valid Links");
			}
			else
			{
				System.out.println("Invalid Links");
			}
		}
		catch(MalformedURLException e1)
		{
			System.out.println("Malformated URL Exception");
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println("Malformated URL Exception");
		}
		
	}

}
