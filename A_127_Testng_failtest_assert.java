package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A_127_Testng_failtest_assert 
{
	@Test
	public void testcase01() throws InterruptedException
	{
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://cza.nic.in/page/en/important-govt-of-india-websites");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement w1 = drive.findElement(By.xpath("(//a[@href='https://www.india.gov.in'])"));
		w1.click();
		
		Set<String> s1 = drive.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> i = s1.iterator();
		String link1 = i.next();
		String link2 = i.next();
		
		drive.switchTo().window(link2);
		WebElement w3 = drive.findElement(By.id("search_key"));
		w3.sendKeys("defense");
		
		Assert.assertEquals(drive.getTitle(), "National Portal ofIndia"); //fail the test case using wrong title
	}
}
