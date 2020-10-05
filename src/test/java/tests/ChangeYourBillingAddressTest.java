package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.ChangeYourBillingAddressPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ChangeYourBillingAddressTest extends BaseTest {

    @Test
    public void correctChangingBillingAddressData() {
        HomePage homePage = new HomePage(driver, wait);
        ChangeYourBillingAddressPage changeYourBillingAddressPage = new ChangeYourBillingAddressPage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        changeYourBillingAddressPage.changeMyBillingAddress("Adam", "Warszawa");
        Assertions.assertTrue(changeYourBillingAddressPage.isAddressBillingCorrectChanged());
    }

    @Test
    public void incorrectChangingBillingAddressData() {
        HomePage homePage = new HomePage(driver, wait);
        ChangeYourBillingAddressPage changeYourBillingAddressPage = new ChangeYourBillingAddressPage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        changeYourBillingAddressPage.changeMyBillingAddress("", "Warszawa");
        Assertions.assertTrue(changeYourBillingAddressPage.isCorrectAlertMassageDisplayedWhenFirstNameIsNotProvided());
    }

    @Test
    public void checkValidationForPostalCode() {
        HomePage homePage = new HomePage(driver, wait);
        ChangeYourBillingAddressPage changeYourBillingAddressPage = new ChangeYourBillingAddressPage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        changeYourBillingAddressPage.changeMyBillingAddress2("000");
        Assertions.assertTrue(changeYourBillingAddressPage.isCorrectAlertMassageDisplayedWhenProvidedWrongZipCode());
    }

    @Test
    public void checkCorrectInputForPostalCode() {
        HomePage homePage = new HomePage(driver, wait);
        ChangeYourBillingAddressPage changeYourBillingAddressPage = new ChangeYourBillingAddressPage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        changeYourBillingAddressPage.changeMyBillingAddress2("00000");
        Assertions.assertTrue(changeYourBillingAddressPage.isCorrectAlertMassageDisplayedWhenProvidedCorrectZipCode());
    }
}