package sachinTest;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Base {

	
	public static WebDriver driver ;
	 public Properties prop;

	public WebDriver initialize() throws IOException
	
	{
		
		 prop= new Properties ();
		FileInputStream fis = new FileInputStream("C:\\Users\\pok3r\\LearnTest\\src\\main\\java\\initial.properities");
		prop.load(fis);
		
		
	    System.out.println(prop.getProperty("browser"));
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pok3r\\selenium\\drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    
	    return driver;
		
	}
	
	
	public void getScreenshot(String Result) throws IOException
	{
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Users\\pok3r\\selenium\\"+Result+".png"));

		}
	
}
