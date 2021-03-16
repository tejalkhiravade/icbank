package bank.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
      public static WebDriver driver=null;
      
      //Browser Lunch 
	public static void browserLaunch(Object[] inputparameters) 
	{
		 String strBrowseName=(String) inputparameters[0];
		 String webDriverExePath=(String) inputparameters[1];
		 
		  if(strBrowseName.equalsIgnoreCase("gecko"))
		 {
			 System.setProperty("webDriver.gecko.driver", webDriverExePath);
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 
		 }
       
	}
        // Application Launch
	public static void aplicationLaunch(Object[] inputparameters)
	{
	      String strURL=(String) inputparameters[0];
	      driver.get(strURL);
		
	}
	//Send keys
	public static void sendkey(Object[] inputparameters )
	{
		String xpath=(String) inputparameters[0];
		String value=(String) inputparameters[0];
		
		WebElement obj=(WebElement) driver.findElements(By.xpath(xpath));
		           obj.clear();
		           obj.sendKeys(value);
		
		
	}
    //Click
	public static void click(Object[] inputparameters)
	{
		
		String xpath=(String) inputparameters[0];
		      WebElement obj1 = driver.findElement(By.xpath(xpath));
		                 obj1.click(); 
    }
	//Drop down
	public static void dropdown(Object[]inputparameters)
	{
		String xpath=(String) inputparameters[0];
		String name=(String) inputparameters[1];
		Select sel=new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(name);
		
		
	}
}
