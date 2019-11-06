package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Amazon_Home_Page{
	
	
	//a[@id='nav-link-accountList']
	
	WebDriver driver;
	By search=By.cssSelector("input[id=twotabsearchtextbox]");
	By login =By.xpath("//a[@id='nav-link-accountList']");
	By signin =By.xpath("//div[@id='nav-flyout-ya-signin'] //span[contains(text(),'Sign in')]");
	By orders =By.xpath("//a[@id='nav-orders']");
	
	public Amazon_Home_Page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		driver=driver2;
	}

	public WebElement verify_order()
	
	{
		
		return driver.findElement(orders);
		
		
}
	


	public WebElement search()
	
	{
		
		return driver.findElement(search);
		
		
}
	
public WebElement click_login()
	
	{
		
		return driver.findElement(login);
		
		
}
	
public WebElement sign_in()

{
	
	return driver.findElement(signin);
	
	
}
	
	

}
