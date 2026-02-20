package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basec 

{
	public static String browser="chrome";
	public static String URL="https://www.facebook.com";
	public static WebDriver driver;
	
	
	public static void browserInitzation() throws InterruptedException
	{
		switch(browser)
		{
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 Thread.sleep(4000);
			 driver.get(URL);
			 break;
			 
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 driver.get(URL);
			 break;	
		
		}
		
	}
		
	public static void browser_Close()
	{
		driver.close();
	}
	

}
