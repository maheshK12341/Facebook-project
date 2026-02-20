package GenericMethods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import base.basec;

public class GenericMethodsC extends basec
{

	public static void JavascriptExecutor_click(WebElement Ele)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",  Ele);
	}
	
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		//we are Takescreenshot as interface and upcasting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
				
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	
	
	
	
	
	
	public static void select_checkbox(String checkname)
	{
	List<WebElement>allcheckboxes=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	
		for(int i=0;i<=allcheckboxes.size()-1;i++)
		{
			if(checkname.equals(allcheckboxes.get(i).getAttribute("value")))
			{
				allcheckboxes.get(i).click();
			}
		}
	}
	
	
	
}
