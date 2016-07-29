package loginJav;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.TimeUnit;

public class Loginva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver  driver = new FirefoxDriver();
		
		driver.get("http://demo1.opentaps.org/");
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		System.out.println (driver.findElementByXPath("//*[@id='form']/h2").getText());
		
		//Print Title
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getTitle());

		driver.close();
	} //closing main method

}//closing class
				
		
		



