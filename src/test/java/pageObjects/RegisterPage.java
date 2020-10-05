package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.RandomUser;

public class RegisterPage extends BasePage {


    @FindBy(css = "#reg_username")
    WebElement userNameField;

    @FindBy(css = "#reg_email")
    WebElement emailAdresField;

    @FindBy(css = "#reg_password")
    WebElement passwordField;

    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
    WebElement registerButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[1]/ul/li")
    WebElement errorPasswordText;

    @FindBy(css = "#content > div > div.woocommerce > ul > li")
    WebElement errorUserNameText;

    @FindBy(css = "#content > div > div.woocommerce > ul > li")
    WebElement errorInputsMassageText;

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void registerNewUser(String userName, String emailAddress, String password) {
        userNameField.sendKeys(userName);
        emailAdresField.sendKeys(emailAddress);
        passwordField.sendKeys(password);
        registerButton.click();
    }

    public void registerNewUser(RandomUser randomUser) {
        userNameField.sendKeys(randomUser.userName);
        emailAdresField.sendKeys(randomUser.emailAddress);
        passwordField.sendKeys(randomUser.password);
        registerButton.click();
    }

    public boolean isNewUserRegistered() {
        return isUserLoggedIn();
    }

    public boolean isMissingPasswordErrorDisplayed() {
        return errorPasswordText.getText().equals("Error: Please enter an account password.");
    }

    public boolean isMissingUserNameErrorDisplayed() {
        return errorUserNameText.getText().trim().equals("Error: Please enter a valid account username.");
    }

    public boolean isMissingInputsErrorDisplayed() {
        return errorInputsMassageText.getText().trim().equals("Error: Please provide a valid email address.");
    }

}
