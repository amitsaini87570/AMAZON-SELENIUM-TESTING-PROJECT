package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_009_SHOPPINGCART_FUNCTIONALITY3;

public class TC_CO_003_CHECKOUT_FUNCTIONALITY3 extends TC_SC_009_SHOPPINGCART_FUNCTIONALITY3 {
	@Test
	public void existing_address_checkout() {
		TC_CO_003_CHECKOUT_FUNCTIONALITY3 c_O_001 = new TC_CO_003_CHECKOUT_FUNCTIONALITY3();
		c_O_001.Validate_shopping_cart_to_checkout();

		// click on use this method
		driver.findElement(By.xpath(loc.getProperty("click_on_use_this_methodTC_CO_003"))).click();
//CLOICK_ON_PLACE YOUR ORDER
		driver.findElement(By.xpath(loc.getProperty("click_on_place_your_order_TC_CO_003"))).click();

	}
}
