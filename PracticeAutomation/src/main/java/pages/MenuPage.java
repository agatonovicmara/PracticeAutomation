package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

    public WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMenuButton(){
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    public WebElement getAllProductsLink(){
        return driver.findElement(By.id("inventory_sidebar_link"));
    }
    public WebElement getAboutLink(){
        return driver.findElement(By.id("about_sidebar_link"));
    }
    public WebElement getLogoutLink(){
        return driver.findElement(By.id("logout_sidebar_link"));
    }
    public WebElement getResetAppStateLink(){
        return driver.findElement(By.id("reset_sidebar_link"));
    }
    public WebElement getCloseMenuButton(){
        return driver.findElement(By.id("react-burger-cross-btn"));
    }
}
