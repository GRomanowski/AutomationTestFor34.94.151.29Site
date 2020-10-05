package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AddItem;
import pageObjects.HomePage;

public class AddItemTest extends BaseTest {

    @Test
    void shouldBeAbleToAddItemToCart() {
        HomePage homePage = new HomePage(driver, wait);
        AddItem addItem = new AddItem(driver, wait);
        addItem.addItemToCart();
        Assertions.assertTrue(addItem.isItemAdded());
    }
}
