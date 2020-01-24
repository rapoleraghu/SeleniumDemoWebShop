package DemoWebShopTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoWebShopPOM.LoginPagePOM;
import DemoWebShopPOM.RegistrationPagePom;

public class RegisterLoginTest {

	WebDriver driver;
	@BeforeMethod
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void checkRegistrationPage() throws InterruptedException
	{
		
		
		RegistrationPagePom register=new RegistrationPagePom(driver);
		register.clickRegisterLink();
		register.selectgender();
		register.enterfirstname("rapi");
		register.enterlastname("rapi");
		register.enteremail("Rapi@gmail.com");
		register.enterpassword("Rapi@1234");
		register.enterconfirmpassword("Rapi@1234");
		register.clickregister();
		Thread.sleep(3000);
		String expectedtitle="Your registration Completed";
		String actualTitle=driver.findElement(By.xpath("//*[contains(text(),'Your registration completed')]")).getText();
		Assert.assertEquals(expectedtitle, actualTitle);
		register.clicklogout();
	}
	
	@Test(priority=1)
	public void checkLoginPage() throws InterruptedException
	{

		
		LoginPagePOM login=new LoginPagePOM(driver);
		login.clickLoginLink();
		login.enterusername("Rapi@gmail.com");
		login.enterpassword("Rapi@1234");
		login.clicklogin();
		Thread.sleep(3000);
		login.clicklogout();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
