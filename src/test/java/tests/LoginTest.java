package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    void shouldBeAbleToLoginWithCorrectLoginAndPassword() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        Assertions.assertTrue(loginPage.isUserLoggedIn());
    }

    @Test
    void shouldNotBeAbelToLoginWithIncorrectLogin(){
        HomePage homepage = new HomePage(driver, wait);
        LoginPage loginPage = homepage.goToLoginPage();
        loginPage.login("gg121212", "YHNyhn1298");
        Assertions.assertTrue(loginPage.isFailedLoginAlertDisplayed());
    }

    @Test
    void shouldNotBeAbelToLoginWithIncorrectPassword(){
        HomePage homepage = new HomePage(driver, wait);
        LoginPage loginPage = homepage.goToLoginPage();
        loginPage.login("gg", "YHNyh8");
        Assertions.assertTrue(loginPage.isWrongPasswordAlertDisplayed());
    }

    @Test
    void shouldNotBeAbelToLoginWithIncorrectLoginAndCorrectPassword(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("","YHNyhn1298");
        Assertions.assertTrue(loginPage.isWrongUserAlertDisplayed());
    }

    @Test
    void shouldNotBeAbelToLoginWithEmptyLoginAndPassword(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("","");
        Assertions.assertTrue(loginPage.isWrongUserAlertDisplayed());
    }

    @Test
    void shouldNotBeAbelToLoginWithEmptyPassword(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg","");
        Assertions.assertTrue(loginPage.isPasswordEmptyAlertDisplayed());
    }
}