package Tira_Mini_Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page_Object {
	WebDriver driver;
	By search=By.id("search");
	
	public Page_Object(WebDriver driver) {
    	this.driver=driver;
	}
	
	public void search_in(String product) {
		driver.findElement(By.id("search")).click();
	      driver.findElement(By.id("search")).sendKeys(product);

	      driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    }
}
