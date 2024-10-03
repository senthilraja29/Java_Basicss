package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_083_Amzn_srch 
{
    public static void main(String[] args) throws InterruptedException 
    {   
        
        ChromeDriver web = new ChromeDriver();
        web.manage().window().maximize();
        
        
        web.get("https://amazon.in/");
        
        
        WebElement searchBox = web.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("shoe");
        
        
        web.findElement(By.xpath("//input[@value='Go']")).click();
        
        WebDriverWait wait = new WebDriverWait(web, Duration.ofSeconds(20));
        
        List<WebElement> searchResults = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@data-component-type='s-search-result']//h2/a")));
        
        System.out.println(searchResults.size());
        
        // web.quit();
    }
}
