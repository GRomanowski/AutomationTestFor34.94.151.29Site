package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddItem extends BasePage {

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[2]")
    WebElement addItemButton;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[1]/a[3]")
    WebElement viewChartButtonExists;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[9]/a[2]")
    WebElement addSecoundItemButton;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[10]/a[2]")
    WebElement addThirdItemButton;

    @FindBy(xpath = "//*[@id=\"main\"]/ul/li[9]/a[3]")
    WebElement viewCartButton;

    @FindBy(xpath = "//*[@id=\"site-header-cart\"]/li[1]/a")
    WebElement cartVisibility;

    @FindBy(xpath = "//*[@id=\"site-header-cart\"]/li[2]/div/div/p[2]/a[1]")
    WebElement viewCart;

    @FindBy(xpath = "//*[@id=\"coupon_code\"]")
    WebElement couponCodeField;

    @FindBy(className = "button")
    WebElement applyCouponButton;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div[1]/div")
    WebElement alertMassage;

    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div[2]/div/div/a")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"billing_first_name\"]")
    WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"billing_last_name\"]")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"select2-billing_country-container\"]")
    WebElement countryField;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement countryFieldInput;

    @FindBy(xpath = "//*[@id=\"billing_address_1\"]")
    WebElement streetAddressField;

    @FindBy(xpath = "//*[@id=\"billing_postcode\"]")
    WebElement zipCodeField;

    @FindBy(xpath = "//*[@id=\"billing_city\"]")
    WebElement townField;

    @FindBy(xpath = "//*[@id=\"billing_phone\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"billing_email\"]")
    WebElement emailAddressField;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    WebElement placeOrderButton;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]")
    WebElement orderReceivedMassage;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/form[2]/div[1]/ul/li[1]")
    WebElement wrongAddressAlertMassage;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/form[2]/div[1]/ul/li[2]")
    WebElement wrongCityAlertMassage;

    public AddItem(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart() {
        addItemButton.click();
    }

    public void addItemsToCart() {
        addItemButton.click();
        addSecoundItemButton.click();
        addThirdItemButton.click();
    }

    public void addCoupon() {
        viewCartButton.click();
        couponCodeField.sendKeys("softie");
        applyCouponButton.click();
    }

    public void makeOrder() {
        viewCartButton.click();
        proceedToCheckout.click();
    }

    public void billingDetails(String firstName, String lastName, String country, String streetInput, String postalCode, String city, String phone, String emailAddress) throws InterruptedException {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        countryField.click();
        countryFieldInput.sendKeys(country);
        zipCodeField.click();
        zipCodeField.sendKeys(postalCode);
        streetAddressField.sendKeys(streetInput);
        townField.sendKeys(city);
        phoneNumber.sendKeys(phone);
        emailAddressField.sendKeys(emailAddress);
        Thread.sleep(1000);
        placeOrderButton.click();

    }

    public boolean isItemAdded() {
        return viewChartButtonExists.getText().equals("View cart");
    }

    public boolean isCouponAppliedSuccessfully() {
        return alertMassage.getText().equals("Coupon code applied successfully.");
    }

    public boolean isOrderReceived() {
        return orderReceivedMassage.getText().equals("Thank you. Your order has been received.");
    }

    public boolean isWrongAddressAlertVisible() {
        return wrongAddressAlertMassage.getText().equals("Billing Street address is a required field.");
    }

    public boolean isWrongCityAlertVisible() {
        return wrongCityAlertMassage.getText().equals("Billing Town / City is a required field.");
    }

    public void print() {
        System.out.println(viewChartButtonExists.getText());
    }
}
