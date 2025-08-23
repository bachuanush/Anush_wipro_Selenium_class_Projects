package Sele_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlValidation {
	public static void main(String[] args) throws InterruptedException {
		
		//create object for Browser	
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		System.out.println("Page load sucessfully");
		
		String exepectedurl = "https://chatgpt.com/";        //Application you want to open
		String actualurl = driver.getCurrentUrl();
		
		System.out.println("Expected Url:" + exepectedurl);
		System.out.println("Actual url:" + actualurl);
			      
			
		driver.manage().window().maximize();       //Application to maximize it self
		Thread.sleep(5000);
			
			if(exepectedurl.equals(actualurl))
			{
				System.out.println("Url validation sucessfull");
			}
			else {
				System.out.println("Url validation not sucessfull");
			}
			
			driver.close();       //Close the browser auto after 5 sec acc to above stmt

	}
}
