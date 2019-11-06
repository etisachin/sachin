package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {
	
	
	
	WebDriver driver;
	
	By user_name = By.id("ap_email");
	
	By continue_btn =By.id("continue");
	
	By passwd =By.id("ap_password");
	
	By signin =By.id("signInSubmit");
	
	public login_page(WebDriver driver2)
	
	{
		driver=driver2;
		
		}
	
	public WebElement click_signin()
	{
		
		
		return driver.findElement(signin);
		
	}
	
	
	public WebElement usr_name()
	{
		
		
		return driver.findElement(user_name);
		
	}
	
	public WebElement click_continue()
	{
		
		
		return driver.findElement(continue_btn);
		
	}
	
	
	public WebElement passwd()
	{
		
		
		return driver.findElement(passwd);
		
	}
	
	
	
	
	
	

}
