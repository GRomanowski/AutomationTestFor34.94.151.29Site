package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[5]/a")
    private WebElement goToMyAcount;

    @FindBy(css = "#username")
    private WebElement loginField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElement submitLoginButton;

    @FindBy(css = "#post-9 > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--customer-logout > a")
    private WebElement logOutButton;

    @FindBy(xpath = "//*[@id=\"woocommerce-product-search-field-0\"]")
    private WebElement searchField;

    public LoginPage goToLoginPage() {
        goToMyAcount.click();
        LoginPage loginPage = new LoginPage(driver, wait);
        return loginPage;
    }

    public SearchPage searchForItem(String item) {
        searchField.sendKeys(item);
        searchField.sendKeys(Keys.ENTER);
        searchField.sendKeys(Keys.RETURN);
        SearchPage searchPage = new SearchPage (driver, wait);
        return searchPage;
    }

    public boolean isUserLoggedIn() {
        return logOutButton.isDisplayed();
    }

    public boolean isUserLogOut() {
        return loginField.isDisplayed();
    }

    public void logOutUser() {
        logOutButton.click();
    }
}
