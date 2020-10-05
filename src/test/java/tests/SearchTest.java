package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;

public class SearchTest extends BaseTest {

    @Test
    void shouldDisplaySearchResultItem() {
        HomePage homePage = new HomePage(driver, wait);
        SearchPage searchPage = homePage.searchForItem("gold");
        Assertions.assertTrue(searchPage.isSearchResultsListCorrect());
    }

    @Test
    void shouldDisplaySearchResultWithNoInputItem() {
        HomePage homePage = new HomePage(driver, wait);
        SearchPage searchPage = homePage.searchForItem("");
        Assertions.assertTrue(searchPage.isSearchResultEmpty());
    }

    @Test
    void shouldDisplaySearchResultWithSilverInput() {
        HomePage homePage = new HomePage(driver, wait);
        SearchPage searchPage = homePage.searchForItem("silver");
        Assertions.assertTrue(searchPage.isSearchResultSilver());
    }

    @Test
    void shouldDisplaySearchResultWithBarsInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        SearchPage searchPage = homePage.searchForItem("bars");
        Assertions.assertTrue(searchPage.isSearchResultBars());
    }
}
