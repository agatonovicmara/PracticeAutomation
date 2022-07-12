package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import pages.CartPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ProductsPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasicTest {
    protected WebDriver driver;

    protected String baseUrl="https://www.saucedemo.com/";

    protected CartPage cart;
    protected LoginPage login;

    protected MenuPage menu;

    protected ProductsPage products;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        cart = new CartPage(driver);
        login = new LoginPage(driver);
        menu = new MenuPage(driver);
        products = new ProductsPage(driver);

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        String timestamp = new SimpleDateFormat(
                "hh_mm_ss_dd_MM_yyyy").format(new Date());

        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot screen = (TakesScreenshot) driver;
            File screenshot = screen.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(screenshot, new File(
                        "src/main/java/Screenshots/TestFailure_" + timestamp + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    @AfterClass

    public void afterClass() {
        driver.quit();
    }
}


