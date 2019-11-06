package runner;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object_repository.Amazon_Home_Page;
import object_repository.login_page;
import sachinTest.Base;

public class landing_page extends Base {

	
     @Test(dataProvider="getData")
     public void mainPage (String usrname,String passwd) throws IOException, InterruptedException
     
     {
    	 
    	 driver=initialize();
    	 
    	 driver.get(prop.getProperty("url"));
    	 
    	 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	 Amazon_Home_Page AHP = new Amazon_Home_Page(driver);
    	 
    	 Actions a= new Actions(driver);
    	 a.moveToElement(AHP.click_login());
    	 a.moveToElement(AHP.sign_in()).click().build().perform();
    	 login_page lp= new login_page(driver);
    	 
    	 lp.usr_name().sendKeys(usrname);
    	 
    	 lp.click_continue().click();
    	 
    	 Thread.sleep(3000);
    	 
    	 
    	 lp.passwd().sendKeys(passwd);
    	 
     }
	
     
     @DataProvider
     public Object[][] getData()
     {
    	// Row is the numbe rof test to be conducted by different data types 
    	 
    	// column is for how amny values to send 
    	 Object [][] data =new 	Object[2][2];
    	 
    	 data[0][0]="7760282007";
    	 data[0][1]="test123";
    	 
    	 
    	 data[1][0]="8860282007";
    	 data[1][1]="asdfdg";
    	 
    	 return data;
    	 
     }
	
	
	
	
	
	
}
