package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    public WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }


    //items, add to cart buttons

    public WebElement getBackpackButtonAddToCart(){
       return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getBikeLightButtonAddToCart(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }
    public WebElement getTShirtButtonAddToCart(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }
    public WebElement getJacketButtonAddToCart(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getOnesieButtonAddToCart(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getRedTShirtButtonAddToCart(){
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }
    public WebElement getCartButton(){
        return driver.findElement(By.className("shopping_cart_link"));
    }
    public WebElement getSelectButton(){
        return driver.findElement(By.className("product_sort_container"));
    }
}
