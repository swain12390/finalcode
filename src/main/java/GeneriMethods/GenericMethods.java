package GeneriMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basepackage.BaseClass;

public class GenericMethods extends BaseClass
{

	public static String captureScreenShot() throws IOException 
	{
		TakesScreenshot tc=((TakesScreenshot)BaseClass.Driver);
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
		File destfile=new File("E://project//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrfile, destfile);
		
	String srcpath=destfile.getAbsolutePath();
		
		return srcpath;
	}
	
	
	
	public static void explictWait(int time, WebElement button1)
	{
		
		 WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.elementToBeClickable(button1));
	    button1.click();
	}


	


}
