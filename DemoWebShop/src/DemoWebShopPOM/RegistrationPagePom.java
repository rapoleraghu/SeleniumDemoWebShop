package DemoWebShopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPagePom {

	WebDriver driver;
	
	By ClickRegisterLink=By.xpath("//a[@class='ico-register']");
	By Gender=By.id("gender-male");
	By FirstName=By.id("FirstName");
	By LastName=By.id("LastName");
	By Email=By.id("Email");
	By Password=By.id("Password");
	By ConfirmPassword=By.id("ConfirmPassword");
	By Register=By.id("register-button");
	By logout=By.xpath("//a[@class='ico-logout']");
	
	
	public RegistrationPagePom(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickRegisterLink()
	{
		driver.findElement(ClickRegisterLink).click();
	}
	public void selectgender()
	{
		driver.findElement(Gender).click();
	}
	
	public void enterfirstname(String Fname)
	{
		driver.findElement(FirstName).sendKeys(Fname);
	}
	
	public void enterlastname(String Lname)
	{
		driver.findElement(LastName).sendKeys(Lname);
	}
	
	public void enteremail(String email)
	{
		driver.findElement(Email).sendKeys(email);
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void enterconfirmpassword(String confirmpassword)
	{
		driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
	}
	
	public void clickregister()
	{
		driver.findElement(Register).click();
	}
	
	public void clicklogout()
	{
		driver.findElement(logout).click();
	}
}
