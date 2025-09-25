package Sele_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1
		
//		String actual = driver.getTitle();
//		String expected = "Register";
//		
//		Assert.assertEquals(actual, expected, "Error");
		
		
		//2
		
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//		
//		WebElement ab = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		ab.click();
//		Alert bc = driver.switchTo().alert();
//		bc.accept();
//		
//		System.out.println(driver.getTitle());
		
		
		//3
		
//				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
//				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
//				
//				WebElement ed = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//				ed.click();
//				Alert po = driver.switchTo().alert();
//				Thread.sleep(5000);
//				System.out.println(po.getText());
		
		
		
		//4
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("ajhwfr");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("plokmj");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Hyderabad, Telangana");
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("ygbbf@th.ok");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9632587412");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
		
		
		//loop
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)");
		
		String[] country = {"Bangladesh", "Denmark", "Hong Kong", "Australia"};
		
		for(String cuntry : country) {
			WebElement ab = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
					ab.click();
			
			WebElement cd = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
			cd.click();
			cd.clear();
			cd.sendKeys(cuntry);
			cd.sendKeys(Keys.ENTER);
		}
		
		WebElement gt = driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));
		System.out.println(gt.getText());
		
		
		
		//year
		
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
