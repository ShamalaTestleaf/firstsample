package week2dy1n2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindows_Windowhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TO GET FIRSTWINDOW - URL,PRINT TITLE 
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	 	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			
		//SAME FOR SECOND WINDOW - put it in a loop 
		
		driver.findElementByLinkText("Contact Us").click();
		driver.findElementByLinkText("Counter Ticket Cancellation").click();

		 String firstWindow = driver.getWindowHandle();// single window - HANDLE - SYNTAX
			
		Set<String> eachWindow = driver.getWindowHandles();//handling many windows - HANDLES - SYNTAX WITH FOR LOOP
	
		for(String allWindowHandle : eachWindow)
		{
			
			driver.switchTo().window(allWindowHandle);																											
				
		}
		
		 System.out.println("NUMBER OF WINDOWS opened" +eachWindow.size());
		System.out.println("second or rest of the window url" +driver.getCurrentUrl());
		System.out.println("second TITLE OF THE URL" +driver.getTitle());
		
		//SWITCH BACK TO FIRSTWINDOW
		
		
		driver.switchTo().window(firstWindow);
		System.out.println("THE URL OF FIRSTWINDOW" +firstWindow);//alphanumeric char
		System.out.println("TITLE OF THE URL" +driver.getTitle());
		
		driver.quit();

		
	}

}
