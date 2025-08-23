package Sele_pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {
	public static void loginStep(WebDriver driver, String user1, String pass1, String testexecution) throws InterruptedException
	{
		System.out.println("Manual test -->" + testexecution);
		
		
		//locating username text field
		WebElement user = driver.findElement(By.id("user_login"));
		user.sendKeys(user1);
		
		//locating password text field
		WebElement pass = driver.findElement(By.id("user_password"));
		pass.sendKeys(pass1);
		
		//click on sigin button
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);

		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
		loginStep(driver, "6488", "password", "unable to login");
		loginStep(driver, "username", "kjsbfug", "unable to login");
		loginStep(driver, "6488", "jkrehg", "unable to login");
		loginStep(driver, "", "", "unable to login");
		loginStep(driver, "username", "password", "user is able to login successfully");
		
		//driver.close(); //To close the application auto
	}

}
