package Assignments;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.AbstractParallelWorker.Arguments;

import graphql.language.Argument;

public class A_133_Testng_youtube_Assertion 
{
	@Test
	public void youtube() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		WebElement w2 = driver.findElement(By.xpath("(//div//input[@id='search'])"));
		w2.sendKeys("Tourism");
		w2.sendKeys(Keys.ENTER);
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement filtersButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Filters']")));
        
       //Use JavascriptExecutor to click the button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", filtersButton);

        WebElement filtersoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//yt-formatted-string[text()='Channel'])")));
		filtersoption.click();
		
		WebElement subscribe =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div[@id='subscribe-button'])[6])")));
		subscribe.click();
		
		WebElement forgot_button = driver.findElement(By.xpath("(//button[text()='Forgot email?'])"));
		String actual = forgot_button.getText();
		
		Assert.assertEquals(actual, "Forgot email?");
	}
}
