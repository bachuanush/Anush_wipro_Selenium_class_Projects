package Testing;

//Create testing class
//Project URL= https://www.ebay.com/
//Add pre-requisite
//Create 10 testcases for
//1.Login
//2.Multiple searches using array list or array
//3.Add to cart
//4.delete from cart
//5.Change login name
//6. change current address
//7.shop by categories
//8.select particular product right click on that product image and find out description of that product.
//9.shop by all categories and check whether this function is working fine or not
//10. change the language of your application using setting
// 
//Create Post condition for every testcase






import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Ebay_Test_Assgn {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
}
	
	@Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("userid")).sendKeys("anushrao.326@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("9014544204a");
        driver.findElement(By.id("sgnBt")).click();
        Thread.sleep(3000);
    }

    @Test (priority = 2) //2
    public void multipleSearchTest() throws InterruptedException {
        ArrayList<String> items = new ArrayList<>();
        items.add("shoes");
        items.add("games");
        items.add("laptop");
        for (String item : items) {
            WebElement sb = driver.findElement(By.id("gh-ac"));
            sb.clear();
            sb.sendKeys(item);
            sb.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }
    }

	
    @Test (priority = 3) //3
    public void addToCartTest() throws InterruptedException {
        WebElement sb = driver.findElement(By.id("gh-ac"));
        sb.clear();
        sb.sendKeys("camera");
        sb.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
		  
        //driver.findElement(By.partialLinkText("RICOH CX2 Compact Digital Camera From Japan")).click();
	
        driver.navigate().to("https://www.ebay.com/itm/316438512727?_skw=camera&itmmeta=01K2MSW7BVMD1BP954YRF98ACY&hash=item49ad348457:g:FvkAAOSwl19nxvkA&itmprp=enc%3AAQAKAAAAwFkggFvd1GGDu0w3yXCmi1ekvG3OhSA5Ey8%2BH9Cf3DomJAakE4r32WWcUNlftAcD87gh9YPyna%2Fney37adVoFiCO0qumbnuq0f5gJx8C1NZ8N6eyH7W1cPFqNN9%2Bwx5AoeX9S4AQ2OiwkY1iAzlNV3AnVvF9MQt3Hyl9y5zmzqwdtxl99UfMwqB4OCBRtLdnx64uY0OmcfqXXNcSEK5jmQZoejJMzKg5hrrsgbBiJGaslfzuKyP1nEnQLaEqGeDa1w%3D%3D%7Ctkp%3ABk9SR5T28JmVZg");
        Thread.sleep(3000);

        // Click the Add to Cart button
        driver.findElement(By.id("atcBtn_btn_1")).click();
        Thread.sleep(3000);
        
   	    //Navigate to main page
        driver.get("https://www.ebay.com/"); 
    }

	         
    @Test (priority = 4) //4
    public void deleteFromCartTest() throws InterruptedException {
    	driver.get("https://cart.ebay.com/");
    	
    	//click on cart icon and select
        driver.findElement(By.className("gh-cart__icon")).click();
        Thread.sleep(2000);
        
        //remove the product from cart
        driver.findElement(By.className("fake-link")).click();
        Thread.sleep(2000);
        
      //Navigate to main page
        driver.get("https://www.ebay.com/");
    }

    
    											//other version
    
  //  @Test(priority = 5)
//    public void changeLoginNameTest() throws InterruptedException {
//        Actions act = new Actions(driver);
//        Thread.sleep(3000);
//        WebElement hiMsg = driver.findElement(By.cssSelector("span.gh-identity__greeting"));
//        act.moveToElement(hiMsg).perform();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//li[@class='gh-identity-signed-in__link']/a[text()='Account settings']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Personal Information")).click();
//        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
//        Thread.sleep(2000);
//        
//        WebElement fn = driver.findElement(By.id("firstname"));
//        fn.clear();
//        fn.sendKeys("anush");
//        WebElement fn3 = driver.findElement(By.id("city"));
//        fn3.clear();
//        fn3.sendKeys("hyd");
//        WebElement fn2 = driver.findElement(By.id("streetAddressOptional"));
//        fn2.clear();
//        fn2.sendKeys("6-58");
//        driver.findElement(By.id("address_edit_submit_button")).click();
//        Thread.sleep(2000);   
//  }
										//my version	
//  @Test(priority = 5) //5
//  public void changeLoginNameTest() throws InterruptedException {
//      Actions act = new Actions(driver);
//      Thread.sleep(2000);
//     
//      //place cursor on the Account Resetting
//      WebElement abc = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span"));
//      act.moveToElement(abc).perform();
//	  Thread.sleep(2000);
//	  
//	  
//	  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
//	  Thread.sleep(2000);
//	  
//	  
//	  driver.findElement(By.id("account-settings-link-PI")).click();
//	  Thread.sleep(2000);
//	  
//	  driver.findElement(By.id("pass")).sendKeys("9014544204a");
//	  
//	  driver.findElement(By.id("sgnBt")).click();
//      Thread.sleep(2000);
//      
//      driver.findElement(By.id("individual_username_edit_button")).click();
//      Thread.sleep(2000);
//      
//      WebElement newid = driver.findElement(By.xpath("//*[@id='user_name']"));
//      newid.clear();
//      newid.sendKeys("newname");
//      
//      driver.findElement(By.id("username_submit_edit_btn")).click();	
//}

  @Test(priority = 5)  //6
  public void chngeAddress() throws InterruptedException {
      Actions act = new Actions(driver);
      Thread.sleep(2000);
     
      //place cursor on the Account Setting
      WebElement abc = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span"));
      act.moveToElement(abc).perform();
	  Thread.sleep(2000);
	  
	  //click on Account Setting
	  driver.findElement(By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  //Click on Address
	  driver.findElement(By.id("account-settings-link-ADDR")).click();
	  Thread.sleep(2000);
	  
	  //click on address edit
	  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a")).click();
	  Thread.sleep(2000);
	  
	//click on edit
	  driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	  Thread.sleep(2000);
	  
	  //click on address and change
	  WebElement newi = driver.findElement(By.id("addressLine1"));
      newi.clear();
      newi.sendKeys("manali");
      
      //Click on save
      driver.findElement(By.id("address_edit_submit_button")).click();
      
      //Navigate to main page
      driver.get("https://www.ebay.com/");  
}
  
	
	@Test (priority = 6)     //7
	  public void ShopByCatgy() throws InterruptedException {
		 //Navigate to main page
	      driver.get("https://www.ebay.com/");  
	     
	      //click on the catgry
	      WebElement catgry = driver.findElement(By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span"));
	      catgry.click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[3]")).click();
	      Thread.sleep(2000);
	}
	
  @Test  (priority = 7)    //9
  public void ShopByAllCatgy() throws InterruptedException {
	 //Navigate to main page
      driver.get("https://www.ebay.com/");  
     
      //click on the all catgry
      WebElement catgry = driver.findElement(By.id("gh-cat"));
      catgry.click();
      Select sel=new Select(catgry);
      sel.selectByValue("625");
	  //Thread.sleep(2000);
      
    //Click on search
     driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]/span")).click();	  
}
  
  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"Working");
	  //driver.close();
  }

}
