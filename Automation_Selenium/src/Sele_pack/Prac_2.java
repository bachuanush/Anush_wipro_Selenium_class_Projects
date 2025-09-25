package Sele_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Prac_2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1
		
//		String actual = driver.getTitle();
//		String expected = "Register";
//		
//		Assert.assertEquals(actual, expected, "Error message");
//		System.out.println("The Title of the page is : " + actual);
		
		
		//2
		
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//		System.out.println(driver.getTitle());
		
		
		//3
		
//		WebElement ab = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//				ab.click();
//		Alert bc = driver.switchTo().alert();
//		System.out.println("The text in the Alert Box is : " + bc.getText());
		
		
		
		
	}

}
