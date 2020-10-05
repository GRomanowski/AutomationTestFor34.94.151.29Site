package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeYourBillingAddressPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"site-navigation\"]/div[1]/ul/li[5]/a")
    WebElement myAccountButton;

    @FindBy(xpath = "//*[@id=\"post-9\"]/div/div/div/p[2]/a[2]")
    WebElement billingData;

    @FindBy(xpath = "//*[@id=\"post-9\"]/div/div/div/div[2]/div[1]/header/a")
    WebElement billingAddressChangeButton;

    @FindBy(xpath = "//*[@id=\"billing_first_name\"]")
    WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"billing_city\"]")
    WebElement cityField;

    @FindBy(xpath = "//*[@id=\"post-9\"]/div/div/div/form/div/p/button")
    WebElement saveAddressButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div")
    WebElement correctAddressChangeAlert;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul/li")
    WebElement wrongFirstNameMassageAlert;

    @FindBy(xpath = "//*[@id=\"billing_postcode\"]")
    WebElement zipCodeField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul/li")
    WebElement zipCodeAlertMassage;

    public ChangeYourBillingAddressPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void changeMyBillingAddress(String firstName, String city) {
        myAccountButton.click();
        billingData.click();
        billingAddressChangeButton.click();
        firstNameField.click();
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        cityField.click();
        cityField.clear();
        cityField.sendKeys(city);
        saveAddressButton.click();
    }

    public void changeMyBillingAddress2(String zipcode){
        myAccountButton.click();
        billingData.click();
        billingAddressChangeButton.click();
        zipCodeField.click();
        zipCodeField.clear();
        zipCodeField.sendKeys(zipcode);
        saveAddressButton.click();
    }

    public boolean isAddressBillingCorrectChanged(){
        return correctAddressChangeAlert.getText().equals("Address changed successfully.");
    }

    public boolean isCorrectAlertMassageDisplayedWhenFirstNameIsNotProvided(){
        return wrongFirstNameMassageAlert.getText().equals("First name is a required field.");
    }

    public boolean isCorrectAlertMassageDisplayedWhenProvidedWrongZipCode(){
        return zipCodeAlertMassage.getText().equals("Please enter a valid postcode / ZIP.");
    }

    public boolean isCorrectAlertMassageDisplayedWhenProvidedCorrectZipCode(){
        return correctAddressChangeAlert.getText().equals("Address changed successfully.");
    }
}
