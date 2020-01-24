package DemoWebShopTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DemoWebShopPOM.RegistrationPagePom;

public class RegisterPageTest {

	@Test
	public void checkRegistration() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		RegistrationPagePom register=new RegistrationPagePom(driver);
		register.clickRegisterLink();
		register.selectgender();
		register.enterfirstname("Raghu");
		register.enterlastname("Rapole");
		register.enteremail("raghurapole@gmail.com");
		register.enterpassword("Raghu@1234");
		register.enterconfirmpassword("Raghu@1234");
		register.clickregister();
		
		
	}
}
