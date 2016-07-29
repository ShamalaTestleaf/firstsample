package week2dy1n2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merge_leads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize
		driver.manage().window().maximize();
			
		// Set timeouts
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("crmsfa").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		
		driver.findElementByXPath("//a[@href='/crmsfa/control/mergeLeadsForm']").click();
		
		driver.findElement(By.xpath("//a[contains(@href, 'partyIdFrom')]")).click();
		 Thread.sleep(1000);
		
		 String partyId = "10001"; 
		
		String parentWindow = driver.getWindowHandle();
		
		
		for (String childWindow : driver.getWindowHandles()) {
			driver.switchTo().window(childWindow); 
		}
					 System.out.println(driver.getTitle());
		
				driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys(partyId);
				
		driver.findElement(By.xpath("//button[contains(., 'Find')]")).click();
		
		
		//how to identify ID LINK - 10001
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href, partyId)]")).click();
		

		//<a class="linktext" href="javascript:set_value('10001');" id="ext-gen293">10001</a>
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

						
				driver.findElement(By.xpath("//a[contains(@href, 'partyIdTo')]")).click();

				for (String childWindow : driver.getWindowHandles()) {
					driver.switchTo().window(childWindow); 
				}
				driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys("10003");
				
				driver.findElement(By.xpath("//button[contains(., 'Find')]")).click();
				
						
									

		//<a class="linktext" href="javascript:set_value('10001');" id="ext-gen343">10001</a>

		//<button class="x-btn-text" type="button" id="ext-gen114">Find Leads</button>

}
}
