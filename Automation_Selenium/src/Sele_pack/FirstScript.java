package Sele_pack;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Page load sucessfully");
		//setup browser(Chrome driver, firefox driver)
		//System.setProperty("webdriver.chrome.drive", "D:\\Selenium_jar\\chromedriver-win64\\chromedriver.exe");       //stmt not required when manage stmt is available
		
		//create object for Browser	
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		
		
		//Set WebApplication URL
		try {
			driver.get("https://chatgpt.com/");        //Application you want to open
			driver.manage().window().maximize();       //Application to maximize it self
			Thread.sleep(5000);
			driver.close();                            //Close the browser auto after 5 sec acc to above stmt
			System.out.println("Page load sucessfully");
		} catch (Exception e) {
			System.out.println("Unable to load url");
			System.out.println(e);
		}
		                             
	}
}
