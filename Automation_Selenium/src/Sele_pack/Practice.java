package Sele_pack;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;


public class Practice {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    
//    String actual = driver.getTitle();
//    
//    String expected = "Register";
    
    
    //Assert.assertEquals(actual, expected, "Error");
  //  Assert.assertTrue();
    
  //  System.out.println("Successfully");
    
    
//	driver.findElement(By.className("dropdown-toggle")).click();
//	//Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//	
//	 WebElement ab =   driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//	 ab.click();
//	// Thread.sleep(5000);
//	 Alert a1 = driver.switchTo().alert();
//	 System.out.println( a1.getText());
//	// a1.accept();
	
	//driver.navigate().to("https://demo.automationtesting.in/Alerts.html");	
    
    
    
    //5
    

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 400)");
    
//    String[] subjects = {"Bangladesh", "Denmark", "Hong", "Australia"};
//	
//	for (String subject:subjects) {
//		WebElement ab = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
//		ab.click();
//		
//		WebElement subs =driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		subs.click();
//		subs.clear();
//		subs.sendKeys(subject);
//		subs.sendKeys(Keys.ENTER);
//	}
//    
//	//6
//	
//	WebElement nw = driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));
//	
//	System.out.println(nw.getText());

	
		//9
    
//    //Year
//    driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).click();
//    driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[82]")).click();
//    // Select s1 = new Select(driver);
//		
//    //Month 
//    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
//    driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[7]")).click();
//    
//    //Day
//    driver.findElement(By.xpath("//*[@id=\"daybox\"]")).click();
//    WebElement no  = driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[26]"));
//    		no.click();
//    		no.sendKeys(Keys.ENTER);
    
    WebElement year = driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
    Select s1 = new Select(year);
    s1.selectByValue("1996");
    
    WebElement month = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    Select s2 = new Select(month);
    s2.selectByValue("June");
    
    WebElement day = driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
    Select s3 = new Select(day);
    s3.selectByValue("25");
    
    
		
	}

}
