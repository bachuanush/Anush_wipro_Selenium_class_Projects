package Sele_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
//		driver.get("https://demoqa.com/buttons");
//		Thread.sleep(5000);
//		driver.manage().window().maximize();
//		
//		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
//		Actions act = new Actions(driver);
//		act.doubleClick(doubleclick).perform();
//		
//		Thread.sleep(3000);
//		WebElement rightclick =driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rightclick).perform();
		
		//perform mouse over actions
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Actions act1 = new Actions(driver);
		
		WebElement motors = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		act1.moveToElement(motors).perform();
		Thread.sleep(3000);
		
		WebElement sports = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
		act1.moveToElement(sports).perform();
		Thread.sleep(3000);
		
		WebElement fashion = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		act1.moveToElement(fashion).perform();
		Thread.sleep(3000);
	}

}
