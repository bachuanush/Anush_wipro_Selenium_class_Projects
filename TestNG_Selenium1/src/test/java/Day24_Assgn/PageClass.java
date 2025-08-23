package Day24_Assgn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	 WebDriver driver;
	    WebDriverWait wait;
	    Actions actions;

	    By signInLink = By.linkText("Sign in");
	    By email = By.id("userid");
	    By pass = By.id("pass");
	    By cont = By.id("signin-continue-btn");
	    By submit = By.id("sgnBt");
	    By search = By.id("gh-ac");
	    By searchBtn = By.id("gh-search-btn");
	    By addToCartBtn = By.id("atcBtn_btn_1");
	    By removeFromCartBtn = By.cssSelector("button[data-test-id='cart-remove-item']");
	    By myEbay = By.linkText("My eBay");
	    By account = By.linkText("Account");

	    By personalInfoLink = By.id("account-settings-link-PI");
	    By editUserNameBtn = By.id("individual_username_edit_button");
	    By userNameField = By.id("user_name");
	    By saveUserNameBtn = By.id("user_name_edit_submit");

	    By addressLink = By.linkText("Addresses");
	    By editAddressBtn = By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[1]/div/div[2]/a");
	    By indAddressChange = By.id("individual_personal_info_address_edit_button");
	    By addressLine1 = By.id("addressLine1");
	    By cityField = By.id("city");
	    By saveAddressBtn = By.id("address_edit_submit_button");

	    By categoryDropdown = By.className("gh-search-categories");
	    By allCategoryOption = By.cssSelector("#gh-cat > option:nth-child(1)");
	    By artCategoryOption = By.cssSelector("#gh-cat > option:nth-child(3)");

	    By watchProduct = By.xpath("//*[@id=\"item2b24cf1791\"]/div/div[1]/div/a/div/img");

	    By countryButton = By.cssSelector("button[class='gf-flag__button']");
	    By koreanLanguage = By.linkText("Korea");

	    
	    public PageClass(WebDriver driver, WebDriverWait wait, Actions actions) {
	        this.driver = driver;
	        this.wait = wait;
	        this.actions = actions;
	    }


	    public void login_in() throws InterruptedException {
	        driver.findElement(signInLink).click();
	        driver.findElement(email).sendKeys("anushrao.326@gmail.com");
	        driver.findElement(cont).click();
	        Thread.sleep(2000);
	        driver.findElement(pass).sendKeys("9014544204a");
	        driver.findElement(submit).click();
	    }

	    public void searchMultipleItems_in() {
	        List<String> items = new ArrayList<>();
	        items.add("games");
	        items.add("shoes");
	        items.add("powerBank");

	        for (String item : items) {
	            WebElement searchBox = driver.findElement(search);
	            searchBox.clear();
	            searchBox.sendKeys(item, Keys.ENTER);
	            System.out.println("Searched for: " + item);
	            driver.navigate().back();
	        }
	    }

	    public void addToCart() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        driver.findElement(search).clear();
	        driver.findElement(search).sendKeys("Laptop");
	        driver.findElement(searchBtn).click();

	        driver.get("https://www.ebay.com/itm/326013509564?_skw=laptop");
	        js.executeScript("window.scrollBy(0,300)");
	        driver.findElement(addToCartBtn).click();
	    }

	    public void removeFromCart() {
	        driver.get("https://cart.ebay.com/");
	        driver.findElement(removeFromCartBtn).click();
	    }


	    public void changeAddress() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        driver.findElement(myEbay).click();
	        driver.findElement(account).click();
	        driver.findElement(addressLink).click();
	        driver.findElement(editAddressBtn).click();

	        js.executeScript("window.scrollBy(0,300)");
	        driver.findElement(indAddressChange).click();

	        driver.findElement(addressLine1).clear();
	        driver.findElement(addressLine1).sendKeys("Manali");

	        driver.findElement(cityField).clear();
	        driver.findElement(cityField).sendKeys("Jalandhar");

	        driver.findElement(saveAddressBtn).click();

	    }

	    public void shopAllCategories() {
	        driver.findElement(search).clear();
	        driver.findElement(categoryDropdown).click();
	        driver.findElement(allCategoryOption).click();
	        driver.findElement(searchBtn).click();
	    }

	    public void shopByCategory() {
	        driver.findElement(categoryDropdown).click();
	        driver.findElement(artCategoryOption).click();
	        driver.findElement(searchBtn).click();
	    }

	    public void rightClickOnProduct() {
	        driver.findElement(search).clear();
	        driver.findElement(search).sendKeys("Wrist Watch");
	        driver.findElement(searchBtn).click();

	        WebElement productImage = wait.until(
	                ExpectedConditions.presenceOfElementLocated(watchProduct)
	        );

	        actions.contextClick(productImage).perform();
	        String description = productImage.getAttribute("alt");
	        System.out.println("Product description: " + description);

	        driver.navigate().refresh();
	    }

	    public void changeLanguage() {
	        driver.findElement(myEbay).click();
	        driver.findElement(account).click();

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,400)");

	        WebElement country = driver.findElement(countryButton);
	        country.sendKeys(Keys.ENTER);

	        wait.until(ExpectedConditions.elementToBeClickable(koreanLanguage)).click();
	    }
}
