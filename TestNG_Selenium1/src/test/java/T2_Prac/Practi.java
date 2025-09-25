package T2_Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practi {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.id("firstName")).sendKeys("Arjun");
		driver.findElement(By.id("lastName")).sendKeys("Arun");
		driver.findElement(By.id("userEmail")).sendKeys("abc@kk.ik");
		
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9632587412");
		
		driver.findElement(By.cssSelector("input[id=\"dateOfBirthInput\"]")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(year);
		sel.selectByValue("1999");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sell = new Select(month);
		sell.selectByValue("4");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]")).click();
		
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("Maths");
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("English");
		sub.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		
	}
}
