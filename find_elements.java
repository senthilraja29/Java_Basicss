package Day42_selenium02;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.Main;

public class find_elements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://www.flipkart.com");
		Thread.sleep(3000);
	//	driver1.findElement();
	}
}
