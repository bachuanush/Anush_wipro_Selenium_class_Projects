package Sele_pack;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		
		//To full extend the window
		driver.manage().window().maximize();
		
		//to scroll the window auto
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Neeva");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Sharma");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]")).click();
		
		//scroll the screen auto
		js.executeScript("window.scrollBy(0,700)");
		
		WebElement phn=driver.findElement(By.id("userNumber"));
		phn.sendKeys("9876543125");
		
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel=new Select(year);
		//sel.selectByIndex(125);   //2025
		//sel.selectByValue("2012");
		sel.selectByVisibleText("2012");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1 = new Select(month);
		//sel1.selectByValue("0");    //January
		//sel1.selectByIndex(1);
		sel1.selectByVisibleText("February");
		
		//Selecting date
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[5]")).click();
		
		
		// subject
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("Maths");
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("Phy");
		sub.sendKeys(Keys.ENTER);
		sub.sendKeys("co");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		
		
		/*//////////For LOOP for subjects ////////////////////////////////////
		String[] subjects = {"Math", "phy", "Eco", "Eng"};
		WebElement subs =driver.findElement(By.id("subjectsInput"));
		for (String subject:subjects) {
			subs.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
		}
		*//////////////////////////////////////////////////////////////////////
		
		//Hobbies
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		
		//upload picture
		WebElement img = driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\shashank\\Desktop\\Anush\\Screenshot 2025-08-01 154218.jpg");
		
		//state
		WebElement state =driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		//city
		WebElement city =driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		//click on submit button
		driver.findElement(By.id("submit")).click();
		
		
		//For screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
	}

}
