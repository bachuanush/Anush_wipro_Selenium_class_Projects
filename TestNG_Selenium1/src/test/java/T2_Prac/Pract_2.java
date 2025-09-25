package T2_Prac;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class Pract_2 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		
  		driver.get("https://demo.automationtesting.in/Register.html");
	  }
	
  @Test(priority = 1)
  public void Title_Valiadtion() {
	  		//1
	  		
	  		String actual = driver.getTitle();
	  		String expected = "Register";
	  		
	  		Assert.assertEquals(actual, expected, "Error message");
	  		System.out.println("The Title of the page is : " + actual);
  }
  
//  @Test
//  public void Alert_Title_Valiadtion() {		
//	  		//2
//	  		
//	  		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
//	  		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//	  		System.out.println(driver.getTitle());
//  }
//
//  @Test
//  public void Alert_Text_Valiadtion() {			
//	  		//3
//	  		
//	  		WebElement ab = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//	  		ab.click();
//	  		Alert bc = driver.switchTo().alert();
//	  		System.out.println("The text in the Alert Box is : " + bc.getText());
//  }
  
  
  @Test(priority = 2)
  public void Country_Drop_Down() {			
	  		//5
	  		
	        //driver.get("https://demo.automationtesting.in/Register.html");
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,400)");
	        
	        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	        
//	        Select s1 = new Select(df); 
	        
	        WebElement df = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
	        df.clear();
	        df.sendKeys("Australia");
	        df.sendKeys(Keys.ENTER);        
	        
	        //6
	        
	        WebElement jf = driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));
	  		System.out.println("The country selected is : " + jf.getText());
  } 
  
  @Test(priority = 4)
  public void Is_Selected_radio() {			
	  		//9
	  
	  WebElement male = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
	  male.click();
	  
	  WebElement female = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
	  female.click();
	  
	  Assert.assertTrue(female.isSelected(), "female selected");
	  System.out.println("male is selected");
	  
  }
  
  @Test(priority = 3)
  public void Day_Of_Birth() {			
	  		//9
	  
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
  

  @AfterClass
  public void afterClass() {
  }

}
