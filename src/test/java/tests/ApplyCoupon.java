package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.AddItem;
import pageObjects.HomePage;

public class ApplyCoupon extends BaseTest {

    @Test
    public void addThreeItemToCart() {
        HomePage homePage = new HomePage(driver, wait);
        AddItem addItem = new AddItem(driver, wait);
        addItem.addItemsToCart();
        addItem.addCoupon();
        Assertions.assertTrue(addItem.isCouponAppliedSuccessfully());
    }
}
