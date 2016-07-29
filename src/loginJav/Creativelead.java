package loginJav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Creativelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://demo1.opentaps.org/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		//driver.findElementByLinkText("/crmsfa/control/main?externalLoginKey=EL619307159490");
		
          driver.findElementByClassName("crmsfa").click();
          
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            
			driver.findElementByPartialLinkText("Create").click();
			
		driver.findElementById("createLeadForm_companyName").sendKeys("BORN");
		driver.findElementById("createLeadForm_firstName").sendKeys("shyamala");
		driver.findElementById("createLeadForm_lastName").sendKeys("suresh");
		
		
		driver.findElementByClassName("smallSubmit").click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String title = driver. getTitle();
		System.out.println(title);
		
		
		          	
		}

}
