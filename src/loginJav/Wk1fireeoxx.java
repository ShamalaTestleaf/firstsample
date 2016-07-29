package loginJav;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Wk1fireeoxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://developer.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByPartialLinkText("Sign").click();
		//driver.findElementByLinkText("//signup?d=70130000000td6N");
		//driver.findElementByClassName("btn btn-success").click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//SELECT DROPDOWN - CODING STARTS - to print all values from the list
		//driver.findElementByClassName("job_role");
		
		/*Select dropdown = new Select(driver.findElementByName("user[job_role]"));
		List<WebElement> allOptions = dropdown.getOptions();
		int value = allOptions.size()-1;
		dropdown.selectByIndex(value);
		//System.out.println(allOptions.get(0).getText());
		for(WebElement eachOption : allOptions){
			System.out.println(eachOption.getText());*/
			
			
			//to print only one value FROM THE DROPDOWN
			
			Select dropdown = new Select(driver.findElementByName("user[job_role]"));
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			List<WebElement> allOptions = dropdown.getOptions();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			dropdown.selectByIndex(3);
			System.out.println(allOptions.get(3).getText());			 
			
		driver.quit();
				
					 		
			
		}
		
		
		
		
	}


