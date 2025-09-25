package T2_Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DemoQA_page {
	WebDriver driver;
    By uname = By.xpath("//*[@id=\"user-name\"]");
    By pass = By.xpath("//*[@id=\"password\"]");
    By submit = By.xpath("//*[@id=\"login-button\"]");

    public DemoQA_page(WebDriver driver) {
        this.driver = driver;
    }

    //login
    public boolean login(String username, String password) {
        try {
            driver.findElement(uname).sendKeys(username);
            driver.findElement(pass).sendKeys(password);
            driver.findElement(submit).click();
            return true;
        } catch (Exception e) {
            System.out.println("Error occurred during login: " + e.getMessage());
            return false;
        }
    }
    
    // url validation
    public String isValidUrl(String url) {
        String regex = "https://www.saucedemo.com/";
        if (url.matches(regex)) {
            return "Valid URL";
        } else {
            return "Invalid URL";
        }
    }
    
    //title validation
    public String verifyPageTitle1(String eTitle) {
        String aTitle=driver.getTitle();
        if (aTitle.equals(eTitle)) {
            return "matches"+aTitle;
        } else {
            return "not match"+eTitle+"actual"+aTitle;
        }
    }
    
}




