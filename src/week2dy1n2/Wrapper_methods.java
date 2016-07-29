package week2dy1n2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapper_methods {
	
	//FirefoxDriver  driver = new FirefoxDriver();
	FirefoxDriver driver = null;
	
	
public void login(String url, String browser)
	
	{
		
	try {
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	} 
	
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		
		driver.
		
	System.out.println("The url" +url+ "is unavailable");
	}
	}
	
	public void enterTextById(String id, String value)
	
	{
		
	try {
		driver.findElementById("id").sendKeys("value");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		
	System.out.println("The element" +id+ " id is unavailable");
	}
	
}
public void logout()
	
	{
		
	try {
		
		driver.close();	} 
	
	catch (Exception e) {
		// TODO Auto-generated catch block
		
	//System.out.println("The element" +id+ " id is unavailable");
	}
	
}
}
