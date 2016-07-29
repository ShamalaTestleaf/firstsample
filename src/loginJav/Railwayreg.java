package loginJav;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Railwayreg {
	
	//DROPDOWN, EXPLICIT WAIT, WAIT TILL ELEMENTS FOUND - imp FUNCTIONS ARE USED HERE

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
				
		driver.findElementById("userRegistrationForm:userName").sendKeys("shyamala");
		driver.findElementById("userRegistrationForm:password").sendKeys("Shyam123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Shyam123");
		
		
		Select dropdown1 = new Select(driver.findElementByName("userRegistrationForm:securityQ"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//FROM LIST OF OPTIONS - HOW TO GET ONE VALUE
		
		List<WebElement> allOptions = dropdown1.getOptions();
		dropdown1.selectByIndex(4);	
		System.out.println(allOptions.get(4).getText());
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("myson");
		
		new Select(driver.findElementById("userRegistrationForm:prelan")).selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//System.out.println(allOptions2.get(0).getText());
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("SHYAMALA");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("SURESH");
		
			
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		Select dropdown3 = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		List<WebElement> allOptions3  = dropdown3.getOptions();
		dropdown3.selectByIndex(10);
		System.out.println(allOptions3.get(10).getText());
		
			
		Select dropdown4 = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		dropdown4.selectByIndex(9);
				
		Select dropdown5 = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		dropdown5.selectByIndex(101);
	
		/*Select dropdown6 = new Select(driver.findElementById("userRegistrationForm:occupation"));
		List<WebElement> allOptions6  = dropdown6.getOptions();
		dropdown6.selectByIndex(4);
		System.out.println(allOptions6.get(4).getText());
		*/
		
		new Select(driver.findElementById("userRegistrationForm:occupation")).selectByIndex(4);
		//System.out.println(allOptions6.get(4).getText());

		
		driver.findElementById("userRegistrationForm:idno").sendKeys("123567");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("shyamb@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("1234561234");
				
		//DROPDOWN SELECT - NEW METHOD...
		
		new Select(driver.findElementById("userRegistrationForm:nationalityId")).selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:address").sendKeys("123, adyar");
		
		driver.findElementById("userRegistrationForm:street").sendKeys("1 st");
		new Select(driver.findElementById("userRegistrationForm:countries")).selectByIndex(1);
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600040",Keys.TAB);
		 
		// Explicit wait 
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			// Waiting until text (value) is present in State field
			wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("userRegistrationForm:statesName"), "TAMIL NADU"));
			
		Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		city.selectByVisibleText("Chennai");
		Thread.sleep(600);
		new Select(driver.findElementById("userRegistrationForm:postofficeName")).selectByValue("Anna Nagar S.O (Chennai)");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("89089090");
		
		driver.quit();
			
		}

}
