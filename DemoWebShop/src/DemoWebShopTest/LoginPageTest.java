package DemoWebShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.LoginPagePOM;

public class LoginPageTest {

	@Test
	public void checkLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		LoginPagePOM login=new LoginPagePOM(driver);
		login.clickLoginLink();
		login.enterusername("rapoleraghu@gmail.com");
		login.enterpassword("Raghu@1995");
		login.clicklogin();
		Thread.sleep(3000);
		login.clicklogout();
	}
	
	
	
}
