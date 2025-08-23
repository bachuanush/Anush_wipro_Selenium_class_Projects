package Sele_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println("Page load sucessfully");
		

		String exepectedtitle = "Selenium dev";        
		String actualtitle = driver.getTitle();
		
		System.out.println("Expected Title:" + exepectedtitle);
		System.out.println("Actual Title:" + actualtitle);
		
		
			      
			
			driver.manage().window().maximize();       
			Thread.sleep(5000);
			
			if(exepectedtitle.equals(actualtitle))
			{
				System.out.println("Title validation sucessfull");
			}
			else {
				System.out.println("Title validation not sucessfull");
			}
			
			driver.close();                

		
	}
}
