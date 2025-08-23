package Sele_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemoQA {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    WebElement fname=driver.findElement(By.cssSelector("div>input[placeholder=\"First Name\"]"));
	    fname.sendKeys("Neeva");
	    //
	    WebElement lname=driver.findElement(By.cssSelector("div>input[placeholder=\"Last Name\"]"));
	    lname.sendKeys("Sharma");
	    
	    //mail
	    WebElement mail=driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
	    mail.sendKeys("Sharma@gmail.com");
	    
	    //gender
	    driver.findElement(By.cssSelector("label[id=\"gender-radio-2\"]")).click();
	    
	    //mobile number
	    WebElement mbl=driver.findElement(By.cssSelector("input[id=\"userNumber\"]"));
	    mbl.sendKeys("9632587425");
	    
	    //DoB
	    driver.findElement(By.id("dateOfBirthInput")).click();
	    driver.findElement(By.cssSelector("select>option[value=\"2017\"]")).click();
	    driver.findElement(By.cssSelector("select>option[value=\"1\"]")).click();
	    driver.findElement(By.cssSelector("div[aria-label=\"Choose Monday, February 6th, 2017\"]")).click();

	    driver.findElement(By.cssSelector("label[id=\"hobbies-checkbox-1\"]")).click();
	}

}
