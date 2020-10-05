package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigatePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[2]/a")
    WebElement aboutUsButton;

    @FindBy(xpath = "//*[@id=\"post-69\"]/header/h1")
    WebElement aboutUsTitle;

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[3]/a")
    WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"post-7\"]/header/h1")
    WebElement cartTitle;

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[4]/a")
    WebElement checkoutButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div")
    WebElement checkoutAlertMassage;

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[5]/a")
    WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\"post-9\"]/header/h1")
    WebElement myAccountTitle;

    @FindBy(xpath = "//*[@id=\"woocommerce_product_categories-3\"]/ul/li[1]/a")
    WebElement goldBarsButton;

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    WebElement goldBarsTitle;

    @FindBy(xpath = "//*[@id=\"woocommerce_product_categories-3\"]/ul/li[2]/a")
    WebElement goldCoinsButton;

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    WebElement goldCoinsTitle;

    @FindBy(xpath = "//*[@id=\"woocommerce_product_categories-3\"]/ul/li[3]/a")
    WebElement silverBarsButton;

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    WebElement silverBarsTitle;

    @FindBy(xpath = "//*[@id=\"woocommerce_product_categories-3\"]/ul/li[4]/a")
    WebElement silverCoinsButton;

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    WebElement silverCoinsTitle;

    @FindBy(xpath = "//*[@id=\"woocommerce_product_categories-3\"]/ul/li[5]/a")
    WebElement uncategorizedButton;

    @FindBy(xpath = "//*[@id=\"main\"]/header/h1")
    WebElement uncategorizedTitle;

    public void navigateAboutUsPage() {
        aboutUsButton.click();
    }

    public void navigateCartPage() {
        cartButton.click();
    }

    public void navigateCheckoutPage() {
        checkoutButton.click();
    }

    public void navigateMyAccountPage() {
        myAccountButton.click();
    }

    public void navigateGoldBars() {
        goldBarsButton.click();
    }

    public void navigateGoldCoins(){
        goldCoinsButton.click();
    }

    public void navigateSilverBars(){
        silverBarsButton.click();
    }

    public void navigateSilverCoins(){
        silverCoinsButton.click();
    }

    public void navigateUncategorized(){
        uncategorizedButton.click();
    }

    public NavigatePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public boolean isAboutUsPageDisplayed() {
        return aboutUsTitle.getText().equals("About us");
    }

    public boolean isCartPageDisplayed() {
        return cartTitle.getText().equals("Cart");
    }

    public boolean isCheckoutAlertMassageDisplayed() {
        return checkoutAlertMassage.getText().equals("Checkout is not available whilst your cart is empty.");
    }

    public boolean isMyAccountPageDisplayed() {
        return myAccountTitle.getText().equals("My account");
    }

    public boolean isGoldBarsPageDisplayed(){
        return goldBarsTitle.getText().equals("Gold Bars");
    }

    public boolean isGoldCoinsPageDisplayed(){
        return goldCoinsTitle.getText().equals("Gold Coins");
    }

    public boolean isSilverBarsPageDisplayed(){
        return silverBarsTitle.getText().equals("Silver Bars");
    }

    public boolean isSilverCoinsPageDisplayed(){
        return silverCoinsTitle.getText().equals("Silver Coins");
    }

    public boolean isUncategorizedPageDisplayed(){
        return uncategorizedTitle.getText().equals("Uncategorized");
    }
}
