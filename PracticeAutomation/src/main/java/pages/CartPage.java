package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    public WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContinueShoppingButton(){
        return driver.findElement(By.id("continue-shopping"));
    }
    public WebElement getCheckoutButton(){
        return driver.findElement(By.id("checkout"));
    }

    //REMOVE ITEMS BTNS

    public WebElement getRemoveBackpackButton(){
        return driver.findElement(By.name("remove-sauce-labs-backpack"));
    }
    public WebElement getRemoveBikeLightButton(){
        return driver.findElement(By.name("remove-sauce-labs-bike-light"));
    }
    public WebElement getRemoveTShirtButton(){
        return driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt"));
    }
    public WebElement getRemoveJacketButton(){
        return driver.findElement(By.name("remove-sauce-labs-fleece-jacket"));
    }
    public WebElement getRemoveOonesieButton(){
        return driver.findElement(By.name("remove-sauce-labs-onesie"));
    }
    public WebElement getRemoveRedTShirtButton(){
        return driver.findElement(By.name("remove-test.allthethings()-t-shirt-(red)"));
    }

}
