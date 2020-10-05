package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LogOutTest extends BaseTest{

    @Test
    void shouldBeAbelToLogOut(){
        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        Assertions.assertTrue(loginPage.isUserLoggedIn());
        homePage.logOutUser();
        Assertions.assertTrue(loginPage.isUserLogOut());
    }

}
