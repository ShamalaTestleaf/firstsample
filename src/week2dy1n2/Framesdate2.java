package week2dy1n2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdate2 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubk
		
		// Chrome
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// Maximize
				driver.manage().window().maximize();
					
				// Set timeouts
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// Enter URL - 
				
				//http://www.w3schools.com/js/js_popup.asp
				driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
				//CLICKKING BUTTON INSIDE A FRAME ---- <iframe frameborder="0" id="iframeResult"></iframe>
				
				driver.switchTo().frame("iframeResult");
				driver.findElementByXPath("/html/body/button").click();//CLICKING - TRY IT BUTTON
				driver.switchTo().alert().dismiss(); //ALERT CANCEL	
				String text = driver.findElementByXPath("//*[@id='demo']").getText();
				System.out.println(text);
				
				
				

}
}