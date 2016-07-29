package week2dy1n2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_popupwindov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://popuptest.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		try
		{
			//<a href="popuptest12.html">Multi-PopUp Test #2</a> ---- IN HREF, IF ANY LINK IS NOT RECOGNIZED, USE TEXT - 
			//xpath for <a href="">Birds</a> would be //a[text()='Birds']

			driver.findElementByXPath("//a[text() = 'Multi-PopUp Test #2']").click();


			String firstWindow = driver.getWindowHandle();

			Set<String> allWindows =  driver.getWindowHandles();	

			for(String eachWindow : allWindows)
			{
				driver.switchTo().window(eachWindow);

				if(eachWindow.equalsIgnoreCase(firstWindow))
				{

					System.out.println("title of parent window"  +driver.getTitle());
				}
				else
				{
					driver.close();
				}

			}
			System.out.println("Number of windows opened" +allWindows.size());

		}


		catch(Exception e){

			System.out.println("check Exception");

		}

	}
}





