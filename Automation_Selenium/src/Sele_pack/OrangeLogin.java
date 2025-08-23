package Sele_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {
	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException
	{
		System.out.println("Manual test -->" + testexecution);
		
		
		//locating username text field
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(user1);
		
		//locating password text field
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(pass1);
		
		//click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		//Navigate back to login page for next test data
		driver.navigate().refresh();
		Thread.sleep(4000);

		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000); //All web page to load fully
		System.out.println("Welcome to Orange Login page");
		
		loginStep(driver, "6488", "admin123", "unable to login");
		loginStep(driver, "Admin", "kjsbfug", "unable to login");
		loginStep(driver, "gjfghfyiuy", "85215", "unable to login");
		loginStep(driver, "", "", "unable to login");
		loginStep(driver, "Admin", "admin123", "user is able to login successfully");
		
		
		//Loop through the list and call loginStep()
		
		//driver.close(); //To close the application auto
	}

}
