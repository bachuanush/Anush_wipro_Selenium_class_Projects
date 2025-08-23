package Sele_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        // Double Click Action
        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleclick).perform();

        Thread.sleep(3000);

        // Right Click Action
        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightclick).perform();

        Thread.sleep(3000);

        driver.quit();  // Close browser after execution
    }
}

