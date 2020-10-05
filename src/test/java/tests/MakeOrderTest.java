package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AddItem;
import pageObjects.HomePage;

public class MakeOrderTest extends BaseTest {

    @Test
    public void makeOrder() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        AddItem addItem = new AddItem(driver, wait);
        addItem.addItemsToCart();
        addItem.makeOrder();
        addItem.billingDetails("Grzegorz", "Softie", "Poland", "Testowa 12", "80-000", "Gdańsk", "600111222", "gg1@gmail.com");
        Assertions.assertTrue(addItem.isOrderReceived());
    }

    @Test
    public void makeOrderWithNotAllRequiredField() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        AddItem addItem = new AddItem(driver, wait);
        addItem.addItemsToCart();
        addItem.makeOrder();
        addItem.billingDetails("Grzegorz", "Softie", "Poland", "", "80-000", "", "600111222", "gg1@gmail.com");
        Assertions.assertTrue(addItem.isWrongAddressAlertVisible());
        Assertions.assertTrue(addItem.isWrongCityAlertVisible());
    }
}
