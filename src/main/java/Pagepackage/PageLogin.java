package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basepackage.BaseClass;
import GeneriMethods.GenericMethods;


public class PageLogin extends BaseClass
{
	GenericMethods Gm= new GenericMethods();
	public static By EmailID=By.xpath("//input[@name='email']");
	
	public static By PassWordID=By.xpath("//input[@name='pass']");
	public static By Button= By.xpath("//button[@name='login']");
	
	public static void Enter_Emailid(String email)
	{
		Driver.findElement(EmailID).sendKeys(email);
	}
	public static void Enter_password(String password)
	{
		Driver.findElement(PassWordID).sendKeys(password);
			
	}
	public static void Login()
	{
		GenericMethods Gm= new GenericMethods();
		WebElement Button1= Driver.findElement( Button);
		Gm.explictWait(3, Button1);	
	}
	
}
