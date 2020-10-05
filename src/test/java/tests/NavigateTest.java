package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.NavigatePage;

public class NavigateTest extends BaseTest {

    @Test
    public void navigateThroughoutMainMenu() {
        HomePage homePage = new HomePage(driver, wait);
        NavigatePage navigatePage = new NavigatePage(driver, wait);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.login("gg1", "YHNyhn1298");
        navigatePage.navigateAboutUsPage();
        Assertions.assertTrue(navigatePage.isAboutUsPageDisplayed());
        navigatePage.navigateCartPage();
        Assertions.assertTrue(navigatePage.isCartPageDisplayed());
        navigatePage.navigateCheckoutPage();
        Assertions.assertTrue(navigatePage.isCheckoutAlertMassageDisplayed());
        navigatePage.navigateMyAccountPage();
        Assertions.assertTrue(navigatePage.isMyAccountPageDisplayed());
    }

    @Test
    public void navigateThroughoutProductsCategories() {
        HomePage homePage = new HomePage(driver, wait);
        NavigatePage navigatePage = new NavigatePage(driver, wait);
        navigatePage.navigateGoldBars();
        Assertions.assertTrue(navigatePage.isGoldBarsPageDisplayed());
        navigatePage.navigateGoldCoins();
        Assertions.assertTrue(navigatePage.isGoldCoinsPageDisplayed());
        navigatePage.navigateSilverBars();
        Assertions.assertTrue(navigatePage.isSilverBarsPageDisplayed());
        navigatePage.navigateSilverCoins();
        Assertions.assertTrue(navigatePage.isSilverCoinsPageDisplayed());
        navigatePage.navigateUncategorized();
        Assertions.assertTrue(navigatePage.isUncategorizedPageDisplayed());
    }

}
