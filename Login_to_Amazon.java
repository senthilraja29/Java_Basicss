package Day42_selenium02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_to_Amazon {
public static void main(String[] args) {
	ChromeDriver driver1 = new ChromeDriver();
	driver1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12826247324104183805%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061921%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver1.manage().window().maximize();
	WebElement un=	driver1.findElement(By.name("email"));
	un.sendKeys("stbymkt@gmail.com");
	
	WebElement cnt_button=	driver1.findElement(By.id("continue"));
	cnt_button.click();
	
	
	WebElement password=	driver1.findElement(By.name("password"));
	password.sendKeys("BHY^%$REDCFVGBHJK");
	
	WebElement signinbutton=	driver1.findElement(By.id("signInSubmit"));
	signinbutton.click();
}
}
