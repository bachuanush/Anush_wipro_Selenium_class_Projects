package Sele_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLoginTestCases {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to Zero bank Login page");
		
	//////////////////////////////////////////////////////////////////////////////////////////	
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and valid password credentials");
		}
		
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("85588");	
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click sign button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		
		//////////////////////////////////////////////////////////////////////////////////////////			
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "valid username and invalid password credentials");
		}
		
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");	
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("kjnkji");
		
		//click sign button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		
		//////////////////////////////////////////////////////////////////////////////////////////			
		
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "invalid username and invalid password credentials");
		}
		
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("85588");	
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("kkjueuyu");
		
		//click sign button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		
		//////////////////////////////////////////////////////////////////////////////////////////			
		
		{
			System.out.println("Manual test::-->Check user is unable to login with "
					+ "null username and null password credentials");
		}
		
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");	
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		
		//click sign button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		System.out.println("Login unsuccessfully");
		
		
//////////////////////////////////////////////////////////////////////////////////////////		
		
		{
			System.out.println("Manual test::-->Check user is able to login with valid credentials");
		}
		
		//locating username text field
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		//locating password text field
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//click sign button
		driver.findElement(By.name("submit")).click();
		System.out.println("Login successfully");
		
		
		Thread.sleep(5000);
		driver.close();	

	}

}
