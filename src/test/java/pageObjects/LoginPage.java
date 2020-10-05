package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(css = "#username")
    WebElement emailInputField;

    @FindBy(css = "#password")
    WebElement passwordInputField;

    @FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    WebElement loginButton;

    @FindBy(css = "#content > div > div.woocommerce > ul > li")
    WebElement wrongLoginAlertText;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul/li")
    WebElement wrongPasswordAlert;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul/li/strong[2]")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/ul/li")
    WebElement emptyPasswordAlert;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.wait = wait;
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String userName, String password) {
        emailInputField.sendKeys(userName);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

    public boolean isFailedLoginAlertDisplayed() {
        return wrongLoginAlertText.getText().equals("Unknown username. Check again or try your email address.");
    }

    public boolean isWrongPasswordAlertDisplayed() {
        String user = userName.getText();
        return wrongPasswordAlert.getText().equals("Error: The password you entered for the username "
                + user + " is incorrect. Lost your password?");
    }

    public boolean isWrongUserAlertDisplayed() {
        return wrongLoginAlertText.getText().equals("Error: Username is required.");
    }

    public boolean isPasswordEmptyAlertDisplayed() {
        return emptyPasswordAlert.getText().equals("Error: The password field is empty.");
    }
}



