package loginJav;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class chromechange {

	public static void main(String[] args)throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://developer.salesforce.com/");
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElementByPartialLinkText("Sign").click();
				//driver.findElementByLinkText("//signup?d=70130000000td6N");
				//driver.findElementByClassName("btn btn-success").click();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				
				//SELECT DROPDOWN - CODING STARTS
				//driver.findElementByClassName("job_role");
				
				Select dropdown = new Select(driver.findElementByName("user[job_role]"));
				List<WebElement> allOptions = dropdown.getOptions();
				//int value = allOptions.size()-1;
				//dropdown.selectByIndex(value);
				//System.out.println(allOptions.get(0).getText()) - single- (0) dropdown value
				for(WebElement eachOption : allOptions){
					System.out.println(eachOption.getText());
				}
				
	}
}
