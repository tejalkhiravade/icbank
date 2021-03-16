package bank.UnitSteps;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TemptJava {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.gecko.driver", "D:\\banking project\\icBank\\src\\test\\resources\\DRIVERS\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Browser Launch
		driver.get("http://primusbank.qedgetech.com/");

	}

}
