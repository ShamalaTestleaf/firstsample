package week2dy1n2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framess_childframee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize
		driver.manage().window().maximize();
			
		// Set timeouts
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Enter URL - 
		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		int sizeOfFrames = driver.findElementsByTagName("iframe").size();
		  //List<WebElement>allFrames = driver.findElementsByTagName("iframe").;
		System.out.println("Number of iframes" +sizeOfFrames);
		
		driver.switchTo().frame("DIDCHROME");
		
		Set<String> childFrame = driver.getWindowHandles();//handling many windows - HANDLES - SYNTAX WITH FOR LOOP
		
		for(String allFrame : childFrame)
		{
						driver.switchTo().window(allFrame);																											
				
		}
		
				
		
		
		//http://www.guru99.com/handling-iframes-selenium.html
		

		driver.quit();
	}
		
}
