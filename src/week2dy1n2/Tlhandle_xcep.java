package week2dy1n2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class Tlhandle_xcep {
	
		public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub
		
		FirefoxDriver  driver = new FirefoxDriver();

		driver.get("http://demo1.opentaps.org/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		
		try {
			driver.findElement(By.id("userame")).sendKeys("DemoSalesManager");
		} 		catch (NoSuchElementException e) 
		
		{
			System.out.println("Element not found");	
		} 
		
		finally {
						File snap = driver.getScreenshotAs(OutputType.FILE);

			// copy the file from memory to physical file

			FileUtils.copyFile(snap, new File("./Snapshot/snap2.jpeg"));
			
			// Code for taking screenshots
			// Executes in case of pass or failure
			
		driver.close();
		}
		}
	}



