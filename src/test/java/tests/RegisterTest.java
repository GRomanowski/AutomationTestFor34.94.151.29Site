package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utils.RandomUser;

public class RegisterTest extends BaseTest {

    @Test
    public void shouldRegisterNewUser() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        RegisterPage registerPage = new RegisterPage(driver, wait);
        RandomUser randomUser = new RandomUser();
        registerPage.registerNewUser(randomUser);
        Assertions.assertTrue(registerPage.isNewUserRegistered());
    }

    @Test
    public void registerNewUserWithoutPassword() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        RegisterPage registerPage = new RegisterPage(driver, wait);
        registerPage.registerNewUser("Grzegorz12", "gg5935535353535@gmail.com", "");
        Assertions.assertTrue(registerPage.isMissingPasswordErrorDisplayed());
    }

    @Test
    public void registerNewUserWithoutUserName() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        RegisterPage registerPage = new RegisterPage(driver, wait);
        registerPage.registerNewUser("", "gg5@gmail.com", "YHNyhn1199");
        Assertions.assertTrue(registerPage.isMissingUserNameErrorDisplayed());
    }

    @Test
    public void registerNewUserWithoutInputs() {
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        RegisterPage registerPage = new RegisterPage(driver, wait);
        registerPage.registerNewUser("", "", "");
        Assertions.assertTrue(registerPage.isMissingInputsErrorDisplayed());
    }
}
