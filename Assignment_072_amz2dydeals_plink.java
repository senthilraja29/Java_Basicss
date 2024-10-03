package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_072_amz2dydeals_plink 
{
	public static void main(String[] args) 
	{
		EdgeDriver edrive = new EdgeDriver();
		edrive.get("https://www.amazon.in/");
		edrive.manage().window().maximize();
		WebElement e1 =  edrive.findElement(By.partialLinkText("Today's"));
		e1.click();
		
	}
}
