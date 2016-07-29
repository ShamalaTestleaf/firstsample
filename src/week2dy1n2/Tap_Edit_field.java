package week2dy1n2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tap_Edit_field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver	= new FirefoxDriver();
		
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		
		//FINDING MORE ELEMENTS IN THE WEBPAGE, USE - findElements (plural)
		//find the page name - eg -inputlogin to find all editable fields 
		 			
			List<WebElement> allFields = driver.findElements(By.className("inputLogin"));
					System.out.println("NO OF EDITABLE FIELD" +allFields.size());
						 			
		for(WebElement eachField:allFields)			
		{
		System.out.println("CLASSNAME OF EDITABLE FIELD" +eachField.getAttribute("class"));	
			
		}
		driver.close();
	}

}

