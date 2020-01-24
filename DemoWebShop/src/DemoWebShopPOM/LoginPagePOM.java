package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;
	By clickloginlink=By.xpath("//a[@class='ico-login']");
	By username=By.id("Email");
	By password=By.name("Password");
	By login=By.xpath("//input[@class='button-1 login-button']");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickLoginLink()
	{
		driver.findElement(clickloginlink).click();
	}
	
	public void enterusername(String UN)
	{
		driver.findElement(username).sendKeys(UN);
	}
	
	public void enterpassword(String PWD)
	{
		driver.findElement(password).sendKeys(PWD);
	}
	
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	
	public void clicklogout()
	{
		driver.findElement(logout).click();
	}
}
