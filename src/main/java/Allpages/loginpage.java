package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import GenericMethods.GenericMethodsC;
import base.basec;

public class loginpage extends basec
{

	public static By EmailID=By.cssSelector("input#email");
			
			//.xpath("//input[@id='email']");
	public static By passwordID=By.xpath("//input[@id='pass']");
	public static By loginbutton=By.xpath("//button[@name='login']");
	
	public static void EnterEmailID(String Emailname)
	{
		driver.findElement(EmailID).sendKeys(Emailname);
	}
	
	public static void Enterpassword(String passwordname)
	{
		driver.findElement(passwordID).sendKeys(passwordname);
	}
	
	
	public static void login()
	{
		WebElement ele=driver.findElement(loginbutton);
		
		GenericMethodsC.JavascriptExecutor_click(ele);
	}
	
}
