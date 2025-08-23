package Sele_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_wePage_Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    
	    
	    WebElement samplealert = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a"));
	    samplealert.click();
	    Thread.sleep(4000);
	    Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		WebElement timealert=driver.findElement(By.id("timerAlertButton"));
//		timealert.click();
//		Thread.sleep(7000);
//		Alert alert12=driver.switchTo().alert();
//		alert12.accept();
//
//
//		Thread.sleep(3000);
//		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
//		confirmalert.click();
//		Thread.sleep(4000);
//		Alert alert1=driver.switchTo().alert();
//		alert1.dismiss();
//
//
//		Thread.sleep(3000);
//		WebElement promptalert=driver.findElement(By.id("promtButton"));
//		promptalert.click();
//		Thread.sleep(4000);
//		Alert alert11=driver.switchTo().alert();
//		alert11.sendKeys("Harry");
//		alert11.accept();

	}

}
