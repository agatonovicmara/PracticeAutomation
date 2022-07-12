package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInput(){
        return driver.findElement(By.id("user-name"));
    }
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.id("login-button"));
    }


}
