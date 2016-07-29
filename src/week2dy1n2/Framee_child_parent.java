package week2dy1n2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framee_child_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize
		driver.manage().window().maximize();
			
		// Enter URL - 
		
		//http://www.w3schools.com/js/js_popup.asp
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		
		// Set timeouts
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			
		/*WebDriver id = driver.switchTo().frame(driver.findElement(By.id("IRHCOMMFRAME")));

		System.out.println("The Element with id :"+id+"is  available");
		
		WebDriver name = driver.switchTo().frame(driver.findElement(By.name("childIframe")));
		
		System.out.println("The Element with name :"+name+"is  available");
		
//IF ONLY ONE IFRAME IS THERE, USE INDEX... OR DONT USE
*/		/*WebDriver indexx = driver.switchTo().frame(0);
System.out.println("The no of index :" +indexx.getClass());

			WebDriver parentFrame = driver.switchTo().defaultContent();*/
				
				WebDriver nameTagg = driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
				System.out.println("The Element with id :"+nameTagg+"is  available");

			WebDriver id = driver.switchTo().frame("id");
			System.out.println("The Element with id :"+id+"is  available");

			WebDriver namee = driver.switchTo().frame("name");
			System.out.println("The Element with id :"+namee+"is  available");
			
			
			/*List<WebElement> allframes= driver.switchTo().frame(driver.findElement(By.id("iFrame")));
			
			driver.switchTo().frame(webelement)

			for(String allWindowHandle : eachWindow)
			{
				
				driver.switchTo().window(allWindowHandle);																											
				List<WebElement> allDropDownss= driver.findElementsByXPath("//a[contains(class,'dropdown-toggle']");
			
			}*/
			
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent()
	
			

to ask ramya tomorrow..args.

		
			
		System.out.println("The Element with index :"+indexx+"is  available");
		
		
		*/
		
		

		/*List<WebElement> allframes= driver.findElementsByXPath("//a[contains(class,'dropdown-toggle']");

		for(String allWindowHandle : eachWindow)
		{
			
			driver.switchTo().window(allWindowHandle);																											
			List<WebElement> allDropDownss= driver.findElementsByXPath("//a[contains(class,'dropdown-toggle']");
		*/
		}
		
			}


