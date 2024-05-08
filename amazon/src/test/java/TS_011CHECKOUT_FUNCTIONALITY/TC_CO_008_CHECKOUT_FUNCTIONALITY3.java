package TS_011CHECKOUT_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_002_SHOPPINGCART_FUNCTIONALITY2;
import TS_010_SHOPPING_CART_FUNCTIONALITY.TC_SC_009_SHOPPINGCART_FUNCTIONALITY3;

public class TC_CO_008_CHECKOUT_FUNCTIONALITY3 extends TC_SC_009_SHOPPINGCART_FUNCTIONALITY3 {
	@Test
	public void validate_ui() {
		TC_CO_008_CHECKOUT_FUNCTIONALITY3 c_O_001 = new TC_CO_008_CHECKOUT_FUNCTIONALITY3();
		c_O_001.Validate_shopping_cart_to_checkout();

		// Proper and good UI are displayed on the 'checkout Account' page

	}
}
