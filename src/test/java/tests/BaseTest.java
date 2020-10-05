package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeAll
    static void setup() {
//        driver = new ChromeDriver(); //Chrome browser


        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"); //FireFox browser
        driver = new FirefoxDriver(); //FireFox browser

//        ChromeOptions chromeOptions = new ChromeOptions(); //Chrome headLess browser
//        chromeOptions.addArguments("--no-sandbox"); //Chrome headLess browser
//        chromeOptions.addArguments("--headless"); //Chrome headLess browser
//        chromeOptions.addArguments("disable-gpu"); //Chrome headLess browser
//        driver = new ChromeDriver(chromeOptions); //Chrome headLess browser

        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }

    @AfterEach
    void clearCookies() {
        driver.manage().deleteAllCookies();
    }
}

