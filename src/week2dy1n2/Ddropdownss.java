package week2dy1n2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ddropdownss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://developer.salesforce.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		//how many drop downs are available.
		
	List<WebElement> allDropDownss= driver.findElementsByXPath("//a[contains(class,'dropdown-toggle']");
			
		
			System.out.println(allDropDownss.size());
	
	for(WebElement eachDropDownn: allDropDownss)																																
	{
		System.out.println("List of dropdowns" +eachDropDownn.getAttribute("href"));
	}
	
			
	driver.close();
	}
		
}
