package Testing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageClass {
	WebDriver driver;
    By email=By.id("userid");
    By pass=By.id("pass");
    By cont=By.id("signin-continue-btn");
    By search=By.id("gh-ac");
    By submit=By.id("sgnBt");
    
    //add to cart and delete
    By addCart=By.id("atcBtn_btn_1");
    By DeleteCart=By.className("gh-cart__icon");     //click on delete icon
    By removeProd = By.className("fake-link");       //remove product
    
    //shop by cat
    By ShopByCat = By.xpath("//*[@id=\"gh\"]/section/div/div/div/button/span");
    By selectAnItemInShop = By.xpath("//*[@id=\"s0-1-4-12-0-1-dialog\"]/div/div/div[1]/div[2]/div[1]/div/a[3]");
    
    //change address
    By ActSetngs = By.xpath("//*[@id=\"s0-1-4-9-3[0]-0-9-dialog\"]/div/div/ul/li[2]/a");
    //By Actst1 = By.xpath("//*[@id=\\\"s0-1-4-9-3[0]-0-9-dialog\\\"]/div/div/ul/li[2]/a");
    By Actst2 = By.id("account-settings-link-ADDR");
    By Actst3 = By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a");
    By editbtn = By.id("individual_personal_info_address_edit_button");
    
    By ChngAdrs = By.id("addressLine1");
    By saveBtn = By.id("address_edit_submit_button");

    public PageClass(WebDriver driver) {
    	this.driver=driver;
	}

	public void email_in() {
        driver.findElement(email).click();
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("anushrao.326@gmail.com");
    }

    public void pass_in() {
        driver.findElement(pass).click();
        driver.findElement(pass).sendKeys("9014544204a");
    }

    public void con_in() {
        driver.findElement(cont).click();
    }

    public void submit_in() {
        driver.findElement(submit).click();
    }

    public void search_in() {
        driver.findElement(search).click();
        driver.findElement(search).sendKeys("games");
        driver.findElement(search).sendKeys(Keys.ENTER);
    }
    
    public void searchMul_in() {
        
        ArrayList<String> items = new ArrayList<>();
        items.add("shoes");
        items.add("games");
        items.add("laptop");
        for (String item : items) {
            WebElement sb = driver.findElement(search);
            sb.clear();
            sb.sendKeys(item);
            sb.sendKeys(Keys.ENTER);
            driver.navigate().back();
        }
    }
    
    
    public void addCart_in() {
    	driver.get("https://www.ebay.com/");
    	
        driver.findElement(search).click();
        driver.findElement(search).clear();;
        driver.findElement(search).sendKeys("camera");
        driver.findElement(search).sendKeys(Keys.ENTER);
        
        driver.get("https://www.ebay.com/itm/316438512727?_skw=camera&itmmeta=01K2MSW7BVMD1BP954YRF98ACY&hash=item49ad348457:g:FvkAAOSwl19nxvkA&itmprp=enc%3AAQAKAAAAwFkggFvd1GGDu0w3yXCmi1ekvG3OhSA5Ey8%2BH9Cf3DomJAakE4r32WWcUNlftAcD87gh9YPyna%2Fney37adVoFiCO0qumbnuq0f5gJx8C1NZ8N6eyH7W1cPFqNN9%2Bwx5AoeX9S4AQ2OiwkY1iAzlNV3AnVvF9MQt3Hyl9y5zmzqwdtxl99UfMwqB4OCBRtLdnx64uY0OmcfqXXNcSEK5jmQZoejJMzKg5hrrsgbBiJGaslfzuKyP1nEnQLaEqGeDa1w%3D%3D%7Ctkp%3ABk9SR5T28JmVZg");

        // Click the Add to Cart button
        driver.findElement(addCart).click();
        
        //go to main page
        driver.get("https://www.ebay.com/");
        
    }
    
    public void deleteCart_in() {
    	driver.get("https://www.ebay.com/");
    	
    	driver.findElement(DeleteCart).click();
    	driver.findElement(removeProd).click();
    }
    
    public void ChngAddrs_in() {
    	Actions act = new Actions(driver);
    	
    	//place cursor on the Account Setting
        WebElement abc = driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button/span"));
        act.moveToElement(abc).perform();
        
      //click on Account Setting
        driver.findElement(ActSetngs).click();
        //driver.findElement(Actst1).click();
        driver.findElement(Actst2).click();
        driver.findElement(Actst3).click();
        
        driver.findElement(editbtn).click();
        
        //click on address and change
	  	  WebElement newi = driver.findElement(ChngAdrs);
	      newi.clear();
	      newi.sendKeys("manali");
	      
	      driver.findElement(saveBtn).click();
        
    }
    
	public void ShopByCatgy_in() {
    	driver.get("https://www.ebay.com/");
    	
    	driver.findElement(ShopByCat).click();
    	driver.findElement(selectAnItemInShop).click();	
	}
	

    
    
}
